package com.zhongd.eureka_client.entity;

import java.util.List;

/**
 * @author xiezd 2018-05-05 10:24
 */
public class TableInfo {
    /**
     * 表名
     */
    private String tableName;
    /**
     * 列集合
     */
    private List<ColumnInfo> columns;
    /**
     * 表注释
     */
    private String remark;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<ColumnInfo> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnInfo> columns) {
        this.columns = columns;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
