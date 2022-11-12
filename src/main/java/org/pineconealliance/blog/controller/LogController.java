package org.pineconealliance.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.pineconealliance.blog.dto.OperationLogDTO;
import org.pineconealliance.blog.service.OperationLogService;
import org.pineconealliance.blog.vo.ConditionVO;
import org.pineconealliance.blog.vo.PageResult;
import org.pineconealliance.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 日志控制器
 *
 * @Author Squ1rrel
 * @Date 2022/07/27
 */
@Api(tags = "日志模块")
@RestController
public class LogController {
    @Autowired
    private OperationLogService operationLogService;

    /**
     * 查看操作日志
     *
     * @param conditionVO 条件
     * @return {@link Result< OperationLogDTO >} 日志列表
     */
    @ApiOperation(value = "查看操作日志")
    @GetMapping("/admin/operation/logs")
    public Result<PageResult<OperationLogDTO>> listOperationLogs(ConditionVO conditionVO) {
        return Result.ok(operationLogService.listOperationLogs(conditionVO));
    }

    /**
     * 删除操作日志
     *
     * @param logIdList 日志id列表
     * @return {@link Result<>}
     */
    @ApiOperation(value = "删除操作日志")
    @DeleteMapping("/admin/operation/logs")
    public Result<?> deleteOperationLogs(@RequestBody List<Integer> logIdList) {
        operationLogService.removeByIds(logIdList);
        return Result.ok();
    }
}
