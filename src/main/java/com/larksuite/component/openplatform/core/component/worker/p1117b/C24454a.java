package com.larksuite.component.openplatform.core.component.worker.p1117b;

import android.content.ContextWrapper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24368a;
import com.larksuite.component.openplatform.core.component.worker.p1116a.AbstractC24452a;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.launchschedule.LaunchScheduler;

/* renamed from: com.larksuite.component.openplatform.core.component.worker.b.a */
public class C24454a extends AbstractC24452a {

    /* renamed from: c */
    public AbstractC24368a f60337c;

    /* renamed from: d */
    private IJsRuntime f60338d;

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a, com.larksuite.component.openplatform.core.component.worker.p1116a.AbstractC24452a
    /* renamed from: b */
    public void mo87125b() {
        if (this.f60338d != null) {
            AppBrandLogger.m52830i("OP_SDK_OPLegacyGadgetWorkerImpl", "destroy current js runtime");
            this.f60338d.release();
        }
    }

    /* renamed from: a */
    private boolean m89204a(IAppContext iAppContext) {
        return ((LaunchScheduler) AppbrandApplicationImpl.getInst(iAppContext).getService(LaunchScheduler.class)).isAtLeastLaunching();
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a
    /* renamed from: a */
    public void mo87123a(AbstractC24368a aVar) {
        this.f60337c = aVar;
        if (m89204a(this.f60335a)) {
            AbstractC24368a aVar2 = this.f60337c;
            if (aVar2 != null) {
                aVar2.mo87134a();
            }
            AppBrandLogger.m52830i("OP_SDK_OPLegacyGadgetWorkerImpl", "global scheduler is on");
            return;
        }
        this.f60338d.loadMainJs(new AbstractC66328m() {
            /* class com.larksuite.component.openplatform.core.component.worker.p1117b.C24454a.C244551 */

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87263a() {
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: b */
            public void mo87265b() {
                if (C24454a.this.f60337c != null) {
                    C24454a.this.f60337c.mo87134a();
                }
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87264a(Exception exc) {
                if (C24454a.this.f60337c != null) {
                    C24454a.this.f60337c.mo87135a("", exc.getMessage());
                }
            }
        });
    }

    public C24454a(ContextWrapper contextWrapper, IAppContext iAppContext) {
        super(contextWrapper, iAppContext);
        m89204a(iAppContext);
        JsRuntimeManager jsRuntimeManager = (JsRuntimeManager) AppbrandApplicationImpl.getInst(this.f60335a).getService(JsRuntimeManager.class);
        jsRuntimeManager.initTMARuntime(contextWrapper);
        this.f60338d = jsRuntimeManager.getCurrentRuntime();
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a, com.larksuite.component.openplatform.core.component.worker.p1116a.AbstractC24452a
    /* renamed from: a */
    public void mo87124a(String str, String str2) {
        IJsRuntime iJsRuntime = this.f60338d;
        if (iJsRuntime == null || iJsRuntime.getJsBridge() == null) {
            AppBrandLogger.m52829e("OP_SDK_OPLegacyGadgetWorkerImpl", "call js error : no js bridge");
            return;
        }
        this.f60338d.getJsBridge().sendMsgToJsCore(str, str2);
    }
}
