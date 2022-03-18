package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67549i;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.h */
public class C24936h extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "createRequestTask";
    }

    public C24936h() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        AbstractC67550j a = C67549i.m262706a(mo232455f()).mo234573a("createRequestTask");
        if (a == null) {
            return CharacterUtils.empty();
        }
        try {
            String a2 = C66625a.m260272a(a, this.f168426a, new AbstractC67550j.AbstractC67551a<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.network.C24936h.C249371 */

                /* renamed from: a */
                public void onNativeModuleCall(String str) {
                    AppBrandLogger.m52828d("tma_ApiRequestCtrl", "ApiRequestCtrl invoke ", str);
                    try {
                        C24936h.this.mo232454e().mo235028a(C67706e.C67708a.m263377a("onRequestTaskStateChange", new JSONObject(str)).mo235009a());
                    } catch (Throwable th) {
                        AppBrandLogger.m52829e("tma_ApiRequestCtrl", "JSONException", th);
                        IJsBridge jsBridge = C67432a.m262319a(C24936h.this.mo232455f()).getJsBridge();
                        if (jsBridge != null) {
                            jsBridge.sendMsgToJsCore("onRequestTaskStateChange", str);
                        }
                    }
                }
            });
            AppBrandLogger.m52828d("tma_ApiRequestCtrl", "ApiRequestCtrl result ", a2);
            return a2;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiRequestCtrl", "ApiRequestCtrl", e);
            return CharacterUtils.empty();
        }
    }

    public C24936h(String str) {
        super(str);
    }
}
