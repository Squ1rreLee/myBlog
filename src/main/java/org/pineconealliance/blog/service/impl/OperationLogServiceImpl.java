package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.OperationLogDao;
import org.pineconealliance.blog.dto.OperationLogDTO;
import org.pineconealliance.blog.entity.OperationLog;
import org.pineconealliance.blog.service.OperationLogService;
import org.pineconealliance.blog.util.BeanCopyUtils;
import org.pineconealliance.blog.util.PageUtils;
import org.pineconealliance.blog.vo.ConditionVO;
import org.pineconealliance.blog.vo.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 操作日志服务
 *
 * @Author Squ1rrel
 * @Date 2022/08/08
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLog> implements OperationLogService {
    @Override
    public PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO) {
        Page<OperationLog> page = new Page<>(PageUtils.getCurrent(), PageUtils.getSize());
        // 查询日志列表
        Page<OperationLog> operationLogPage = this.page(page, new LambdaQueryWrapper<OperationLog>()
                .like(StringUtils.isNotBlank(conditionVO.getKeywords()), OperationLog::getOptModule,
                        conditionVO.getKeywords())
                .or()
                .like(StringUtils.isNotBlank(conditionVO.getKeywords()), OperationLog::getOptDesc,
                        conditionVO.getKeywords())
                .orderByDesc(OperationLog::getId));
        List<OperationLogDTO> operationLogDTOList = BeanCopyUtils.copyList(operationLogPage.getRecords(),
                OperationLogDTO.class);
        return new PageResult<>(operationLogDTOList, (int)operationLogPage.getTotal());
    }
}
