package com.bytedance.ee.larkoryx.p665a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.oryxgadget.utils.C12920b;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkoryx.a.b */
public class C13382b implements AbstractC13381a {
    @Override // com.bytedance.ee.larkoryx.p665a.AbstractC13381a
    /* renamed from: a */
    public boolean mo49689a(IAppContext iAppContext) {
        if (C12920b.m53269a(iAppContext.getApplicationContext())) {
            HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
            if (hostInterface == null) {
                return false;
            }
            Log.m165389i("MainProcessOryxInitor", "init at main process");
            hostInterface.loadMiraPlugin("com.bytedance.ee.lark.oryxplugin");
            OryxManagerProxy.f35291a.mo49687b();
            return true;
        }
        OryxManagerProxy.f35291a.mo49687b();
        return true;
    }
}
