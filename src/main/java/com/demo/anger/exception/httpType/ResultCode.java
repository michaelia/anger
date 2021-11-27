package com.demo.anger.exception.httpType;

public enum ResultCode {
    // 数据操作错误定义
    SUCCESS("200", "成功!"),
    SERVER_BUSY("500","服务器正忙，请稍后再试!"),
    UnknownError("501","未知错误");

    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误描述
     */
    private final String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
