package com.ss.android.lark.feed.app;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.c */
public class C37427c {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.c$a */
    public static class C37428a {

        /* renamed from: a */
        public static final C37427c f96025a = new C37427c();
    }

    /* renamed from: a */
    public static C37427c m147290a() {
        return C37428a.f96025a;
    }

    /* renamed from: b */
    public String mo137333b() {
        List<UIFeedCard> c;
        UpdateRecord h = C37731d.m148488a().mo138417h();
        if (!(h == null || (c = h.mo138376c()) == null || c.size() == 0)) {
            for (UIFeedCard uIFeedCard : c) {
                if (uIFeedCard != null && uIFeedCard.getType() == FeedCard.Type.CHAT && (uIFeedCard instanceof ChatFeedPreview)) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) uIFeedCard;
                    if (chatFeedPreview.isTenantChat()) {
                        return chatFeedPreview.getId();
                    }
                }
            }
        }
        return null;
    }
}
