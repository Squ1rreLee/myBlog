package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 后台评论
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentBackDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 被回复用户昵称
     */
    private String replyNickname;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 评论内容
     */
    private String commentContent;
    /**
     * 评论类型
     */
    private Integer type;
    /**
     * 是否审核
     */
    private Integer isReview;
    /**
     * 发表时间
     */
    private LocalDateTime createTime;
}
