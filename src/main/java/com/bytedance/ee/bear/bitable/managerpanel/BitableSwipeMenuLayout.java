package com.bytedance.ee.bear.bitable.managerpanel;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableSwipeMenuLayout;", "Lcom/bytedance/ee/bear/facade/common/widget/recyclerview/SwipeMenuLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableSwipeMenuLayout extends SwipeMenuLayout {
    public BitableSwipeMenuLayout(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 != 3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x001b
            r2 = 2
            if (r0 == r2) goto L_0x0013
            r1 = 3
            if (r0 == r1) goto L_0x001b
            goto L_0x0023
        L_0x0013:
            android.view.ViewParent r0 = r3.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0023
        L_0x001b:
            android.view.ViewParent r0 = r3.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0023:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bitable.managerpanel.BitableSwipeMenuLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public BitableSwipeMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BitableSwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
