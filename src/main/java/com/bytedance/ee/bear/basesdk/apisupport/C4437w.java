package com.bytedance.ee.bear.basesdk.apisupport;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.api.AbstractC4391o;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.w */
final class C4437w implements AbstractC4391o {

    /* renamed from: a */
    private final AbstractC4431q f13085a;

    /* renamed from: b */
    private final AbstractC4391o f13086b;

    C4437w(AbstractC4431q qVar, AbstractC4391o oVar) {
        this.f13085a = qVar;
        this.f13086b = oVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4391o
    /* renamed from: a */
    public void mo17077a(FragmentActivity fragmentActivity, FullQuotoConfig fullQuotoConfig) {
        C13479a.m54764b("Apisupport", "api call: showFullQuotoDialog");
        this.f13085a.mo17158a();
        this.f13086b.mo17077a(fragmentActivity, fullQuotoConfig);
    }
}
