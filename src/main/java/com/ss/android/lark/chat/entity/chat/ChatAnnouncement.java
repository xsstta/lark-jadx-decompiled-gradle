package com.ss.android.lark.chat.entity.chat;

import java.io.Serializable;

public class ChatAnnouncement implements Serializable {
    private static final long serialVersionUID = 9059996248975978048L;
    private String announceUrl;
    private String chatId;
    private String content;
    private String docUrl;
    private String lastEditorId;
    private long updateTime;
    private boolean useOpenDoc;

    public String getAnnounceUrl() {
        return this.announceUrl;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getContent() {
        return this.content;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public String getLastEditorId() {
        return this.lastEditorId;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isUseOpenDoc() {
        return this.useOpenDoc;
    }

    public void setAnnounceUrl(String str) {
        this.announceUrl = str;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDocUrl(String str) {
        this.docUrl = str;
    }

    public void setLastEditorId(String str) {
        this.lastEditorId = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUseOpenDoc(boolean z) {
        this.useOpenDoc = z;
    }
}
