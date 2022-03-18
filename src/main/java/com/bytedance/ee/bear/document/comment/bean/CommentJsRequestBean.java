package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.util.io.NonProguard;

public class CommentJsRequestBean implements NonProguard {
    private String action;
    private String options;
    private boolean owner;
    private String token;
    private int type;

    public String getAction() {
        return this.action;
    }

    public String getOptions() {
        return this.options;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public boolean isOwner() {
        return this.owner;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setOptions(String str) {
        this.options = str;
    }

    public void setOwner(boolean z) {
        this.owner = z;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
