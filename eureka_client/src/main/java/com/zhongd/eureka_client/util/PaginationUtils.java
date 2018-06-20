package com.zhongd.eureka_client.util;

/**
 * @author xiezd 2018-06-20 19:15
 */
public class PaginationUtils {

    public static String generateCountSql(String sql) {
        return "SELECT COUNT(1) FROM (" + sql + ")";
    }

    public static String generatePaginationSql(String sql, Integer page, Integer pageSize) {
        Integer limit = pageSize;
        Integer offset = (page - 1) * pageSize;
        return sql + " LIMIT " + limit + ", " + offset;
    }
}
