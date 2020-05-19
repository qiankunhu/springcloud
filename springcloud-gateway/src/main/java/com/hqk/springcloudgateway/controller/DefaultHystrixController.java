package com.hqk.springcloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/19 10:36
 * @Description:
 */
@RestController
public class DefaultHystrixController {

    @RequestMapping("/defaultfallback")
    public Object defaultfallback(){
        System.out.println("降级操作...");
        Map<String,Object> map = new HashMap<>();
        map.put("code","false");
        map.put("message","服务异常");
        map.put("data","这里测试网关服务熔断");
        return map;
    }
}
