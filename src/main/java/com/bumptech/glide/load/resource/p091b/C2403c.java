package com.bumptech.glide.load.resource.p091b;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.AbstractC2383u;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.resource.b.c */
public final class C2403c extends AbstractC2402b<Drawable> {
    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<android.graphics.drawable.Drawable> */
    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<Drawable> mo10877c() {
        return this.f7945a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return Math.max(1, this.f7945a.getIntrinsicWidth() * this.f7945a.getIntrinsicHeight() * 4);
    }

    private C2403c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static AbstractC2383u<Drawable> m10169a(Drawable drawable) {
        if (drawable != null) {
            return new C2403c(drawable);
        }
        return null;
    }
}
