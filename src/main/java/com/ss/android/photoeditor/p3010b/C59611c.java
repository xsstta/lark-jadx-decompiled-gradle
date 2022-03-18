package com.ss.android.photoeditor.p3010b;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.ss.android.photoeditor.b.c */
public class C59611c {
    /* renamed from: a */
    public static void m231214a(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.photoeditor.p3010b.C59611c.ViewTreeObserver$OnPreDrawListenerC596121 */

            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                runnable.run();
                return false;
            }
        });
    }
}
