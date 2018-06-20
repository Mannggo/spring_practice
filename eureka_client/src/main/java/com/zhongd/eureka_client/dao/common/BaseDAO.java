package com.zhongd.eureka_client.dao.common;

import com.zhongd.eureka_client.base.Pagination;
import com.zhongd.eureka_client.dto.param.PaginationParam;
import com.zhongd.eureka_client.util.PaginationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author xiezd 2018-05-05 10:58
 */
public abstract class BaseDAO {
    @Autowired
    protected NamedParameterJdbcTemplate jdbcTemplate;

    /**
     * 获取分页数据
     * @param sql
     * @param pp
     * @param param
     * @param tClass
     * @param <T>
     * @return
     */
    public <T> Pagination<T> getPagination(String sql, PaginationParam pp, Map<String, Object> param, Class<T> tClass){
        Pagination<T> result = new Pagination<>();
        String countSql = PaginationUtils.generateCountSql(sql);
        Integer total = jdbcTemplate.queryForObject(countSql, param, Integer.class);
        result.setTotal(total);
        String paginationSql = PaginationUtils.generatePaginationSql(sql, pp.getPage(), pp.getPageSize());
        List<T> data = jdbcTemplate.queryForList(paginationSql, param, tClass);
        result.setData(data);
        result.setPage(pp.getPage());
        result.setPageSize(pp.getPageSize());
        return result;
    }
}
