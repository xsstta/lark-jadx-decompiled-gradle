package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.p986g.AbstractC22307b;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f55351a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo78589a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior() {
    }

    /* renamed from: a */
    private boolean m81664a(boolean z) {
        if (z) {
            int i = this.f55351a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f55351a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC22307b mo78588a(CoordinatorLayout coordinatorLayout, View view) {
        List<View> c = coordinatorLayout.mo3950c(view);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            View view2 = c.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (AbstractC22307b) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        AbstractC22307b bVar = (AbstractC22307b) view2;
        if (!m81664a(bVar.mo77501a())) {
            return false;
        }
        if (bVar.mo77501a()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f55351a = i;
        return mo78589a((View) bVar, view, bVar.mo77501a(), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = mo78588a(r3, r4);
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r3, final android.view.View r4, int r5) {
        /*
            r2 = this;
            boolean r5 = androidx.core.view.ViewCompat.m4012F(r4)
            if (r5 != 0) goto L_0x002d
            com.google.android.material.g.b r3 = r2.mo78588a(r3, r4)
            if (r3 == 0) goto L_0x002d
            boolean r5 = r3.mo77501a()
            boolean r5 = r2.m81664a(r5)
            if (r5 == 0) goto L_0x002d
            boolean r5 = r3.mo77501a()
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r2.f55351a = r5
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$1 r1 = new com.google.android.material.transformation.ExpandableBehavior$1
            r1.<init>(r4, r5, r3)
            r0.addOnPreDrawListener(r1)
        L_0x002d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }
}
