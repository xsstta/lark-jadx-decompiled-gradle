package com.bumptech.glide.request.p095a;

import com.bumptech.glide.util.C2568k;

/* renamed from: com.bumptech.glide.request.a.h */
public abstract class AbstractC2520h<Z> extends AbstractC2511a<Z> {

    /* renamed from: a */
    private final int f8185a;

    /* renamed from: b */
    private final int f8186b;

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public void mo11176b(AbstractC2521i iVar) {
    }

    public AbstractC2520h() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final void mo11175a(AbstractC2521i iVar) {
        if (C2568k.m10911a(this.f8185a, this.f8186b)) {
            iVar.mo11187a(this.f8185a, this.f8186b);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f8185a + " and height: " + this.f8186b + ", either provide dimensions in the constructor or call override()");
    }

    public AbstractC2520h(int i, int i2) {
        this.f8185a = i;
        this.f8186b = i2;
    }
}
