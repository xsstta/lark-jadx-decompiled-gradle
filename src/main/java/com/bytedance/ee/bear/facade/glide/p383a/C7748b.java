package com.bytedance.ee.bear.facade.glide.p383a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.AbstractC2429f;
import com.bumptech.glide.load.resource.bitmap.C2455y;
import java.security.MessageDigest;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.b */
public class C7748b extends AbstractC2429f {

    /* renamed from: b */
    private static final byte[] f21012b = "com.bytedance.ee.bear.facade.glide.thumbnail.LeftCropForView.1".getBytes(AbstractC2265c.f7599a);

    /* renamed from: c */
    private int f21013c;

    /* renamed from: d */
    private int f21014d;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return 576476343;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof C7748b;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f21012b);
    }

    /* renamed from: a */
    private Bitmap.Config m31037a(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    public C7748b(int i, int i2) {
        this.f21013c = i;
        this.f21014d = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
    /* renamed from: a */
    public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int i3 = this.f21013c;
        int i4 = this.f21014d;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap a = eVar.mo10690a(i4, i3, config);
        Bitmap a2 = m31038a(a, bitmap, i4, i3);
        if (!(a == null || a == a2)) {
            eVar.mo10693a(a);
        }
        return a2;
    }

    /* renamed from: a */
    private Bitmap m31038a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        int i3;
        float f;
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
            return bitmap2;
        }
        Matrix matrix = new Matrix();
        if (bitmap2.getWidth() * i2 > bitmap2.getHeight() * i) {
            f = (float) i2;
            i3 = bitmap2.getHeight();
        } else {
            f = (float) i;
            i3 = bitmap2.getWidth();
        }
        float f2 = f / ((float) i3);
        matrix.setScale(f2, f2);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, m31037a(bitmap2));
        }
        C2455y.m10371a(bitmap2, bitmap);
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(6));
        return bitmap;
    }
}
