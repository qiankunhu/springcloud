package com.hqk.springcloudprovider.controller;

import com.hqk.springcloudprovider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.StringRedisTemplate;
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

    @Autowired
    private TestService testService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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

    @RequestMapping("/userName")
    public String  getUserName(){

        return testService.gettest();
    }

    @RequestMapping("/redis")
    public String  getRedis(){

        stringRedisTemplate.opsForValue().set("name",testService.gettest());
        return stringRedisTemplate.opsForValue().get("name");
    }

}
