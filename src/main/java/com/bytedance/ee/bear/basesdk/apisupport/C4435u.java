package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4389m;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.u */
final class C4435u implements AbstractC4389m {

    /* renamed from: a */
    private final AbstractC4431q f13081a;

    /* renamed from: b */
    private final AbstractC4389m f13082b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4389m
    /* renamed from: a */
    public void mo17072a(long j) {
        C13479a.m54764b("Apisupport", "api call: timingCleanData");
        this.f13082b.mo17072a(j);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4389m
    /* renamed from: a */
    public void mo17073a(String str) {
        C13479a.m54764b("Apisupport", "api call: setCCMConfig");
        this.f13082b.mo17073a(str);
    }

    C4435u(AbstractC4431q qVar, AbstractC4389m mVar) {
        this.f13081a = qVar;
        this.f13082b = mVar;
    }
}
