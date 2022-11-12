package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.Message;
import org.springframework.stereotype.Repository;

/**
 * 留言
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface MessageDao extends BaseMapper<Message> {
}
