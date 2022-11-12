package org.pineconealliance.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.pineconealliance.blog.dao.WebsiteConfigDao;
import org.pineconealliance.blog.entity.WebsiteConfig;
import org.pineconealliance.blog.service.WebsiteConfigService;
import org.springframework.stereotype.Service;

/**
 * 网站配置服务
 *
 * @Author Squ1rrel
 * @Date 2022/08/09
 */
@Service
public class WebsiteConfigServiceImpl extends ServiceImpl<WebsiteConfigDao, WebsiteConfig> implements WebsiteConfigService {
}




