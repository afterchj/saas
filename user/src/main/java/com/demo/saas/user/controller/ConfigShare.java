package com.demo.saas.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigShare {

    @Value("${nacos.share}")
    private String share;
//
//    @Value("${share.config1}")
//    private String shareConfig1;
//
//    @Value("${share.config2}")
//    private String shareConfig2;

    @GetMapping("/getValue")
    public String getValue() {
        System.out.println(share);
        return share;
    }

//    @GetMapping("/getShare1")
//    public String getShare1() {
//        return shareConfig1;
//    }
//
//    @GetMapping("/getShare2")
//    public String getShare2() {
//        return shareConfig2;
//    }

}
