package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * qq用户信息dto
 *
 * @Author Squ1rrel
 * @Date 2022/06/14
 * @since 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QQUserInfoDTO {
    /**
     * 昵称
     */
    private String nickname;
    /**
     * qq头像
     */
    private String figureurl_qq_1;
}
