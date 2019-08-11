package com.example.retrystudy.common.exceptions;

import com.example.retrystudy.common.beans.ReturnCodeEnum;

/**
 * 参数校验异常类
 * @author hcq
 * @date 2019/7/19 22:59
 */
public class ParamValidException extends BizException {

    private ParamValidException(String msg) {
        super(ReturnCodeEnum.PARAMS_ERROR, msg);
    }

    public static ParamValidException build(String msg) {
        return new ParamValidException(msg);
    }

}
