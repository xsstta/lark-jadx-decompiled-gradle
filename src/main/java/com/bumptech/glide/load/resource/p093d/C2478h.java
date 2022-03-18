package com.bumptech.glide.load.resource.p093d;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.C2428e;

/* renamed from: com.bumptech.glide.load.resource.d.h */
public final class C2478h implements AbstractC2391g<GifDecoder, Bitmap> {

    /* renamed from: a */
    private final AbstractC2283e f8089a;

    /* renamed from: a */
    public boolean mo10904a(GifDecoder gifDecoder, C2390f fVar) {
        return true;
    }

    public C2478h(AbstractC2283e eVar) {
        this.f8089a = eVar;
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(GifDecoder gifDecoder, int i, int i2, C2390f fVar) {
        return C2428e.m10257a(gifDecoder.mo10454h(), this.f8089a);
    }
}
