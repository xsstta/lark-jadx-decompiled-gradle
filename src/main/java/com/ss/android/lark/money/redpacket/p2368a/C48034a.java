package com.ss.android.lark.money.redpacket.p2368a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: com.ss.android.lark.money.redpacket.a.a */
public class C48034a extends Transition {
    public void captureEndValues(TransitionValues transitionValues) {
        transitionValues.values.put("alpha", Float.valueOf(transitionValues.view.getAlpha()));
    }

    public void captureStartValues(TransitionValues transitionValues) {
        transitionValues.values.put("alpha", Float.valueOf(transitionValues.view.getAlpha()));
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return ObjectAnimator.ofFloat(transitionValues2.view, "alpha", ((Float) transitionValues.values.get("alpha")).floatValue(), ((Float) transitionValues2.values.get("alpha")).floatValue());
    }
}
