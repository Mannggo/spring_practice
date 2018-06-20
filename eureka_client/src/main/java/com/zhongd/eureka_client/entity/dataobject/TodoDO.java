package com.zhongd.eureka_client.entity.dataobject;

import java.util.Date;

/**
 * @author xiezd 2018-06-20 18:12
 */
public class TodoDO {
    private String title;
    private Date completeDate;
    private String content;
    private Integer priporty;
    private String completed;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPriporty() {
        return priporty;
    }

    public void setPriporty(Integer priporty) {
        this.priporty = priporty;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
