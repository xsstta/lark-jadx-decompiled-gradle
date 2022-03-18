package com.ss.android.lark.feed.app.model.p1864d;

import android.text.TextUtils;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.d */
public class C37744d extends AbstractC37737a<DocFeedPreview> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public DocFeedPreview mo138436a(FeedPreviewInfo feedPreviewInfo) {
        DocFeedPreview docFeedPreview = new DocFeedPreview();
        mo138438a((FeedPreview) docFeedPreview, feedPreviewInfo);
        m148577a(docFeedPreview, feedPreviewInfo);
        m148576a(docFeedPreview);
        return docFeedPreview;
    }

    /* renamed from: a */
    private void m148576a(DocFeedPreview docFeedPreview) {
        LarkNameTag a = C37711b.m148267a(UIHelper.getContext(), docFeedPreview);
        C37711b.m148269a().mo138227a(a, a.mo90006b());
        docFeedPreview.setFeedNameTag(a);
    }

    /* renamed from: a */
    public List<DocFeedPreview> mo138446a(List<FeedPreviewInfo> list, boolean z) {
        return mo138437a(FeedCard.Type.DOC, list);
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
    private void m148577a(DocFeedPreview docFeedPreview, FeedPreviewInfo feedPreviewInfo) {
        docFeedPreview.setDocType(feedPreviewInfo.mo106083k());
        docFeedPreview.setDocMessageType(feedPreviewInfo.mo106001Y());
        docFeedPreview.setLastDocMessageId(feedPreviewInfo.mo106002Z());
        docFeedPreview.setDocUrl(feedPreviewInfo.mo106086l());
        if (TextUtils.isEmpty(docFeedPreview.getName())) {
            docFeedPreview.setName(UIHelper.getString(R.string.Lark_Legacy_DefaultName));
        }
    }
}
