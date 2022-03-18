package com.ss.android.lark.locationmessage.p2149b;

import android.os.SystemClock;
import android.view.View;

/* renamed from: com.ss.android.lark.locationmessage.b.a */
public abstract class AbstractView$OnClickListenerC41590a implements View.OnClickListener {

    /* renamed from: a */
    private long f105678a;

    /* renamed from: a */
    public abstract void mo149706a(View view);

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f105678a > 1000) {
            mo149706a(view);
            this.f105678a = uptimeMillis;
        }
    }
}
