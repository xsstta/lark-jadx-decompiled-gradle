package com.ss.android.lark.feed.app.model.p1864d;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.BoxFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.b */
public class C37742b extends AbstractC37737a<BoxFeedPreview> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public BoxFeedPreview mo138436a(FeedPreviewInfo feedPreviewInfo) {
        BoxFeedPreview boxFeedPreview = new BoxFeedPreview();
        mo138438a((FeedPreview) boxFeedPreview, feedPreviewInfo);
        m148564a(boxFeedPreview, feedPreviewInfo);
        return boxFeedPreview;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a
    /* renamed from: b */
    public void mo138439b(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        feedPreview.setLocalizedDigestMessage(feedPreviewInfo.mo105981E());
    }

    /* renamed from: a */
    public List<BoxFeedPreview> mo138442a(List<FeedPreviewInfo> list, boolean z) {
        return mo138437a(FeedCard.Type.BOX, list);
    }

    /* renamed from: a */
    private void m148564a(BoxFeedPreview boxFeedPreview, FeedPreviewInfo feedPreviewInfo) {
        String str;
        String str2;
        String str3 = " ";
        if (feedPreviewInfo.mo106106t() > 1) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_UnReadCounts, "unread_count", Long.toString(feedPreviewInfo.mo106106t())) + str3;
        } else if (feedPreviewInfo.mo106106t() == 1) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_UnReadCount, "unread_count", Long.toString(feedPreviewInfo.mo106106t())) + str3;
        } else {
            str = "";
        }
        boxFeedPreview.setMarkText(str);
        List<FeedPreviewInfo.AtInfo> I = feedPreviewInfo.mo105985I();
        int i = 0;
        if (!CollectionUtils.isNotEmpty(I)) {
            str2 = "";
        } else if (I.size() == 1) {
            str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedBoxOneGroupHasAt, "chat_name", I.get(0).mo106122d());
        } else {
            str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AtInGroups, "chat_count", Integer.toString(I.size()));
        }
        long t = feedPreviewInfo.mo106106t();
        if (!TextUtils.isEmpty(str2)) {
            i = 2;
            boxFeedPreview.setMarkText(str2);
        }
        if (t > 0) {
            i |= 4;
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            }
            boxFeedPreview.setLocalizedDigestMessage(str3 + "[" + feedPreviewInfo.mo105981E() + "]");
        }
        if (feedPreviewInfo.mo105987K()) {
            i |= 16;
            boxFeedPreview.setMarkText("[" + UIHelper.getString(R.string.Lark_Legacy_SpecialRemind) + "]");
        }
        boxFeedPreview.setLastMsgType(i);
    }
}
