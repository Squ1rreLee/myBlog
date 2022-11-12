package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户角色选项
 *
 * @Author Squ1rrel
 * @Date 2022/08/01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDTO {
    /**
     * 角色id
     */
    private Integer id;
    /**
     * 角色名
     */
    private String roleName;
}
