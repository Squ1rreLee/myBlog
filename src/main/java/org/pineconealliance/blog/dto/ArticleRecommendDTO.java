package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 推荐文章
 *
 * @Author Squ1rrel
 * @Date 2022/08/01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleRecommendDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 文章缩略图
     */
    private String articleCover;
    /**
     * 标题
     */
    private String articleTitle;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
