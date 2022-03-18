package com.bumptech.glide.request.p095a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.AbstractC2533d;
import com.bumptech.glide.util.C2568k;

/* renamed from: com.bumptech.glide.request.a.c */
public abstract class AbstractC2513c<T> implements AbstractC2522j<T> {

    /* renamed from: a */
    private final int f8169a;

    /* renamed from: b */
    private final int f8170b;

    /* renamed from: c */
    private AbstractC2533d f8171c;

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public void mo10444b(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public final void mo11176b(AbstractC2521i iVar) {
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: c */
    public void mo11172c(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: f */
    public void mo10427f() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: g */
    public void mo10428g() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: h */
    public void mo10429h() {
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final AbstractC2533d mo11170a() {
        return this.f8171c;
    }

    public AbstractC2513c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final void mo11175a(AbstractC2521i iVar) {
        iVar.mo11187a(this.f8169a, this.f8170b);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public final void mo11171a(AbstractC2533d dVar) {
        this.f8171c = dVar;
    }

    public AbstractC2513c(int i, int i2) {
        if (C2568k.m10911a(i, i2)) {
            this.f8169a = i;
            this.f8170b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
