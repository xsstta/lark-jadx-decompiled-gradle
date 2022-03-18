package com.bytedance.ee.bear.debug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class LoadingView extends View {

    /* renamed from: a */
    public float f15005a;

    /* renamed from: b */
    ValueAnimator f15006b;

    /* renamed from: c */
    private float f15007c;

    /* renamed from: d */
    private float f15008d;

    /* renamed from: e */
    private Paint f15009e;

    /* renamed from: a */
    public void mo21156a() {
        mo21157b();
        m21454a(BitmapDescriptorFactory.HUE_RED, 1.0f, 1000);
    }

    /* renamed from: c */
    private void m21455c() {
        Paint paint = new Paint();
        this.f15009e = paint;
        paint.setAntiAlias(true);
        this.f15009e.setStyle(Paint.Style.STROKE);
        this.f15009e.setColor(-1);
        this.f15009e.setStrokeWidth(8.0f);
    }

    /* renamed from: b */
    public void mo21157b() {
        if (this.f15006b != null) {
            clearAnimation();
            this.f15006b.setRepeatCount(1);
            this.f15006b.cancel();
            this.f15006b.end();
        }
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f15009e.setColor(Color.argb(100, 255, 255, 255));
        float f = this.f15007c;
        canvas.drawCircle(f / 2.0f, f / 2.0f, (f / 2.0f) - this.f15008d, this.f15009e);
        this.f15009e.setColor(-1);
        float f2 = this.f15008d;
        float f3 = this.f15007c;
        canvas.drawArc(new RectF(f2, f2, f3 - f2, f3 - f2), this.f15005a, 100.0f, false, this.f15009e);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > getHeight()) {
            this.f15007c = (float) getMeasuredHeight();
        } else {
            this.f15007c = (float) getMeasuredWidth();
        }
        this.f15008d = 5.0f;
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21455c();
    }

    /* renamed from: a */
    private ValueAnimator m21454a(float f, float f2, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.f15006b = ofFloat;
        ofFloat.setDuration(j);
        this.f15006b.setInterpolator(new LinearInterpolator());
        this.f15006b.setRepeatCount(-1);
        this.f15006b.setRepeatMode(1);
        this.f15006b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.debug.LoadingView.C52481 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoadingView.this.f15005a = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
                LoadingView.this.invalidate();
            }
        });
        this.f15006b.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.debug.LoadingView.C52492 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        if (!this.f15006b.isRunning()) {
            this.f15006b.start();
        }
        return this.f15006b;
    }
}
