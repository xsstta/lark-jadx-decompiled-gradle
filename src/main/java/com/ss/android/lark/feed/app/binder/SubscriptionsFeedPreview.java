package com.ss.android.lark.feed.app.binder;

import android.text.TextUtils;
import com.ss.android.lark.feed.app.entity.FeedPreview;

public class SubscriptionsFeedPreview extends FeedPreview {
    String schema;

    public String getSchema() {
        return this.schema;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard, com.ss.android.lark.feed.app.entity.FeedPreview
    public boolean exactlyCompare(Object obj) {
        if ((obj instanceof SubscriptionsFeedPreview) && TextUtils.equals(this.schema, ((SubscriptionsFeedPreview) obj).getSchema())) {
            return super.exactlyCompare(obj);
        }
        return false;
    }
}
