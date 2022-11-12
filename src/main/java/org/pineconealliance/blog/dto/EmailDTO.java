package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 邮件
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {
    /**
     * 邮箱号
     */
    private String email;
    /**
     * 主题
     */
    private String subject;
    /**
     * 内容
     */
    private String content;
}
