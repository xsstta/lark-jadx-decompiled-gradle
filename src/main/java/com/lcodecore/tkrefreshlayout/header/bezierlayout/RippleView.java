package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RippleView extends View {

    /* renamed from: a */
    public int f65177a;

    /* renamed from: b */
    public AbstractC26412a f65178b;

    /* renamed from: c */
    ValueAnimator f65179c;

    /* renamed from: d */
    private Paint f65180d;

    /* renamed from: com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView$a */
    public interface AbstractC26412a {
        /* renamed from: a */
        void mo93700a();
    }

    public int getR() {
        return this.f65177a;
    }

    /* renamed from: b */
    public void mo93702b() {
        ValueAnimator valueAnimator = this.f65179c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f65179c.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f65179c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    private void m95664c() {
        Paint paint = new Paint();
        this.f65180d = paint;
        paint.setAntiAlias(true);
        this.f65180d.setColor(-1);
        this.f65180d.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public void mo93701a() {
        setVisibility(0);
        if (this.f65179c == null) {
            int sqrt = (int) Math.sqrt(Math.pow((double) getHeight(), 2.0d) + Math.pow((double) getWidth(), 2.0d));
            ValueAnimator ofInt = ValueAnimator.ofInt(0, sqrt / 2);
            this.f65179c = ofInt;
            ofInt.setDuration((long) sqrt);
            this.f65179c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView.C264101 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RippleView.this.f65177a = ((Integer) valueAnimator.getAnimatedValue()).intValue() * 2;
                    RippleView.this.invalidate();
                }
            });
            this.f65179c.addListener(new AnimatorListenerAdapter() {
                /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView.C264112 */

                public void onAnimationEnd(Animator animator) {
                    if (RippleView.this.f65178b != null) {
                        RippleView.this.f65178b.mo93700a();
                    }
                }
            });
        }
        this.f65179c.start();
    }

    public void setR(int i) {
        this.f65177a = i;
    }

    public void setRippleEndListener(AbstractC26412a aVar) {
        this.f65178b = aVar;
    }

    public RippleView(Context context) {
        this(context, null, 0);
    }

    public void setRippleColor(int i) {
        Paint paint = this.f65180d;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f65177a, this.f65180d);
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95664c();
    }
}
