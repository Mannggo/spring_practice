package com.zhongd.eureka_client.service;

import java.util.HashMap;

/**
 * @author xiezd 2018-05-02 22:53
 */
public interface ClientService {

    HashMap<String, Object> doSomething(String where, String who, String when);
}
