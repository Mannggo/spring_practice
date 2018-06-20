package com.zhongd.eureka_client.dao.todolist;

import com.zhongd.eureka_client.base.Pagination;
import com.zhongd.eureka_client.dao.common.BaseDAO;
import com.zhongd.eureka_client.dto.param.PaginationParam;
import com.zhongd.eureka_client.entity.dataobject.TodoDO;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author xiezd 2018-06-20 19:36
 */
@Repository
public class TodoListDAO extends BaseDAO {
    public Pagination<TodoDO> list(PaginationParam pp, Map<String,Object> param) {
        String sql = "SELECT * FROM todo_list WHERE 1 = 1 ";
        if (!param.isEmpty()) {
            sql += "AND title like :key ";
        }
        return getPagination(sql, pp, param, TodoDO.class);
    }
}
