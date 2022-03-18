package com.ss.android.lark.reaction.widget.p2559a;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.reaction.widget.a.b */
public abstract class AbstractView$OnClickListenerC52989b implements View.OnClickListener {

    /* renamed from: a */
    private long f130903a;

    /* renamed from: b */
    private long f130904b;

    /* renamed from: a */
    public abstract void mo122732a(View view);

    public AbstractView$OnClickListenerC52989b() {
        this.f130903a = 500;
        this.f130903a = 500;
    }

    public AbstractView$OnClickListenerC52989b(long j) {
        this.f130903a = 500;
        this.f130903a = j;
    }

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f130904b = uptimeMillis;
        if (uptimeMillis - this.f130904b < this.f130903a) {
            Log.m165389i("OnSingleClickListener", "elapsedTime is short than LENGTH_SHORT");
        } else {
            mo122732a(view);
        }
    }
}
