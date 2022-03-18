package com.ss.android.shapeimage.p3023b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.shapeimage.b.a */
public abstract class AbstractC59984a {

    /* renamed from: a */
    protected int f149545a;

    /* renamed from: b */
    protected int f149546b;

    /* renamed from: c */
    protected int f149547c = -16777216;

    /* renamed from: d */
    protected int f149548d;

    /* renamed from: e */
    protected float f149549e = 1.0f;

    /* renamed from: f */
    protected boolean f149550f;

    /* renamed from: g */
    protected final Paint f149551g;

    /* renamed from: h */
    protected final Paint f149552h;

    /* renamed from: i */
    protected BitmapShader f149553i;

    /* renamed from: j */
    protected Drawable f149554j;

    /* renamed from: k */
    protected final Matrix f149555k = new Matrix();

    /* renamed from: a */
    public abstract void mo204251a(int i, int i2, float f, float f2, float f3, float f4, float f5);

    /* renamed from: a */
    public void mo204252a(Context context, AttributeSet attributeSet, int i) {
    }

    /* renamed from: a */
    public abstract void mo204253a(Canvas canvas, Paint paint, Paint paint2);

    /* renamed from: b */
    public abstract void mo204257b();

    /* renamed from: e */
    public final int mo204261e() {
        return this.f149548d;
    }

    /* renamed from: f */
    public final float mo204262f() {
        return this.f149549e;
    }

    /* renamed from: g */
    public final boolean mo204263g() {
        return this.f149550f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Bitmap mo204260d() {
        Drawable drawable = this.f149554j;
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    public AbstractC59984a() {
        Paint paint = new Paint();
        this.f149551g = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f149552h = paint2;
        paint2.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo204259c() {
        Bitmap a = mo126282a();
        if (a != null && a.getWidth() > 0 && a.getHeight() > 0) {
            BitmapShader bitmapShader = new BitmapShader(a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f149553i = bitmapShader;
            this.f149552h.setShader(bitmapShader);
        }
    }

    /* renamed from: a */
    public Bitmap mo126282a() {
        float f;
        float f2;
        Bitmap d = mo204260d();
        if (d != null) {
            int width = d.getWidth();
            int height = d.getHeight();
            if (width > 0 && height > 0) {
                float round = (float) Math.round(((float) this.f149545a) - (((float) this.f149548d) * 2.0f));
                float round2 = (float) Math.round(((float) this.f149546b) - (((float) this.f149548d) * 2.0f));
                float f3 = (float) width;
                float f4 = (float) height;
                float f5 = BitmapDescriptorFactory.HUE_RED;
                if (f3 * round2 > round * f4) {
                    f2 = round2 / f4;
                    f5 = (float) Math.round(((round / f2) - f3) / 2.0f);
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    float f6 = round / f3;
                    f2 = f6;
                    f = (float) Math.round(((round2 / f6) - f4) / 2.0f);
                }
                this.f149555k.setScale(f2, f2);
                this.f149555k.preTranslate(f5, f);
                Matrix matrix = this.f149555k;
                int i = this.f149548d;
                matrix.postTranslate((float) i, (float) i);
                mo204251a(width, height, round, round2, f2, f5, f);
                return d;
            }
        }
        mo204257b();
        return null;
    }

    /* renamed from: a */
    public final void mo204249a(int i) {
        this.f149547c = i;
        Paint paint = this.f149551g;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    /* renamed from: b */
    public final void mo204258b(int i) {
        this.f149548d = i;
        Paint paint = this.f149551g;
        if (paint != null) {
            paint.setStrokeWidth((float) i);
        }
    }

    /* renamed from: a */
    public final void mo204248a(float f) {
        this.f149549e = f;
        Paint paint = this.f149551g;
        if (paint != null) {
            paint.setAlpha(Float.valueOf(f * 255.0f).intValue());
        }
    }

    /* renamed from: a */
    public final void mo204254a(Drawable drawable) {
        this.f149554j = drawable;
        this.f149553i = null;
        this.f149552h.setShader(null);
    }

    /* renamed from: a */
    public final void mo204255a(boolean z) {
        this.f149550f = z;
    }

    /* renamed from: a */
    public boolean mo204256a(Canvas canvas) {
        if (this.f149553i == null) {
            mo204259c();
        }
        if (this.f149553i == null || this.f149545a <= 0 || this.f149546b <= 0) {
            return false;
        }
        mo204253a(canvas, this.f149552h, this.f149551g);
        return true;
    }

    /* renamed from: a */
    public void mo204250a(int i, int i2) {
        if (this.f149545a != i || this.f149546b != i2) {
            this.f149545a = i;
            this.f149546b = i2;
            if (mo204263g()) {
                int min = Math.min(i, i2);
                this.f149546b = min;
                this.f149545a = min;
            }
            if (this.f149553i != null) {
                mo126282a();
            }
        }
    }
}
