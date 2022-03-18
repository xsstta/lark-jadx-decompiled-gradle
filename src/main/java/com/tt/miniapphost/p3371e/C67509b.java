package com.tt.miniapphost.p3371e;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.p3391l.AbstractC67653e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.e.b */
public class C67509b {
    /* renamed from: b */
    private static void m262591b(String str, int i, JSONObject jSONObject, IAppContext iAppContext) {
    }

    /* renamed from: a */
    public static void m262585a() {
        AbstractC67653e eVar = ContextSingletonInstance.getInstance().sdkMonitor;
        if (eVar != null) {
            try {
                eVar.mo234909a();
            } catch (Throwable th) {
                AppBrandLogger.m52829e("AppBrandMonitor", th);
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m262584a(JSONObject jSONObject, IAppContext iAppContext) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            C67531h initParams = AppbrandContext.getInst().getInitParams();
            jSONObject2.put("aid", initParams.mo234510j());
            jSONObject2.put("huv", initParams.mo234508h());
            if (AppbrandContext.getInst().getInitParams() != null) {
                str = AppbrandContext.getInst().getInitParams().mo234512l();
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("plugin_ver", str);
            }
            jSONObject2.put("extra", C67475d.m262451a(jSONObject, null, iAppContext));
        } catch (Exception e) {
            AppBrandLogger.m52828d("AppBrandMonitor", e.getMessage());
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static void m262586a(String str, int i, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("tma_event", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m262587a("mp_preload_case", i, jSONObject, iAppContext);
    }

    /* renamed from: a */
    public static void m262587a(String str, int i, JSONObject jSONObject, IAppContext iAppContext) {
        AbstractC67653e eVar = ContextSingletonInstance.getInstance().sdkMonitor;
        if (eVar != null) {
            eVar.mo234910a(str, i, m262584a(jSONObject, iAppContext));
        } else {
            m262591b(str, i, m262584a(jSONObject, iAppContext), iAppContext);
        }
    }

    /* renamed from: a */
    public static void m262589a(String str, String str2, String str3, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("err_msg", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("extra_info", str3);
            m262587a("mp_special_error", 9400, jSONObject, iAppContext);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m262588a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, IAppContext iAppContext) {
        AbstractC67653e eVar = ContextSingletonInstance.getInstance().sdkMonitor;
        if (eVar != null) {
            eVar.mo234911a(str, i, jSONObject, m262584a(jSONObject2, iAppContext));
        } else {
            m262591b(str, i, m262584a(jSONObject2, iAppContext), iAppContext);
        }
    }

    /* renamed from: a */
    public static void m262590a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, IAppContext iAppContext) {
        AbstractC67653e eVar = ContextSingletonInstance.getInstance().sdkMonitor;
        if (eVar != null) {
            eVar.mo234912a(str, jSONObject, jSONObject2, m262584a(jSONObject3, iAppContext));
        } else {
            m262591b(str, 0, m262584a(jSONObject3, iAppContext), iAppContext);
        }
    }
}
