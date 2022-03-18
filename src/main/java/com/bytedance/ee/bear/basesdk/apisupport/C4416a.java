package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4375a;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.a */
final class C4416a implements AbstractC4375a {

    /* renamed from: a */
    private final AbstractC4431q f13024a;

    /* renamed from: b */
    private final AbstractC4375a f13025b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4375a
    /* renamed from: a */
    public void mo17017a(int i) {
        C13479a.m54764b("Apisupport", "api call: onLoginStatusChangedEvent");
        this.f13024a.mo17158a();
        this.f13025b.mo17017a(i);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4375a
    /* renamed from: a */
    public void mo17018a(DocDynamicConfig docDynamicConfig) {
        C13479a.m54764b("Apisupport", "api call: updateDynamicConfig");
        this.f13024a.mo17158a();
        this.f13025b.mo17018a(docDynamicConfig);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4375a
    /* renamed from: a */
    public void mo17019a(String str) {
        C13479a.m54764b("Apisupport", "api call: syncCookie");
        this.f13024a.mo17158a();
        this.f13025b.mo17019a(str);
    }

    C4416a(AbstractC4431q qVar, AbstractC4375a aVar) {
        this.f13024a = qVar;
        this.f13025b = aVar;
    }
}
