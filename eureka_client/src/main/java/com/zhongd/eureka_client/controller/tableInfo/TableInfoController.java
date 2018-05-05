package com.zhongd.eureka_client.controller.tableInfo;

import com.zhongd.eureka_client.entity.ReturnCode;
import com.zhongd.eureka_client.entity.ReturnObject;
import com.zhongd.eureka_client.entity.TableInfo;
import com.zhongd.eureka_client.service.tableInfo.TableInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author xiezd 2018-05-05 10:09
 */
@RestController
@RequestMapping("/table")
public class TableInfoController {

    @Autowired
    TableInfoService tableInfoService;

    @GetMapping("/info/{tableName}")
    public ReturnObject getTableInfoByName(@PathVariable("tableName") String tableName) {
        ReturnObject obj = new ReturnObject();
        int a = 0;
        try {
            TableInfo table = tableInfoService.getTableInfoByName(tableName);
            if (Objects.nonNull(table)) {
                obj.setData(table);
            } else {
                obj.setCode(ReturnCode.FAIL.getCode());
                obj.setDescription(ReturnCode.FAIL.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
            obj.setCode(ReturnCode.FAIL.getCode());
            obj.setDescription(ReturnCode.FAIL.getMessage());
        }
        return obj;
    }
}
