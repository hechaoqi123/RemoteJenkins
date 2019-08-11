package com.example.retrystudy.common.interceptor;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一日志拦截器
 * @author hcq
 * @date 2019/7/21 16:42
 */
@Component
@Slf4j
public class LogInterceptor implements HandlerInterceptor {

    /**
     * 方法预处理，可以在Controller执行前对其进行拦截
     * 应用场景：统一日志处理，方法验签、参数校验、权限检查。
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        log.info("请求路径:{},请求方式:{},请求入参:{}",request.getRequestURI(),request.getMethod(),JSONObject.toJSONString(request.getParameterMap()));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object obj, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse response, Object obj, Exception e) throws Exception {
    }

}
