package com.bytedance.sdk.bridge.monitor;

import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.sdk.bridge.BridgeManager;
import com.bytedance.sdk.bridge.api.AbstractC20660a;
import com.bytedance.sdk.bridge.model.C20679b;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import com.bytedance.services.apm.api.IApmAgent;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001XB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010HJ6\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020\u00042\b\u0010O\u001a\u0004\u0018\u00010H2\u0006\u0010P\u001a\u00020H2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010RH\u0007J\u001e\u0010K\u001a\u00020L2\u0006\u0010S\u001a\u00020H2\u0006\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020HJ \u0010T\u001a\u00020L2\u0006\u0010S\u001a\u00020H2\b\u0010O\u001a\u0004\u0018\u00010H2\u0006\u0010P\u001a\u00020HJ\u0016\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020HR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000201XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/bytedance/sdk/bridge/monitor/BridgeMonitor;", "", "()V", "AUTH_ERROR", "", "BRIDGE_NAME", "CALL_SUCCESS_SERVICE_NAME", "CONFIG_ERROR", "CONFIG_FAILURE", "CONFIG_SUCCESS", "ERROR_ACTIVITY", "ERROR_CODE", "ERROR_MSG", "ERROR_URL", "EVENT_TYPE", "EXTRA_PARAMS", "FLUTTER_CALLSYNC_NOT_FOUND", "FLUTTER_CALLSYNC_NOT_SUPPORT_SYNC", "FLUTTER_CALLSYNC_NO_PARAMS", "FLUTTER_CALLSYNC_NO_PRIVILEGE", "FLUTTER_CALLSYNC_NULL", "FLUTTER_CALL_NOT_FOUND", "FLUTTER_CALL_NO_PARAMS", "FLUTTER_CALL_NO_PRIVILEGE", "FLUTTER_CALL_NULL", "IS_SUCCESSFUL", "IS_SYNC", "JS_CALLSYNC_NOT_FOUND", "JS_CALLSYNC_NOT_SUPPORT_SYNC", "JS_CALLSYNC_NO_PARAMS", "JS_CALLSYNC_NO_PRIVILEGE", "JS_CALLSYNC_NULL", "JS_CALLSYNC_SUCCESS", "JS_CALL_NOT_FOUND", "JS_CALL_NO_PARAMS", "JS_CALL_NO_PRIVILEGE", "JS_CALL_NULL", "JS_CALL_SUCCESS", "RN_CALLSYNC_NOT_FOUND", "RN_CALLSYNC_NOT_SUPPORT_SYNC", "RN_CALLSYNC_NO_PARAMS", "RN_CALLSYNC_NO_PRIVILEGE", "RN_CALLSYNC_NULL", "RN_CALL_NOT_FOUND", "RN_CALL_NO_PARAMS", "RN_CALL_NO_PRIVILEGE", "RN_CALL_NULL", "SERVICE_NAME", "STATUS_CODE_0", "", "STATUS_CODE_1", "STATUS_CODE_2", "STATUS_CODE_3", "STATUS_CODE_4", "STATUS_CODE_5", "STATUS_CODE_6", "STATUS_CODE_7", "STATUS_MSG_FLUTTER_CALL", "STATUS_MSG_FLUTTER_CALL_SYNC", "STATUS_MSG_GET_INFO_BY_INDEX", "STATUS_MSG_JS_CALL", "STATUS_MSG_JS_CALL_SYNC", "STATUS_MSG_JS_EXCEPTION", "STATUS_MSG_JS_LOAD_URL", "STATUS_MSG_NEW_AUTH", "STATUS_MSG_OLD_JS_CALL", "STATUS_MSG_REQUEST_AUTH", "STATUS_MSG_REQUEST_CONFIG", "STATUS_MSG_RN_CALL", "STATUS_MSG_RN_CALL_SYNC", "TIME_COST", "dealWithFetchMethod", "Lorg/json/JSONObject;", "bridgeName", "params", "monitorEvent", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "statusMsg", "metric", "extraLog", "iBridgeContext", "Lcom/bytedance/sdk/bridge/model/IBridgeContext;", "category", "monitorJsSuccessEvent", "monitorLog", "logType", "logExtr", "Fetch", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.b.a */
public final class BridgeMonitor {

    /* renamed from: a */
    public static final BridgeMonitor f50418a = new BridgeMonitor();

    private BridgeMonitor() {
    }

    /* renamed from: a */
    public final JSONObject mo69557a(String str, JSONObject jSONObject) {
        String str2;
        String optString;
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        JSONObject jSONObject2 = null;
        if (Intrinsics.areEqual(StringsKt.substringAfterLast$default(str, ".", (String) null, 2, (Object) null), "fetch")) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("bridge_name", str);
            String str3 = "";
            if (jSONObject == null || (str2 = jSONObject.optString("method")) == null) {
                str2 = str3;
            }
            jSONObject2.put("fetch_method", str2);
            if (!(jSONObject == null || (optString = jSONObject.optString("url")) == null)) {
                str3 = optString;
            }
            jSONObject2.put("fetch_url", str3);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo69559a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "category");
        Intrinsics.checkParameterIsNotNull(jSONObject3, "extraLog");
        IApmAgent iApmAgent = (IApmAgent) C20216d.m73783a(IApmAgent.class);
        if (iApmAgent != null) {
            iApmAgent.monitorEvent("component_bridge_sdk_monitor_success", jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* renamed from: a */
    public final void mo69558a(int i, String str, JSONObject jSONObject, JSONObject jSONObject2, IBridgeContext dVar) {
        Intrinsics.checkParameterIsNotNull(str, "statusMsg");
        Intrinsics.checkParameterIsNotNull(jSONObject2, "extraLog");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(str, i);
        IApmAgent iApmAgent = (IApmAgent) C20216d.m73783a(IApmAgent.class);
        if (iApmAgent != null) {
            iApmAgent.monitorEvent("component_bridge_sdk_monitor", jSONObject3, jSONObject, jSONObject2);
        }
        if (BridgeManager.f50421a.mo69560a().mo69550g() != null) {
            try {
                C20679b bVar = new C20679b();
                if (jSONObject2.has("error_msg")) {
                    bVar.f50546d = jSONObject2.optString("error_msg");
                }
                if (jSONObject2.has("error_url")) {
                    bVar.f50548f = jSONObject2.optString("error_url");
                }
                if (jSONObject2.has("event_type")) {
                    bVar.f50545c = jSONObject2.optString("event_type");
                }
                if (jSONObject2.has("bridge_name")) {
                    bVar.f50547e = jSONObject2.optString("bridge_name");
                }
                if (jSONObject2.has("error_activity")) {
                    bVar.f50549g = jSONObject2.optString("error_activity");
                }
                if (jSONObject2.has("error_code")) {
                    bVar.f50544b = jSONObject2.optInt("error_code");
                }
                if (jSONObject2.has("is_sync")) {
                    bVar.f50543a = jSONObject2.optInt("is_sync");
                }
                if (jSONObject2.has("extra_params")) {
                    bVar.f50550h = jSONObject2.optJSONObject("extra_params");
                }
                bVar.f50551i = dVar;
                AbstractC20660a g = BridgeManager.f50421a.mo69560a().mo69550g();
                if (g != null) {
                    g.mo69542a(bVar);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m75144a(BridgeMonitor aVar, int i, String str, JSONObject jSONObject, JSONObject jSONObject2, IBridgeContext dVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            dVar = null;
        }
        aVar.mo69558a(i, str, jSONObject, jSONObject2, dVar);
    }
}
