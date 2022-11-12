package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.ChatRecordDao;
import org.pineconealliance.blog.entity.ChatRecord;
import org.pineconealliance.blog.service.ChatRecordService;
import org.springframework.stereotype.Service;

/**
 * 聊天记录服务
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Service
public class ChatRecordServiceImpl extends ServiceImpl<ChatRecordDao, ChatRecord> implements ChatRecordService {
}
