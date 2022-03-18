package com.ss.android.lark.download.service;

import com.ss.android.lark.biz.core.api.FileDownloadState;
import java.io.Serializable;

public class DownloadProgress implements Serializable {
    private static final long serialVersionUID = 845768575142564090L;
    private String channelId;
    private String key;
    private String messageId;
    private int progress;
    private String sourceId;
    private FileDownloadState state;

    public String getChannelId() {
        return this.channelId;
    }

    public String getKey() {
        return this.key;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getProgress() {
        return this.progress;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public FileDownloadState getState() {
        return this.state;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }

    public void setState(FileDownloadState fileDownloadState) {
        this.state = fileDownloadState;
    }
}
