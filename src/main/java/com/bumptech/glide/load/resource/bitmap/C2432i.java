package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
public class C2432i extends AbstractC2429f {

    /* renamed from: b */
    private static final byte[] f7983b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f7599a);

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof C2432i;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f7983b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
    /* renamed from: a */
    public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        return C2455y.m10367a(eVar, bitmap, i, i2);
    }
}
