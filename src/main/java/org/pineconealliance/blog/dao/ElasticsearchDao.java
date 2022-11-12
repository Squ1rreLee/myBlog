package org.pineconealliance.blog.dao;

import org.pineconealliance.blog.dto.ArticleSearchDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * elasticsearch
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface ElasticsearchDao extends ElasticsearchRepository<ArticleSearchDTO, Integer> {
}
