package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2542a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public class C2430g implements AbstractC2391g<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C2434k f7981a;

    public C2430g(C2434k kVar) {
        this.f7981a = kVar;
    }

    /* renamed from: a */
    public boolean mo10904a(ByteBuffer byteBuffer, C2390f fVar) {
        return this.f7981a.mo10952a(byteBuffer);
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(ByteBuffer byteBuffer, int i, int i2, C2390f fVar) throws IOException {
        return this.f7981a.mo10948a(C2542a.m10847b(byteBuffer), i, i2, fVar);
    }
}
