package com.ss.android.lark.inv.export.util;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.inv.export.util.a */
public class C40099a {
    /* renamed from: a */
    public static ValueAnimator m158956a(final View view, final Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 359.0f).setDuration(1000L);
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.inv.export.util.C40099a.C401001 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        duration.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.inv.export.util.C40099a.C401012 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
                runnable.run();
            }
        });
        return duration;
    }
}
