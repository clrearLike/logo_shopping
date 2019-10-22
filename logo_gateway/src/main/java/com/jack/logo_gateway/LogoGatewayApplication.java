package com.jack.logo_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关
 */
@SpringBootApplication
@EnableZuulProxy
public class LogoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogoGatewayApplication.class, args);
    }

}
