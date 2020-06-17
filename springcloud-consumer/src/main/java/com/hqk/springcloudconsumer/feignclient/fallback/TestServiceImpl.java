package com.hqk.springcloudconsumer.feignclient.fallback;

import com.hqk.springcloudconsumer.feignclient.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/21 16:35
 * @Description: 服务降级
 */
@Slf4j
//@Component
public class TestServiceImpl /*implements TestService*/ {

   /* @Override
    public String getHello() {
        log.info("服务调用失败");
        return null;
    }

    @Override
    public String updateUserName(String name) {
        return null;
    }*/
}
