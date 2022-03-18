package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.util.io.NonProguard;

public class SwitchCardBean implements NonProguard {
    private String commentId;

    public String getCommentId() {
        return this.commentId;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }
}
