package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * websocket消息
 *
 * @Author Squ1rrel
 * @Date 2022/08/01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebsocketMessageDTO {
    /**
     * 类型
     */
    private Integer type;
    /**
     * 数据
     */
    private Object data;
}
