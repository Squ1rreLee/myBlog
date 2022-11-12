package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户地区dto
 *
 * @Author Squ1rrel
 * @Date 2022/08/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAreaDTO {
    /**
     * 地区名
     */
    private String name;
    /**
     * 数量
     */
    private Long value;
}
