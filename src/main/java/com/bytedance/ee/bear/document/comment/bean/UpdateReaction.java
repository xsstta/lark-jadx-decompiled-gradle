package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class UpdateReaction implements BaseJSModel {
    private String reactionKey;

    public String getReactionKey() {
        return this.reactionKey;
    }

    public String toString() {
        return "UpdateReaction{reactionKey='" + this.reactionKey + '\'' + '}';
    }

    public void setReactionKey(String str) {
        this.reactionKey = str;
    }
}
