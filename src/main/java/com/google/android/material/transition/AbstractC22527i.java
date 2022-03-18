package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1562y;
import androidx.transition.Visibility;
import com.google.android.material.p980a.C22117b;
import com.google.android.material.transition.AbstractC22534l;
import java.util.ArrayList;

/* renamed from: com.google.android.material.transition.i */
abstract class AbstractC22527i<P extends AbstractC22534l> extends Visibility {

    /* renamed from: a */
    private final P f55487a;

    /* renamed from: i */
    private AbstractC22534l f55488i;

    /* renamed from: a */
    private Animator m81764a(ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        Animator animator2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            animator = this.f55487a.mo78611a(viewGroup, view);
        } else {
            animator = this.f55487a.mo78612b(viewGroup, view);
        }
        if (animator != null) {
            arrayList.add(animator);
        }
        AbstractC22534l lVar = this.f55488i;
        if (lVar != null) {
            if (z) {
                animator2 = lVar.mo78611a(viewGroup, view);
            } else {
                animator2 = lVar.mo78612b(viewGroup, view);
            }
            if (animator2 != null) {
                arrayList.add(animator2);
            }
        }
        C22117b.m79707a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // androidx.transition.Visibility
    /* renamed from: a */
    public Animator mo7869a(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        return m81764a(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: b */
    public Animator mo7870b(ViewGroup viewGroup, View view, C1562y yVar, C1562y yVar2) {
        return m81764a(viewGroup, view, false);
    }
}
