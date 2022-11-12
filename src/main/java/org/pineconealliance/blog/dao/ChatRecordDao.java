package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.ChatRecord;
import org.springframework.stereotype.Repository;

/**
 * 聊天记录
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
