package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4387k;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.l */
final class C4426l implements AbstractC4387k {

    /* renamed from: a */
    private final AbstractC4431q f13058a;

    /* renamed from: b */
    private final AbstractC4387k f13059b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4387k
    /* renamed from: a */
    public List<AbstractC28490a> mo17067a() {
        C13479a.m54764b("Apisupport", "api call: getAbTestExperimentList");
        return this.f13059b.mo17067a();
    }

    C4426l(AbstractC4431q qVar, AbstractC4387k kVar) {
        this.f13058a = qVar;
        this.f13059b = kVar;
    }
}
