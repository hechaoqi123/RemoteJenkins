package com.example.retrystudy.common.aspect;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *  日志切面
 * @author hcq
 * @date 2019/7/21 18:12
 *  感觉使用拦截器会更好一点，But 拦截器无法获取响应数据（革命尚未成功）
 */
@Aspect
@Slf4j
@Component
@Deprecated
public class LogAspect {
    @Pointcut("execution( * com.example.retrystudy.controller.*.* (..))")
    public void point(){};
    @Around("point()")
    public Object consumingAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj=joinPoint.proceed();
        log.info("响应数据:"+JSONObject.toJSONString(obj));
        return obj;
    }
}
