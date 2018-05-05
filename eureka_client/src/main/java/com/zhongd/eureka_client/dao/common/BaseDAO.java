package com.zhongd.eureka_client.dao.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author xiezd 2018-05-05 10:58
 */
public class BaseDAO {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
