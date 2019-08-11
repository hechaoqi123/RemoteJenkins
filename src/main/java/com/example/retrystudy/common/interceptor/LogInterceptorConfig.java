package com.example.retrystudy.common.interceptor;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 * @author hcq
 * @date 2019/7/21 16:54
 */
@Configuration
@AllArgsConstructor
public class LogInterceptorConfig extends WebMvcConfigurerAdapter {
    /**
     * 日志拦截器
     */
    LogInterceptor logInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/**.html","/**.css","/**.js","/**.jpg","/**.png");
    }
}
