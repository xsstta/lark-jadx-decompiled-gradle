package com.scwang.smartrefresh.layout.header.bezierradar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

/* renamed from: com.scwang.smartrefresh.layout.header.bezierradar.c */
public class C27159c extends View {

    /* renamed from: a */
    public int f67553a;

    /* renamed from: b */
    private Paint f67554b;

    /* renamed from: c */
    private Paint f67555c;

    /* renamed from: d */
    private ValueAnimator f67556d;

    /* renamed from: e */
    private int f67557e = 270;

    /* renamed from: f */
    private int f67558f;

    /* renamed from: g */
    private int f67559g;

    /* renamed from: h */
    private RectF f67560h = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a */
    public void mo96558a() {
        ValueAnimator valueAnimator = this.f67556d;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* renamed from: b */
    public void mo96559b() {
        ValueAnimator valueAnimator = this.f67556d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f67556d.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f67556d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.header.bezierradar.C27159c.C271601 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C27159c.this.f67553a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C27159c.this.postInvalidate();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f67556d.removeAllUpdateListeners();
    }

    /* renamed from: c */
    private void m98750c() {
        this.f67554b = new Paint();
        this.f67555c = new Paint();
        this.f67554b.setAntiAlias(true);
        this.f67555c.setAntiAlias(true);
        this.f67554b.setColor(-1);
        this.f67555c.setColor(1426063360);
        C27144b bVar = new C27144b();
        this.f67558f = bVar.mo96505c(20.0f);
        this.f67559g = bVar.mo96505c(7.0f);
        this.f67554b.setStrokeWidth((float) bVar.mo96505c(3.0f));
        this.f67555c.setStrokeWidth((float) bVar.mo96505c(3.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        this.f67556d = ofInt;
        ofInt.setDuration(720L);
        this.f67556d.setRepeatCount(-1);
        this.f67556d.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public void setFrontColor(int i) {
        this.f67554b.setColor(i);
    }

    public void setBackColor(int i) {
        this.f67555c.setColor((i & 16777215) | 1426063360);
    }

    public C27159c(Context context) {
        super(context);
        m98750c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (isInEditMode()) {
            this.f67557e = 0;
            this.f67553a = 270;
        }
        this.f67554b.setStyle(Paint.Style.FILL);
        int i = width / 2;
        float f = (float) i;
        int i2 = height / 2;
        float f2 = (float) i2;
        canvas.drawCircle(f, f2, (float) this.f67558f, this.f67554b);
        this.f67554b.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(f, f2, (float) (this.f67558f + this.f67559g), this.f67554b);
        this.f67555c.setStyle(Paint.Style.FILL);
        RectF rectF = this.f67560h;
        int i3 = this.f67558f;
        rectF.set((float) (i - i3), (float) (i2 - i3), (float) (i + i3), (float) (i3 + i2));
        canvas.drawArc(this.f67560h, (float) this.f67557e, (float) this.f67553a, true, this.f67555c);
        this.f67558f += this.f67559g;
        this.f67555c.setStyle(Paint.Style.STROKE);
        RectF rectF2 = this.f67560h;
        int i4 = this.f67558f;
        rectF2.set((float) (i - i4), (float) (i2 - i4), (float) (i + i4), (float) (i2 + i4));
        canvas.drawArc(this.f67560h, (float) this.f67557e, (float) this.f67553a, false, this.f67555c);
        this.f67558f -= this.f67559g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(getSuggestedMinimumHeight(), i2));
    }
}
