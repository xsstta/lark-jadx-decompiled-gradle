package com.ss.android.lark.feed.app.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BoxFeedPreview extends FeedPreview {
    private int lastMsgType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxLastMsgType {
    }

    public int getLastMsgType() {
        return this.lastMsgType;
    }

    public void setLastMsgType(int i) {
        this.lastMsgType = i;
    }

    public boolean hasSpecificMsgType(int i) {
        if ((i & this.lastMsgType) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard, com.ss.android.lark.feed.app.entity.FeedPreview
    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof BoxFeedPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.lastMsgType != ((BoxFeedPreview) obj).lastMsgType) {
            return false;
        }
        return super.exactlyCompare(obj);
    }
}
