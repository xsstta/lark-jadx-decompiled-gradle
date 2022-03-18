package com.bytedance.ee.bear.basesdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class LarkLoadingView extends AppCompatImageView {

    /* renamed from: a */
    public boolean f12960a;

    /* renamed from: b */
    public int f12961b;

    /* renamed from: c */
    public int f12962c;

    /* renamed from: d */
    public int f12963d;

    /* renamed from: e */
    final AnimatorSet f12964e = new AnimatorSet();

    /* renamed from: f */
    private Drawable f12965f;

    /* renamed from: g */
    private Drawable f12966g;

    /* renamed from: h */
    private Drawable f12967h;

    /* renamed from: i */
    private int f12968i;

    /* renamed from: j */
    private int f12969j;

    /* renamed from: k */
    private int f12970k;

    /* renamed from: l */
    private int f12971l;

    /* renamed from: m */
    private int f12972m;

    /* renamed from: n */
    private int f12973n;

    /* renamed from: o */
    private int f12974o;

    /* renamed from: p */
    private float f12975p;

    /* renamed from: q */
    private float f12976q;

    /* renamed from: c */
    private void m17927c() {
        m17928d();
        m17929e();
    }

    /* renamed from: d */
    private void m17928d() {
        setBackgroundResource(R.drawable.loading_component_bg);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo16963b();
    }

    /* renamed from: b */
    public void mo16963b() {
        this.f12960a = false;
        this.f12964e.cancel();
    }

    /* renamed from: e */
    private void m17929e() {
        this.f12965f = getContext().getResources().getDrawable(R.drawable.loading_component_one);
        this.f12966g = getContext().getResources().getDrawable(R.drawable.loading_component_two);
        this.f12967h = getContext().getResources().getDrawable(R.drawable.loading_component_three);
    }

    /* renamed from: a */
    public void mo16962a() {
        this.f12960a = true;
        if (!this.f12964e.isRunning() && !this.f12964e.isStarted()) {
            int i = this.f12968i;
            this.f12961b = i;
            this.f12962c = i;
            this.f12963d = i;
            this.f12964e.start();
        }
    }

    /* renamed from: f */
    private void m17930f() {
        C43401 r1 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.basesdk.LarkLoadingView.C43401 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LarkLoadingView.this.f12961b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LarkLoadingView.this.postInvalidate();
            }
        };
        C43412 r2 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.basesdk.LarkLoadingView.C43412 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LarkLoadingView.this.f12962c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LarkLoadingView.this.postInvalidate();
            }
        };
        C43423 r3 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.basesdk.LarkLoadingView.C43423 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LarkLoadingView.this.f12963d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LarkLoadingView.this.postInvalidate();
            }
        };
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f12968i, this.f12969j);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(r1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.f12969j, this.f12970k);
        ofInt2.setInterpolator(new DecelerateInterpolator());
        ofInt2.setDuration(50L);
        ofInt2.addUpdateListener(r1);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(this.f12968i, this.f12969j);
        ofInt3.setInterpolator(new DecelerateInterpolator());
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(r2);
        ValueAnimator ofInt4 = ValueAnimator.ofInt(this.f12969j, this.f12970k);
        ofInt4.setInterpolator(new DecelerateInterpolator());
        ofInt4.setDuration(50L);
        ofInt4.addUpdateListener(r2);
        ValueAnimator ofInt5 = ValueAnimator.ofInt(this.f12968i, this.f12969j);
        ofInt5.setInterpolator(new DecelerateInterpolator());
        ofInt5.setDuration(300L);
        ofInt5.addUpdateListener(r3);
        ValueAnimator ofInt6 = ValueAnimator.ofInt(this.f12969j, this.f12970k);
        ofInt6.setInterpolator(new DecelerateInterpolator());
        ofInt6.setDuration(50L);
        ofInt6.addUpdateListener(r3);
        ValueAnimator ofInt7 = ValueAnimator.ofInt(this.f12970k, this.f12971l);
        ofInt7.setInterpolator(new DecelerateInterpolator());
        ofInt7.setDuration(250L);
        ofInt7.addUpdateListener(r1);
        ValueAnimator ofInt8 = ValueAnimator.ofInt(this.f12970k, this.f12971l);
        ofInt8.setInterpolator(new DecelerateInterpolator());
        ofInt8.setDuration(250L);
        ofInt8.addUpdateListener(r2);
        ValueAnimator ofInt9 = ValueAnimator.ofInt(this.f12970k, this.f12971l);
        ofInt9.setInterpolator(new DecelerateInterpolator());
        ofInt9.setDuration(250L);
        ofInt9.addUpdateListener(r3);
        this.f12964e.play(ofInt).before(ofInt2);
        this.f12964e.play(ofInt2).with(ofInt3);
        this.f12964e.play(ofInt4).after(ofInt3);
        this.f12964e.play(ofInt5).with(ofInt4);
        this.f12964e.play(ofInt6).after(ofInt5);
        this.f12964e.play(ofInt7).after(ofInt6);
        this.f12964e.play(ofInt8).after(ofInt7);
        this.f12964e.play(ofInt9).after(ofInt8);
        this.f12964e.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.basesdk.LarkLoadingView.C43434 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (LarkLoadingView.this.f12960a) {
                    LarkLoadingView.this.f12964e.start();
                }
            }
        });
        if (this.f12960a && !this.f12964e.isRunning() && !this.f12964e.isStarted()) {
            int i = this.f12968i;
            this.f12961b = i;
            this.f12962c = i;
            this.f12963d = i;
            this.f12964e.start();
        }
    }

    public LarkLoadingView(Context context) {
        super(context);
        m17927c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveCount = canvas.getSaveCount();
        m17926a(canvas, saveCount, this.f12961b, this.f12972m, this.f12965f);
        m17926a(canvas, saveCount, this.f12962c, this.f12973n, this.f12966g);
        m17926a(canvas, saveCount, this.f12963d, this.f12974o, this.f12967h);
    }

    public LarkLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17927c();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            mo16962a();
        } else if ((i == 8 || i == 4) && this.f12964e.isRunning()) {
            mo16963b();
        }
    }

    /* renamed from: a */
    private void m17925a(int i, int i2) {
        float f = (float) i;
        this.f12975p = f / 450.0f;
        float f2 = (float) i2;
        this.f12976q = f2 / 360.0f;
        int i3 = (int) (0.1511f * f);
        this.f12968i = i3;
        int i4 = (int) (0.504f * f);
        this.f12970k = i4;
        this.f12969j = (int) (((float) i4) + 6.0f);
        this.f12971l = (int) (f * 0.855f);
        this.f12961b = i3;
        this.f12962c = i3;
        this.f12963d = i3;
        int i5 = (int) (0.3f * f2);
        this.f12972m = i5;
        float f3 = f2 * 0.025f;
        int intrinsicHeight = i5 + ((int) ((((float) this.f12965f.getIntrinsicHeight()) + f3) * this.f12976q));
        this.f12973n = intrinsicHeight;
        this.f12974o = intrinsicHeight + ((int) ((f3 + ((float) this.f12965f.getIntrinsicHeight())) * this.f12976q));
    }

    public LarkLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17927c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != i || i4 != i2) {
            m17925a(i, i2);
            m17930f();
        }
    }

    /* renamed from: a */
    private void m17926a(Canvas canvas, int i, int i2, int i3, Drawable drawable) {
        if (this.f12968i < i2 && i2 < this.f12971l) {
            canvas.save();
            int intrinsicWidth = (int) (((float) drawable.getIntrinsicWidth()) * this.f12975p);
            int intrinsicHeight = (int) (((float) drawable.getIntrinsicHeight()) * this.f12976q);
            canvas.translate((float) this.f12968i, (float) i3);
            canvas.clipRect(intrinsicWidth, 0, this.f12971l - this.f12968i, intrinsicHeight);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            canvas.translate((float) (i2 - this.f12968i), BitmapDescriptorFactory.HUE_RED);
            drawable.draw(canvas);
            canvas.restoreToCount(i);
        }
    }
}
