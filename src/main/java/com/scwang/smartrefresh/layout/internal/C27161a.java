package com.scwang.smartrefresh.layout.internal;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: com.scwang.smartrefresh.layout.internal.a */
public class C27161a extends Drawable implements Animatable {

    /* renamed from: a */
    public int f67562a;

    /* renamed from: b */
    private ValueAnimator f67563b;

    /* renamed from: c */
    private Path f67564c = new Path();

    /* renamed from: d */
    private Paint f67565d;

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f67563b.isRunning();
    }

    public void start() {
        if (!this.f67563b.isRunning()) {
            this.f67563b.start();
        }
    }

    public void stop() {
        if (this.f67563b.isRunning()) {
            this.f67563b.cancel();
        }
    }

    public C27161a() {
        Paint paint = new Paint();
        this.f67565d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f67565d.setAntiAlias(true);
        this.f67565d.setColor(-5592406);
        m98753a();
    }

    /* renamed from: a */
    private void m98753a() {
        ValueAnimator ofInt = ValueAnimator.ofInt(30, 3600);
        this.f67563b = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.internal.C27161a.C271621 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C27161a.this.f67562a = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
                C27161a.this.invalidateSelf();
            }
        });
        this.f67563b.setDuration(10000L);
        this.f67563b.setInterpolator(new LinearInterpolator());
        this.f67563b.setRepeatCount(-1);
        this.f67563b.setRepeatMode(1);
    }

    /* renamed from: a */
    public void mo96567a(int i) {
        this.f67565d.setColor(i);
    }

    public void setAlpha(int i) {
        this.f67565d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f67565d.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        float f = (float) (width / 2);
        int i = height / 2;
        float f2 = (float) i;
        canvas.rotate((float) this.f67562a, f, f2);
        int max = Math.max(1, width / 20);
        for (int i2 = 0; i2 < 12; i2++) {
            this.f67564c.reset();
            float f3 = (float) (width - max);
            float f4 = (float) max;
            this.f67564c.addCircle(f3, f2, f4, Path.Direction.CW);
            float f5 = (float) (width - (max * 5));
            this.f67564c.addRect(f5, (float) (i - max), f3, (float) (i + max), Path.Direction.CW);
            this.f67564c.addCircle(f5, f2, f4, Path.Direction.CW);
            this.f67565d.setAlpha((i2 + 5) * 17);
            canvas.rotate(30.0f, f, f2);
            canvas.drawPath(this.f67564c, this.f67565d);
        }
        canvas.restore();
    }
}
