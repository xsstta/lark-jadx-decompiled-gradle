package com.ss.android.lark.feed.app.model.p1864d;

import com.larksuite.component.ui.tag.LarkNameTag;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.e */
public class C37745e extends AbstractC37737a<LittleAppFeedPreview> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LittleAppFeedPreview mo138436a(FeedPreviewInfo feedPreviewInfo) {
        LittleAppFeedPreview littleAppFeedPreview = new LittleAppFeedPreview();
        mo138438a((FeedPreview) littleAppFeedPreview, feedPreviewInfo);
        m148583a(littleAppFeedPreview, feedPreviewInfo);
        m148582a(littleAppFeedPreview);
        return littleAppFeedPreview;
    }

    /* renamed from: a */
    private void m148582a(LittleAppFeedPreview littleAppFeedPreview) {
        LarkNameTag a = C37711b.m148268a(UIHelper.getContext(), littleAppFeedPreview);
        C37711b.m148269a().mo138227a(a, a.mo90006b());
        littleAppFeedPreview.setFeedNameTag(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a
    /* renamed from: b */
    public void mo138439b(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        feedPreview.setLocalizedDigestMessage(feedPreviewInfo.mo105981E());
    }

    /* renamed from: a */
    private void m148583a(LittleAppFeedPreview littleAppFeedPreview, FeedPreviewInfo feedPreviewInfo) {
        littleAppFeedPreview.setAppId(feedPreviewInfo.ab());
        littleAppFeedPreview.setSchema(feedPreviewInfo.ac());
        littleAppFeedPreview.setLastAppNotificationId(feedPreviewInfo.ad());
    }

    /* renamed from: a */
    public List<LittleAppFeedPreview> mo138447a(List<FeedPreviewInfo> list, boolean z) {
        List<LittleAppFeedPreview> a = mo138437a(FeedCard.Type.APP, list);
        List<LittleAppFeedPreview> a2 = mo138437a(FeedCard.Type.OPEN_APP_CHAT, list);
        if (a2 == null) {
            return a;
        }
        if (a == null) {
            return a2;
        }
        a.addAll(a2);
        return a;
    }
}
