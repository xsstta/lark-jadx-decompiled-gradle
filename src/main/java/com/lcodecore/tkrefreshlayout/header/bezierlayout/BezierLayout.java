package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26394b;
import com.lcodecore.tkrefreshlayout.AbstractC26398c;
import com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView;

public class BezierLayout extends FrameLayout implements AbstractC26394b {

    /* renamed from: a */
    View f65164a;

    /* renamed from: b */
    WaveView f65165b;

    /* renamed from: c */
    RippleView f65166c;

    /* renamed from: d */
    RoundDotView f65167d;

    /* renamed from: e */
    RoundProgressView f65168e;

    /* renamed from: f */
    private ValueAnimator f65169f;

    /* renamed from: g */
    private ValueAnimator f65170g;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f65169f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f65170g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93668a() {
        ValueAnimator valueAnimator = this.f65169f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f65169f.cancel();
        }
        this.f65165b.setWaveHeight(0);
        ValueAnimator valueAnimator2 = this.f65170g;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f65170g.cancel();
        }
        this.f65167d.setVisibility(0);
        this.f65168e.mo93714b();
        this.f65168e.setScaleX(BitmapDescriptorFactory.HUE_RED);
        this.f65168e.setScaleY(BitmapDescriptorFactory.HUE_RED);
        this.f65168e.setVisibility(8);
        this.f65166c.mo93702b();
        this.f65166c.setVisibility(8);
    }

    public BezierLayout(Context context) {
        this(context, null);
    }

    public void setRippleColor(int i) {
        this.f65166c.setRippleColor(i);
    }

    public void setWaveColor(int i) {
        this.f65165b.setWaveColor(i);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93671a(final AbstractC26398c cVar) {
        this.f65168e.mo93714b();
        this.f65168e.animate().scaleX(BitmapDescriptorFactory.HUE_RED);
        this.f65168e.animate().scaleY(BitmapDescriptorFactory.HUE_RED);
        this.f65166c.setRippleEndListener(new RippleView.AbstractC26412a() {
            /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.BezierLayout.C264094 */

            @Override // com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView.AbstractC26412a
            /* renamed from: a */
            public void mo93700a() {
                cVar.mo93557a();
            }
        });
        this.f65166c.mo93701a();
    }

    /* renamed from: a */
    private void m95656a(AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_bezier, (ViewGroup) null);
        this.f65164a = inflate;
        this.f65165b = (WaveView) inflate.findViewById(R.id.draweeView);
        this.f65166c = (RippleView) this.f65164a.findViewById(R.id.ripple);
        this.f65167d = (RoundDotView) this.f65164a.findViewById(R.id.round1);
        RoundProgressView roundProgressView = (RoundProgressView) this.f65164a.findViewById(R.id.round2);
        this.f65168e = roundProgressView;
        roundProgressView.setVisibility(8);
        addView(this.f65164a);
    }

    public BezierLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public float mo93692b(float f, float f2) {
        float min = Math.min(f, f2);
        float max = Math.max(f, f2);
        if (BitmapDescriptorFactory.HUE_RED > min) {
            min = BitmapDescriptorFactory.HUE_RED;
        }
        return min < max ? min : max;
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93669a(float f, float f2) {
        this.f65165b.setHeadHeight((int) f2);
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f65165b.getWaveHeight(), 0, -300, 0, -100, 0);
        this.f65169f = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.BezierLayout.C264051 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BezierLayout.this.f65165b.setWaveHeight(((Integer) valueAnimator.getAnimatedValue()).intValue() / 2);
                BezierLayout.this.f65165b.invalidate();
            }
        });
        this.f65169f.setInterpolator(new DecelerateInterpolator());
        this.f65169f.setDuration(800L);
        this.f65169f.start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f65170g = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.BezierLayout.C264062 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                BezierLayout.this.f65167d.setVisibility(8);
                BezierLayout.this.f65168e.setVisibility(0);
                BezierLayout.this.f65168e.animate().scaleX(1.0f);
                BezierLayout.this.f65168e.animate().scaleY(1.0f);
                BezierLayout.this.f65168e.postDelayed(new Runnable() {
                    /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.BezierLayout.C264062.RunnableC264071 */

                    public void run() {
                        BezierLayout.this.f65168e.mo93713a();
                    }
                }, 200);
            }
        });
        this.f65170g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lcodecore.tkrefreshlayout.header.bezierlayout.BezierLayout.C264083 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BezierLayout.this.f65167d.setCir_x((int) ((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * 40.0f));
                BezierLayout.this.f65167d.invalidate();
            }
        });
        this.f65170g.setInterpolator(new DecelerateInterpolator());
        this.f65170g.setDuration(300L);
        this.f65170g.start();
    }

    public BezierLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95656a(attributeSet);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: b */
    public void mo93672b(float f, float f2, float f3) {
        this.f65165b.setHeadHeight((int) (f3 * mo93692b(1.0f, f)));
        this.f65165b.setWaveHeight((int) (f2 * Math.max((float) BitmapDescriptorFactory.HUE_RED, f - 1.0f)));
        this.f65165b.invalidate();
        this.f65167d.setCir_x((int) (mo93692b(1.0f, f) * 30.0f));
        this.f65167d.invalidate();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93670a(float f, float f2, float f3) {
        if (this.f65166c.getVisibility() == 0) {
            this.f65166c.setVisibility(8);
        }
        this.f65165b.setHeadHeight((int) (f3 * mo93692b(1.0f, f)));
        this.f65165b.setWaveHeight((int) (f2 * Math.max((float) BitmapDescriptorFactory.HUE_RED, f - 1.0f)));
        this.f65165b.invalidate();
        this.f65167d.setCir_x((int) (mo93692b(1.0f, f) * 30.0f));
        this.f65167d.setVisibility(0);
        this.f65167d.invalidate();
        this.f65168e.setVisibility(8);
        this.f65168e.animate().scaleX(0.1f);
        this.f65168e.animate().scaleY(0.1f);
    }
}
