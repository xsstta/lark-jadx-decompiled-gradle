package com.ss.android.lark.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class LoadingView extends AppCompatImageView {

    /* renamed from: a */
    final AnimatorSet f141898a = new AnimatorSet();

    /* renamed from: b */
    public boolean f141899b;

    /* renamed from: c */
    public int f141900c;

    /* renamed from: d */
    public int f141901d;

    /* renamed from: e */
    public int f141902e;

    /* renamed from: f */
    private Drawable f141903f;

    /* renamed from: g */
    private Drawable f141904g;

    /* renamed from: h */
    private Drawable f141905h;

    /* renamed from: i */
    private int f141906i;

    /* renamed from: j */
    private int f141907j;

    /* renamed from: k */
    private int f141908k;

    /* renamed from: l */
    private int f141909l;

    /* renamed from: m */
    private int f141910m;

    /* renamed from: n */
    private int f141911n;

    /* renamed from: o */
    private int f141912o;

    /* renamed from: p */
    private float f141913p;

    /* renamed from: q */
    private float f141914q;

    /* renamed from: b */
    private void m223587b() {
        m223588c();
        m223589d();
    }

    /* renamed from: c */
    private void m223588c() {
        setBackgroundResource(R.drawable.loading_component_bg);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo195543a();
    }

    /* renamed from: a */
    public void mo195543a() {
        this.f141899b = false;
        this.f141898a.cancel();
    }

    /* renamed from: d */
    private void m223589d() {
        this.f141903f = getContext().getResources().getDrawable(R.drawable.loading_component_one);
        this.f141904g = getContext().getResources().getDrawable(R.drawable.loading_component_two);
        this.f141905h = getContext().getResources().getDrawable(R.drawable.loading_component_three);
    }

    /* renamed from: e */
    private void m223590e() {
        C575761 r1 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.ui.LoadingView.C575761 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoadingView.this.f141900c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LoadingView.this.postInvalidate();
            }
        };
        C575772 r2 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.ui.LoadingView.C575772 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoadingView.this.f141901d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LoadingView.this.postInvalidate();
            }
        };
        C575783 r3 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.ui.LoadingView.C575783 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoadingView.this.f141902e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LoadingView.this.postInvalidate();
            }
        };
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f141906i, this.f141907j);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(r1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.f141907j, this.f141908k);
        ofInt2.setInterpolator(new DecelerateInterpolator());
        ofInt2.setDuration(50L);
        ofInt2.addUpdateListener(r1);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(this.f141906i, this.f141907j);
        ofInt3.setInterpolator(new DecelerateInterpolator());
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(r2);
        ValueAnimator ofInt4 = ValueAnimator.ofInt(this.f141907j, this.f141908k);
        ofInt4.setInterpolator(new DecelerateInterpolator());
        ofInt4.setDuration(50L);
        ofInt4.addUpdateListener(r2);
        ValueAnimator ofInt5 = ValueAnimator.ofInt(this.f141906i, this.f141907j);
        ofInt5.setInterpolator(new DecelerateInterpolator());
        ofInt5.setDuration(300L);
        ofInt5.addUpdateListener(r3);
        ValueAnimator ofInt6 = ValueAnimator.ofInt(this.f141907j, this.f141908k);
        ofInt6.setInterpolator(new DecelerateInterpolator());
        ofInt6.setDuration(50L);
        ofInt6.addUpdateListener(r3);
        ValueAnimator ofInt7 = ValueAnimator.ofInt(this.f141908k, this.f141909l);
        ofInt7.setInterpolator(new DecelerateInterpolator());
        ofInt7.setDuration(250L);
        ofInt7.addUpdateListener(r1);
        ValueAnimator ofInt8 = ValueAnimator.ofInt(this.f141908k, this.f141909l);
        ofInt8.setInterpolator(new DecelerateInterpolator());
        ofInt8.setDuration(250L);
        ofInt8.addUpdateListener(r2);
        ValueAnimator ofInt9 = ValueAnimator.ofInt(this.f141908k, this.f141909l);
        ofInt9.setInterpolator(new DecelerateInterpolator());
        ofInt9.setDuration(250L);
        ofInt9.addUpdateListener(r3);
        this.f141898a.play(ofInt).before(ofInt2);
        this.f141898a.play(ofInt2).with(ofInt3);
        this.f141898a.play(ofInt4).after(ofInt3);
        this.f141898a.play(ofInt5).with(ofInt4);
        this.f141898a.play(ofInt6).after(ofInt5);
        this.f141898a.play(ofInt7).after(ofInt6);
        this.f141898a.play(ofInt8).after(ofInt7);
        this.f141898a.play(ofInt9).after(ofInt8);
        this.f141898a.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.ui.LoadingView.C575794 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (LoadingView.this.f141899b) {
                    LoadingView.this.f141898a.start();
                }
            }
        });
        if (this.f141899b && !this.f141898a.isRunning() && !this.f141898a.isStarted()) {
            int i = this.f141906i;
            this.f141900c = i;
            this.f141901d = i;
            this.f141902e = i;
            this.f141898a.start();
        }
    }

    public LoadingView(Context context) {
        super(context);
        m223587b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveCount = canvas.getSaveCount();
        m223586a(canvas, saveCount, this.f141900c, this.f141910m, this.f141903f);
        m223586a(canvas, saveCount, this.f141901d, this.f141911n, this.f141904g);
        m223586a(canvas, saveCount, this.f141902e, this.f141912o, this.f141905h);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223587b();
    }

    /* renamed from: a */
    private void m223585a(int i, int i2) {
        float f = (float) i;
        this.f141913p = f / 450.0f;
        float f2 = (float) i2;
        this.f141914q = f2 / 360.0f;
        int i3 = (int) (0.1511f * f);
        this.f141906i = i3;
        int i4 = (int) (0.504f * f);
        this.f141908k = i4;
        this.f141907j = (int) (((float) i4) + 6.0f);
        this.f141909l = (int) (f * 0.855f);
        this.f141900c = i3;
        this.f141901d = i3;
        this.f141902e = i3;
        int i5 = (int) (0.3f * f2);
        this.f141910m = i5;
        float f3 = f2 * 0.025f;
        int intrinsicHeight = i5 + ((int) ((((float) this.f141903f.getIntrinsicHeight()) + f3) * this.f141914q));
        this.f141911n = intrinsicHeight;
        this.f141912o = intrinsicHeight + ((int) ((f3 + ((float) this.f141903f.getIntrinsicHeight())) * this.f141914q));
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223587b();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != i || i4 != i2) {
            m223585a(i, i2);
            m223590e();
        }
    }

    /* renamed from: a */
    private void m223586a(Canvas canvas, int i, int i2, int i3, Drawable drawable) {
        if (this.f141906i < i2 && i2 < this.f141909l) {
            canvas.save();
            int intrinsicWidth = (int) (((float) drawable.getIntrinsicWidth()) * this.f141913p);
            int intrinsicHeight = (int) (((float) drawable.getIntrinsicHeight()) * this.f141914q);
            canvas.translate((float) this.f141906i, (float) i3);
            canvas.clipRect(intrinsicWidth, 0, this.f141909l - this.f141906i, intrinsicHeight);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            canvas.translate((float) (i2 - this.f141906i), BitmapDescriptorFactory.HUE_RED);
            drawable.draw(canvas);
            canvas.restoreToCount(i);
        }
    }
}
