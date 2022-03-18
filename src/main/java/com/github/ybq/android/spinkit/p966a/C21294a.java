package com.github.ybq.android.spinkit.p966a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;

/* renamed from: com.github.ybq.android.spinkit.a.a */
public class C21294a {
    /* renamed from: a */
    public static void m77132a(Animator animator) {
        if (animator != null && !animator.isStarted()) {
            animator.start();
        }
    }

    /* renamed from: b */
    public static void m77135b(AbstractC21312f... fVarArr) {
        for (AbstractC21312f fVar : fVarArr) {
            fVar.stop();
        }
    }

    /* renamed from: a */
    public static void m77133a(AbstractC21312f... fVarArr) {
        for (AbstractC21312f fVar : fVarArr) {
            fVar.start();
        }
    }

    /* renamed from: b */
    public static boolean m77136b(ValueAnimator valueAnimator) {
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m77137c(AbstractC21312f... fVarArr) {
        for (AbstractC21312f fVar : fVarArr) {
            if (fVar.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m77134a(ValueAnimator valueAnimator) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }
}
