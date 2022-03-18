package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;

public class StickyHeaderLottieAnimationView extends LKUILottieAnimationView {
    public boolean isShown() {
        View view = this;
        while (getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
            if (view == null) {
                return false;
            }
        }
        return false;
    }

    public StickyHeaderLottieAnimationView(Context context) {
        this(context, null);
    }

    public StickyHeaderLottieAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickyHeaderLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
