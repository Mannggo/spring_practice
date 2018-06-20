package com.zhongd.eureka_client.service.todolist;

import com.zhongd.eureka_client.base.Pagination;
import com.zhongd.eureka_client.dao.todolist.TodoListDAO;
import com.zhongd.eureka_client.dto.param.PaginationParam;
import com.zhongd.eureka_client.entity.dataobject.TodoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiezd 2018-06-20 19:06
 */
@Service
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    TodoListDAO todoListDAO;

    @Override
    public Pagination<TodoDO> list(Integer page, Integer pageSize, String key) {
        PaginationParam pp = new PaginationParam(page, pageSize);
        Map<String, Object> param = new HashMap<>();
        param.put("key", "%" + key + "%");
        return todoListDAO.list(pp, param);
    }
}
