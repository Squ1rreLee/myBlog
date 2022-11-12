package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.RoleResourceDao;
import org.pineconealliance.blog.entity.RoleResource;
import org.pineconealliance.blog.service.RoleResourceService;
import org.springframework.stereotype.Service;

/**
 * 角色资源服务
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Service
public class RoleResourceServiceImpl extends ServiceImpl<RoleResourceDao, RoleResource> implements RoleResourceService {
}
