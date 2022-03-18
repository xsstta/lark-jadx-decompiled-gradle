package com.tt.miniapp.util;

import android.os.SystemClock;
import android.view.View;

/* renamed from: com.tt.miniapp.util.i */
public abstract class AbstractView$OnClickListenerC67042i implements View.OnClickListener {

    /* renamed from: a */
    private long f169014a;

    /* renamed from: b */
    long f169015b = 1000;

    /* renamed from: a */
    public abstract void mo232142a(View view);

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f169014a > this.f169015b) {
            mo232142a(view);
            this.f169014a = uptimeMillis;
        }
    }
}
