package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.UserRoleDao;
import org.pineconealliance.blog.entity.UserRole;
import org.pineconealliance.blog.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色服务
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {
}
