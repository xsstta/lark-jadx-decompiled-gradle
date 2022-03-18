package com.ss.android.lark.reaction.widget.detailwindow.scroller;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.n */
class C53045n {
    /* renamed from: a */
    static void m205378a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
        }
    }
}
