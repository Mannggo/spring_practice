package com.zhongd.eureka_client.base;

import java.util.List;

/**
 * @author xiezd 2018-06-20 18:16
 */
public class Pagination<T> {
    private Integer page;
    private Integer pageSize;
    private List<T> data;
    private Integer total;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
