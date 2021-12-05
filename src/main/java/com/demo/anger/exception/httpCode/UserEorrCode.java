package com.demo.anger.exception.httpCode;

/**
 * @Author 周敏怡
 * @Description //TODO 用户失败错误吗
 * @version: v1.8.0
 * @Date 2021/11/29 7:10 PM
 **/
public enum UserEorrCode implements BaseCode{
    // 用户信息不存在
    USER_NOT_Live("1001", "用户信息不存在！");


    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误描述
     */
    private final String msg;

    UserEorrCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
