package com.bytedance.ee.bear.list.homepage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.log.C13479a;

public class HomeCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: f */
    private AbstractC8505c f22842f;

    public HomeCoordinatorLayout(Context context) {
        super(context);
    }

    public void setMainTitle(AbstractC8505c cVar) {
        this.f22842f = cVar;
    }

    public HomeCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    public HomeCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(view, i, i2, iArr, i3);
        C13479a.m54764b("HomeCoordinatorLayout", "onNestedPreScroll()...dy = " + i2);
        AbstractC8505c cVar = this.f22842f;
        if (cVar != null) {
            cVar.mo33176a(i, i2);
        }
    }
}
