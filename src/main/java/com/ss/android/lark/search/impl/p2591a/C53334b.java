package com.ss.android.lark.search.impl.p2591a;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.search.impl.a.b */
public class C53334b {
    /* renamed from: a */
    public static ValueAnimator m206437a(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.search.impl.p2591a.C53334b.C533351 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: b */
    public static ValueAnimator m206438b(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.search.impl.p2591a.C53334b.C533362 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: c */
    public static ValueAnimator m206439c(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.search.impl.p2591a.C53334b.C533373 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPivotX(BitmapDescriptorFactory.HUE_RED);
                view.setPivotY(BitmapDescriptorFactory.HUE_RED);
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (Float.isNaN(floatValue) || Float.isInfinite(floatValue)) {
                    Log.m165383e("SearchAnimationUtils", "onAnimationUpdate failed: value is " + floatValue);
                    return;
                }
                view.setScaleX(floatValue);
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    /* renamed from: d */
    public static ValueAnimator m206440d(final View view, float f, float f2, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.search.impl.p2591a.C53334b.C533384 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.rightMargin = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofFloat.setDuration((long) i);
        return ofFloat;
    }
}
