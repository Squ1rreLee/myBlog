package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.FriendLink;
import org.springframework.stereotype.Repository;

/**
 * 友情链接
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface FriendLinkDao extends BaseMapper<FriendLink> {
}
