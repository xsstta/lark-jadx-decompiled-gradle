package com.scwang.smart.refresh.layout.p1232d;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27083e;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27085a;

/* renamed from: com.scwang.smart.refresh.layout.d.a */
public class C27100a {
    /* renamed from: a */
    public static void m98448a(View view, AbstractC27083e eVar, final AbstractC27085a aVar) {
        try {
            if (view instanceof CoordinatorLayout) {
                eVar.mo96287a().mo96250e(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
                            /* class com.scwang.smart.refresh.layout.p1232d.C27100a.C271011 */

                            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
                            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                                boolean z;
                                AbstractC27085a aVar = aVar;
                                boolean z2 = true;
                                if (i >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (appBarLayout.getTotalScrollRange() + i > 0) {
                                    z2 = false;
                                }
                                aVar.mo96310a(z, z2);
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
