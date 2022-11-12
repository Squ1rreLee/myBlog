package org.pineconealliance.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.pineconealliance.blog.dto.MessageBackDTO;
import org.pineconealliance.blog.dto.MessageDTO;
import org.pineconealliance.blog.entity.Message;
import org.pineconealliance.blog.vo.ConditionVO;
import org.pineconealliance.blog.vo.MessageVO;
import org.pineconealliance.blog.vo.PageResult;
import org.pineconealliance.blog.vo.ReviewVO;

import java.util.List;

/**
 *
 * 留言服务
 * @Author Squ1rrel
 * @Date 2022/07/29
 */
public interface MessageService extends IService<Message> {
    /**
     * 添加留言弹幕
     *
     * @param messageVO 留言对象
     */
    void saveMessage(MessageVO messageVO);

    /**
     * 查看留言弹幕
     *
     * @return 留言列表
     */
    List<MessageDTO> listMessages();

    /**
     * 审核留言
     *
     * @param reviewVO 审查签证官
     */
    void updateMessagesReview(ReviewVO reviewVO);

    /**
     * 查看后台留言
     *
     * @param condition 条件
     * @return 留言列表
     */
    PageResult<MessageBackDTO> listMessageBackDTO(ConditionVO condition);
}
