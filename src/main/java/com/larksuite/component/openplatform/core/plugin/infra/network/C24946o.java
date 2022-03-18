package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67549i;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.o */
public class C24946o extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "createUploadTask";
    }

    public C24946o() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        AbstractC67550j a = C67549i.m262706a(mo232455f()).mo234573a("createUploadTask");
        if (a == null) {
            AppBrandLogger.m52830i("tma_CreateUploadTaskCtrl", "create upload task native module is null!");
            return CharacterUtils.empty();
        }
        try {
            return C66625a.m260272a(a, this.f168426a, new AbstractC67550j.AbstractC67551a<String>() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.network.C24946o.C249471 */

                /* renamed from: a */
                public void onNativeModuleCall(String str) {
                    if (DebugUtil.debug()) {
                        AppBrandLogger.m52828d("tma_CreateUploadTaskCtrl", "create upload task -> onNativeModuleCall:" + str);
                    } else {
                        AppBrandLogger.m52830i("tma_CreateUploadTaskCtrl", "create upload task ->onNativeModuleCall......");
                    }
                    try {
                        C24946o.this.mo232454e().mo235028a(C67706e.C67708a.m263377a("onUploadTaskStateChange", new JSONObject(str)).mo235009a());
                    } catch (Throwable th) {
                        AppBrandLogger.m52829e("tma_CreateUploadTaskCtrl", "JSONException", th);
                        IJsBridge jsBridge = C67432a.m262319a(C24946o.this.mo232455f()).getJsBridge();
                        if (jsBridge != null) {
                            jsBridge.sendMsgToJsCore("onUploadTaskStateChange", str);
                        }
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_CreateUploadTaskCtrl", "", e);
            return CharacterUtils.empty();
        }
    }

    public C24946o(String str) {
        super(str);
    }
}
