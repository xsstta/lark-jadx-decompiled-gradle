package com.ss.android.lark.todo.impl.features.detail.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.DecelerateInterpolator;

/* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.b */
public class C56793b {
    /* renamed from: a */
    private static Animator m220694a(int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 1.0f), ObjectAnimator.ofFloat((Object) null, "translationX", (float) i2, (float) i));
        return animatorSet;
    }

    /* renamed from: b */
    private static Animator m220696b(int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 1.0f), ObjectAnimator.ofFloat((Object) null, "translationX", (float) i, (float) i2));
        return animatorSet;
    }

    /* renamed from: c */
    private static Animator m220697c(int i, int i2) {
        return ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofInt("left", 0, 0), PropertyValuesHolder.ofInt("top", 0, 0), PropertyValuesHolder.ofInt("right", 0, 0), PropertyValuesHolder.ofInt("bottom", 0, 0), PropertyValuesHolder.ofFloat("alpha", 1.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", (float) i2, (float) i));
    }

    /* renamed from: d */
    private static Animator m220698d(int i, int i2) {
        return ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofInt("left", 0, 0), PropertyValuesHolder.ofInt("top", 0, 0), PropertyValuesHolder.ofInt("right", 0, 0), PropertyValuesHolder.ofInt("bottom", 0, 0), PropertyValuesHolder.ofFloat("alpha", 1.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", (float) i, (float) i2));
    }

    /* renamed from: a */
    public static LayoutTransition m220695a(int i, int i2, int i3) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(2, m220694a(i, i2));
        long j = (long) i3;
        layoutTransition.setDuration(j);
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setAnimator(3, m220696b(i, i2));
        layoutTransition.setDuration(j);
        layoutTransition.setDuration(3, 0);
        layoutTransition.setAnimator(0, m220697c(i, i2));
        layoutTransition.setDuration(j);
        layoutTransition.setStartDelay(0, 0);
        layoutTransition.setAnimator(1, m220698d(i, i2));
        layoutTransition.setDuration(j);
        layoutTransition.setStartDelay(1, 0);
        return layoutTransition;
    }
}
