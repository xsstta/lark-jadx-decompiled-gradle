package com.tt.miniapp.event.p3281b.p3282a;

import com.tt.miniapp.event.p3281b.AbstractC66023a;
import com.tt.miniapp.event.p3281b.C66029b;
import com.tt.miniapp.event.p3281b.C66031d;

/* renamed from: com.tt.miniapp.event.b.a.e */
public class C66028e extends AbstractC66023a {
    public C66028e(C66031d dVar) {
        super(dVar);
    }

    @Override // com.tt.miniapp.event.p3281b.AbstractC66023a
    /* renamed from: f */
    public boolean mo231103f(C66029b bVar) {
        if (!"stay_page".equals(bVar.f166686a)) {
            return false;
        }
        if (!bVar.f166688c) {
            return !mo231101d(bVar);
        }
        mo231100c(mo231102e(bVar));
        return true;
    }
}
