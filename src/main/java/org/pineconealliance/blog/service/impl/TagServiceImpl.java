package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.ArticleTagDao;
import org.pineconealliance.blog.dao.TagDao;
import org.pineconealliance.blog.dto.TagBackDTO;
import org.pineconealliance.blog.dto.TagDTO;
import org.pineconealliance.blog.entity.ArticleTag;
import org.pineconealliance.blog.entity.Tag;
import org.pineconealliance.blog.exception.BizException;
import org.pineconealliance.blog.service.TagService;
import org.pineconealliance.blog.util.BeanCopyUtils;
import org.pineconealliance.blog.util.PageUtils;
import org.pineconealliance.blog.vo.ConditionVO;
import org.pineconealliance.blog.vo.PageResult;
import org.pineconealliance.blog.vo.TagVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * 标签服务
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagDao, Tag> implements TagService {
    @Autowired
    private TagDao tagDao;
    @Autowired
    private ArticleTagDao articleTagDao;

    @Override
    public PageResult<TagDTO> listTags() {
        // 查询标签列表
        List<Tag> tagList = tagDao.selectList(null);
        // 转换DTO
        List<TagDTO> tagDTOList = BeanCopyUtils.copyList(tagList, TagDTO.class);
        // 查询标签数量
        Integer count = tagDao.selectCount(null);
        return new PageResult<>(tagDTOList, count);
    }

    @Override
    public PageResult<TagBackDTO> listTagBackDTO(ConditionVO condition) {
        // 查询标签数量
        Integer count = tagDao.selectCount(new LambdaQueryWrapper<Tag>()
                .like(StringUtils.isNotBlank(condition.getKeywords()), Tag::getTagName, condition.getKeywords()));
        if (count == 0) {
            return new PageResult<>();
        }
        // 分页查询标签列表
        List<TagBackDTO> tagList = tagDao.listTagBackDTO(PageUtils.getLimitCurrent(), PageUtils.getSize(), condition);
        return new PageResult<>(tagList, count);
    }

    @Override
    public List<TagDTO> listTagsBySearch(ConditionVO condition) {
        // 搜索标签
        List<Tag> tagList = tagDao.selectList(new LambdaQueryWrapper<Tag>()
                .like(StringUtils.isNotBlank(condition.getKeywords()), Tag::getTagName, condition.getKeywords())
                .orderByDesc(Tag::getId));
        return BeanCopyUtils.copyList(tagList, TagDTO.class);
    }

    @Override
    public void deleteTag(List<Integer> tagIdList) {
        // 查询标签下是否有文章
        Integer count = articleTagDao.selectCount(new LambdaQueryWrapper<ArticleTag>()
                .in(ArticleTag::getTagId, tagIdList));
        if (count > 0) {
            throw new BizException("删除失败，该标签下存在文章");
        }
        tagDao.deleteBatchIds(tagIdList);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveOrUpdateTag(TagVO tagVO) {
        // 查询标签名是否存在
        Tag existTag = tagDao.selectOne(new LambdaQueryWrapper<Tag>()
                .select(Tag::getId)
                .eq(Tag::getTagName, tagVO.getTagName()));
        if (Objects.nonNull(existTag) && !existTag.getId().equals(tagVO.getId())) {
            throw new BizException("标签名已存在");
        }
        Tag tag = BeanCopyUtils.copyObject(tagVO, Tag.class);
        this.saveOrUpdate(tag);
    }
}
