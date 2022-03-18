package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f55356b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo78591b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo78589a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f55356b;
        if (animatorSet != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet b = mo78591b(view, view2, z, z3);
        this.f55356b = b;
        b.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.transformation.ExpandableTransformationBehavior.C224991 */

            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f55356b = null;
            }
        });
        this.f55356b.start();
        if (!z2) {
            this.f55356b.end();
        }
        return true;
    }
}
