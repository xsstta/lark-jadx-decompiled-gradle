package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
public final class C2452w extends AbstractC2429f {

    /* renamed from: b */
    private static final byte[] f8028b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(f7599a);

    /* renamed from: c */
    private final int f8029c;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return C2568k.m10914b(-569625254, C2568k.m10913b(this.f8029c));
    }

    public C2452w(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C2567j.m10898a(z, "roundingRadius must be greater than 0.");
        this.f8029c = i;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2452w) || this.f8029c != ((C2452w) obj).f8029c) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f8028b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f8029c).array());
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
    /* renamed from: a */
    public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        return C2455y.m10375b(eVar, bitmap, this.f8029c);
    }
}
