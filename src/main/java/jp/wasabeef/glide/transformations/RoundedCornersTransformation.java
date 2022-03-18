package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.huawei.hms.android.HwBuildEx;
import java.security.MessageDigest;

public class RoundedCornersTransformation extends AbstractC69021a {

    /* renamed from: b */
    private static final byte[] f173040b = "jp.wasabeef.glide.transformations.RoundedCornersTransformation.1".getBytes(f7599a);

    /* renamed from: c */
    private int f173041c;

    /* renamed from: d */
    private int f173042d;

    /* renamed from: e */
    private int f173043e;

    /* renamed from: f */
    private CornerType f173044f;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return 425235636;
    }

    public String toString() {
        return "RoundedTransformation(radius=" + this.f173041c + ", margin=" + this.f173043e + ", diameter=" + this.f173042d + ", cornerType=" + this.f173044f.name() + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jp.wasabeef.glide.transformations.RoundedCornersTransformation$1 */
    public static /* synthetic */ class C690201 {

        /* renamed from: a */
        static final /* synthetic */ int[] f173045a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.wasabeef.glide.transformations.RoundedCornersTransformation.C690201.<clinit>():void");
        }
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        return obj instanceof RoundedCornersTransformation;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f173040b);
    }

    /* renamed from: b */
    private void m265628b(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        int i2 = this.f173042d;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + i2), (float) (i + i2));
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f173043e;
        int i5 = this.f173041c;
        canvas.drawRect(new RectF((float) i4, (float) (i4 + i5), (float) (i4 + i5), f2), paint);
        int i6 = this.f173043e;
        canvas.drawRect(new RectF((float) (this.f173041c + i6), (float) i6, f, f2), paint);
    }

    /* renamed from: c */
    private void m265629c(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173042d;
        int i2 = this.f173043e;
        RectF rectF = new RectF(f - ((float) i), (float) i2, f, (float) (i2 + i));
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f173043e;
        canvas.drawRect(new RectF((float) i4, (float) i4, f - ((float) this.f173041c), f2), paint);
        int i5 = this.f173041c;
        canvas.drawRect(new RectF(f - ((float) i5), (float) (this.f173043e + i5), f, f2), paint);
    }

    /* renamed from: d */
    private void m265630d(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        int i2 = this.f173042d;
        RectF rectF = new RectF((float) i, f2 - ((float) i2), (float) (i + i2), f2);
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f173043e;
        canvas.drawRect(new RectF((float) i4, (float) i4, (float) (i4 + this.f173042d), f2 - ((float) this.f173041c)), paint);
        int i5 = this.f173043e;
        canvas.drawRect(new RectF((float) (this.f173041c + i5), (float) i5, f, f2), paint);
    }

    /* renamed from: e */
    private void m265631e(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173042d;
        RectF rectF = new RectF(f - ((float) i), f2 - ((float) i), f, f2);
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f173043e;
        canvas.drawRect(new RectF((float) i3, (float) i3, f - ((float) this.f173041c), f2), paint);
        int i4 = this.f173041c;
        canvas.drawRect(new RectF(f - ((float) i4), (float) this.f173043e, f, f2 - ((float) i4)), paint);
    }

    /* renamed from: f */
    private void m265632f(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.f173042d));
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f173043e;
        canvas.drawRect(new RectF((float) i3, (float) (i3 + this.f173041c), f, f2), paint);
    }

    /* renamed from: g */
    private void m265633g(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF((float) this.f173043e, f2 - ((float) this.f173042d), f, f2);
        int i = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        int i2 = this.f173043e;
        canvas.drawRect(new RectF((float) i2, (float) i2, f, f2 - ((float) this.f173041c)), paint);
    }

    /* renamed from: h */
    private void m265634h(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + this.f173042d), f2);
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f173043e;
        canvas.drawRect(new RectF((float) (this.f173041c + i3), (float) i3, f, f2), paint);
    }

    /* renamed from: i */
    private void m265635i(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - ((float) this.f173042d), (float) this.f173043e, f, f2);
        int i = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        int i2 = this.f173043e;
        canvas.drawRect(new RectF((float) i2, (float) i2, f - ((float) this.f173041c), f2), paint);
    }

    /* renamed from: j */
    private void m265636j(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF((float) this.f173043e, f2 - ((float) this.f173042d), f, f2);
        int i = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        RectF rectF2 = new RectF(f - ((float) this.f173042d), (float) this.f173043e, f, f2);
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, paint);
        int i3 = this.f173043e;
        int i4 = this.f173041c;
        canvas.drawRect(new RectF((float) i3, (float) i3, f - ((float) i4), f2 - ((float) i4)), paint);
    }

    /* renamed from: k */
    private void m265637k(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + this.f173042d), f2);
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        RectF rectF2 = new RectF((float) this.f173043e, f2 - ((float) this.f173042d), f, f2);
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, paint);
        int i4 = this.f173043e;
        int i5 = this.f173041c;
        canvas.drawRect(new RectF((float) (i4 + i5), (float) i4, f, f2 - ((float) i5)), paint);
    }

    /* renamed from: l */
    private void m265638l(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.f173042d));
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        RectF rectF2 = new RectF(f - ((float) this.f173042d), (float) this.f173043e, f, f2);
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, paint);
        int i4 = this.f173043e;
        int i5 = this.f173041c;
        canvas.drawRect(new RectF((float) i4, (float) (i4 + i5), f - ((float) i5), f2), paint);
    }

    /* renamed from: m */
    private void m265639m(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.f173042d));
        int i2 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f173043e;
        RectF rectF2 = new RectF((float) i3, (float) i3, (float) (i3 + this.f173042d), f2);
        int i4 = this.f173041c;
        canvas.drawRoundRect(rectF2, (float) i4, (float) i4, paint);
        int i5 = this.f173043e;
        int i6 = this.f173041c;
        canvas.drawRect(new RectF((float) (i5 + i6), (float) (i5 + i6), f, f2), paint);
    }

    /* renamed from: n */
    private void m265640n(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        int i2 = this.f173042d;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + i2), (float) (i + i2));
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f173042d;
        RectF rectF2 = new RectF(f - ((float) i4), f2 - ((float) i4), f, f2);
        int i5 = this.f173041c;
        canvas.drawRoundRect(rectF2, (float) i5, (float) i5, paint);
        int i6 = this.f173043e;
        canvas.drawRect(new RectF((float) i6, (float) (i6 + this.f173041c), f - ((float) this.f173042d), f2), paint);
        int i7 = this.f173043e;
        canvas.drawRect(new RectF((float) (this.f173042d + i7), (float) i7, f, f2 - ((float) this.f173041c)), paint);
    }

    /* renamed from: o */
    private void m265641o(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173042d;
        int i2 = this.f173043e;
        RectF rectF = new RectF(f - ((float) i), (float) i2, f, (float) (i2 + i));
        int i3 = this.f173041c;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f173043e;
        int i5 = this.f173042d;
        RectF rectF2 = new RectF((float) i4, f2 - ((float) i5), (float) (i4 + i5), f2);
        int i6 = this.f173041c;
        canvas.drawRoundRect(rectF2, (float) i6, (float) i6, paint);
        int i7 = this.f173043e;
        int i8 = this.f173041c;
        canvas.drawRect(new RectF((float) i7, (float) i7, f - ((float) i8), f2 - ((float) i8)), paint);
        int i9 = this.f173043e;
        int i10 = this.f173041c;
        canvas.drawRect(new RectF((float) (i9 + i10), (float) (i9 + i10), f, f2), paint);
    }

    /* renamed from: a */
    private void m265627a(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f173043e;
        float f3 = f - ((float) i);
        float f4 = f2 - ((float) i);
        switch (C690201.f173045a[this.f173044f.ordinal()]) {
            case 1:
                int i2 = this.f173043e;
                RectF rectF = new RectF((float) i2, (float) i2, f3, f4);
                int i3 = this.f173041c;
                canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
                return;
            case 2:
                m265628b(canvas, paint, f3, f4);
                return;
            case 3:
                m265629c(canvas, paint, f3, f4);
                return;
            case 4:
                m265630d(canvas, paint, f3, f4);
                return;
            case 5:
                m265631e(canvas, paint, f3, f4);
                return;
            case 6:
                m265632f(canvas, paint, f3, f4);
                return;
            case 7:
                m265633g(canvas, paint, f3, f4);
                return;
            case 8:
                m265634h(canvas, paint, f3, f4);
                return;
            case 9:
                m265635i(canvas, paint, f3, f4);
                return;
            case 10:
                m265636j(canvas, paint, f3, f4);
                return;
            case 11:
                m265637k(canvas, paint, f3, f4);
                return;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                m265638l(canvas, paint, f3, f4);
                return;
            case 13:
                m265639m(canvas, paint, f3, f4);
                return;
            case 14:
                m265640n(canvas, paint, f3, f4);
                return;
            case 15:
                m265641o(canvas, paint, f3, f4);
                return;
            default:
                int i4 = this.f173043e;
                RectF rectF2 = new RectF((float) i4, (float) i4, f3, f4);
                int i5 = this.f173041c;
                canvas.drawRoundRect(rectF2, (float) i5, (float) i5, paint);
                return;
        }
    }

    /* access modifiers changed from: protected */
    @Override // jp.wasabeef.glide.transformations.AbstractC69021a
    /* renamed from: a */
    public Bitmap mo238822a(Context context, AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap a = eVar.mo10690a(width, height, Bitmap.Config.ARGB_8888);
        a.setHasAlpha(true);
        Canvas canvas = new Canvas(a);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        m265627a(canvas, paint, (float) width, (float) height);
        return a;
    }
}
