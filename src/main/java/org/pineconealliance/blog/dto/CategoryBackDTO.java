package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 后台分类
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryBackDTO {
    /**
     * 分类id
     */
    private Integer id;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 文章数量
     */
    private Integer articleCount;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
