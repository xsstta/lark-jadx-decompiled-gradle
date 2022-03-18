package com.ss.android.lark.forward.dto;

import java.io.Serializable;

public class ThreadTarget implements Serializable {
    private String mAvatar;
    private String mChatId;
    private String mId;
    private String mName;

    public String getAvatar() {
        return this.mAvatar;
    }

    public String getChatId() {
        return this.mChatId;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public void setAvatar(String str) {
        this.mAvatar = str;
    }

    public void setChatId(String str) {
        this.mChatId = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public ThreadTarget(String str, String str2, String str3, String str4) {
        this.mId = str;
        this.mName = str2;
        this.mAvatar = str3;
        this.mChatId = str4;
    }
}
