package com.zhongd.eureka_client.dao.tableInfo;

import com.zhongd.eureka_client.dao.common.BaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

/**
 * @author xiezd 2018-05-05 10:34
 */
@Repository
public class TableInfoDAO extends BaseDAO{

    public SqlRowSet queryARecord(String tableName) {
        return jdbcTemplate.queryForRowSet("SELECT * FROM " + tableName + " LIMIT 0");
    }
}
