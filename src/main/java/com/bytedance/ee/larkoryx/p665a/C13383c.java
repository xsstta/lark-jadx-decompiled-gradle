package com.bytedance.ee.larkoryx.p665a;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.utils.C12788f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.oryxgadget.utils.C12919a;
import com.bytedance.ee.lark.oryxgadget.utils.C12920b;
import com.bytedance.ee.lark.oryxgadget.utils.OryxHostMonitorUtil;
import com.bytedance.ee.larkoryx.IOryxManager;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkoryx.a.c */
public class C13383c implements AbstractC13381a {
    /* renamed from: b */
    private boolean m54440b(IAppContext iAppContext) {
        Log.m165389i("MiniProcessOryxInitor", "begin real initOryx");
        OryxManagerProxy.f35291a.mo49687b();
        IOryxManager a = OryxManagerProxy.f35291a.mo49685a();
        if (a != null) {
            return a.initProcess(iAppContext);
        }
        return false;
    }

    @Override // com.bytedance.ee.larkoryx.p665a.AbstractC13381a
    /* renamed from: a */
    public boolean mo49689a(IAppContext iAppContext) {
        Context applicationContext;
        if (iAppContext == null || (applicationContext = iAppContext.getApplicationContext()) == null) {
            return false;
        }
        if (C12788f.m52857b(C12788f.m52856b(applicationContext))) {
            Log.m165389i("MiniProcessOryxInitor", "mini process don't register other render");
            return false;
        } else if (!C12920b.m53269a(applicationContext)) {
            return m54440b(iAppContext);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            boolean a = C12919a.m53268a(iAppContext, C13383c.class.getClassLoader(), true);
            OryxHostMonitorUtil.monitorOryxPluginLoad(iAppContext, System.currentTimeMillis() - currentTimeMillis);
            Log.m165389i("MiniProcessOryxInitor", "hook at miniprocess:" + a);
            if (a) {
                return m54440b(iAppContext);
            }
            return false;
        }
    }
}
