package com.bytedance.ee.bear.document.imageviewer.bean;

import com.bytedance.ee.bear.document.comment.bean.Card;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.ArrayList;
import java.util.List;

public class CardCommentData implements BaseJSModel {
    private boolean commentable;
    private List<Card> comments = new ArrayList();

    public List<Card> getComments() {
        return this.comments;
    }

    public boolean isCommentable() {
        return this.commentable;
    }

    public String toString() {
        return "CardCommentData{commentable=" + this.commentable + ", comments=" + this.comments + '}';
    }

    public void setCommentable(boolean z) {
        this.commentable = z;
    }

    public void setComments(List<Card> list) {
        this.comments = list;
    }
}
