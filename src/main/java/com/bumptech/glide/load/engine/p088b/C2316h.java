package com.bumptech.glide.load.engine.p088b;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p088b.AbstractC2317i;
import com.bumptech.glide.util.C2564g;

/* renamed from: com.bumptech.glide.load.engine.b.h */
public class C2316h extends C2564g<AbstractC2265c, AbstractC2383u<?>> implements AbstractC2317i {

    /* renamed from: a */
    private AbstractC2317i.AbstractC2318a f7690a;

    public C2316h(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2317i
    /* renamed from: a */
    public void mo10737a(AbstractC2317i.AbstractC2318a aVar) {
        this.f7690a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10733a(AbstractC2383u<?> uVar) {
        if (uVar == null) {
            return super.mo10733a((Object) null);
        }
        return uVar.mo10879e();
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2317i
    /* renamed from: a */
    public /* synthetic */ AbstractC2383u mo10734a(AbstractC2265c cVar) {
        return (AbstractC2383u) super.mo11253d(cVar);
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2317i
    /* renamed from: a */
    public void mo10735a(int i) {
        if (i >= 40) {
            mo11247a();
        } else if (i >= 20 || i == 15) {
            mo11248a(mo11249b() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2317i
    /* renamed from: b */
    public /* bridge */ /* synthetic */ AbstractC2383u mo10738b(AbstractC2265c cVar, AbstractC2383u uVar) {
        return (AbstractC2383u) super.mo11250b((Object) cVar, (Object) uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10598a(AbstractC2265c cVar, AbstractC2383u<?> uVar) {
        AbstractC2317i.AbstractC2318a aVar = this.f7690a;
        if (aVar != null && uVar != null) {
            aVar.mo10740b(uVar);
        }
    }
}
