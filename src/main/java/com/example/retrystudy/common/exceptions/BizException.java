package com.example.retrystudy.common.exceptions;

import com.example.retrystudy.common.beans.ResponseVO;
import com.example.retrystudy.common.beans.ReturnCodeEnum;
import lombok.Data;

/**
 * 统一业务异常类
 *    封装业务异常公共属性，所有的自定义业务异常都应该继承此类
 * @author hcq
 * @date 2019/7/19 23:28
 */
@Data
public class BizException extends RuntimeException {
    /**
     * 成功响应对象
     */
    private static final ResponseVO SUCCESS = new ResponseVO(ReturnCodeEnum.SUCCESS.getCode(), ReturnCodeEnum.SUCCESS.getDesc(), null);
    /**
     * 异常响应对象
     */
    private static final ResponseVO FAIL = new ResponseVO(ReturnCodeEnum.FAIL.getCode(), ReturnCodeEnum.FAIL.getDesc(), null);

    /**
     * 响应状态码
     */
    private String code;

    BizException(ReturnCodeEnum returnEnum, String msg) {
        //将提示信息封装到Throwable中的message字段中
        super(msg);
        code=returnEnum.getCode();
    }

}
