package com.ss.android.lark.feed.statistics.other;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/feed/statistics/other/MoreMenuHitPoint;", "", "()V", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.f.f.a */
public final class MoreMenuHitPoint {

    /* renamed from: a */
    public static final Companion f97737a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/statistics/other/MoreMenuHitPoint$Companion;", "", "()V", "sendStartInvitation", "", "sendStartQRCode", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.f.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo139414a() {
            Statistics.sendEvent("Scan_QRCode_Contacts", new JSONObject().put("origination", "chat_tab_scan").put(ShareHitPoint.f121868c, "im_add_panel"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
