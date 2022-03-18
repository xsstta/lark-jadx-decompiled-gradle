package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class NoConsumeInsetsFrameLayout extends FrameLayout {
    public NoConsumeInsetsFrameLayout(Context context) {
        super(context);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        requestApplyInsets();
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        super.dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public NoConsumeInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoConsumeInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
