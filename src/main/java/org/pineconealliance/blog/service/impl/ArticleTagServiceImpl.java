package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.ArticleTagDao;
import org.pineconealliance.blog.entity.ArticleTag;
import org.pineconealliance.blog.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * 文章标签服务
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {
}
