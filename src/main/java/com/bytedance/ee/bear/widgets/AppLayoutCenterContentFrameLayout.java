package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;

public class AppLayoutCenterContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f31685a;

    /* renamed from: b */
    private int f31686b;

    /* renamed from: a */
    private int m48887a() {
        View rootView = getRootView();
        if (rootView == null) {
            return 0;
        }
        View findViewById = rootView.findViewById(this.f31685a);
        View findViewById2 = rootView.findViewById(this.f31686b);
        if (findViewById == null || findViewById2 == null || !m48889a(findViewById2)) {
            return 0;
        }
        return findViewById.getMeasuredHeight();
    }

    public AppLayoutCenterContentFrameLayout(Context context) {
        super(context);
        m48888a((AttributeSet) null);
    }

    /* renamed from: a */
    private boolean m48889a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof AppBarLayout.ScrollingViewBehavior;
        }
        return false;
    }

    /* renamed from: a */
    private void m48888a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.appBarLayoutId, R.attr.scrollContentId}, 0, 0);
            this.f31685a = obtainStyledAttributes.getResourceId(0, 0);
            this.f31686b = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppLayoutCenterContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48888a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(size - m48887a(), mode);
        }
        super.onMeasure(i, i2);
    }

    public AppLayoutCenterContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48888a(attributeSet);
    }
}
