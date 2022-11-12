package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.RoleMenuDao;
import org.pineconealliance.blog.entity.RoleMenu;
import org.pineconealliance.blog.service.RoleMenuService;
import org.springframework.stereotype.Service;

/**
 * 角色菜单服务
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuDao, RoleMenu> implements RoleMenuService {
}
