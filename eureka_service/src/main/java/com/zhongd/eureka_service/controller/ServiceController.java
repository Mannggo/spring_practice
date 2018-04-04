package com.zhongd.eureka_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author xiezd 2018-04-04 11:39
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    DiscoveryClient client;

    @GetMapping("/calc")
    public Integer calculate(int day) {
        int result = day * 24 * 3600;
        System.out.println(client.description());
        return result;
    }

    @PostMapping("/calc2")
    public String calculate(@RequestBody Map<String, Object> param) {
        String str1 = (String) param.get("str1");
        String str2 = (String) param.get("str2");
        return String.valueOf(str1.length() + str2.length());
    }
}
