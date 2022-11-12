package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 回复数量
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyCountDTO {
    /**
     * 评论id
     */
    private Integer commentId;
    /**
     * 回复数量
     */
    private Integer replyCount;
}
