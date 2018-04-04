package com.zhongd.eureka_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiezd 2018-04-04 11:44
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    RestTemplate template;

    /**
     * Get请求调用微服务示例
     */
    @GetMapping("/calc")
    public void calc() {
        System.out.println("~~~begin get test~~~");
        ResponseEntity<Integer> result = template.getForEntity("http://EUREKA-SERVICE/service/calc?day={1}", Integer.class, "20");
        System.out.println(result);
    }

    /**
     * Post请求调用微服务示例
     */
    @GetMapping("/calc2")
    public void calc2() {
        System.out.println("~~~begin post test~~~");
        Map<String, Object> param = new HashMap<>();
        param.put("str1", "1231sdfsdgasg12");
        param.put("str2", "aszdfui32iuh");
        String result = template.postForObject("http://EUREKA-SERVICE/service/calc2", param, String.class);
        System.out.println(result);
    }
}
