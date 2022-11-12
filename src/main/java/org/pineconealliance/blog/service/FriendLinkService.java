package org.pineconealliance.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.pineconealliance.blog.dto.FriendLinkBackDTO;
import org.pineconealliance.blog.dto.FriendLinkDTO;
import org.pineconealliance.blog.entity.FriendLink;
import org.pineconealliance.blog.vo.ConditionVO;
import org.pineconealliance.blog.vo.FriendLinkVO;
import org.pineconealliance.blog.vo.PageResult;

import java.util.List;

/**
 * 友链服务
 *
 * @Author Squ1rrel
 * @Date 2022/07/29
 */
public interface FriendLinkService extends IService<FriendLink> {
    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);
}
