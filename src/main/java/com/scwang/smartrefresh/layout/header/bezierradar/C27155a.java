package com.scwang.smartrefresh.layout.header.bezierradar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.scwang.smartrefresh.layout.header.bezierradar.a */
public class C27155a extends View {

    /* renamed from: a */
    public int f67544a;

    /* renamed from: b */
    private Paint f67545b;

    /* renamed from: c */
    private ValueAnimator f67546c;

    /* renamed from: a */
    public void mo96548a() {
        if (this.f67546c == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) Math.sqrt(Math.pow((double) getHeight(), 2.0d) + Math.pow((double) getWidth(), 2.0d)));
            this.f67546c = ofInt;
            ofInt.setDuration(400L);
            this.f67546c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.scwang.smartrefresh.layout.header.bezierradar.C27155a.C271561 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C27155a.this.f67544a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    C27155a.this.invalidate();
                }
            });
            this.f67546c.addListener(new AnimatorListenerAdapter() {
                /* class com.scwang.smartrefresh.layout.header.bezierradar.C27155a.C271572 */

                public void onAnimationEnd(Animator animator) {
                }
            });
        }
        this.f67546c.start();
    }

    public void setFrontColor(int i) {
        this.f67545b.setColor(i);
    }

    public C27155a(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f67545b = paint;
        paint.setAntiAlias(true);
        this.f67545b.setColor(-1);
        this.f67545b.setStyle(Paint.Style.FILL);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f67544a, this.f67545b);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(getSuggestedMinimumHeight(), i2));
    }
}
