package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13270g;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67549i;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.d */
public class C13238d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public boolean canOverride() {
        return false;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showRichText";
    }

    public C13238d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("LarkApiShowRichTextCtrl", "rich text ctrl show execute");
        AbstractC67550j a = C67549i.m262706a(getAppContext()).mo234573a("showRichText");
        if (a == null) {
            try {
                if (this.mApiHandlerCallback != null) {
                    this.mApiHandlerCallback.callback(this.mCallBackId, mo49418a("showRichText", "fail"));
                }
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("LarkApiShowRichTextCtrl", "module is null and callback error", e);
            }
        } else {
            AppBrandLogger.m52828d("ApiShowRichTextCtrl", "ApiShowRichTextCtrl show1sss");
            try {
                a.mo49104a(this.mArgs, new AbstractC67550j.AbstractC67551a<C13270g>() {
                    /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13238d.C132391 */

                    /* renamed from: a */
                    public void onNativeModuleCall(C13270g gVar) {
                    }
                });
                AppBrandLogger.m52830i("LarkApiShowRichTextCtrl", "rich text module invoked");
                if (this.mApiHandlerCallback != null) {
                    this.mApiHandlerCallback.callback(this.mCallBackId, mo49418a("showRichText", "ok"));
                }
            } catch (Exception e2) {
                AppBrandLogger.eWithThrowable("LarkApiShowRichTextCtrl", "rich text module invoke error", e2);
            }
        }
    }

    /* renamed from: a */
    public String mo49418a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(str, str2));
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LarkApiShowRichTextCtrl", "make msg error", e);
            return CharacterUtils.empty();
        }
    }

    public C13238d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
