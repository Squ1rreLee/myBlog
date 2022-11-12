package org.pineconealliance.blog.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * oss配置属性
 *
 * @Author Squ1rrel
 * @Date 2022/07/28
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "upload.oss")
public class OssConfigProperties {
    /**
     * oss域名
     */
    private String url;
    /**
     * 终点
     */
    private String endpoint;
    /**
     * 访问密钥id
     */
    private String accessKeyId;
    /**
     * 访问密钥密码
     */
    private String accessKeySecret;
    /**
     * bucket名称
     */
    private String bucketName;
    /**
     * 静态文件网址
     */
    private String staticUrl;
}
