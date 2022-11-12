package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 社交账号信息
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocialUserInfoDTO {
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String avatar;
}
