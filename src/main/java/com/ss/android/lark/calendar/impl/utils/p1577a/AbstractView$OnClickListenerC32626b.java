package com.ss.android.lark.calendar.impl.utils.p1577a;

import android.os.SystemClock;
import android.view.View;

/* renamed from: com.ss.android.lark.calendar.impl.utils.a.b */
public abstract class AbstractView$OnClickListenerC32626b implements View.OnClickListener {

    /* renamed from: a */
    private long f83721a;

    /* renamed from: a */
    public abstract void mo108751a(View view);

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f83721a > 1000) {
            mo108751a(view);
            this.f83721a = uptimeMillis;
        }
    }
}
