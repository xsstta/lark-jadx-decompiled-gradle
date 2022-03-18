package com.ss.android.lark.money.redpacket.p2368a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

/* renamed from: com.ss.android.lark.money.redpacket.a.b */
public class C48035b extends Visibility {

    /* renamed from: a */
    private float f120927a;

    /* renamed from: b */
    private float f120928b;

    public C48035b(float f, float f2) {
        this.f120927a = f;
        this.f120928b = f2;
    }

    /* renamed from: a */
    private Animator m189579a(View view, float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, f, f2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, f, f2);
        ofFloat.setInterpolator(new OvershootInterpolator(2.5f));
        ofFloat2.setInterpolator(new OvershootInterpolator(2.5f));
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m189579a(view, this.f120927a, this.f120928b);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m189579a(view, this.f120928b, this.f120927a);
    }
}
