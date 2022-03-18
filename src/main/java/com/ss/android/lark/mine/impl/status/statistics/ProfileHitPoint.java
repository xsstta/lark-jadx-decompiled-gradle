package com.ss.android.lark.mine.impl.status.statistics;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/status/statistics/ProfileHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.status.b.a */
public final class ProfileHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Map<String, String> f115591a;

    /* renamed from: b */
    public static final Companion f115592b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/status/statistics/ProfileHitPoint$Companion;", "Lcom/ss/android/lark/mine/impl/status/statistics/IProfileHitPoint;", "()V", "STATUS_MAP", "", "", "sendProfileStatusEdit", "", "originStatus", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.status.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public void mo161044a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originStatus");
            Statistics.sendEvent("profile_status_edit", new JSONObject().put("status_icon", ProfileHitPoint.f115591a.get(str)));
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f115591a = linkedHashMap;
        linkedHashMap.put("BUSINESS", "ooo");
        linkedHashMap.put("LEAVE", "leave");
        linkedHashMap.put("MEETING", "meeting");
    }
}
