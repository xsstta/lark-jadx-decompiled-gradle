package com.bumptech.glide.load.resource.p093d;

import com.bumptech.glide.load.engine.AbstractC2378q;
import com.bumptech.glide.load.resource.p091b.AbstractC2402b;

/* renamed from: com.bumptech.glide.load.resource.d.e */
public class C2471e extends AbstractC2402b<C2468c> implements AbstractC2378q {
    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<C2468c> mo10877c() {
        return C2468c.class;
    }

    @Override // com.bumptech.glide.load.resource.p091b.AbstractC2402b, com.bumptech.glide.load.engine.AbstractC2378q
    /* renamed from: a */
    public void mo10884a() {
        ((C2468c) this.f7945a).mo11000b().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return ((C2468c) this.f7945a).mo10998a();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
        ((C2468c) this.f7945a).stop();
        ((C2468c) this.f7945a).mo11006g();
    }

    public C2471e(C2468c cVar) {
        super(cVar);
    }
}
