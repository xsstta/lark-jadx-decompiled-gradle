package com.bytedance.ee.bear.drive.biz.comment.data;

import com.bytedance.ee.util.io.NonProguard;

public class CommentQuote implements NonProguard {
    private String key;
    private String[] params;

    public CommentQuote() {
    }

    public String getKey() {
        return this.key;
    }

    public String[] getParams() {
        return this.params;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setParams(String[] strArr) {
        this.params = strArr;
    }

    public CommentQuote(String str, String[] strArr) {
        this.key = str;
        this.params = strArr;
    }
}
