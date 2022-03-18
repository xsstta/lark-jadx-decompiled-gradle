package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.f */
public class C0509f extends Drawable {

    /* renamed from: a */
    private float f1828a;

    /* renamed from: b */
    private final Paint f1829b;

    /* renamed from: c */
    private final RectF f1830c;

    /* renamed from: d */
    private final Rect f1831d;

    /* renamed from: e */
    private float f1832e;

    /* renamed from: f */
    private boolean f1833f;

    /* renamed from: g */
    private boolean f1834g = true;

    /* renamed from: h */
    private ColorStateList f1835h;

    /* renamed from: i */
    private PorterDuffColorFilter f1836i;

    /* renamed from: j */
    private ColorStateList f1837j;

    /* renamed from: k */
    private PorterDuff.Mode f1838k = PorterDuff.Mode.SRC_IN;

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2856a() {
        return this.f1832e;
    }

    /* renamed from: b */
    public float mo2860b() {
        return this.f1828a;
    }

    /* renamed from: c */
    public ColorStateList mo2861c() {
        return this.f1835h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1837j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f1835h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo2859a(ColorStateList colorStateList) {
        m2271b(colorStateList);
        invalidateSelf();
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1831d, this.f1828a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2270a(rect);
    }

    public void setAlpha(int i) {
        this.f1829b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1829b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1837j = colorStateList;
        this.f1836i = m2269a(colorStateList, this.f1838k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1838k = mode;
        this.f1836i = m2269a(this.f1837j, mode);
        invalidateSelf();
    }

    /* renamed from: b */
    private void m2271b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1835h = colorStateList;
        this.f1829b.setColor(colorStateList.getColorForState(getState(), this.f1835h.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2857a(float f) {
        if (f != this.f1828a) {
            this.f1828a = f;
            m2270a((Rect) null);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1829b;
        if (this.f1836i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1836i);
            z = true;
        }
        RectF rectF = this.f1830c;
        float f = this.f1828a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1835h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f1829b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1829b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1837j;
        if (colorStateList2 == null || (mode = this.f1838k) == null) {
            return z;
        }
        this.f1836i = m2269a(colorStateList2, mode);
        return true;
    }

    /* renamed from: a */
    private void m2270a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1830c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1831d.set(rect);
        if (this.f1833f) {
            float a = C0510g.m2278a(this.f1832e, this.f1828a, this.f1834g);
            this.f1831d.inset((int) Math.ceil((double) C0510g.m2281b(this.f1832e, this.f1828a, this.f1834g)), (int) Math.ceil((double) a));
            this.f1830c.set(this.f1831d);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m2269a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    C0509f(ColorStateList colorStateList, float f) {
        this.f1828a = f;
        this.f1829b = new Paint(5);
        m2271b(colorStateList);
        this.f1830c = new RectF();
        this.f1831d = new Rect();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2858a(float f, boolean z, boolean z2) {
        if (f != this.f1832e || this.f1833f != z || this.f1834g != z2) {
            this.f1832e = f;
            this.f1833f = z;
            this.f1834g = z2;
            m2270a((Rect) null);
            invalidateSelf();
        }
    }
}
