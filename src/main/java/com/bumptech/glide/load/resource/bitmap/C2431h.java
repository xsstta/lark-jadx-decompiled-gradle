package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
public final class C2431h implements AbstractC2391g<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C2427d f7982a = new C2427d();

    /* renamed from: a */
    public boolean mo10904a(ByteBuffer byteBuffer, C2390f fVar) throws IOException {
        return true;
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(ByteBuffer byteBuffer, int i, int i2, C2390f fVar) throws IOException {
        return this.f7982a.mo10903a(ImageDecoder.createSource(byteBuffer), i, i2, fVar);
    }
}
