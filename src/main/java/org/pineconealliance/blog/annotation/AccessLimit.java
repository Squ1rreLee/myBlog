package org.pineconealliance.blog.annotation;

import java.lang.annotation.*;

/**
 * redis接口限流
 * @Author Squ1rrel
 * @Date 2022/3/23 11:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AccessLimit {
    /**
     * 单位时间（秒）
     *
     * @return int
     */
    int seconds();

    /**
     * 单位时间最大请求次数
     *
     * @return int
     */
    int maxCount();
}
