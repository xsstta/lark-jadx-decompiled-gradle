package com.bytedance.ee.bear.basesdk.apisupport;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.ee.bear.basesdk.api.IDarkMode;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.f */
final class C4421f implements IDarkMode {

    /* renamed from: a */
    private final AbstractC4431q f13034a;

    /* renamed from: b */
    private final IDarkMode f13035b;

    C4421f(AbstractC4431q qVar, IDarkMode iDarkMode) {
        this.f13034a = qVar;
        this.f13035b = iDarkMode;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.IDarkMode
    /* renamed from: a */
    public void mo17016a(Context context, Configuration configuration) {
        C13479a.m54764b("Apisupport", "api call: onConfigurationChanged");
        this.f13035b.mo17016a(context, configuration);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.IDarkMode
    /* renamed from: a */
    public void mo17015a(Context context, int i) {
        C13479a.m54764b("Apisupport", "api call: onAppDarkModeChanged");
        this.f13034a.mo17158a();
        this.f13035b.mo17015a(context, i);
    }
}
