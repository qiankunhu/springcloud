package com.hqk.springcloudprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/18 16:48
 * @Description:
 */
@RestController
@RefreshScope //动态获取
public class TestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String getHello(){

        return "hello";
    }


    @RequestMapping("/json")
    public String getJson(@RequestBody String json){

        return "这里是网关拦截传过来的json："+json;
    }

    @RequestMapping("/name")
    public String name(){

        return name;
    }
}
