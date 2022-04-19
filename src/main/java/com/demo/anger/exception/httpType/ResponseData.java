package com.demo.anger.exception.httpType;

import com.demo.anger.exception.httpCode.BaseCode;
import com.demo.anger.exception.httpCode.ResultCode;
import com.demo.anger.exception.httpCode.UserEorrCode;
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
        return beanResponse;
    }

    public  static BeanResponse fail(String code,String msg){
        BeanResponse beanResponse = new BeanResponse(code,msg);
        beanResponse.setCode(code);
        beanResponse.setMessage(msg);
        System.out.println(beanResponse.toString());
        return beanResponse;
    }
}
