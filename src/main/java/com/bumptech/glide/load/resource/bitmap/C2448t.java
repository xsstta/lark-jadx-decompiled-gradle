package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
public final class C2448t implements AbstractC2391g<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C2434k f8019a;

    public C2448t(C2434k kVar) {
        this.f8019a = kVar;
    }

    /* renamed from: a */
    public boolean mo10904a(ParcelFileDescriptor parcelFileDescriptor, C2390f fVar) {
        return this.f8019a.mo10950a(parcelFileDescriptor);
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C2390f fVar) throws IOException {
        return this.f8019a.mo10947a(parcelFileDescriptor, i, i2, fVar);
    }
}
