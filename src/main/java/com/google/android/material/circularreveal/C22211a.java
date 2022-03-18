package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.AbstractC22213b;

/* renamed from: com.google.android.material.circularreveal.a */
public final class C22211a {
    /* renamed from: a */
    public static Animator.AnimatorListener m80359a(final AbstractC22213b bVar) {
        return new AnimatorListenerAdapter() {
            /* class com.google.android.material.circularreveal.C22211a.C222121 */

            public void onAnimationEnd(Animator animator) {
                bVar.Y_();
            }

            public void onAnimationStart(Animator animator) {
                bVar.mo77235a();
            }
        };
    }

    /* renamed from: a */
    public static Animator m80360a(AbstractC22213b bVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(bVar, AbstractC22213b.C22216b.f54291a, AbstractC22213b.C22215a.f54289a, new AbstractC22213b.C22218d(f, f2, f3));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        AbstractC22213b.C22218d revealInfo = bVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) bVar, (int) f, (int) f2, revealInfo.f54295c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
