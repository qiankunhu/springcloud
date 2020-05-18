package com.hqk.springcloudconsumer.controller;

import com.hqk.springcloudconsumer.removeclient.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/18 17:06
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String getHello(){

        return "hello";
    }

    @RequestMapping("/feign")
    public String  getFign(){

        return  "这里是通过远程调用返回的"+testService.getHello();
    }
}
