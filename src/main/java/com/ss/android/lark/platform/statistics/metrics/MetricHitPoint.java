package com.ss.android.lark.platform.statistics.metrics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/statistics/metrics/MetricHitPoint;", "", "()V", "sendMetricsEvent", "", "obj", "Lorg/json/JSONObject;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.statistics.a.a */
public final class MetricHitPoint {

    /* renamed from: a */
    public static final MetricHitPoint f129013a = new MetricHitPoint();

    private MetricHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m201515a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "obj");
        Statistics.sendEvent("lark_android_cpu_metrics", jSONObject);
    }
}
