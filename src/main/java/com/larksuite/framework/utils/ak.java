package com.larksuite.framework.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

public class ak {
    /* renamed from: a */
    public static void m95026a(View view, int i) {
        m95027a(view, i, i, i, i);
    }

    /* renamed from: a */
    public static void m95027a(final View view, final int i, final int i2, final int i3, final int i4) {
        if (view != null) {
            final View view2 = (View) view.getParent();
            if (view2 != null) {
                view2.post(new Runnable() {
                    /* class com.larksuite.framework.utils.ak.RunnableC262591 */

                    public void run() {
                        Rect rect = new Rect();
                        view.getHitRect(rect);
                        rect.top -= i;
                        rect.bottom += i4;
                        rect.left -= i2;
                        rect.right += i3;
                        view2.setTouchDelegate(new TouchDelegate(rect, view));
                    }
                });
                return;
            }
            throw new RuntimeException("view set TouchDelegate must have parent view");
        }
    }
}
