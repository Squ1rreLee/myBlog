package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 友情链接
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendLinkDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 链接名
     */
    private String linkName;
    /**
     * 链接头像
     */
    private String linkAvatar;
    /**
     * 链接地址
     */
    private String linkAddress;
    /**
     * 介绍
     */
    private String linkIntro;
}
