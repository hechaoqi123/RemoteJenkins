package com.example.retrystudy.common.beans;

import com.example.retrystudy.common.exceptions.BizException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *  统一响应参数
 *  所有接口返回参数都必须通过此类进行包装
 * @author hcq
 * @date 2019/7/20 0:08
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ResponseVO<T> {
    /**
     * 异常响应对象
     */
    private static final ResponseVO FAIL = new ResponseVO<>(ReturnCodeEnum.FAIL.getCode(), ReturnCodeEnum.FAIL.getDesc(), null);

    private String code;
    private String message;
    private T data;

    /**
     * 构建成功响应对象
     */
    public static  ResponseVO biuldSuccess() {
        return  new ResponseVO<>(ReturnCodeEnum.SUCCESS.getCode(), ReturnCodeEnum.SUCCESS.getDesc(), null);
    }
    public static <T> ResponseVO<T> biuldSuccess(T data) {
        return  new ResponseVO<>(ReturnCodeEnum.SUCCESS.getCode(), ReturnCodeEnum.SUCCESS.getDesc(), data);
    }

    /**
     * 构建异常响应对象
     */
    public static ResponseVO biuldException() {
        return new ResponseVO<>(ReturnCodeEnum.SYSTEM_ERROR.getCode(), ReturnCodeEnum.SYSTEM_ERROR.getDesc(), null);
    }
    public static  ResponseVO<BizException> biuldException(BizException e) {
        return new ResponseVO<BizException>(e.getCode(), e.getMessage(), null);
    }


}
