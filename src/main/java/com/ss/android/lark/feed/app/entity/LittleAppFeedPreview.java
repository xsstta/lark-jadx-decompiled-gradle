package com.ss.android.lark.feed.app.entity;

import android.text.TextUtils;

public class LittleAppFeedPreview extends FeedPreview {
    private static final long serialVersionUID = 4621184837728259187L;
    String appId;
    String lastAppNotificationId;
    String schema;

    public String getAppId() {
        return this.appId;
    }

    public String getLastAppNotificationId() {
        return this.lastAppNotificationId;
    }

    public String getSchema() {
        return this.schema;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setLastAppNotificationId(String str) {
        this.lastAppNotificationId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard, com.ss.android.lark.feed.app.entity.FeedPreview
    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof LittleAppFeedPreview)) {
            return false;
        }
        LittleAppFeedPreview littleAppFeedPreview = (LittleAppFeedPreview) obj;
        if (TextUtils.equals(this.appId, littleAppFeedPreview.getAppId()) && TextUtils.equals(this.schema, littleAppFeedPreview.getSchema()) && TextUtils.equals(this.lastAppNotificationId, littleAppFeedPreview.getLastAppNotificationId())) {
            return super.exactlyCompare(obj);
        }
        return false;
    }
}
