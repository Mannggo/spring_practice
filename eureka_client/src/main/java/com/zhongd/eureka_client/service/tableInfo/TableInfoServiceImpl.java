package com.zhongd.eureka_client.service.tableInfo;

import com.zhongd.eureka_client.dao.tableInfo.TableInfoDAO;
import com.zhongd.eureka_client.entity.ColumnInfo;
import com.zhongd.eureka_client.entity.TableInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiezd 2018-05-05 10:33
 */
@Service
public class TableInfoServiceImpl implements TableInfoService {

    @Autowired
    TableInfoDAO tableInfoDAO;

    @Override
    public TableInfo getTableInfoByName(String tableName) {
        SqlRowSet rs = tableInfoDAO.queryARecord(tableName);
        SqlRowSetMetaData data = rs.getMetaData();
        int cc = data.getColumnCount();
        List<ColumnInfo> cols = new ArrayList<>();
        for (int i = 0; i <= cc; i ++) {
            ColumnInfo ci = new ColumnInfo();
            ci.setColumnName(data.getColumnName(i));
            ci.setColumnType(data.getColumnTypeName(i));
            ci.setRemark(data.getColumnLabel(i));
            cols.add(ci);
        }
        TableInfo tableInfo = new TableInfo();
        tableInfo.setColumns(cols);
        tableInfo.setTableName(data.getTableName(1));
        return tableInfo;
    }
}
