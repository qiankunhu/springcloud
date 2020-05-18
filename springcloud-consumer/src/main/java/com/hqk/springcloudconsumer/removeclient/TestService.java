package com.hqk.springcloudconsumer.removeclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/18 17:19
 * @Description:
 */
@FeignClient("service-provider")
public interface TestService {

    @RequestMapping("hello")
    public String  getHello();
}
