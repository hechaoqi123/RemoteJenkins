package com.example.retrystudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
/**
 * @author hcq
 * @date 2019/6/30 21:55
 */
@SpringBootApplication
@EnableRetry(proxyTargetClass = true)
@EnableAsync
@MapperScan("com.example.retrystudy.mapper")
public class RetrystudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(RetrystudyApplication.class, args);
    }

}
