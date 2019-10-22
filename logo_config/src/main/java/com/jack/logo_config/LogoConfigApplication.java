package com.jack.logo_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class LogoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogoConfigApplication.class, args);
    }

}
