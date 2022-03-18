package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.core.graphics.drawable.c */
public abstract class AbstractC0776c extends Drawable {

    /* renamed from: a */
    final Bitmap f3155a;

    /* renamed from: b */
    final Rect f3156b = new Rect();

    /* renamed from: c */
    private int f3157c = 160;

    /* renamed from: d */
    private int f3158d = 119;

    /* renamed from: e */
    private final Paint f3159e = new Paint(3);

    /* renamed from: f */
    private final BitmapShader f3160f;

    /* renamed from: g */
    private final Matrix f3161g = new Matrix();

    /* renamed from: h */
    private float f3162h;

    /* renamed from: i */
    private final RectF f3163i = new RectF();

    /* renamed from: j */
    private boolean f3164j = true;

    /* renamed from: k */
    private boolean f3165k;

    /* renamed from: l */
    private int f3166l;

    /* renamed from: m */
    private int f3167m;

    /* renamed from: b */
    private static boolean m3784b(float f) {
        return f > 0.05f;
    }

    /* renamed from: b */
    public float mo4310b() {
        return this.f3162h;
    }

    public int getIntrinsicHeight() {
        return this.f3167m;
    }

    public int getIntrinsicWidth() {
        return this.f3166l;
    }

    public int getAlpha() {
        return this.f3159e.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f3159e.getColorFilter();
    }

    /* renamed from: d */
    private void m3786d() {
        this.f3162h = (float) (Math.min(this.f3167m, this.f3166l) / 2);
    }

    /* renamed from: c */
    private void m3785c() {
        this.f3166l = this.f3155a.getScaledWidth(this.f3157c);
        this.f3167m = this.f3155a.getScaledHeight(this.f3157c);
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f3158d != 119 || this.f3165k || (bitmap = this.f3155a) == null || bitmap.hasAlpha() || this.f3159e.getAlpha() < 255 || m3784b(this.f3162h)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4306a() {
        if (this.f3164j) {
            if (this.f3165k) {
                int min = Math.min(this.f3166l, this.f3167m);
                mo4308a(this.f3158d, min, min, getBounds(), this.f3156b);
                int min2 = Math.min(this.f3156b.width(), this.f3156b.height());
                this.f3156b.inset(Math.max(0, (this.f3156b.width() - min2) / 2), Math.max(0, (this.f3156b.height() - min2) / 2));
                this.f3162h = ((float) min2) * 0.5f;
            } else {
                mo4308a(this.f3158d, this.f3166l, this.f3167m, getBounds(), this.f3156b);
            }
            this.f3163i.set(this.f3156b);
            if (this.f3160f != null) {
                this.f3161g.setTranslate(this.f3163i.left, this.f3163i.top);
                this.f3161g.preScale(this.f3163i.width() / ((float) this.f3155a.getWidth()), this.f3163i.height() / ((float) this.f3155a.getHeight()));
                this.f3160f.setLocalMatrix(this.f3161g);
                this.f3159e.setShader(this.f3160f);
            }
            this.f3164j = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3165k) {
            m3786d();
        }
        this.f3164j = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3159e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f3159e.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f3159e.setFilterBitmap(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo4309a(boolean z) {
        this.f3165k = z;
        this.f3164j = true;
        if (z) {
            m3786d();
            this.f3159e.setShader(this.f3160f);
            invalidateSelf();
            return;
        }
        mo4307a(BitmapDescriptorFactory.HUE_RED);
    }

    public void setAlpha(int i) {
        if (i != this.f3159e.getAlpha()) {
            this.f3159e.setAlpha(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo4307a(float f) {
        if (this.f3162h != f) {
            this.f3165k = false;
            if (m3784b(f)) {
                this.f3159e.setShader(this.f3160f);
            } else {
                this.f3159e.setShader(null);
            }
            this.f3162h = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f3155a;
        if (bitmap != null) {
            mo4306a();
            if (this.f3159e.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f3156b, this.f3159e);
                return;
            }
            RectF rectF = this.f3163i;
            float f = this.f3162h;
            canvas.drawRoundRect(rectF, f, f, this.f3159e);
        }
    }

    AbstractC0776c(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f3157c = resources.getDisplayMetrics().densityDpi;
        }
        this.f3155a = bitmap;
        if (bitmap != null) {
            m3785c();
            this.f3160f = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            return;
        }
        this.f3167m = -1;
        this.f3166l = -1;
        this.f3160f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4308a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }
}
