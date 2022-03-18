package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.AbstractC2378q;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public class C2428e implements AbstractC2378q, AbstractC2383u<Bitmap> {

    /* renamed from: a */
    private final Bitmap f7979a;

    /* renamed from: b */
    private final AbstractC2283e f7980b;

    /* renamed from: b */
    public Bitmap mo10878d() {
        return this.f7979a;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<Bitmap> mo10877c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2378q
    /* renamed from: a */
    public void mo10884a() {
        this.f7979a.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return C2568k.m10903a(this.f7979a);
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
        this.f7980b.mo10693a(this.f7979a);
    }

    /* renamed from: a */
    public static C2428e m10257a(Bitmap bitmap, AbstractC2283e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C2428e(bitmap, eVar);
    }

    public C2428e(Bitmap bitmap, AbstractC2283e eVar) {
        this.f7979a = (Bitmap) C2567j.m10895a(bitmap, "Bitmap must not be null");
        this.f7980b = (AbstractC2283e) C2567j.m10895a(eVar, "BitmapPool must not be null");
    }
}
