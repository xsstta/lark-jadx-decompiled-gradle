package com.bytedance.ee.bear.atfinder;

import com.bytedance.ee.util.io.NonProguard;

public class MentionModel implements NonProguard {
    private String chatId;
    private String keyword;
    private int source;
    private String token;

    public MentionModel() {
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public int getSource() {
        return this.source;
    }

    public String getToken() {
        return this.token;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public MentionModel(String str, String str2, int i) {
        this.keyword = str;
        this.token = str2;
        this.source = i;
    }

    public MentionModel(String str, String str2, int i, String str3) {
        this.keyword = str;
        this.token = str2;
        this.source = i;
        this.chatId = str3;
    }
}
