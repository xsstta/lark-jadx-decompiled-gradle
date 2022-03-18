package com.tt.refer.impl.business.api.diagnose.entity;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.miniapphost.data.C67485a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.refer.impl.business.api.diagnose.entity.b */
public class C67893b {

    /* renamed from: a */
    private List<DumpService> f170996a = new ArrayList();

    /* renamed from: b */
    private IAppContext f170997b;

    /* renamed from: a */
    public boolean mo235551a() {
        return LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.network.dump");
    }

    public C67893b(IAppContext iAppContext) {
        this.f170997b = iAppContext;
        m264179b(iAppContext);
    }

    /* renamed from: a */
    public static C67893b m264178a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234279I();
    }

    /* renamed from: b */
    private void m264179b(IAppContext iAppContext) {
        List<DumpService> b = C67892a.m264173a().mo235548b();
        if (b != null && b.size() > 0) {
            for (DumpService dumpService : b) {
                if (iAppContext != null && !TextUtils.isEmpty(iAppContext.getAppId()) && TextUtils.equals(iAppContext.getAppId(), dumpService.mo235526a())) {
                    this.f170996a.add(dumpService);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo235549a(IAppContext iAppContext, C67894c cVar) {
        for (DumpService dumpService : this.f170996a) {
            dumpService.mo235527a(cVar);
        }
    }

    /* renamed from: a */
    public void mo235550a(IAppContext iAppContext, C67895d dVar) {
        for (DumpService dumpService : this.f170996a) {
            dumpService.mo235528a(dVar);
        }
    }
}
