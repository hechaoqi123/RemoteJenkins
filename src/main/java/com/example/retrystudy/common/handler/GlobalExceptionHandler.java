package com.example.retrystudy.common.handler;

import com.example.retrystudy.common.beans.ResponseVO;
import com.example.retrystudy.common.exceptions.BizException;
import com.example.retrystudy.common.exceptions.ParamValidException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 * @author hcq
 * @date 2019/7/20 0:00
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * Spring参数校验异常处理器
     */
    @ExceptionHandler(value = {BindException.class})
    public  ResponseVO  paramValidException(BindException e){
        StringBuilder msg=new StringBuilder();
        e.getAllErrors().forEach(error -> msg.append(error.getDefaultMessage()).append("、"));
        return ResponseVO.biuldException(ParamValidException.build(msg.toString()));
    }
    /**
     * 业务异常处理器
     */
    @ExceptionHandler(BizException.class)
    public ResponseVO paramValidExceptionHandler(BizException e) {
        return ResponseVO.biuldException(e);
    }

    /**
     * Exception异常处理器
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseVO paramValidExceptionHandler(Exception e) {
        log.info("捕获系统异常:");
        e.printStackTrace();
        return ResponseVO.biuldException();
    }

}
