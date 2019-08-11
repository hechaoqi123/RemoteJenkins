package com.example.retrystudy.common.exceptions;

import com.example.retrystudy.common.beans.ReturnCodeEnum;

/**
 * 连接超时异常类
 * @author hcq
 * @date 2019/7/19 23:38
 */
public class TimeOutException extends BizException {

    private TimeOutException(String msg) {
        super(ReturnCodeEnum.TIME_OUT, msg);
    }

    public static TimeOutException build(String msg) {
        return new TimeOutException(msg);
    }
}
