package com.ss.android.lark.chatsetting.dto;

import java.io.Serializable;

public class ChatLinkTokenResponse implements Serializable {
    private String displayContent;
    private long expireTime;
    private boolean isUnLimited;
    private String sharedUrl;
    private String token;

    public String getDisplayContent() {
        return this.displayContent;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getSharedUrl() {
        return this.sharedUrl;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isUnLimited() {
        return this.isUnLimited;
    }

    public void setDisplayContent(String str) {
        this.displayContent = str;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setSharedUrl(String str) {
        this.sharedUrl = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUnLimited(boolean z) {
        this.isUnLimited = z;
    }

    public ChatLinkTokenResponse(String str, String str2, String str3, long j) {
        this.token = str;
        this.sharedUrl = str2;
        this.displayContent = str3;
        this.expireTime = j;
    }

    public ChatLinkTokenResponse(String str, String str2, String str3, long j, boolean z) {
        this.token = str;
        this.sharedUrl = str2;
        this.displayContent = str3;
        this.expireTime = j;
        this.isUnLimited = z;
    }
}
