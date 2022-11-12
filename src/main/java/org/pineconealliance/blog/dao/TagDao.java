package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.pineconealliance.blog.dto.TagBackDTO;
import org.pineconealliance.blog.entity.Tag;
import org.pineconealliance.blog.vo.ConditionVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 标签
 *
 * @Author Squ1rrel
 * @Date 2022/08/01
 * @since 2020-05-18
 */
@Repository
public interface TagDao extends BaseMapper<Tag> {
    /**
     * 查询后台标签列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List< TagBackDTO >} 标签列表
     */
    List<TagBackDTO> listTagBackDTO(@Param("current") Long current, @Param("size") Long size,
                                    @Param("condition") ConditionVO condition);

    /**
     * 根据文章id查询标签名
     *
     * @param articleId 文章id
     * @return {@link List<String>} 标签名列表
     */
    List<String> listTagNameByArticleId(Integer articleId);
}
