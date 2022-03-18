package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public class C2441o extends AbstractC2429f {

    /* renamed from: b */
    private static final byte[] f8002b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f7599a);

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof C2441o;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f8002b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
    /* renamed from: a */
    public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        return C2455y.m10376b(eVar, bitmap, i, i2);
    }
}
