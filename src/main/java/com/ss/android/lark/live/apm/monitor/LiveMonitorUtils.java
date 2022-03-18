package com.ss.android.lark.live.apm.monitor;

import android.app.Activity;
import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.live.LiveStateHolder;
import com.ss.android.lark.live.apm.LiveApmDataInfo;
import com.ss.android.lark.live.apm.p2134a.C41500a;
import com.ss.android.lark.live.apm.power.LivePowerDataInfo;
import com.ss.android.lark.live.p2133a.C41488a;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/live/apm/monitor/LiveMonitorUtils;", "", "()V", "getExtra", "Lorg/json/JSONObject;", "getScene", "uploadBasicPerfEvent", "", "apmData", "Lcom/ss/android/lark/live/apm/LiveApmDataInfo;", "uploadPowerEvent", "powerInfo", "Lcom/ss/android/lark/live/apm/power/LivePowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.c.a */
public final class LiveMonitorUtils {

    /* renamed from: a */
    public static final LiveMonitorUtils f105499a = new LiveMonitorUtils();

    private LiveMonitorUtils() {
    }

    /* renamed from: a */
    private final JSONObject m164687a() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", "LarkLive");
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
            boolean z2 = true;
            if (!lifecycleDependency.mo144571b()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("background", z);
            LiveStateHolder liveStateHolder = C41488a.m164623a().f105468a;
            Intrinsics.checkExpressionValueIsNotNull(liveStateHolder, "LiveControl.of().mStateHolder");
            if (liveStateHolder.mo149253a() != LiveStateHolder.DisplayMode.FLOATVIEW) {
                z2 = false;
            }
            jSONObject.put("floating", z2);
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            AbstractC45897a lifecycleDependency2 = a2.getLifecycleDependency();
            Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency2, "MmDepend.impl().lifecycleDependency");
            Activity a3 = lifecycleDependency2.mo144570a();
            if (a3 != null && z2) {
                jSONObject.put("sub_scene", a3);
            }
        } catch (JSONException e) {
            C45855f.m181666e("LiveMonitorUtils", "[getScene] failed: " + e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m164690b() {
        JSONObject jSONObject = new JSONObject();
        try {
            LiveStateHolder liveStateHolder = C41488a.m164623a().f105468a;
            Intrinsics.checkExpressionValueIsNotNull(liveStateHolder, "LiveControl.of().mStateHolder");
            jSONObject.put("live_id", liveStateHolder.mo149261c());
            LiveStateHolder liveStateHolder2 = C41488a.m164623a().f105468a;
            Intrinsics.checkExpressionValueIsNotNull(liveStateHolder2, "LiveControl.of().mStateHolder");
            jSONObject.put("live_status", liveStateHolder2.mo149260b().name());
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
            Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
            Boolean d = C41500a.m164673d(contextDepend.mo144557a());
            Intrinsics.checkExpressionValueIsNotNull(d, "LiveCommonMonitorUtil.is…().contextDepend.context)");
            jSONObject.put("powerSaving", d.booleanValue());
        } catch (JSONException e) {
            C45855f.m181666e("LiveMonitorUtils", "[getExtra] failed: " + e);
        }
        return jSONObject;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m164688a(LiveApmDataInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apmData");
        LiveMonitorUtils aVar = f105499a;
        JSONObject a = aVar.m164687a();
        JSONObject b = aVar.m164690b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("extra", b);
        C45855f.m181663b("LiveMonitorUtils", "[uploadBasicPerfEvent] category: " + a + ", metrics: " + bVar + ", extra: " + jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("app_cpu_usage", bVar.mo149345a().mo149341a());
        jSONObject2.put("app_mem_usage", bVar.mo149346b().mo149351a());
        jSONObject2.put("sys_mem_usage", bVar.mo149346b().mo149352b());
        jSONObject2.put("total_mem", bVar.mo149346b().mo149353c());
        ApmAgent.monitorEvent("inno_perf_statistics", a, jSONObject2, jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m164689a(LivePowerDataInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "powerInfo");
        LiveMonitorUtils aVar = f105499a;
        JSONObject a = aVar.m164687a();
        JSONObject b = aVar.m164690b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("extra", b);
        C45855f.m181663b("LiveMonitorUtils", "[uploadPowerEvent]  category: " + a + ", metrics: " + bVar + ", extra: " + jSONObject);
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a2.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        a.put("is_plugging", C41500a.m164676f(contextDepend.mo144557a()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("start_level", bVar.mo149359a());
        jSONObject2.put("end_level", bVar.mo149360b());
        jSONObject2.put("duration", bVar.mo149361c());
        jSONObject2.put("thermal_state", String.valueOf(bVar.mo149362d()));
        ApmAgent.monitorEvent("inno_perf_power_statistics", a, jSONObject2, b);
    }
}
