package com.github.fenixsoft.bookstore.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * SpringCloud Netflix全家桶的服务API网关（注意：这里把前端代码放到 gateway 这里 resources/static，但是在生产环境中并不是一种值得提倡的做法）
 *
 * @author icyfenix@gmail.com
 * @date 2020/4/17 17:50
 **/
@EnableZuulProxy // 开启代理
@EnableDiscoveryClient // 注册本服务（Eureka 也通用）
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
