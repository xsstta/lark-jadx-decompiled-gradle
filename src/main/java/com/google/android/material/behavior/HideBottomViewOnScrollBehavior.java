package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.p980a.C22116a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public ViewPropertyAnimator f53896a;

    /* renamed from: b */
    private int f53897b;

    /* renamed from: c */
    private int f53898c = 2;

    /* renamed from: d */
    private int f53899d;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: a */
    public void mo76515a(V v) {
        if (this.f53898c != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f53896a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f53898c = 2;
            m79832a(v, 0, 225, C22116a.f53782d);
        }
    }

    /* renamed from: b */
    public void mo76517b(V v) {
        if (this.f53898c != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f53896a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f53898c = 1;
            m79832a(v, this.f53897b + this.f53899d, 175, C22116a.f53781c);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo76516a(V v, int i) {
        this.f53899d = i;
        if (this.f53898c == 1) {
            v.setTranslationY((float) (this.f53897b + i));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f53897b = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    /* renamed from: a */
    private void m79832a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f53896a = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.behavior.HideBottomViewOnScrollBehavior.C221441 */

            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f53896a = null;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo76517b(v);
        } else if (i2 < 0) {
            mo76515a(v);
        }
    }
}
