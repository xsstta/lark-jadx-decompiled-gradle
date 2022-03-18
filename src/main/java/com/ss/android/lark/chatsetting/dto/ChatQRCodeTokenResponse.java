package com.ss.android.lark.chatsetting.dto;

import java.io.Serializable;

public class ChatQRCodeTokenResponse implements Serializable {
    private long expireTime;
    private final boolean isUnLimited;
    private String token;
    private String url;

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isUnLimited() {
        return this.isUnLimited;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public ChatQRCodeTokenResponse(String str, String str2, long j, boolean z) {
        this.token = str;
        this.url = str2;
        this.expireTime = j;
        this.isUnLimited = z;
    }
}
