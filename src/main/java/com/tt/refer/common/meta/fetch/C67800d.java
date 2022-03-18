package com.tt.refer.common.meta.fetch;

import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.tt.refer.common.meta.fetch.C67803g;
import java.util.Map;

/* renamed from: com.tt.refer.common.meta.fetch.d */
public class C67800d extends AbstractC67799c {
    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.fetch.AbstractC67799c
    /* renamed from: a */
    public C12827e mo87492a(C67803g<? extends C67803g.AbstractC67804a> gVar) {
        long j;
        C12827e eVar = new C12827e(gVar.mo235312c(), "POST");
        eVar.mo48434a("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        Map<String, Object> b = gVar.mo235310b();
        if (b != null) {
            eVar.mo48435a(b);
        }
        eVar.mo48433a("sessionid", (Object) gVar.mo235313d());
        eVar.mo48433a("language", (Object) gVar.mo235315f());
        eVar.mo48434a("x-tma-host-sessionid", gVar.mo235313d());
        if (gVar.mo235317h() > 0) {
            j = gVar.mo235317h();
        } else {
            j = 6000;
        }
        eVar.mo48438b(j);
        eVar.mo48439c(j);
        eVar.mo48429a(j);
        gVar.mo235307a(eVar);
        return eVar;
    }
}
