package com.ss.android.lark.chat.entity.media;

import java.io.Serializable;

public class MediaExtra implements Serializable {
    private long duration;
    private String filePath = "";
    private String key = "";
    private String mime;
    private long size;
    private String url = "";

    public long getDuration() {
        return this.duration;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getKey() {
        return this.key;
    }

    public String getMime() {
        return this.mime;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
