package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.c */
public class C13236c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public boolean canOverride() {
        return false;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideRichText";
    }

    public C13236c() {
    }

    /* renamed from: a */
    public void mo49413a() {
        AppBrandLogger.m52830i("ApiHandler", "hide rich text");
        if (getAppContext().getCurrentActivity() != null && C13251h.m54006d() != null) {
            C13251h.m54006d().dismiss();
        }
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("ApiHandler", "rich text ctrl hide execute");
        if (AppbrandContext.getMainHandler() != null) {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13236c.RunnableC132371 */

                public void run() {
                    C13236c.this.mo49413a();
                }
            });
            if (this.mApiHandlerCallback != null) {
                this.mApiHandlerCallback.callback(this.mCallBackId, mo49412a("hideRichText", "ok"));
            }
        }
    }

    /* renamed from: a */
    public String mo49412a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(str, str2));
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ApiHandler", "make msg error", e);
            return CharacterUtils.empty();
        }
    }

    public C13236c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
