package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2568k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
public final class C2459z implements AbstractC2391g<Bitmap, Bitmap> {
    /* renamed from: a */
    public boolean mo10904a(Bitmap bitmap, C2390f fVar) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.z$a */
    public static final class C2460a implements AbstractC2383u<Bitmap> {

        /* renamed from: a */
        private final Bitmap f8040a;

        @Override // com.bumptech.glide.load.engine.AbstractC2383u
        /* renamed from: f */
        public void mo10880f() {
        }

        /* renamed from: a */
        public Bitmap mo10878d() {
            return this.f8040a;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2383u
        /* renamed from: c */
        public Class<Bitmap> mo10877c() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2383u
        /* renamed from: e */
        public int mo10879e() {
            return C2568k.m10903a(this.f8040a);
        }

        C2460a(Bitmap bitmap) {
            this.f8040a = bitmap;
        }
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(Bitmap bitmap, int i, int i2, C2390f fVar) {
        return new C2460a(bitmap);
    }
}
