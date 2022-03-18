package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4384h;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.i */
final class C4423i implements AbstractC4384h {

    /* renamed from: a */
    private final AbstractC4431q f13052a;

    /* renamed from: b */
    private final AbstractC4384h f13053b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4384h
    /* renamed from: a */
    public void mo17053a(String str) {
        C13479a.m54764b("Apisupport", "api call: setPassportHost");
        this.f13052a.mo17158a();
        this.f13053b.mo17053a(str);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4384h
    /* renamed from: a */
    public void mo17054a(Map<Integer, String> map) {
        C13479a.m54764b("Apisupport", "api call: setPassportUrlRegex");
        this.f13052a.mo17158a();
        this.f13053b.mo17054a(map);
    }

    C4423i(AbstractC4431q qVar, AbstractC4384h hVar) {
        this.f13052a = qVar;
        this.f13053b = hVar;
    }
}
