package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.p980a.C22117b;
import com.google.android.material.transition.platform.AbstractC22563l;
import java.util.ArrayList;

/* renamed from: com.google.android.material.transition.platform.i */
abstract class AbstractC22556i<P extends AbstractC22563l> extends Visibility {

    /* renamed from: a */
    private final P f55600a;

    /* renamed from: b */
    private AbstractC22563l f55601b;

    /* renamed from: a */
    private Animator m81852a(ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        Animator animator2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            animator = this.f55600a.mo78639a(viewGroup, view);
        } else {
            animator = this.f55600a.mo78640b(viewGroup, view);
        }
        if (animator != null) {
            arrayList.add(animator);
        }
        AbstractC22563l lVar = this.f55601b;
        if (lVar != null) {
            if (z) {
                animator2 = lVar.mo78639a(viewGroup, view);
            } else {
                animator2 = lVar.mo78640b(viewGroup, view);
            }
            if (animator2 != null) {
                arrayList.add(animator2);
            }
        }
        C22117b.m79707a(animatorSet, arrayList);
        return animatorSet;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m81852a(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m81852a(viewGroup, view, false);
    }
}
