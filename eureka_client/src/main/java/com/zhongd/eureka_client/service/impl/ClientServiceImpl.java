package com.zhongd.eureka_client.service.impl;

import com.zhongd.eureka_client.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author xiezd 2018-05-02 22:54
 */
@Service
public class ClientServiceImpl implements ClientService{
    @Override
    public HashMap<String, Object> doSomething(String where, String who, String when) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("where", where);
        result.put("when", when);
        result.put("who", who);
        result.put("result", String.format("%s, %s %s", when, who, where));
        return result;
    }
}
