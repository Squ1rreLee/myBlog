package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.pineconealliance.blog.entity.ChatRecord;

import java.util.List;

/**
 * 聊天记录
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatRecordDTO {
    /**
     * 聊天记录
     */
    private List<ChatRecord> chatRecordList;
    /**
     * ip地址
     */
    private String ipAddress;
    /**
     * ip来源
     */
    private String ipSource;
}
