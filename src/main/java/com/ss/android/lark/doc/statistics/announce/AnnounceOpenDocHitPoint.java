package com.ss.android.lark.doc.statistics.announce;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/doc/statistics/announce/AnnounceOpenDocHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.doc.a.a.a */
public final class AnnounceOpenDocHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f94670a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/doc/statistics/announce/AnnounceOpenDocHitPoint$Companion;", "", "()V", "sendAnnouncementNotifyEvent", "", "isEdited", "", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.doc.a.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo135786a(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "y";
            } else {
                str = C64034n.f161683a;
            }
            Statistics.sendEvent("announcement_notify", jSONObject.put("is_edited", str));
        }
    }
}
