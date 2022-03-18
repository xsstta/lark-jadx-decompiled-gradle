package com.ss.android.lark.widget.listener;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;

/* renamed from: com.ss.android.lark.widget.listener.e */
public abstract class AbstractView$OnClickListenerC58544e implements View.OnClickListener {

    /* renamed from: a */
    private float f144519a = 0.75f;

    /* renamed from: a */
    public abstract void mo137047a(View view);

    public AbstractView$OnClickListenerC58544e(float f) {
        this.f144519a = f;
    }

    public void onClick(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, this.f144519a, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, this.f144519a, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(220L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58544e.C585451 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AbstractView$OnClickListenerC58544e.this.mo137047a(view);
            }
        });
    }
}
