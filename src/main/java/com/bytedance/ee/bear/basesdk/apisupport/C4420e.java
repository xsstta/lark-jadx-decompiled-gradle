package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4379e;
import com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.e */
final class C4420e implements AbstractC4379e {

    /* renamed from: a */
    private final AbstractC4431q f13032a;

    /* renamed from: b */
    private final AbstractC4379e f13033b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e
    /* renamed from: b */
    public String mo17031b() {
        C13479a.m54764b("Apisupport", "api call: getJSSdkVersion");
        return this.f13033b.mo17031b();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e
    /* renamed from: a */
    public String mo17030a() {
        C13479a.m54764b("Apisupport", "api call: getJSSdkFileName");
        return this.f13033b.mo17030a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e
    /* renamed from: a */
    public AbstractC4379e.AbstractC4380a mo17029a(ICommentDependency cVar) {
        C13479a.m54764b("Apisupport", "api call: createSdk");
        return this.f13033b.mo17029a(cVar);
    }

    C4420e(AbstractC4431q qVar, AbstractC4379e eVar) {
        this.f13032a = qVar;
        this.f13033b = eVar;
    }
}
