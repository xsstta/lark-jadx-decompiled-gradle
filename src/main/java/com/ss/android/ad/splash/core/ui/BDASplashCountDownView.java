package com.ss.android.ad.splash.core.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

public class BDASplashCountDownView extends TextView {

    /* renamed from: a */
    public long f68338a = 0;

    /* renamed from: b */
    public double f68339b = 1.0d;

    /* renamed from: c */
    private final int f68340c = Color.parseColor("#979797");

    /* renamed from: d */
    private Paint f68341d;

    /* renamed from: e */
    private int f68342e;

    /* renamed from: f */
    private int f68343f = -1;

    /* renamed from: g */
    private RectF f68344g;

    /* renamed from: h */
    private final float f68345h = 1.0f;

    /* renamed from: i */
    private ValueAnimator f68346i;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.f68346i;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f68346i;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f68346i = null;
        }
    }

    /* renamed from: b */
    private void m99807b() {
        int i = this.f68342e;
        this.f68344g = new RectF((float) (i / 2), (float) (i / 2), (float) (getMeasuredWidth() - (this.f68342e / 2)), (float) (getMeasuredHeight() - (this.f68342e / 2)));
    }

    /* renamed from: c */
    private void m99808c() {
        long j = this.f68338a;
        if (j != 0) {
            ValueAnimator duration = ValueAnimator.ofFloat((float) j, 0.0f).setDuration(this.f68338a);
            this.f68346i = duration;
            duration.setInterpolator(new LinearInterpolator());
            this.f68346i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ad.splash.core.ui.BDASplashCountDownView.C273701 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BDASplashCountDownView bDASplashCountDownView = BDASplashCountDownView.this;
                    bDASplashCountDownView.f68339b = ((double) floatValue) / ((double) bDASplashCountDownView.f68338a);
                    BDASplashCountDownView.this.invalidate();
                }
            });
        }
    }

    /* renamed from: a */
    private void m99806a() {
        if (this.f68342e == 0) {
            this.f68342e = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        }
        Paint paint = new Paint();
        this.f68341d = paint;
        paint.setColor(this.f68343f);
        this.f68341d.setStyle(Paint.Style.STROKE);
        this.f68341d.setStrokeWidth((float) this.f68342e);
        this.f68341d.setAntiAlias(true);
        this.f68341d.setDither(true);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f68340c);
        gradientDrawable.setShape(1);
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(gradientDrawable);
        } else {
            setBackgroundDrawable(gradientDrawable);
        }
    }

    public void setBorderColor(int i) {
        this.f68343f = i;
        this.f68341d.setColor(i);
    }

    public void setBorderSize(int i) {
        int max = Math.max(i, 0);
        this.f68342e = max;
        this.f68341d.setStrokeWidth((float) max);
    }

    public void setDuration(long j) {
        this.f68338a = Math.max(0L, j);
        m99808c();
    }

    public BDASplashCountDownView(Context context) {
        super(context);
        m99806a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f68344g;
        if (rectF != null) {
            canvas.drawArc(rectF, -90.0f, (float) (this.f68339b * 360.0d), false, this.f68341d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            m99807b();
        }
    }

    public BDASplashCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99806a();
    }

    public BDASplashCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99806a();
    }
}
