package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.C2455y;
import java.security.MessageDigest;

/* renamed from: jp.wasabeef.glide.transformations.c */
public class C69025c extends AbstractC69021a {

    /* renamed from: b */
    private static final byte[] f173051b = "jp.wasabeef.glide.transformations.CropCircleTransformation.1".getBytes(f7599a);

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return 1288474723;
    }

    public String toString() {
        return "CropCircleTransformation()";
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof C69025c;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f173051b);
    }

    /* access modifiers changed from: protected */
    @Override // jp.wasabeef.glide.transformations.AbstractC69021a
    /* renamed from: a */
    public Bitmap mo238822a(Context context, AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        return C2455y.m10379d(eVar, bitmap, i, i2);
    }
}
