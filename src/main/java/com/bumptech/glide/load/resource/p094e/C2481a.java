package com.bumptech.glide.load.resource.p094e;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.p090a.C2399b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.resource.e.a */
public class C2481a implements AbstractC2485e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f8095a;

    /* renamed from: b */
    private final int f8096b;

    public C2481a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C2481a(Bitmap.CompressFormat compressFormat, int i) {
        this.f8095a = compressFormat;
        this.f8096b = i;
    }

    @Override // com.bumptech.glide.load.resource.p094e.AbstractC2485e
    /* renamed from: a */
    public AbstractC2383u<byte[]> mo11044a(AbstractC2383u<Bitmap> uVar, C2390f fVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.mo10878d().compress(this.f8095a, this.f8096b, byteArrayOutputStream);
        uVar.mo10880f();
        return new C2399b(byteArrayOutputStream.toByteArray());
    }
}
