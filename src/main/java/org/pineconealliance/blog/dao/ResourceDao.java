package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.Resource;
import org.springframework.stereotype.Repository;

/**
 * 资源
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface ResourceDao extends BaseMapper<Resource> {
}
