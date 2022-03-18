package com.bytedance.ee.bear.drive.biz.upload.filepicker.command;

public class NoSuchFileOrDirectoryException extends Exception {
    private static final long serialVersionUID = 8601894104043734066L;
    private String path;

    public NoSuchFileOrDirectoryException() {
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public NoSuchFileOrDirectoryException(String str) {
        super(str);
        this.path = str;
    }
}
