package com.zhongd.eureka_client.service.tableInfo;

import com.zhongd.eureka_client.entity.TableInfo;

/**
 * @author xiezd 2018-05-05 10:33
 */
public interface TableInfoService {
    TableInfo getTableInfoByName(String tableName);
}
