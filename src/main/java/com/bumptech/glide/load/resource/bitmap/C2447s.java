package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.AbstractC2378q;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2567j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
public final class C2447s implements AbstractC2378q, AbstractC2383u<BitmapDrawable> {

    /* renamed from: a */
    private final Resources f8017a;

    /* renamed from: b */
    private final AbstractC2383u<Bitmap> f8018b;

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<BitmapDrawable> mo10877c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return this.f8018b.mo10879e();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
        this.f8018b.mo10880f();
    }

    /* renamed from: b */
    public BitmapDrawable mo10878d() {
        return new BitmapDrawable(this.f8017a, this.f8018b.mo10878d());
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2378q
    /* renamed from: a */
    public void mo10884a() {
        AbstractC2383u<Bitmap> uVar = this.f8018b;
        if (uVar instanceof AbstractC2378q) {
            ((AbstractC2378q) uVar).mo10884a();
        }
    }

    /* renamed from: a */
    public static AbstractC2383u<BitmapDrawable> m10337a(Resources resources, AbstractC2383u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new C2447s(resources, uVar);
    }

    private C2447s(Resources resources, AbstractC2383u<Bitmap> uVar) {
        this.f8017a = (Resources) C2567j.m10894a(resources);
        this.f8018b = (AbstractC2383u) C2567j.m10894a(uVar);
    }
}
