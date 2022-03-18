package com.ss.android.lark.openapi.jsapi.entity;

public class OpenDocument implements BaseJSModel {
    private String filePath;
    private String fileType;

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }
}
