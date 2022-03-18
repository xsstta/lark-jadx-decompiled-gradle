package com.tt.miniapp.event.p3281b.p3282a;

import com.tt.miniapp.event.p3281b.AbstractC66023a;
import com.tt.miniapp.event.p3281b.C66029b;
import com.tt.miniapp.event.p3281b.C66031d;

/* renamed from: com.tt.miniapp.event.b.a.a */
public class C66024a extends AbstractC66023a {
    public C66024a(C66031d dVar) {
        super(dVar);
    }

    @Override // com.tt.miniapp.event.p3281b.AbstractC66023a
    /* renamed from: f */
    public boolean mo231103f(C66029b bVar) {
        if (!"load_detail".equals(bVar.f166686a)) {
            return false;
        }
        if (bVar.f166688c) {
            mo231100c(mo231102e(bVar));
            return true;
        }
        boolean d = mo231101d(bVar);
        if (bVar.f166687b.optInt("load_type", 1) == 0) {
            return !d;
        }
        return false;
    }
}
