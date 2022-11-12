package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * qq token信息
 *
 * @Author Squ1rrel
 * @Date 2022/06/15
 * @since 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QQTokenDTO {
    /**
     * openid
     */
    private String openid;
    /**
     * 客户端id
     */
    private String client_id;
}
