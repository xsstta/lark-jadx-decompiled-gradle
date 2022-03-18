package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class HideCountBean implements AbstractC9490b<HideCountBean>, AbstractC9495h, NonProguard {
    private String commentId;
    private int count;
    private boolean whole;

    public String getCommentId() {
        return this.commentId;
    }

    public int getCount() {
        return this.count;
    }

    public boolean isWhole() {
        return this.whole;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setWhole(boolean z) {
        this.whole = z;
    }

    public boolean contentSame(HideCountBean hideCountBean) {
        if (this.count == hideCountBean.count) {
            return true;
        }
        return false;
    }

    public boolean isSameItem(HideCountBean hideCountBean) {
        return Objects.equals(this.commentId, hideCountBean.commentId);
    }
}
