package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class QuoteTitleBean implements AbstractC9490b<QuoteTitleBean>, AbstractC9495h, NonProguard {
    private String comment_id;
    private String content;
    private int is_whole;

    public String getComment_id() {
        return this.comment_id;
    }

    public String getContent() {
        return this.content;
    }

    public int getIs_whole() {
        return this.is_whole;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIs_whole(int i) {
        this.is_whole = i;
    }

    public boolean contentSame(QuoteTitleBean quoteTitleBean) {
        return Objects.equals(this.content, quoteTitleBean.content);
    }

    public boolean isSameItem(QuoteTitleBean quoteTitleBean) {
        return Objects.equals(this.comment_id, quoteTitleBean.comment_id);
    }
}
