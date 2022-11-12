package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分类选项
 *
 * @Author Squ1rrel
 * @Date 2022/08/02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryOptionDTO {
    /**
     * 分类id
     */
    private Integer id;
    /**
     * 分类名
     */
    private String categoryName;
}
