package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.ArticleTag;
import org.springframework.stereotype.Repository;

/**
 * 文章标签
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface ArticleTagDao extends BaseMapper<ArticleTag> {
}
