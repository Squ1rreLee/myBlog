package org.pineconealliance.blog.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.pineconealliance.blog.enums.StatusCodeEnum;

/**
 * 业务异常
 *
 * @Author Squ1rrel
 * @Date 2022/07/27
 */
@Getter
@AllArgsConstructor
public class BizException extends RuntimeException {
    /**
     * 错误码
     */
    private Integer code = StatusCodeEnum.FAIL.getCode();
    /**
     * 错误信息
     */
    private final String message;

    public BizException(String message) {
        this.message = message;
    }

    public BizException(StatusCodeEnum statusCodeEnum) {
        this.code = statusCodeEnum.getCode();
        this.message = statusCodeEnum.getDesc();
    }
}
