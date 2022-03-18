package com.tt.miniapp.util;

import android.app.Application;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.o */
public class C67051o {

    /* renamed from: a */
    private int f169025a;

    /* renamed from: b */
    private volatile AtomicInteger f169026b = new AtomicInteger(0);

    /* renamed from: a */
    public static C67051o m261319a() {
        return ContextSingletonInstance.getInstance().getJsRuntimeErrorReporter();
    }

    public C67051o() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        int i = 10;
        if (applicationContext != null) {
            int a = C12738a.m52722a(applicationContext, 10, Settings.TT_TMA_SWITCH, Settings.TmaSwitch.JS_RUNTIME_ERROR_REPORT_MAX_TIMES);
            if (a < 0) {
                AppBrandLogger.m52829e("JsRuntimeErrorReporter", "invalid js_runtime_error_max_count: " + a);
            } else {
                i = a;
            }
        }
        this.f169025a = i;
        AppBrandLogger.m52830i("JsRuntimeErrorReporter", "mMaxCount: " + this.f169025a);
    }

    /* renamed from: a */
    public void mo233157a(JSONObject jSONObject, IAppContext iAppContext) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("stack");
            String optString3 = jSONObject.optString("errorType");
            String optString4 = jSONObject.optString("extend");
            AppBrandLogger.m52829e("JsRuntimeErrorReporter", "js runtime error, \nerrorType:" + optString3 + "\nmessage:" + optString + "\nstack:" + optString2 + "\nextend:" + optString4);
            AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            if (appInfo != null) {
                int i = appInfo.type;
            }
            if (this.f169026b.getAndIncrement() < this.f169025a) {
                LarkInnerEventHelper.mpJsRuntimeError(jSONObject, appInfo, iAppContext);
            }
        }
    }

    /* renamed from: a */
    public void mo233156a(String str, String str2, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("errorType", str2);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("JsRuntimeErrorReporter", "", e);
        }
        mo233157a(jSONObject, iAppContext);
    }
}
