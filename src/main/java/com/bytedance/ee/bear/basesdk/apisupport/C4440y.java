package com.bytedance.ee.bear.basesdk.apisupport;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.api.AbstractC4381f;
import com.bytedance.ee.bear.basesdk.api.AbstractC4392p;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.y */
final class C4440y implements AbstractC4392p {

    /* renamed from: a */
    private final AbstractC4431q f13096a;

    /* renamed from: b */
    private final AbstractC4392p f13097b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: a */
    public AbstractC10816c mo17078a() {
        C13479a.m54764b("Apisupport", "api call: makeWikiForLarkGlobalSearch");
        this.f13096a.mo17158a();
        return this.f13097b.mo17078a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: b */
    public AbstractC4381f mo17081b() {
        C13479a.m54764b("Apisupport", "api call: createDocPageProvider");
        this.f13096a.mo17158a();
        return this.f13097b.mo17081b();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: a */
    public void mo17080a(Context context) {
        C13479a.m54764b("Apisupport", "api call: preloadSpacePageUI");
        this.f13097b.mo17080a(context);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4392p
    /* renamed from: a */
    public AbstractC10816c mo17079a(boolean z) {
        C13479a.m54764b("Apisupport", "api call: makeDocForLarkGlobalSearch");
        this.f13096a.mo17158a();
        return this.f13097b.mo17079a(z);
    }

    C4440y(AbstractC4431q qVar, AbstractC4392p pVar) {
        this.f13096a = qVar;
        this.f13097b = pVar;
    }
}
