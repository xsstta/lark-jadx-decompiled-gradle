package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;

public class NoneRtlSupportFeedItemView extends FeedItemView {
    public boolean isLayoutDirectionInherited() {
        return false;
    }

    public void resetRtlProperties() {
    }

    public boolean resolveRtlPropertiesIfNeeded() {
        return false;
    }

    public NoneRtlSupportFeedItemView(Context context) {
        super(context);
    }

    public NoneRtlSupportFeedItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoneRtlSupportFeedItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
