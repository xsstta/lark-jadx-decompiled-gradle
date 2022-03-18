package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p633e.C12836c;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.p3324r.p3326b.AbstractC66716b;
import com.tt.miniapp.process.p3320e.C66625a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67549i;
import com.tt.miniapphost.util.DebugUtil;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.i */
public class C24938i extends AbstractC66716b {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66716b
    /* renamed from: b */
    public String mo88000b() {
        return "createRequestTask";
    }

    public C24938i() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66716b
    /* renamed from: a */
    public IApiOutputParam mo87999a() {
        AbstractC67550j a = C67549i.m262706a(mo232461c()).mo234573a("createRequestTask");
        if (a == null) {
            AppBrandLogger.m52829e("tma_ApiRequestCtrl", "api request native module is null!");
            return null;
        }
        try {
            return C66625a.m260271a(a, this.f168428a, new AbstractC67550j.AbstractC67551a<IApiOutputParam>() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.network.C24938i.C249391 */

                /* renamed from: a */
                public void onNativeModuleCall(IApiOutputParam iApiOutputParam) {
                    boolean z = false;
                    if (DebugUtil.debug()) {
                        AppBrandLogger.m52828d("tma_ApiRequestCtrl", "ApiRequestCtrl invoke ", iApiOutputParam);
                    } else {
                        AppBrandLogger.m52830i("tma_ApiRequestCtrl", "ApiRequestCtrlV2 -> onNativeModuleCall is Execute...");
                    }
                    boolean z2 = iApiOutputParam instanceof C66705d.C66708b;
                    if (z2 && ((C66705d.C66708b) iApiOutputParam).f168406h == 1) {
                        z = true;
                    }
                    C67432a.m262319a(C24938i.this.mo232461c()).getJsBridge().sendMsgToJsCore2("onRequestTaskStateChange", iApiOutputParam, z);
                    if (z2) {
                        C66705d.C66708b bVar = (C66705d.C66708b) iApiOutputParam;
                        C12836c.m53008a(bVar.f168400b, bVar.f168404f, bVar.f168405g, bVar.f168406h, C24938i.this.mo232461c());
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ApiRequestCtrl", "ApiRequestCtrlV2", e);
            return null;
        }
    }

    public C24938i(IApiInputParam iApiInputParam) {
        super(iApiInputParam);
    }
}
