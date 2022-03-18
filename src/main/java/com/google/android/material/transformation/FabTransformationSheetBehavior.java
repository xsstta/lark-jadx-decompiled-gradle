package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.p980a.C22123h;
import com.google.android.material.p980a.C22125j;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: c */
    private Map<View, Integer> f55382c;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: a */
    public FabTransformationBehavior.C22504a mo78593a(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C22504a aVar = new FabTransformationBehavior.C22504a();
        aVar.f55375a = C22123h.m79717a(context, i);
        aVar.f55376b = new C22125j(17, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        return aVar;
    }

    /* renamed from: a */
    private void m81694a(View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f55382c = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) || !(((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f55382c;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.m4069d(childAt, this.f55382c.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f55382c.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        ViewCompat.m4069d(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f55382c = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior, com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: a */
    public boolean mo78589a(View view, View view2, boolean z, boolean z2) {
        m81694a(view2, z);
        return super.mo78589a(view, view2, z, z2);
    }
}
