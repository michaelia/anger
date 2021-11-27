package com.demo.anger.exception.config;

import com.demo.anger.exception.httpType.ResultCode;

/**
 * @Author 周敏怡
 * @Description //TODO  自定义出错
 * @version: v1.8.0
 * @Date 2021/11/26 8:32 PM
 **/
public class BaseException extends Exception {

    private ResultCode resultCode;

    public BaseException(ResultCode commonCode){
        this.resultCode = commonCode;
    }

}
