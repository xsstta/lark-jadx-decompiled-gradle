package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class AtBean implements AbstractC9490b<AtBean>, AbstractC9495h, NonProguard {
    private String atId;
    private String avatarUrl;
    private String content;
    private long createTime;
    private boolean lastItem;
    private String messageId;
    private int readStatus = 2;
    private int resolveStatus = 1;
    private String userId;

    public String getAtId() {
        return this.atId;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getContent() {
        return this.content;
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

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isLastItem() {
        return this.lastItem;
    }

    public void setAtId(String str) {
        this.atId = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setContent(String str) {
        this.content = str;
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

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean isSameItem(AtBean atBean) {
        return Objects.equals(this.messageId, atBean.messageId);
    }

    public boolean contentSame(AtBean atBean) {
        if (!Objects.equals(this.content, atBean.content) || !Objects.equals(this.avatarUrl, atBean.avatarUrl) || this.readStatus != atBean.readStatus || this.resolveStatus != atBean.resolveStatus) {
            return false;
        }
        return true;
    }
}
