package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class StatusTitleBean implements AbstractC9490b<StatusTitleBean>, AbstractC9495h, NonProguard {
    private String commentId;
    private String content;
    private int type;
    private int whole = 1;

    public String getCommentId() {
        return this.commentId;
    }

    public String getContent() {
        return this.content;
    }

    public int getType() {
        return this.type;
    }

    public int getWhole() {
        return this.whole;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWhole(int i) {
        this.whole = i;
    }

    public boolean isSameItem(StatusTitleBean statusTitleBean) {
        return Objects.equals(this.commentId, statusTitleBean.commentId);
    }

    public boolean contentSame(StatusTitleBean statusTitleBean) {
        if (!Objects.equals(this.content, statusTitleBean.commentId) || this.type != statusTitleBean.type) {
            return false;
        }
        return true;
    }
}
