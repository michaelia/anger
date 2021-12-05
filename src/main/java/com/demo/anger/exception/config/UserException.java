package com.demo.anger.exception.config;

import com.demo.anger.exception.httpCode.BaseCode;
import com.demo.anger.exception.httpCode.ResultCode;
import com.demo.anger.exception.httpCode.UserEorrCode;

/**
 * @Author 周敏怡
 * @Description //TODO  自定义出错
 * @version: v1.8.0
 * @Date 2021/11/26 8:32 PM
 **/
public class UserException extends Exception {
    /**
     * 错误码
     */
    protected String errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public UserException(BaseCode commonCode){
        this.errorCode = commonCode.getCode();
        this.errorMsg = commonCode.getMsg();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
