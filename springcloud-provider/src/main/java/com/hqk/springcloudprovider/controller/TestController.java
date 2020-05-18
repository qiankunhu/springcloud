package com.hqk.springcloudprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/18 16:48
 * @Description:
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String getHello(){

        return "hello";
    }
}
