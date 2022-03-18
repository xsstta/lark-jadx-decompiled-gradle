package com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.p1127a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.a.a.b */
public class C24516b extends AbstractC24527b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b
    /* renamed from: c */
    public String mo87381c() {
        return "tma_jssdk_info";
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b
    /* renamed from: d */
    public String mo87382d() {
        return "tenant_share_js_component";
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24527b
    /* renamed from: e */
    public boolean mo87383e() {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (iAppSandboxEnvProcessor != null && iAppSandboxEnvProcessor.hasSandboxExist(AppbrandContext.getInst().getApplicationContext())) {
                AppBrandLogger.m52830i("js_bundle_manager_js_component_gadget", "deleteOldJsComponents->has sandbox exist!");
                return false;
            }
        }
        return true;
    }

    public C24516b(IAppContext iAppContext) {
        super(iAppContext);
    }
}
