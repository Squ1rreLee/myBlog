package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文章统计
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleStatisticsDTO {
    /**
     * 日期
     */
    private String date;
    /**
     * 数量
     */
    private Integer count;
}
