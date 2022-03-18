package com.bytedance.ee.util.p718t;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

/* renamed from: com.bytedance.ee.util.t.b */
public class C13727b {

    /* renamed from: com.bytedance.ee.util.t.b$a */
    public static class C13735a implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m55680a(View view, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m55684b(View view, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static ValueAnimator m55678a(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) {
            /* class com.bytedance.ee.util.p718t.$$Lambda$b$ihFdgj9RzVV2YAkAk9TPLL6kdno */
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C13727b.m55684b(this.f$0, valueAnimator);
            }
        });
        return ofInt;
    }

    /* renamed from: b */
    public static ValueAnimator m55682b(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) {
            /* class com.bytedance.ee.util.p718t.$$Lambda$b$lIv0rX7Q6kGekoSokqroGxKFYb0 */
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C13727b.m55680a(this.f$0, valueAnimator);
            }
        });
        return ofInt;
    }

    /* renamed from: a */
    public static ValueAnimator m55677a(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137281 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: b */
    public static ValueAnimator m55681b(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137292 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: c */
    public static ValueAnimator m55685c(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137303 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.rightMargin = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: d */
    public static ValueAnimator m55686d(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137314 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: e */
    public static ValueAnimator m55687e(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137325 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    /* renamed from: a */
    public static ValueAnimator m55679a(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137336 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration((long) i3);
        ofInt.setInterpolator(new LinearInterpolator());
        return ofInt;
    }

    /* renamed from: b */
    public static ValueAnimator m55683b(final View view, int i, int i2, int i3) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.util.p718t.C13727b.C137347 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) ofInt.getAnimatedValue()).intValue();
                layoutParams.width = ((Integer) ofInt.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration((long) i3);
        return ofInt;
    }
}
