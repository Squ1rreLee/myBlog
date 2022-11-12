package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微博用户信息
 *
 * @Author Squ1rrel
 * @Date 2022/06/14
 * @since 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeiboUserInfoDTO {
    /**
     * 昵称
     */
    private String screen_name;
    /**
     * 头像
     */
    private String avatar_hd;
}
