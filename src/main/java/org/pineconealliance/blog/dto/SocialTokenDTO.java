package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 社交登录token
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocialTokenDTO {
    /**
     * 开放id
     */
    private String openId;
    /**
     * 访问令牌
     */
    private String accessToken;
    /**
     * 登录类型
     */
    private Integer loginType;
}
