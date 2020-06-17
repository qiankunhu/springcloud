package com.hqk.springcloudconsumer.controller;

import com.hqk.springcloudconsumer.mapper.TestUserMapper;
import com.hqk.springcloudconsumer.feignclient.TestService;
import com.hqk.springcloudconsumer.service.TestUserService;
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

    @Autowired
    private TestUserService testUserService;

    @Autowired
    private TestUserMapper testUserMapper;


    @RequestMapping("/hello")
    public String getHello(){

        return "hello";
    }

    @RequestMapping("/feign")
    public String  getFign(){

        return  "这里是通过远程调用返回的"+testService.getHello();
    }

    @RequestMapping("/age")
    public String  age(){

        return  "这里是查询数据库返回的年龄"+testUserMapper.getTest();
    }

    @RequestMapping("/updateAge")
    public String  updateAge(int age){

        return  "这里是修改数据库返回的年龄"+testUserService.updateAge(age);
    }
}
