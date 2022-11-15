package com.allen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 生效的条件是@ConditionalOnClass注解中检测到包含IdProperties.class。
 * 并且使用@EnableConfigurationProperties注解会自动注入IdProperties的实例。
 *
 * @author Allen
 */
@ConditionalOnClass(IdProperties.class)
@EnableConfigurationProperties(IdProperties.class)
@Configuration
public class IdGenerateAutoConfiguration {
    @Autowired
    private IdProperties properties;
    @Bean
    public IdGenerateService idGenerateService() {
        return new IdGenerateService(properties.getWorkId());
    }
}