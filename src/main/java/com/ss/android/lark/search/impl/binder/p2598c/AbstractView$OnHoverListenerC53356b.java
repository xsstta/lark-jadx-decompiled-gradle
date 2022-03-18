package com.ss.android.lark.search.impl.binder.p2598c;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ss.android.lark.search.impl.binder.c.b */
public abstract class AbstractView$OnHoverListenerC53356b implements View.OnHoverListener {
    /* renamed from: a */
    public abstract void mo181992a(boolean z);

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            mo181992a(true);
        } else if (motionEvent.getAction() == 10) {
            mo181992a(false);
        }
        return false;
    }
}
