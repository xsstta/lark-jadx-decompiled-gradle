package com.ss.android.lark.guide.landing.general.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

public class ColorAnimationView extends View implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private float f99323a;

    /* renamed from: b */
    private int f99324b;

    /* renamed from: c */
    private int f99325c;

    /* renamed from: d */
    private int f99326d;

    /* renamed from: e */
    private List<Drawable> f99327e;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    /* renamed from: a */
    private void m152502a() {
        this.f99326d = 0;
        this.f99327e = new ArrayList();
    }

    public ColorAnimationView(Context context) {
        super(context);
        m152502a();
    }

    public void setLayerDrawable(int[] iArr) {
        for (int i : iArr) {
            this.f99327e.add(getContext().getResources().getDrawable(i));
        }
    }

    public void onDraw(Canvas canvas) {
        int min = (int) ((Math.min(this.f99323a, 1.0f) * 255.0f) + BitmapDescriptorFactory.HUE_RED);
        this.f99326d = min;
        if (this.f99324b < this.f99327e.size()) {
            Drawable drawable = this.f99327e.get(this.f99324b);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.setAlpha(255 - min);
            drawable.draw(canvas);
            drawable.setAlpha(255);
            if (min > 0 && this.f99325c < this.f99327e.size()) {
                Drawable drawable2 = this.f99327e.get(this.f99325c);
                drawable2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable2.setAlpha(min);
                drawable2.draw(canvas);
                drawable2.setAlpha(255);
            }
        }
    }

    public ColorAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m152502a();
    }

    public ColorAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m152502a();
    }
}
