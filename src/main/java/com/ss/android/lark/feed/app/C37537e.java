package com.ss.android.lark.feed.app;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.eetroublecapture.AbstractC36988h;
import com.ss.android.lark.eetroublecapture.C36997n;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.e */
public class C37537e {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.e$a */
    public static final class C37538a extends AbstractC36988h<FeedPreview> {

        /* renamed from: d */
        private int f96248d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Map<String, String> mo129761a(FeedPreview feedPreview) {
            int i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", feedPreview.getId());
            if (feedPreview.getName() != null) {
                i = feedPreview.getName().length();
            } else {
                i = 0;
            }
            linkedHashMap.put("titleLength", String.valueOf(i));
            linkedHashMap.put("time", String.valueOf(feedPreview.getDisplayTime()));
            linkedHashMap.put("position", String.valueOf(this.f96248d));
            linkedHashMap.put("parentCardId", feedPreview.getParentCardId());
            if (feedPreview.getType() != null) {
                linkedHashMap.put(ShareHitPoint.f121869d, feedPreview.getType().name());
            }
            linkedHashMap.put("unreadCount", String.valueOf(feedPreview.getUnreadCount()));
            return linkedHashMap;
        }

        public C37538a(FeedPreview feedPreview, int i) {
            super(feedPreview);
            this.f96248d = i;
        }
    }

    /* renamed from: a */
    public static void m147608a(View view, FeedPreview feedPreview, int i) {
        C37538a aVar;
        Object tag = view.getTag(R.id.tag_troublecapture_view);
        if (tag instanceof C37538a) {
            aVar = (C37538a) tag;
        } else {
            aVar = new C37538a(feedPreview, i);
        }
        aVar.mo136501b(feedPreview);
        aVar.mo136515a(true);
        aVar.mo136516b(false);
        C36997n.m146013a(view, aVar);
    }
}
