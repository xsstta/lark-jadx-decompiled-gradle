package com.ss.android.lark.appcenter.wrapper.impl.statistics;

import com.ss.android.appcenter.common.util.C28179c;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/appcenter/wrapper/impl/statistics/AppCenterHitPoint;", "", "()V", "sendAppCenterView", "", "abTestValue", "", "app-center_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.c.a */
public final class AppCenterHitPoint {

    /* renamed from: a */
    public static final AppCenterHitPoint f72988a = new AppCenterHitPoint();

    private AppCenterHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m107225a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "abTestValue");
        try {
            JSONObject jSONObject = new JSONObject();
            C27548m m = C27548m.m100547m();
            Intrinsics.checkExpressionValueIsNotNull(m, "Providers.getInstance()");
            AbstractC27547l e = m.mo98221e();
            Intrinsics.checkExpressionValueIsNotNull(e, "Providers.getInstance().userProvider");
            jSONObject.put("tenant_id", C28179c.m103226a(e.mo98215d()));
            C27548m m2 = C27548m.m100547m();
            Intrinsics.checkExpressionValueIsNotNull(m2, "Providers.getInstance()");
            AbstractC27547l e2 = m2.mo98221e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "Providers.getInstance().userProvider");
            jSONObject.put("user_id", C28179c.m103226a(e2.mo98213b()));
            Statistics.sendEvent("appcenter_view", jSONObject);
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }
}
