package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;

public class TSwipeMenuLayout extends SwipeMenuLayout {
    public TSwipeMenuLayout(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != 3) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x0016
            r2 = 2
            if (r0 == r2) goto L_0x000e
            r1 = 3
            if (r0 == r1) goto L_0x0016
            goto L_0x001e
        L_0x000e:
            android.view.ViewParent r0 = r3.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r3.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x001e:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.wikitree.tree.view.TSwipeMenuLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public TSwipeMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TSwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
