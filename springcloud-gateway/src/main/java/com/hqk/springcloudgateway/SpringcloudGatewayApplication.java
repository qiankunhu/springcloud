package com.hqk.springcloudgateway;

import com.hqk.springcloudgateway.resolver.UrlResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient //服务注册
public class SpringcloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayApplication.class, args);
    }


   /* @Bean
    public UrlResolver urlResolver(){
        return new UrlResolver();
    }*/
}
