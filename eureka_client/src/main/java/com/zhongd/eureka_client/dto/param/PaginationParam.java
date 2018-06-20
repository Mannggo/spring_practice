package com.zhongd.eureka_client.dto.param;

/**
 * @author xiezd 2018-06-20 18:05
 */
public class PaginationParam {
    private Integer pageSize;
    private Integer page;

    public PaginationParam(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
