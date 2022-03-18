package com.bumptech.glide.load.engine.p087a;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.engine.a.f */
public class C2284f implements AbstractC2283e {
    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public void mo10691a() {
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public void mo10692a(int i) {
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public void mo10693a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: a */
    public Bitmap mo10690a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e
    /* renamed from: b */
    public Bitmap mo10694b(int i, int i2, Bitmap.Config config) {
        return mo10690a(i, i2, config);
    }
}
