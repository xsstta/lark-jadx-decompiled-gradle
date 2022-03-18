package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2542a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
public final class C2446r implements AbstractC2391g<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2427d f8016a = new C2427d();

    /* renamed from: a */
    public boolean mo10904a(InputStream inputStream, C2390f fVar) throws IOException {
        return true;
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(InputStream inputStream, int i, int i2, C2390f fVar) throws IOException {
        return this.f8016a.mo10903a(ImageDecoder.createSource(C2542a.m10844a(inputStream)), i, i2, fVar);
    }
}
