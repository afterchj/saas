package com.demo.saas.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@RestController
public class UserApplication {

    @Value("${share.config1}")
    private String shareConfig1;

    @Value("${share.config2}")
    private String shareConfig2;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @GetMapping("/getShare1")
    public String getShare1() {
        return shareConfig1;
    }

    @GetMapping("/getShare2")
    public String getShare2() {
        return shareConfig2;
    }

}
