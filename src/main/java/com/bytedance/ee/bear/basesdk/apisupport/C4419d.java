package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4378d;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.d */
final class C4419d implements AbstractC4378d {

    /* renamed from: a */
    private final AbstractC4431q f13030a;

    /* renamed from: b */
    private final AbstractC4378d f13031b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4378d
    /* renamed from: a */
    public void mo17028a(C8043a aVar) {
        C13479a.m54764b("Apisupport", "api call: loadThumbnail");
        this.f13030a.mo17158a();
        this.f13031b.mo17028a(aVar);
    }

    C4419d(AbstractC4431q qVar, AbstractC4378d dVar) {
        this.f13030a = qVar;
        this.f13031b = dVar;
    }
}
