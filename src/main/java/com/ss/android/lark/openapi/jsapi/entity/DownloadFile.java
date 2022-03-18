package com.ss.android.lark.openapi.jsapi.entity;

public class DownloadFile implements BaseJSModel {
    private String taskId;
    private String url;

    public String getTaskId() {
        return this.taskId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
