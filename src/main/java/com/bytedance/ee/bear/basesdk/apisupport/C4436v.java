package com.bytedance.ee.bear.basesdk.apisupport;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.basesdk.api.AbstractC4390n;
import com.bytedance.ee.bear.basesdk.api.AbstractC4394r;
import com.bytedance.ee.bear.lark.p413a.C7962a;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.v */
final class C4436v implements AbstractC4390n {

    /* renamed from: a */
    private final AbstractC4431q f13083a;

    /* renamed from: b */
    private final AbstractC4390n f13084b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4390n
    /* renamed from: a */
    public DialogInterface$OnCancelListenerC1021b mo17074a(ShareParams shareParams) {
        C13479a.m54764b("Apisupport", "api call: showShareFragment");
        this.f13083a.mo17158a();
        return this.f13084b.mo17074a(shareParams);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4390n
    /* renamed from: a */
    public void mo17076a(C7962a aVar) {
        C13479a.m54764b("Apisupport", "api call: showAskOwnerPanel");
        this.f13083a.mo17158a();
        this.f13084b.mo17076a(aVar);
    }

    C4436v(AbstractC4431q qVar, AbstractC4390n nVar) {
        this.f13083a = qVar;
        this.f13084b = nVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4390n
    /* renamed from: a */
    public void mo17075a(int i, String str, int i2, String str2, int i3, AbstractC4394r rVar) {
        C13479a.m54764b("Apisupport", "api call: removeUserPermission");
        this.f13083a.mo17158a();
        this.f13084b.mo17075a(i, str, i2, str2, i3, rVar);
    }
}
