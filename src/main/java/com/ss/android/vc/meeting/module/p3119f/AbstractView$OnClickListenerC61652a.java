package com.ss.android.vc.meeting.module.p3119f;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.vc.meeting.module.f.a */
public abstract class AbstractView$OnClickListenerC61652a implements View.OnClickListener {

    /* renamed from: a */
    private long f154657a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo213552a(View view);

    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f154657a < ((long) ViewConfiguration.getDoubleTapTimeout())) {
            mo213552a(view);
            this.f154657a = 0;
            return;
        }
        this.f154657a = currentTimeMillis;
    }
}
