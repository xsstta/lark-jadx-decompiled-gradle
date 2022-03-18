package com.tt.miniapp.falcon.p3286b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.p3371e.C67509b;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.falcon.b.d */
public class C66060d {
    /* renamed from: a */
    static void m258685a(IAppContext iAppContext, String str, String str2, String str3, int i) {
        ILogger d = C25529d.m91161d(iAppContext);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventName", str);
            jSONObject.put("invokeMethodName", str2);
            jSONObject.put("errorMessage", str3);
            jSONObject.put("apiVersion", i);
            C67509b.m262587a("mp_invoke_api_failed", 7000, jSONObject, iAppContext);
            LarkInnerEventHelper.statusRate("mp_invoke_api_failed", 7000, jSONObject, iAppContext);
            if (d != null) {
                d.mo92223e("MonitorUtil", "invoke api failed: " + jSONObject.toString());
                return;
            }
            AppBrandLogger.m52829e("MonitorUtil", "invoke api failed: " + jSONObject.toString());
        } catch (Exception e) {
            if (d != null) {
                d.mo92223e("MonitorUtil", "Exception", e);
                return;
            }
            AppBrandLogger.m52829e("MonitorUtil", e);
        }
    }

    /* renamed from: a */
    static void m258684a(IAppContext iAppContext, String str, OPTrace oPTrace, long j, LKEvent lKEvent, LKBasePluginResult lKBasePluginResult) {
        String str2;
        JSONObject e = lKBasePluginResult.mo92270e();
        e.remove("inner_tracing_id");
        int c = lKBasePluginResult.mo92267c();
        if (c == Integer.MIN_VALUE) {
            str2 = "ok";
        } else {
            str2 = "fail";
        }
        int a = C25529d.m91125a(c, e);
        String optString = e.optString(ApiHandler.API_CALLBACK_ERRMSG);
        String a2 = C25529d.m91141a(e);
        OPMonitorUtils.monitorPMResult(iAppContext, lKEvent, j, str2, c, a, optString, a2, true);
        OPMonitorUtils.monitorResultCallback(iAppContext, str, oPTrace, str2, c, a, optString, a2, true);
    }
}
