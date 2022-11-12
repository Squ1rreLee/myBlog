package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 标签选项
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LabelOptionDTO {
    /**
     * 选项id
     */
    private Integer id;
    /**
     * 选项名
     */
    private String label;
    /**
     * 子选项
     */
    private List<LabelOptionDTO> children;
}
