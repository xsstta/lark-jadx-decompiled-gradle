package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;

public class CropTransformation extends AbstractC69021a {

    /* renamed from: b */
    private static final byte[] f173035b = "jp.wasabeef.glide.transformations.CropTransformation.1".getBytes(f7599a);

    /* renamed from: c */
    private int f173036c;

    /* renamed from: d */
    private int f173037d;

    /* renamed from: e */
    private CropType f173038e = CropType.CENTER;

    public enum CropType {
        TOP,
        CENTER,
        BOTTOM
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return -1462327117;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jp.wasabeef.glide.transformations.CropTransformation$1 */
    public static /* synthetic */ class C690191 {

        /* renamed from: a */
        static final /* synthetic */ int[] f173039a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                jp.wasabeef.glide.transformations.CropTransformation$CropType[] r0 = jp.wasabeef.glide.transformations.CropTransformation.CropType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                jp.wasabeef.glide.transformations.CropTransformation.C690191.f173039a = r0
                jp.wasabeef.glide.transformations.CropTransformation$CropType r1 = jp.wasabeef.glide.transformations.CropTransformation.CropType.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = jp.wasabeef.glide.transformations.CropTransformation.C690191.f173039a     // Catch:{ NoSuchFieldError -> 0x001d }
                jp.wasabeef.glide.transformations.CropTransformation$CropType r1 = jp.wasabeef.glide.transformations.CropTransformation.CropType.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = jp.wasabeef.glide.transformations.CropTransformation.C690191.f173039a     // Catch:{ NoSuchFieldError -> 0x0028 }
                jp.wasabeef.glide.transformations.CropTransformation$CropType r1 = jp.wasabeef.glide.transformations.CropTransformation.CropType.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.wasabeef.glide.transformations.CropTransformation.C690191.<clinit>():void");
        }
    }

    public String toString() {
        return "CropTransformation(width=" + this.f173036c + ", height=" + this.f173037d + ", cropType=" + this.f173038e + ")";
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof CropTransformation;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f173035b);
    }

    /* renamed from: a */
    private float m265625a(float f) {
        int i = C690191.f173039a[this.f173038e.ordinal()];
        if (i == 2) {
            return (((float) this.f173037d) - f) / 2.0f;
        }
        if (i != 3) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((float) this.f173037d) - f;
    }

    public CropTransformation(int i, int i2, CropType cropType) {
        this.f173036c = i;
        this.f173037d = i2;
        this.f173038e = cropType;
    }

    /* access modifiers changed from: protected */
    @Override // jp.wasabeef.glide.transformations.AbstractC69021a
    /* renamed from: a */
    public Bitmap mo238822a(Context context, AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int i3 = this.f173036c;
        if (i3 == 0) {
            i3 = bitmap.getWidth();
        }
        this.f173036c = i3;
        int i4 = this.f173037d;
        if (i4 == 0) {
            i4 = bitmap.getHeight();
        }
        this.f173037d = i4;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap a = eVar.mo10690a(this.f173036c, this.f173037d, config);
        a.setHasAlpha(true);
        float max = Math.max(((float) this.f173036c) / ((float) bitmap.getWidth()), ((float) this.f173037d) / ((float) bitmap.getHeight()));
        float width = ((float) bitmap.getWidth()) * max;
        float height = max * ((float) bitmap.getHeight());
        float f = (((float) this.f173036c) - width) / 2.0f;
        float a2 = m265625a(height);
        new Canvas(a).drawBitmap(bitmap, (Rect) null, new RectF(f, a2, width + f, height + a2), (Paint) null);
        return a;
    }
}
