package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Card implements Serializable {
    private Map<Object, Object> bizParams;
    private String commentId;
    private List<CommentBean.CommentDetail> commentList;
    private String commentUUID;
    private int finish;
    private boolean isWhole;
    private String position;
    private String quote;
    private boolean unSubmitComment;

    public Map<Object, Object> getBizParams() {
        return this.bizParams;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public List<CommentBean.CommentDetail> getCommentList() {
        return this.commentList;
    }

    public String getCommentUUID() {
        return this.commentUUID;
    }

    public int getFinish() {
        return this.finish;
    }

    public String getPosition() {
        return this.position;
    }

    public String getQuote() {
        return this.quote;
    }

    public boolean isUnSubmitComment() {
        return this.unSubmitComment;
    }

    public boolean isWhole() {
        return this.isWhole;
    }

    public boolean isFinish() {
        if (this.finish != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Card{commentId='" + this.commentId + '\'' + ", comment_list=" + this.commentList + "unSubmited= " + this.unSubmitComment + '}';
    }

    public void setBizParams(Map<Object, Object> map) {
        this.bizParams = map;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCommentList(List<CommentBean.CommentDetail> list) {
        this.commentList = list;
    }

    public void setCommentUUID(String str) {
        this.commentUUID = str;
    }

    public void setFinish(int i) {
        this.finish = i;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setQuote(String str) {
        this.quote = str;
    }

    public void setUnSubmitComment(boolean z) {
        this.unSubmitComment = z;
    }

    public void setWhole(boolean z) {
        this.isWhole = z;
    }
}
