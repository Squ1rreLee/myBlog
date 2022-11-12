package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.pineconealliance.blog.dto.ResourceRoleDTO;
import org.pineconealliance.blog.dto.RoleDTO;
import org.pineconealliance.blog.entity.Role;
import org.pineconealliance.blog.vo.ConditionVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Repository
public interface RoleDao extends BaseMapper<Role> {
    /**
     * 查询路由角色列表
     *
     * @return 角色标签
     */
    List<ResourceRoleDTO> listResourceRoles();

    /**
     * 根据用户id获取角色列表
     *
     * @param userInfoId 用户id
     * @return 角色标签
     */
    List<String> listRolesByUserInfoId(Integer userInfoId);

    /**
     * 查询角色列表
     *
     * @param current     页码
     * @param size        条数
     * @param conditionVO 条件
     * @return 角色列表
     */
    List<RoleDTO> listRoles(@Param("current") Long current, @Param("size") Long size,
                            @Param("conditionVO") ConditionVO conditionVO);
}
