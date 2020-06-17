package com.hqk.springcloudconsumer.feignclient;

import com.hqk.springcloudconsumer.feignclient.fallback.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/18 17:19
 * @Description:  feign 服务调用
 */
//@FeignClient(name="service-provider",fallback = TestServiceImpl.class)
@FeignClient(name="service-provider")
public interface TestService {

    @RequestMapping("hello")
    public String  getHello();

    @RequestMapping("updateUserName")
    public String  updateUserName(@RequestParam("name") String name);


}
