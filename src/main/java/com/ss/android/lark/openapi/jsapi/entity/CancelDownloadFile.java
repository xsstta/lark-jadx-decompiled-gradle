package com.ss.android.lark.openapi.jsapi.entity;

public class CancelDownloadFile implements BaseJSModel {
    private String taskId;

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }
}
