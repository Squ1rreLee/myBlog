package org.pineconealliance.blog.strategy;

import org.pineconealliance.blog.dto.UserInfoDTO;

/**
 * 第三方登录策略
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
public interface SocialLoginStrategy {
    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);
}
