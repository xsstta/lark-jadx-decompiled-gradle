package com.ss.android.lark.appstrategy.p1376c;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.appstrategy.C29231a;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appstrategy.c.c */
public class C29240c {
    /* renamed from: a */
    public static void m107524a(boolean z, String str) {
        String str2;
        if (!C26284k.m95185a(C29231a.m107507a().getContext())) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            try {
                jSONObject.put("resultType", str2);
                if (str != null) {
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
                }
                MonitorUtils.monitorEvent("app_states_terminalinfo_wifi", jSONObject, null, null);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m107523a(boolean z, long j, String str) {
        String str2;
        if (!C26284k.m95185a(C29231a.m107507a().getContext())) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            try {
                jSONObject.put("resultType", str2);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
                if (j != -1) {
                    jSONObject2.put("duration", j);
                }
                MonitorUtils.monitorEvent("app_states_terminalinfo_location", jSONObject, jSONObject2, null);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m107525a(boolean z, String str, long j, boolean z2, int i, String str2) {
        String str3;
        if (!C26284k.m95185a(C29231a.m107507a().getContext())) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            if (i == 0) {
                try {
                    jSONObject2.put("duration", j);
                    jSONObject.put("isDialogShow", String.valueOf(z2));
                } catch (JSONException e) {
                    Log.m165386e("MonitorHelper", e);
                    return;
                }
            }
            jSONObject.put("errCode", i);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str2);
            jSONObject3.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
            if (z) {
                str3 = "appstrategy_get_app_state_h5";
            } else {
                str3 = "appstrategy_get_app_state_miniapp";
            }
            MonitorUtils.monitorEvent(str3, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
