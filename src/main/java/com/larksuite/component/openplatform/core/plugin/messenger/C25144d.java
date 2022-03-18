package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.d */
public class C25144d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideToast";
    }

    public C25144d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo88243a() {
        HostDependManager.getInst().hideToast();
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiHideToastCtrl", this.mArgs);
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25144d.RunnableC251451 */

            public void run() {
                C25144d.this.mo88243a();
                C25144d.this.callbackOk();
            }
        });
    }

    public C25144d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
