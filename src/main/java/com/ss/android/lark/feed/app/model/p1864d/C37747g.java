package com.ss.android.lark.feed.app.model.p1864d;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.binder.SubscriptionsFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.g */
public class C37747g extends AbstractC37737a<SubscriptionsFeedPreview> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SubscriptionsFeedPreview mo138436a(FeedPreviewInfo feedPreviewInfo) {
        SubscriptionsFeedPreview subscriptionsFeedPreview = new SubscriptionsFeedPreview();
        mo138438a((FeedPreview) subscriptionsFeedPreview, feedPreviewInfo);
        m148590a(subscriptionsFeedPreview, feedPreviewInfo);
        return subscriptionsFeedPreview;
    }

    /* renamed from: a */
    private void m148590a(SubscriptionsFeedPreview subscriptionsFeedPreview, FeedPreviewInfo feedPreviewInfo) {
        subscriptionsFeedPreview.setSchema(feedPreviewInfo.ac());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a
    /* renamed from: b */
    public void mo138439b(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        feedPreview.setLocalizedDigestMessage(feedPreviewInfo.mo105981E());
    }

    /* renamed from: a */
    public List<SubscriptionsFeedPreview> mo138450a(List<FeedPreviewInfo> list, boolean z) {
        return mo138437a(FeedCard.Type.SUBSCRIPTION, list);
    }
}
