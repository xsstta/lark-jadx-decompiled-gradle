package com.ss.android.lark.money.redpacket.p2368a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.lark.money.redpacket.a.c */
public class C48036c extends Transition {

    /* renamed from: a */
    private float f120929a;

    /* renamed from: b */
    private float f120930b;

    public void captureEndValues(TransitionValues transitionValues) {
        transitionValues.values.put("scaleX", Float.valueOf(this.f120930b));
    }

    public void captureStartValues(TransitionValues transitionValues) {
        transitionValues.values.put("scaleX", Float.valueOf(this.f120929a));
    }

    public C48036c(float f, float f2) {
        this.f120929a = f;
        this.f120930b = f2;
    }

    /* renamed from: a */
    private Animator m189580a(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, View.SCALE_X, f, f2);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        try {
            return m189580a(transitionValues2.view, this.f120929a, this.f120930b);
        } catch (Exception unused) {
            return null;
        }
    }
}
