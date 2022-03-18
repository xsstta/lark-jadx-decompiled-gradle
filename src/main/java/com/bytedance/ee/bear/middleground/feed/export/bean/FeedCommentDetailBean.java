package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class FeedCommentDetailBean extends BaseFeedMessageDetailBean implements AbstractC9490b<FeedCommentDetailBean>, AbstractC9495h, NonProguard {
    @JSONField(name = "create_time")
    private long createTime;
    private boolean lastItem;
    @JSONField(name = "message_id")
    private String messageId;
    private int readStatus;
    private int resolveStatus;
    private CharSequence titleStr = "";
    private int type;

    public long getCreateTime() {
        return this.createTime;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getReadStatus() {
        return this.readStatus;
    }

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public CharSequence getTitleStr() {
        return this.titleStr;
    }

    public int getType() {
        return this.type;
    }

    public boolean isLastItem() {
        return this.lastItem;
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

    public void setResolveStatus(int i) {
        this.resolveStatus = i;
    }

    public void setTitleStr(CharSequence charSequence) {
        this.titleStr = charSequence;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean isSameItem(FeedCommentDetailBean feedCommentDetailBean) {
        return Objects.equals(getReply_id(), feedCommentDetailBean.getReply_id());
    }

    public boolean contentSame(FeedCommentDetailBean feedCommentDetailBean) {
        if (super.equals(feedCommentDetailBean) && this.readStatus == feedCommentDetailBean.readStatus && this.resolveStatus == feedCommentDetailBean.resolveStatus && this.lastItem == feedCommentDetailBean.lastItem) {
            return true;
        }
        return false;
    }
}
