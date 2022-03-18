package com.ss.android.lark.feed.app.model.p1864d;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.h */
public class C37748h extends AbstractC37737a<ThreadFeedPreview> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ThreadFeedPreview mo138436a(FeedPreviewInfo feedPreviewInfo) {
        ThreadFeedPreview threadFeedPreview = new ThreadFeedPreview();
        mo138438a(threadFeedPreview, feedPreviewInfo);
        threadFeedPreview.setChatId(feedPreviewInfo.ao());
        return threadFeedPreview;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a
    /* renamed from: b */
    public void mo138439b(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        String E = feedPreviewInfo.mo105981E();
        if (E.length() > 80) {
            E = E.substring(0, 80);
        }
        feedPreview.setLocalizedDigestMessage(E);
    }

    /* renamed from: a */
    public List<ThreadFeedPreview> mo138451a(List<FeedPreviewInfo> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        List a = mo138437a(FeedCard.Type.THREAD, list);
        if (CollectionUtils.isNotEmpty(a)) {
            arrayList.addAll(a);
        }
        List a2 = mo138437a(FeedCard.Type.TOPIC, list);
        if (CollectionUtils.isNotEmpty(a2)) {
            arrayList.addAll(a2);
        }
        if (CollectionUtils.isEmpty(arrayList)) {
            return null;
        }
        return arrayList;
    }
}
