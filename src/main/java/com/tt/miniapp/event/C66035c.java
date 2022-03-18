package com.tt.miniapp.event;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.C12968b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.util.DebugUtil;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.c */
public class C66035c {
    /* renamed from: b */
    public static void m258577b(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            AppBrandLogger.m52829e("EventReporter", "reportEventToTea eventName or data is null!");
            return;
        }
        m258578c(str, jSONObject);
        LarkExtensionManager.getInstance().getExtension().mo49574a(str, jSONObject);
    }

    /* renamed from: c */
    private static void m258578c(String str, JSONObject jSONObject) {
        if (DebugUtil.debug() && jSONObject.optString("trace_id", null) == null) {
            AppBrandLogger.m52829e("EventReporter", str + " trace id is null!");
        }
    }

    /* renamed from: a */
    public static void m258576a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            AppBrandLogger.m52829e("EventReporter", "reportEventToSlardar eventName or data is null!");
            return;
        }
        Log.m165379d("EventReporter", "reportEventToSlardar: " + str + " eventData:" + jSONObject.toString());
        m258578c(str, jSONObject);
        if (jSONObject.length() != 0) {
            LarkExtensionManager.getInstance().getExtension().monitorDuration(str, jSONObject, null);
            C12968b.m53393a().mo48869a(str, jSONObject);
        }
    }
}
