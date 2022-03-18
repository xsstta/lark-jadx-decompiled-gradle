package com.bytedance.ee.larkoryx.p666b;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.render.RenderEngineManageService;

/* renamed from: com.bytedance.ee.larkoryx.b.b */
public class C13385b implements AbstractC13384a {
    @Override // com.bytedance.ee.larkoryx.p666b.AbstractC13384a
    /* renamed from: a */
    public void mo49690a(IAppContext iAppContext, RenderEngineManageService renderEngineManageService) {
        if (renderEngineManageService != null) {
            OryxManagerProxy.f35291a.mo49687b();
            OryxManagerProxy.f35291a.mo49686a(renderEngineManageService);
            Log.m165389i("MainProcessOryxRegister", "real reg at main process");
        }
    }
}
