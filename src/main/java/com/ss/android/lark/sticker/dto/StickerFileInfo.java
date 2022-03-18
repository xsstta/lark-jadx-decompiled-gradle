package com.ss.android.lark.sticker.dto;

import java.io.Serializable;

public class StickerFileInfo implements Serializable {
    private String FilePath;
    private int height;
    private String key;
    private String url;
    private int width;

    public StickerFileInfo() {
    }

    public String getFilePath() {
        return this.FilePath;
    }

    public int getHeight() {
        return this.height;
    }

    public String getKey() {
        return this.key;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setFilePath(String str) {
        this.FilePath = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public StickerFileInfo(String str, String str2, String str3, int i, int i2) {
        this.key = str;
        this.url = str2;
        this.FilePath = str3;
        this.width = i;
        this.height = i2;
    }
}
