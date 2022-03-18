package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.r */
public final class C2379r {

    /* renamed from: a */
    private final Map<AbstractC2265c, C2367l<?>> f7890a = new HashMap();

    /* renamed from: b */
    private final Map<AbstractC2265c, C2367l<?>> f7891b = new HashMap();

    C2379r() {
    }

    /* renamed from: a */
    private Map<AbstractC2265c, C2367l<?>> m10092a(boolean z) {
        if (z) {
            return this.f7891b;
        }
        return this.f7890a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2367l<?> mo10885a(AbstractC2265c cVar, boolean z) {
        return m10092a(z).get(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10886a(AbstractC2265c cVar, C2367l<?> lVar) {
        m10092a(lVar.mo10852a()).put(cVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10887b(AbstractC2265c cVar, C2367l<?> lVar) {
        Map<AbstractC2265c, C2367l<?>> a = m10092a(lVar.mo10852a());
        if (lVar.equals(a.get(cVar))) {
            a.remove(cVar);
        }
    }
}
