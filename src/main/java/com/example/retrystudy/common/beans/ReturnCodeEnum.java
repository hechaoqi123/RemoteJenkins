package com.example.retrystudy.common.beans;

/**
 *  响应状态码
 *  封装所有状态响应码
 * @author hcq
 * @date 2019/7/19 23:07
 */
public enum ReturnCodeEnum {
    /**
     *  请求成功
     */
    SUCCESS("00","SUCCESS"),
    /**
     *  请求失败
     */
    FAIL("01","FAIL"),

    /**
     * 参数校验异常
     */
    PARAMS_ERROR("0201","参数不合法"),
    /**
     * 验签失败
     */
    SIGN_ERROR("0202","验签失败"),
    /**
     * 连接超时
     */
    TIME_OUT("04","连接超时"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR("99","系统异常");

    private final String code;
    private final String desc;


    ReturnCodeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
