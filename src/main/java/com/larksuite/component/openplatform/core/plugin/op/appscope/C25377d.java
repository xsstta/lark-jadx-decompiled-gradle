package com.larksuite.component.openplatform.core.plugin.op.appscope;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.d */
public class C25377d {
    /* renamed from: a */
    public static void m90882a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", str);
            jSONObject.put(ShareHitPoint.f121869d, str2);
            LarkExtensionManager.getInstance().getExtension().mo49574a("api_authrequest_request", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ScopeEventReportHelper", "", e);
        }
    }

    /* renamed from: a */
    public static void m90883a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", str);
            jSONObject.put(ShareHitPoint.f121869d, str2);
            jSONObject.put("action_type", str3);
            LarkExtensionManager.getInstance().getExtension().mo49574a("api_authrequest_sendrequest", jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ScopeEventReportHelper", "", e);
        }
    }
}
