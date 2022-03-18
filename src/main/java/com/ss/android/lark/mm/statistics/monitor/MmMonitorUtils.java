package com.ss.android.lark.mm.statistics.monitor;

import com.bytedance.apm.ApmAgent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.apm.MmApmDataInfo;
import com.ss.android.lark.mm.apm.p2285a.C45849a;
import com.ss.android.lark.mm.apm.power.MmPowerDataInfo;
import com.ss.android.lark.mm.depend.AbstractC45897a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mm.statistics.monitor.a */
public final class MmMonitorUtils {

    /* renamed from: a */
    public static final MmMonitorUtils f118585a = new MmMonitorUtils();

    private MmMonitorUtils() {
    }

    /* renamed from: a */
    public final void mo165439a(MmMonitorCategory mmMonitorCategory, JSONObject jSONObject) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(mmMonitorCategory, "category");
        Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ShareHitPoint.f121869d, mmMonitorCategory.getValue());
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.IWschannelDependency wschannelDependency = a.getWschannelDependency();
        Intrinsics.checkExpressionValueIsNotNull(wschannelDependency, "MmDepend.impl().wschannelDependency");
        IMmDepend.IWschannelDependency.MmNetworkLevel a2 = wschannelDependency.mo144566a();
        if (a2 != null) {
            obj = Integer.valueOf(a2.getValue());
        } else {
            obj = "unknown";
        }
        jSONObject.put("network_level", obj);
        jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject);
        ApmAgent.monitorEvent("meeting_minutes_monitor", null, null, jSONObject2);
    }

    /* renamed from: a */
    public final void mo165440a(JSONObject jSONObject, MmApmDataInfo bVar, JSONObject jSONObject2) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "category");
        Intrinsics.checkParameterIsNotNull(bVar, "apmData");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        jSONObject.put("background", !lifecycleDependency.mo144571b());
        if (jSONObject2 != null) {
            Boolean f = C45849a.m181621f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MmCommonMonitorUtil.isPowerSaving()");
            jSONObject2.put("powerSaving", f.booleanValue());
        }
        JSONObject jSONObject3 = null;
        if (jSONObject2 != null) {
            jSONObject3 = new JSONObject();
            jSONObject3.put("extra", jSONObject2);
        }
        C45855f.m181663b("MmMonitorUtils", "[uploadBasicPerfEvent],  category: " + jSONObject + ", metrics: " + bVar + ", extra: " + jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("app_cpu_usage", bVar.mo161124a().mo161120a());
        jSONObject4.put("app_mem_usage", bVar.mo161125b().mo161130a());
        jSONObject4.put("sys_mem_usage", bVar.mo161125b().mo161131b());
        jSONObject4.put("total_mem", bVar.mo161125b().mo161132c());
        ApmAgent.monitorEvent("inno_perf_statistics", jSONObject, jSONObject4, jSONObject3);
    }

    /* renamed from: a */
    public final void mo165441a(JSONObject jSONObject, MmPowerDataInfo bVar, JSONObject jSONObject2) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "category");
        Intrinsics.checkParameterIsNotNull(bVar, "powerInfo");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        AbstractC45897a lifecycleDependency = a.getLifecycleDependency();
        Intrinsics.checkExpressionValueIsNotNull(lifecycleDependency, "MmDepend.impl().lifecycleDependency");
        jSONObject.put("background", !lifecycleDependency.mo144571b());
        if (jSONObject2 != null) {
            Boolean f = C45849a.m181621f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MmCommonMonitorUtil.isPowerSaving()");
            jSONObject2.put("powerSaving", f.booleanValue());
        }
        JSONObject jSONObject3 = null;
        if (jSONObject2 != null) {
            jSONObject3 = new JSONObject();
            jSONObject3.put("extra", jSONObject2);
        }
        C45855f.m181663b("MmMonitorUtils", "[uploadPowerEvent],  category: " + jSONObject + ", metrics: " + bVar + ", extra: " + jSONObject3);
        jSONObject.put("is_plugging", C45849a.m181623h());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("start_level", bVar.mo161138a());
        jSONObject4.put("end_level", bVar.mo161139b());
        jSONObject4.put("duration", bVar.mo161140c());
        jSONObject4.put("thermal_state", String.valueOf(bVar.mo161141d()));
        ApmAgent.monitorEvent("inno_perf_power_statistics", jSONObject, jSONObject4, jSONObject2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186469a(MmMonitorUtils aVar, JSONObject jSONObject, MmApmDataInfo bVar, JSONObject jSONObject2, int i, Object obj) {
        if ((i & 4) != 0) {
            jSONObject2 = null;
        }
        aVar.mo165440a(jSONObject, bVar, jSONObject2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186470a(MmMonitorUtils aVar, JSONObject jSONObject, MmPowerDataInfo bVar, JSONObject jSONObject2, int i, Object obj) {
        if ((i & 4) != 0) {
            jSONObject2 = null;
        }
        aVar.mo165441a(jSONObject, bVar, jSONObject2);
    }
}
