package org.pineconealliance.blog.annotation;

import java.lang.annotation.*;

/**
 * 操作日志注解
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {
    /**
     * @return 操作类型
     */
    String optType() default "";
}
