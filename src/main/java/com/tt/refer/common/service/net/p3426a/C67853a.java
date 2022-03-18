package com.tt.refer.common.service.net.p3426a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p630d.p631a.AbstractC12831a;
import com.bytedance.ee.lark.infra.network.p630d.p631a.p632a.C12832a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.net.C66504b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.refer.common.service.net.AbstractC67855c;

/* renamed from: com.tt.refer.common.service.net.a.a */
public class C67853a extends AbstractC67457c implements AbstractC67855c {
    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    public C67853a(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.tt.refer.common.service.net.AbstractC67855c
    /* renamed from: a */
    public void mo235488a(C12832a aVar, AbstractC12831a aVar2) {
        AppBrandLogger.m52830i("NetRequestService", "addDownloadRequest...");
        C66504b.m259891a(aVar, aVar2, C12805d.m52895a((TracingCoreSpan) AppbrandContext.getInst().getTracing(), true, this.f170082d), this.f170082d);
    }
}
