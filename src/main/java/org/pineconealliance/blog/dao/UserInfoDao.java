package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * 用户信息
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface UserInfoDao extends BaseMapper<UserInfo> {
}
