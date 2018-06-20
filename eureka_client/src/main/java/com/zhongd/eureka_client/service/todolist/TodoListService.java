package com.zhongd.eureka_client.service.todolist;

import com.zhongd.eureka_client.base.Pagination;
import com.zhongd.eureka_client.entity.dataobject.TodoDO;

import java.util.List;

/**
 * @author xiezd 2018-06-20 18:04
 */
public interface TodoListService {
    Pagination<TodoDO> list(Integer page, Integer pageSize, String key);
}
