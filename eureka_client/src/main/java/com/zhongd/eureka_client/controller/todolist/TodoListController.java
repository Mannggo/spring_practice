package com.zhongd.eureka_client.controller.todolist;

import com.zhongd.eureka_client.entity.ReturnObject;
import com.zhongd.eureka_client.service.todolist.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiezd 2018-06-20 17:59
 */
@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    TodoListService todoListService;

    @GetMapping("/list")
    public ReturnObject list(Integer page, Integer pageSize, String key) {
        ReturnObject obj = new ReturnObject();
        obj.setData(todoListService.list(page, pageSize, key));
        return obj;
    }

}
