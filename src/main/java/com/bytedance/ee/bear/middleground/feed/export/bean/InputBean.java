package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class InputBean implements AbstractC9490b<InputBean>, AbstractC9495h, NonProguard {
    private String commentId;
    private int is_whole;

    public boolean contentSame(InputBean inputBean) {
        return true;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public int getIs_whole() {
        return this.is_whole;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setIs_whole(int i) {
        this.is_whole = i;
    }

    public boolean isSameItem(InputBean inputBean) {
        return Objects.equals(this.commentId, inputBean.commentId);
    }
}
