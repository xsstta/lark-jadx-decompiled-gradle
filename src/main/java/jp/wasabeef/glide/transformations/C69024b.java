package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;
import jp.wasabeef.glide.transformations.p3464a.C69022a;
import jp.wasabeef.glide.transformations.p3464a.C69023b;

/* renamed from: jp.wasabeef.glide.transformations.b */
public class C69024b extends AbstractC69021a {

    /* renamed from: b */
    private static final byte[] f173046b = "jp.wasabeef.glide.transformations.BlurTransformation.1".getBytes(f7599a);

    /* renamed from: c */
    private static int f173047c = 25;

    /* renamed from: d */
    private static int f173048d = 1;

    /* renamed from: e */
    private int f173049e;

    /* renamed from: f */
    private int f173050f;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return 737513610;
    }

    public C69024b() {
        this(f173047c, f173048d);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f173049e + ", sampling=" + this.f173050f + ")";
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof C69024b;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f173046b);
    }

    public C69024b(int i, int i2) {
        this.f173049e = i;
        this.f173050f = i2;
    }

    /* access modifiers changed from: protected */
    @Override // jp.wasabeef.glide.transformations.AbstractC69021a
    /* renamed from: a */
    public Bitmap mo238822a(Context context, AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f173050f;
        Bitmap a = eVar.mo10690a(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(a);
        int i4 = this.f173050f;
        canvas.scale(1.0f / ((float) i4), 1.0f / ((float) i4));
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        if (Build.VERSION.SDK_INT < 18) {
            return C69022a.m265645a(a, this.f173049e, true);
        }
        try {
            return C69023b.m265646a(context, a, this.f173049e);
        } catch (RSRuntimeException unused) {
            return C69022a.m265645a(a, this.f173049e, true);
        }
    }
}
