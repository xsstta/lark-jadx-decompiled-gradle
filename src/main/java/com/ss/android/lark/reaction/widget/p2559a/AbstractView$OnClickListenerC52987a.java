package com.ss.android.lark.reaction.widget.p2559a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;

/* renamed from: com.ss.android.lark.reaction.widget.a.a */
public abstract class AbstractView$OnClickListenerC52987a implements View.OnClickListener {

    /* renamed from: a */
    private float f130900a;

    /* renamed from: a */
    public abstract void mo181003a(View view);

    public AbstractView$OnClickListenerC52987a() {
        this.f130900a = 0.75f;
        this.f130900a = 0.75f;
    }

    public void onClick(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, this.f130900a, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, this.f130900a, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(220L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52987a.C529881 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AbstractView$OnClickListenerC52987a.this.mo181003a(view);
            }
        });
    }
}
