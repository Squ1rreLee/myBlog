package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.UserRole;
import org.springframework.stereotype.Repository;

/**
 * 用户角色
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface UserRoleDao extends BaseMapper<UserRole> {
}
