package org.pineconealliance.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.pineconealliance.blog.entity.OperationLog;
import org.springframework.stereotype.Repository;

/**
 * 操作日志
 *
 * @Author Squ1rrel
 * @Date 2022/08/10
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {
}
