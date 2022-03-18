package com.ss.android.lark.main.app.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.main.app.fragment.g */
public class C44279g {
    /* renamed from: a */
    private static Animator m175650a(int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat((Object) null, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f), ObjectAnimator.ofFloat((Object) null, "translationY", (float) i2, (float) i));
        return animatorSet;
    }

    /* renamed from: b */
    private static Animator m175652b(int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat((Object) null, "translationY", (float) i, (float) i2));
        return animatorSet;
    }

    /* renamed from: c */
    private static Animator m175653c(int i, int i2) {
        return ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofInt("left", 0, 0), PropertyValuesHolder.ofInt("top", 0, 0), PropertyValuesHolder.ofInt("right", 0, 0), PropertyValuesHolder.ofInt("bottom", 0, 0), PropertyValuesHolder.ofFloat("alpha", BitmapDescriptorFactory.HUE_RED, 1.0f), PropertyValuesHolder.ofFloat("translationY", (float) i2, (float) i));
    }

    /* renamed from: d */
    private static Animator m175654d(int i, int i2) {
        return ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofInt("left", 0, 0), PropertyValuesHolder.ofInt("top", 0, 0), PropertyValuesHolder.ofInt("right", 0, 0), PropertyValuesHolder.ofInt("bottom", 0, 0), PropertyValuesHolder.ofFloat("alpha", 1.0f, BitmapDescriptorFactory.HUE_RED), PropertyValuesHolder.ofFloat("translationY", (float) i, (float) i2));
    }

    /* renamed from: a */
    public static LayoutTransition m175651a(int i, int i2, int i3) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(2, m175650a(i, i2));
        long j = (long) i3;
        layoutTransition.setDuration(j);
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setAnimator(3, m175652b(i, i2));
        layoutTransition.setDuration(j);
        layoutTransition.setDuration(3, 0);
        layoutTransition.setAnimator(0, m175653c(i, i2));
        layoutTransition.setDuration(j);
        layoutTransition.setStartDelay(0, 0);
        layoutTransition.setAnimator(1, m175654d(i, i2));
        layoutTransition.setDuration(j);
        layoutTransition.setStartDelay(1, 0);
        return layoutTransition;
    }
}
