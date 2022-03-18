package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0768a;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.C22402m;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.c */
public class C22287c extends Drawable {

    /* renamed from: a */
    float f54513a;

    /* renamed from: b */
    private final C22402m f54514b = new C22402m();

    /* renamed from: c */
    private final Paint f54515c;

    /* renamed from: d */
    private final Path f54516d = new Path();

    /* renamed from: e */
    private final Rect f54517e = new Rect();

    /* renamed from: f */
    private final RectF f54518f = new RectF();

    /* renamed from: g */
    private final RectF f54519g = new RectF();

    /* renamed from: h */
    private final C22289a f54520h = new C22289a();

    /* renamed from: i */
    private int f54521i;

    /* renamed from: j */
    private int f54522j;

    /* renamed from: k */
    private int f54523k;

    /* renamed from: l */
    private int f54524l;

    /* renamed from: m */
    private int f54525m;

    /* renamed from: n */
    private boolean f54526n = true;

    /* renamed from: o */
    private C22398l f54527o;

    /* renamed from: p */
    private ColorStateList f54528p;

    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    private class C22289a extends Drawable.ConstantState {
        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C22287c.this;
        }

        private C22289a() {
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f54520h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RectF mo77584a() {
        this.f54519g.set(getBounds());
        return this.f54519g;
    }

    public int getOpacity() {
        if (this.f54513a > BitmapDescriptorFactory.HUE_RED) {
            return -3;
        }
        return -2;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f54528p;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private Shader m80673b() {
        Rect rect = this.f54517e;
        copyBounds(rect);
        float height = this.f54513a / ((float) rect.height());
        return new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) rect.top, (float) BitmapDescriptorFactory.HUE_RED, (float) rect.bottom, new int[]{C0768a.m3706a(this.f54521i, this.f54525m), C0768a.m3706a(this.f54522j, this.f54525m), C0768a.m3706a(C0768a.m3716c(this.f54522j, 0), this.f54525m), C0768a.m3706a(C0768a.m3716c(this.f54524l, 0), this.f54525m), C0768a.m3706a(this.f54524l, this.f54525m), C0768a.m3706a(this.f54523k, this.f54525m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f54526n = true;
    }

    /* renamed from: a */
    public void mo77588a(C22398l lVar) {
        this.f54527o = lVar;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f54515c.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f54515c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo77585a(float f) {
        if (this.f54513a != f) {
            this.f54513a = f;
            this.f54515c.setStrokeWidth(f * 1.3333f);
            this.f54526n = true;
            invalidateSelf();
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.f54527o.mo78004a(mo77584a())) {
            return true;
        }
        int round = Math.round(this.f54513a);
        rect.set(round, round, round, round);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f54528p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f54525m)) == this.f54525m)) {
            this.f54526n = true;
            this.f54525m = colorForState;
        }
        if (this.f54526n) {
            invalidateSelf();
        }
        return this.f54526n;
    }

    C22287c(C22398l lVar) {
        this.f54527o = lVar;
        Paint paint = new Paint(1);
        this.f54515c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77587a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f54525m = colorStateList.getColorForState(getState(), this.f54525m);
        }
        this.f54528p = colorStateList;
        this.f54526n = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (this.f54526n) {
            this.f54515c.setShader(m80673b());
            this.f54526n = false;
        }
        float strokeWidth = this.f54515c.getStrokeWidth() / 2.0f;
        copyBounds(this.f54517e);
        this.f54518f.set(this.f54517e);
        float min = Math.min(this.f54527o.mo78009f().mo77991a(mo77584a()), this.f54518f.width() / 2.0f);
        if (this.f54527o.mo78004a(mo77584a())) {
            this.f54518f.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f54518f, min, min, this.f54515c);
        }
    }

    public void getOutline(Outline outline) {
        if (this.f54527o.mo78004a(mo77584a())) {
            outline.setRoundRect(getBounds(), this.f54527o.mo78009f().mo77991a(mo77584a()));
            return;
        }
        copyBounds(this.f54517e);
        this.f54518f.set(this.f54517e);
        this.f54514b.mo78040a(this.f54527o, 1.0f, this.f54518f, this.f54516d);
        if (this.f54516d.isConvex()) {
            outline.setConvexPath(this.f54516d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77586a(int i, int i2, int i3, int i4) {
        this.f54521i = i;
        this.f54522j = i2;
        this.f54523k = i3;
        this.f54524l = i4;
    }
}
