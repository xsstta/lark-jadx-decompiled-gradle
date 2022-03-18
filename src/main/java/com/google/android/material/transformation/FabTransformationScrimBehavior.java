package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p980a.C22117b;
import com.google.android.material.p980a.C22124i;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C22124i f55377c = new C22124i(75, 150);

    /* renamed from: d */
    private final C22124i f55378d = new C22124i(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    public AnimatorSet mo78591b(View view, final View view2, final boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m81692a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C22117b.m79707a(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.transformation.FabTransformationScrimBehavior.C225051 */

            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    /* renamed from: a */
    private void m81692a(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        C22124i iVar;
        ObjectAnimator objectAnimator;
        if (z) {
            iVar = this.f55377c;
        } else {
            iVar = this.f55378d;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        iVar.mo76300a((Animator) objectAnimator);
        list.add(objectAnimator);
    }
}
