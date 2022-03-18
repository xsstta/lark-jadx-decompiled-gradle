package com.bytedance.ee.bear.list.p426d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.AbstractC2429f;
import java.security.MessageDigest;

/* renamed from: com.bytedance.ee.bear.list.d.e */
public class C8261e extends AbstractC2429f {

    /* renamed from: b */
    private static final byte[] f22292b = "com.bytedance.ee.bear.list.listitem.ListIconTransformation.1".getBytes(f7599a);

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return -1834593300;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof C8261e;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f22292b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
    /* renamed from: a */
    public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        int i3;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        if (width > height) {
            i3 = (width - height) / 2;
        } else {
            height = width;
            i3 = 0;
        }
        return Bitmap.createBitmap(bitmap, i3, 0, height, height);
    }
}
