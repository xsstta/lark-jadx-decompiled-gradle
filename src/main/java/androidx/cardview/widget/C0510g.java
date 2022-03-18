package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.g */
public class C0510g extends Drawable {

    /* renamed from: a */
    static AbstractC0511a f1839a;

    /* renamed from: b */
    private static final double f1840b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final int f1841c;

    /* renamed from: d */
    private Paint f1842d;

    /* renamed from: e */
    private Paint f1843e;

    /* renamed from: f */
    private Paint f1844f;

    /* renamed from: g */
    private final RectF f1845g;

    /* renamed from: h */
    private float f1846h;

    /* renamed from: i */
    private Path f1847i;

    /* renamed from: j */
    private float f1848j;

    /* renamed from: k */
    private float f1849k;

    /* renamed from: l */
    private float f1850l;

    /* renamed from: m */
    private ColorStateList f1851m;

    /* renamed from: n */
    private boolean f1852n = true;

    /* renamed from: o */
    private final int f1853o;

    /* renamed from: p */
    private final int f1854p;

    /* renamed from: q */
    private boolean f1855q = true;

    /* renamed from: r */
    private boolean f1856r;

    /* renamed from: androidx.cardview.widget.g$a */
    interface AbstractC0511a {
        /* renamed from: a */
        void mo2841a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2872a() {
        return this.f1846h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo2877b() {
        return this.f1850l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2879c() {
        return this.f1848j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo2884f() {
        return this.f1851m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo2881d() {
        float f = this.f1848j;
        return (Math.max(f, this.f1846h + ((float) this.f1841c) + (f / 2.0f)) * 2.0f) + ((this.f1848j + ((float) this.f1841c)) * 2.0f);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1851m;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo2883e() {
        float f = this.f1848j;
        return (Math.max(f, this.f1846h + ((float) this.f1841c) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1848j * 1.5f) + ((float) this.f1841c)) * 2.0f);
    }

    /* renamed from: g */
    private void m2285g() {
        float f = this.f1846h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1849k;
        rectF2.inset(-f2, -f2);
        Path path = this.f1847i;
        if (path == null) {
            this.f1847i = new Path();
        } else {
            path.reset();
        }
        this.f1847i.setFillType(Path.FillType.EVEN_ODD);
        this.f1847i.moveTo(-this.f1846h, BitmapDescriptorFactory.HUE_RED);
        this.f1847i.rLineTo(-this.f1849k, BitmapDescriptorFactory.HUE_RED);
        this.f1847i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1847i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1847i.close();
        float f3 = this.f1846h;
        float f4 = f3 / (this.f1849k + f3);
        Paint paint = this.f1843e;
        float f5 = this.f1846h + this.f1849k;
        int i = this.f1853o;
        paint.setShader(new RadialGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f5, new int[]{i, i, this.f1854p}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1844f;
        float f6 = this.f1846h;
        float f7 = this.f1849k;
        int i2 = this.f1853o;
        paint2.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (-f6) + f7, (float) BitmapDescriptorFactory.HUE_RED, (-f6) - f7, new int[]{i2, i2, this.f1854p}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1844f.setAntiAlias(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2874a(ColorStateList colorStateList) {
        m2282b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2878b(float f) {
        m2279a(f, this.f1848j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2880c(float f) {
        m2279a(this.f1850l, f);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1852n = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1842d.setColorFilter(colorFilter);
    }

    /* renamed from: d */
    private int m2284d(float f) {
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2875a(Rect rect) {
        getPadding(rect);
    }

    public void setAlpha(int i) {
        this.f1842d.setAlpha(i);
        this.f1843e.setAlpha(i);
        this.f1844f.setAlpha(i);
    }

    /* renamed from: b */
    private void m2282b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1851m = colorStateList;
        this.f1842d.setColor(colorStateList.getColorForState(getState(), this.f1851m.getDefaultColor()));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1851m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1842d.getColor() == colorForState) {
            return false;
        }
        this.f1842d.setColor(colorForState);
        this.f1852n = true;
        invalidateSelf();
        return true;
    }

    /* renamed from: b */
    private void m2283b(Rect rect) {
        float f = this.f1848j * 1.5f;
        this.f1845g.set(((float) rect.left) + this.f1848j, ((float) rect.top) + f, ((float) rect.right) - this.f1848j, ((float) rect.bottom) - f);
        m2285g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2873a(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1846h != f2) {
                this.f1846h = f2;
                this.f1852n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    public void draw(Canvas canvas) {
        if (this.f1852n) {
            m2283b(getBounds());
            this.f1852n = false;
        }
        canvas.translate(BitmapDescriptorFactory.HUE_RED, this.f1850l / 2.0f);
        m2280a(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (-this.f1850l) / 2.0f);
        f1839a.mo2841a(canvas, this.f1845g, this.f1846h, this.f1842d);
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m2278a(this.f1848j, this.f1846h, this.f1855q));
        int ceil2 = (int) Math.ceil((double) m2281b(this.f1848j, this.f1846h, this.f1855q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2876a(boolean z) {
        this.f1855q = z;
        invalidateSelf();
    }

    /* renamed from: a */
    private void m2280a(Canvas canvas) {
        boolean z;
        boolean z2;
        float f = this.f1846h;
        float f2 = (-f) - this.f1849k;
        float f3 = f + ((float) this.f1841c) + (this.f1850l / 2.0f);
        float f4 = f3 * 2.0f;
        if (this.f1845g.width() - f4 > BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1845g.height() - f4 > BitmapDescriptorFactory.HUE_RED) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        canvas.translate(this.f1845g.left + f3, this.f1845g.top + f3);
        canvas.drawPath(this.f1847i, this.f1843e);
        if (z) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f2, this.f1845g.width() - f4, -this.f1846h, this.f1844f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f1845g.right - f3, this.f1845g.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1847i, this.f1843e);
        if (z) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f2, this.f1845g.width() - f4, (-this.f1846h) + this.f1849k, this.f1844f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f1845g.left + f3, this.f1845g.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1847i, this.f1843e);
        if (z2) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f2, this.f1845g.height() - f4, -this.f1846h, this.f1844f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f1845g.right - f3, this.f1845g.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1847i, this.f1843e);
        if (z2) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f2, this.f1845g.height() - f4, -this.f1846h, this.f1844f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: a */
    private void m2279a(float f, float f2) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= BitmapDescriptorFactory.HUE_RED) {
            float d = (float) m2284d(f);
            float d2 = (float) m2284d(f2);
            if (d > d2) {
                if (!this.f1856r) {
                    this.f1856r = true;
                }
                d = d2;
            }
            if (this.f1850l != d || this.f1848j != d2) {
                this.f1850l = d;
                this.f1848j = d2;
                this.f1849k = (float) ((int) ((d * 1.5f) + ((float) this.f1841c) + 0.5f));
                this.f1852n = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: b */
    static float m2281b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f1840b) * ((double) f2)));
        }
        return f;
    }

    /* renamed from: a */
    static float m2278a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (f * 1.5f)) + ((1.0d - f1840b) * ((double) f2)));
        }
        return f * 1.5f;
    }

    C0510g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1853o = resources.getColor(R.color.cardview_shadow_start_color);
        this.f1854p = resources.getColor(R.color.cardview_shadow_end_color);
        this.f1841c = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.f1842d = new Paint(5);
        m2282b(colorStateList);
        Paint paint = new Paint(5);
        this.f1843e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1846h = (float) ((int) (f + 0.5f));
        this.f1845g = new RectF();
        Paint paint2 = new Paint(this.f1843e);
        this.f1844f = paint2;
        paint2.setAntiAlias(false);
        m2279a(f2, f3);
    }
}
