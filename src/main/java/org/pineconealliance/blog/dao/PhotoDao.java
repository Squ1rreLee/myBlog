package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.Photo;
import org.springframework.stereotype.Repository;

/**
 * 照片映射器
 *
 * @Author Squ1rrel
 * @Date 2022/08/04
 */
@Repository
public interface PhotoDao extends BaseMapper<Photo> {
}




