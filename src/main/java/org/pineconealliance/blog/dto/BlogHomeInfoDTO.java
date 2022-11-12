package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.pineconealliance.blog.vo.PageVO;
import org.pineconealliance.blog.vo.WebsiteConfigVO;

import java.util.List;

/**
 * 博客首页信息
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogHomeInfoDTO {
    /**
     * 文章数量
     */
    private Integer articleCount;
    /**
     * 分类数量
     */
    private Integer categoryCount;
    /**
     * 标签数量
     */
    private Integer tagCount;
    /**
     * 访问量
     */
    private String viewsCount;
    /**
     * 网站配置
     */
    private WebsiteConfigVO websiteConfig;
    /**
     * 页面列表
     */
    private List<PageVO> pageList;
}
