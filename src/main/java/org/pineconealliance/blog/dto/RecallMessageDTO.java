package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 撤回消息dto
 *
 * @Author Squ1rrel
 * @Date 2022/08/01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecallMessageDTO {
    /**
     * 消息id
     */
    private Integer id;
    /**
     * 是否为语音
     */
    private Boolean isVoice;
}
