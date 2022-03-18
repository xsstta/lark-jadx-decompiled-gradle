package com.ss.android.lark.ai.p1336e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.ai.e.f */
public class C28543f extends Drawable {

    /* renamed from: a */
    private Paint f71713a;

    /* renamed from: b */
    private Paint f71714b;

    /* renamed from: c */
    private boolean f71715c;

    /* renamed from: d */
    private int[] f71716d;

    /* renamed from: e */
    private int f71717e;

    /* renamed from: f */
    private int f71718f;

    /* renamed from: g */
    private int[] f71719g;

    /* renamed from: h */
    private int f71720h = 10;

    /* renamed from: i */
    private int f71721i;

    /* renamed from: j */
    private int f71722j;

    /* renamed from: k */
    private float f71723k = 1.0f;

    /* renamed from: l */
    private int f71724l = -1;

    /* renamed from: m */
    private int f71725m = -16777216;

    /* renamed from: n */
    private int f71726n = -16777216;

    /* renamed from: o */
    private Path f71727o;

    /* renamed from: p */
    private Path f71728p;

    /* renamed from: q */
    private int f71729q = 1;

    public int getOpacity() {
        return -3;
    }

    public C28543f() {
        m104652a();
    }

    /* renamed from: a */
    private void m104652a() {
        Paint paint = new Paint(5);
        this.f71714b = paint;
        paint.setColor(this.f71725m);
        this.f71714b.setAntiAlias(true);
        this.f71714b.setStyle(Paint.Style.STROKE);
        this.f71714b.setStrokeWidth(this.f71723k);
        this.f71727o = new Path();
        this.f71728p = new Path();
        Paint paint2 = new Paint(5);
        this.f71713a = paint2;
        paint2.setColor(this.f71724l);
        this.f71713a.setAntiAlias(true);
        this.f71713a.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public void mo101623a(boolean z) {
        this.f71715c = z;
    }

    /* renamed from: b */
    public void mo101626b(int[] iArr) {
        this.f71719g = iArr;
    }

    /* renamed from: d */
    public void mo101628d(int i) {
        this.f71726n = i;
    }

    /* renamed from: e */
    public void mo101630e(int i) {
        this.f71717e = i;
    }

    /* renamed from: f */
    public void mo101631f(int i) {
        this.f71718f = i;
    }

    /* renamed from: g */
    public void mo101632g(int i) {
        this.f71720h = i;
    }

    /* renamed from: h */
    public void mo101635h(int i) {
        this.f71721i = i;
    }

    /* renamed from: i */
    public void mo101636i(int i) {
        this.f71722j = i;
    }

    /* renamed from: a */
    public void mo101624a(int[] iArr) {
        this.f71716d = iArr;
    }

    public void setAlpha(int i) {
        this.f71713a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f71713a.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public void mo101622a(int i) {
        this.f71724l = i;
        this.f71713a.setColor(i);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo101625b(int i) {
        this.f71725m = i;
        this.f71714b.setColor(i);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo101627c(int i) {
        float f = (float) i;
        this.f71723k = f;
        this.f71714b.setStrokeWidth(f);
        invalidateSelf();
    }

    public void getOutline(Outline outline) {
        int i;
        int i2;
        Rect bounds = getBounds();
        if (this.f71715c) {
            i2 = bounds.top + this.f71729q + this.f71722j;
            i = bounds.bottom;
        } else {
            i2 = bounds.top;
            i = (bounds.bottom - this.f71729q) - this.f71722j;
        }
        outline.setRoundRect(new Rect(bounds.left, i2, bounds.right, i), (float) this.f71720h);
    }

    /* renamed from: b */
    private void m104654b(Rect rect) {
        int i = this.f71719g[0] - this.f71716d[0];
        this.f71728p.reset();
        float f = (float) i;
        float f2 = ((float) (this.f71721i / 2)) * 1.2f;
        this.f71728p.moveTo(f - f2, ((float) (rect.height() - this.f71729q)) - (((float) this.f71722j) * 1.2f));
        this.f71728p.lineTo(f, (float) (rect.height() - this.f71729q));
        this.f71728p.lineTo(f + f2, ((float) (rect.height() - this.f71729q)) - (((float) this.f71722j) * 1.2f));
        this.f71728p.close();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.f71715c) {
            m104653a(bounds);
            this.f71728p.reset();
        } else {
            m104655c(bounds);
            m104654b(bounds);
        }
        canvas.drawPath(this.f71727o, this.f71713a);
        if (!this.f71728p.isEmpty()) {
            this.f71713a.setColor(this.f71726n);
            canvas.drawPath(this.f71728p, this.f71713a);
            this.f71713a.setColor(this.f71724l);
        }
        canvas.drawPath(this.f71727o, this.f71714b);
    }

    /* renamed from: a */
    private void m104653a(Rect rect) {
        int i = this.f71719g[0] - this.f71716d[0];
        int i2 = this.f71721i / 2;
        int min = Math.min(Math.max(i, this.f71729q + this.f71720h + i2), ((rect.width() - this.f71729q) - this.f71720h) - i2);
        this.f71727o.reset();
        Path path = this.f71727o;
        int i3 = this.f71729q;
        path.moveTo((float) (this.f71720h + i3), (float) (i3 + this.f71722j));
        Path path2 = this.f71727o;
        int i4 = this.f71729q;
        int i5 = this.f71722j;
        int i6 = this.f71720h;
        path2.arcTo(new RectF((float) i4, (float) (i4 + i5), (float) ((i6 * 2) + i4), (float) (i4 + i5 + (i6 * 2))), 270.0f, -90.0f);
        this.f71727o.lineTo((float) this.f71729q, (float) ((rect.height() - this.f71729q) - this.f71720h));
        Path path3 = this.f71727o;
        int height = rect.height();
        int i7 = this.f71729q;
        int i8 = this.f71720h;
        path3.arcTo(new RectF((float) this.f71729q, (float) ((height - i7) - (i8 * 2)), (float) (i7 + (i8 * 2)), (float) (rect.height() - this.f71729q)), 180.0f, -90.0f);
        this.f71727o.lineTo((float) ((rect.width() - this.f71729q) - this.f71720h), (float) (rect.height() - this.f71729q));
        this.f71727o.arcTo(new RectF((float) ((rect.width() - this.f71729q) - (this.f71720h * 2)), (float) ((rect.height() - this.f71729q) - (this.f71720h * 2)), (float) (rect.width() - this.f71729q), (float) (rect.height() - this.f71729q)), 90.0f, -90.0f);
        Path path4 = this.f71727o;
        int width = rect.width();
        int i9 = this.f71729q;
        path4.lineTo((float) (width - i9), (float) (i9 + this.f71722j + this.f71720h));
        Path path5 = this.f71727o;
        int width2 = rect.width();
        int i10 = this.f71729q;
        int width3 = rect.width();
        int i11 = this.f71729q;
        path5.arcTo(new RectF((float) ((width2 - i10) - (this.f71720h * 2)), (float) (i10 + this.f71722j), (float) (width3 - i11), (float) (i11 + this.f71722j + (this.f71720h * 2))), BitmapDescriptorFactory.HUE_RED, -90.0f);
        this.f71727o.lineTo((float) (min + i2), (float) (this.f71729q + this.f71722j));
        this.f71727o.lineTo((float) min, (float) this.f71729q);
        this.f71727o.lineTo((float) (min - i2), (float) (this.f71729q + this.f71722j));
        this.f71727o.close();
    }

    /* renamed from: c */
    private void m104655c(Rect rect) {
        int i = this.f71719g[0] - this.f71716d[0];
        int i2 = this.f71721i / 2;
        int min = Math.min(Math.max(i, this.f71729q + this.f71720h + i2), ((rect.width() - this.f71729q) - this.f71720h) - i2);
        this.f71727o.reset();
        Path path = this.f71727o;
        int i3 = this.f71729q;
        path.moveTo((float) (this.f71720h + i3), (float) i3);
        Path path2 = this.f71727o;
        int i4 = this.f71729q;
        int i5 = this.f71720h;
        path2.arcTo(new RectF((float) i4, (float) i4, (float) ((i5 * 2) + i4), (float) (i4 + (i5 * 2))), 270.0f, -90.0f);
        this.f71727o.lineTo((float) this.f71729q, (float) (((rect.height() - this.f71729q) - this.f71720h) - this.f71722j));
        Path path3 = this.f71727o;
        int height = rect.height();
        int i6 = this.f71729q;
        int i7 = this.f71720h;
        path3.arcTo(new RectF((float) this.f71729q, (float) (((height - i6) - (i7 * 2)) - this.f71722j), (float) (i6 + (i7 * 2)), (float) ((rect.height() - this.f71729q) - this.f71722j)), 180.0f, -90.0f);
        this.f71727o.lineTo((float) (min - i2), (float) ((rect.height() - this.f71729q) - this.f71722j));
        this.f71727o.lineTo((float) min, (float) (rect.height() - this.f71729q));
        this.f71727o.lineTo((float) (min + i2), (float) ((rect.height() - this.f71729q) - this.f71722j));
        this.f71727o.lineTo((float) ((rect.width() - this.f71729q) - this.f71720h), (float) ((rect.height() - this.f71729q) - this.f71722j));
        this.f71727o.arcTo(new RectF((float) ((rect.width() - this.f71729q) - (this.f71720h * 2)), (float) (((rect.height() - this.f71729q) - (this.f71720h * 2)) - this.f71722j), (float) (rect.width() - this.f71729q), (float) ((rect.height() - this.f71729q) - this.f71722j)), 90.0f, -90.0f);
        Path path4 = this.f71727o;
        int width = rect.width();
        int i8 = this.f71729q;
        path4.lineTo((float) (width - i8), (float) (i8 + this.f71720h));
        Path path5 = this.f71727o;
        int width2 = rect.width();
        int i9 = this.f71729q;
        int width3 = rect.width();
        int i10 = this.f71729q;
        path5.arcTo(new RectF((float) ((width2 - i9) - (this.f71720h * 2)), (float) i9, (float) (width3 - i10), (float) (i10 + (this.f71720h * 2))), BitmapDescriptorFactory.HUE_RED, -90.0f);
        this.f71727o.close();
    }
}
