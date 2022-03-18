package com.ss.android.lark.image.p1958a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.AbstractC2378q;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2567j;

/* renamed from: com.ss.android.lark.image.a.c */
public final class C38806c implements AbstractC2378q, AbstractC2383u<BitmapDrawable> {

    /* renamed from: a */
    private final Resources f99757a;

    /* renamed from: b */
    private final AbstractC2383u<Bitmap> f99758b;

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<BitmapDrawable> mo10877c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return this.f99758b.mo10879e();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
        this.f99758b.mo10880f();
    }

    /* renamed from: b */
    public BitmapDrawable mo10878d() {
        return new C38804a(this.f99757a, this.f99758b.mo10878d());
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2378q
    /* renamed from: a */
    public void mo10884a() {
        AbstractC2383u<Bitmap> uVar = this.f99758b;
        if (uVar instanceof AbstractC2378q) {
            ((AbstractC2378q) uVar).mo10884a();
        }
    }

    /* renamed from: a */
    public static C38806c m153148a(Resources resources, AbstractC2383u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new C38806c(resources, uVar);
    }

    private C38806c(Resources resources, AbstractC2383u<Bitmap> uVar) {
        this.f99757a = (Resources) C2567j.m10894a(resources);
        this.f99758b = (AbstractC2383u) C2567j.m10894a(uVar);
    }
}
