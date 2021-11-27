package com.demo.anger.exception.httpType;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author 周敏怡
 * @Description //TODO
 * @version: v1.8.0
 * @Date 2021/11/25 10:33 PM
 **/

@Slf4j
public class ResponseData {

    public  static  BeanResponse success(Object data) {
        BeanResponse beanResponse = new BeanResponse();
        beanResponse.setCode(ResultCode.SUCCESS.getCode());
        beanResponse.setMessage(ResultCode.SUCCESS.getMsg());

        beanResponse.setResult(data);
        log.debug(beanResponse.getMessage());
        return beanResponse;
    }

    public  static BeanResponse fail(ResultCode resultCode){
        BeanResponse beanResponse = new BeanResponse();
        beanResponse.setCode(resultCode.getCode());
        beanResponse.setMessage(resultCode.getMsg());
        return beanResponse;
    }
}
