package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class DeleteBean implements AbstractC9490b<DeleteBean>, AbstractC9495h, NonProguard {
    private String avatarUrl;
    private String commentId;
    private long createTime;
    private boolean lastItem;
    private String messageId;
    private int readStatus = 2;
    private String replyId;
    private int resolveStatus;
    private String titleStr = "";
    private int type = 1;
    private String userId;
    private boolean whole;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getReadStatus() {
        return this.readStatus;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public String getTitleStr() {
        return this.titleStr;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isLastItem() {
        return this.lastItem;
    }

    public boolean isWhole() {
        return this.whole;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setLastItem(boolean z) {
        this.lastItem = z;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setReadStatus(int i) {
        this.readStatus = i;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setResolveStatus(int i) {
        this.resolveStatus = i;
    }

    public void setTitleStr(String str) {
        this.titleStr = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setWhole(boolean z) {
        this.whole = z;
    }

    public boolean isSameItem(DeleteBean deleteBean) {
        return Objects.equals(this.messageId, deleteBean.messageId);
    }

    public boolean contentSame(DeleteBean deleteBean) {
        if (Objects.equals(this.avatarUrl, deleteBean.avatarUrl) && this.readStatus == deleteBean.readStatus && this.resolveStatus == deleteBean.resolveStatus && this.type == deleteBean.type) {
            return true;
        }
        return false;
    }
}
