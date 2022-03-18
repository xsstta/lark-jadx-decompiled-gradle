package com.ss.android.lark.chat.entity.chat;

import java.io.Serializable;

public class ChatSetting implements Serializable {
    private String chatId;
    private boolean isInBox;
    private boolean isRemind = true;
    private long updateTime;

    public String getChatId() {
        return this.chatId;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isInBox() {
        return this.isInBox;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    public ChatSetting() {
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setInBox(boolean z) {
        this.isInBox = z;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public ChatSetting(String str, boolean z, long j) {
        this.isRemind = z;
        this.updateTime = j;
        this.chatId = str;
    }

    public ChatSetting(String str, boolean z, long j, boolean z2) {
        this.isRemind = z;
        this.updateTime = j;
        this.chatId = str;
        this.isInBox = z2;
    }
}
