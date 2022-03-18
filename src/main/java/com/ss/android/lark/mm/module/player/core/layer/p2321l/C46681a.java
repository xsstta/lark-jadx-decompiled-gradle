package com.ss.android.lark.mm.module.player.core.layer.p2321l;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.l.a */
public class C46681a {
    /* renamed from: a */
    public static void m184654a(final View view, final int i) {
        if (view != null) {
            view.post(new Runnable() {
                /* class com.ss.android.lark.mm.module.player.core.layer.p2321l.C46681a.RunnableC466821 */

                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i;
                    rect.left -= i;
                    rect.right += i;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m184655a(final View view, final int i, final int i2, final int i3, final int i4) {
        if (view != null) {
            view.post(new Runnable() {
                /* class com.ss.android.lark.mm.module.player.core.layer.p2321l.C46681a.RunnableC466832 */

                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i2;
                    rect.left -= i3;
                    rect.right += i4;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            });
        }
    }
}
