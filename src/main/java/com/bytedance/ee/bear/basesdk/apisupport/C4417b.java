package com.bytedance.ee.bear.basesdk.apisupport;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.ee.bear.basesdk.api.AbstractC4376b;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.b */
final class C4417b implements AbstractC4376b {

    /* renamed from: a */
    private final AbstractC4431q f13026a;

    /* renamed from: b */
    private final AbstractC4376b f13027b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4376b
    /* renamed from: b */
    public void mo17022b(boolean z) {
        C13479a.m54764b("Apisupport", "api call: setIsAppInFront");
        this.f13027b.mo17022b(z);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4376b
    /* renamed from: a */
    public void mo17021a(boolean z) {
        C13479a.m54764b("Apisupport", "api call: setIsDoze");
        this.f13027b.mo17021a(z);
    }

    C4417b(AbstractC4431q qVar, AbstractC4376b bVar) {
        this.f13026a = qVar;
        this.f13027b = bVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4376b
    /* renamed from: a */
    public void mo17020a(Context context, Configuration configuration) {
        C13479a.m54764b("Apisupport", "api call: onConfigurationChanged");
        this.f13027b.mo17020a(context, configuration);
    }
}
