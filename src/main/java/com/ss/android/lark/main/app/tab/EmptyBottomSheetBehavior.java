package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ss.android.lark.main.app.fragment.NavBottomSheetBehavior;

public class EmptyBottomSheetBehavior<V extends View> extends NavBottomSheetBehavior<V> {
    public EmptyBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
    }
}
