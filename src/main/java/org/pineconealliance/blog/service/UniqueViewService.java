package org.pineconealliance.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.pineconealliance.blog.dto.UniqueViewDTO;
import org.pineconealliance.blog.entity.UniqueView;

import java.util.List;

/**
 * 用户量统计
 *
 * @Author xiaojie
 * @Date 2022/07/29
 */
public interface UniqueViewService extends IService<UniqueView> {
    /**
     * 获取7天用户量统计
     *
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews();
}
