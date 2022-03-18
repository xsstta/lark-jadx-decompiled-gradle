package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;

public class NonDragAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public NonDragAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDragCallback(new AppBarLayout.Behavior.DragCallback() {
            /* class com.bytedance.ee.bear.widgets.NonDragAppBarLayoutBehavior.C118101 */

            @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
            public boolean canDrag(AppBarLayout appBarLayout) {
                return false;
            }
        });
    }
}
