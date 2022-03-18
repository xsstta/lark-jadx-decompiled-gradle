package com.ss.android.ad.splash.core.p1246a;

import android.view.View;

/* renamed from: com.ss.android.ad.splash.core.a.a */
public abstract class AbstractView$OnClickListenerC27267a implements View.OnClickListener {

    /* renamed from: a */
    private long f67944a;

    /* renamed from: b */
    public boolean f67945b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo97216a(View view);

    public AbstractView$OnClickListenerC27267a() {
        this(500);
    }

    public AbstractView$OnClickListenerC27267a(long j) {
        this.f67945b = true;
        this.f67944a = j;
    }

    public void onClick(View view) {
        if (this.f67945b) {
            this.f67945b = false;
            view.postDelayed(new Runnable() {
                /* class com.ss.android.ad.splash.core.p1246a.AbstractView$OnClickListenerC27267a.RunnableC272681 */

                public void run() {
                    AbstractView$OnClickListenerC27267a.this.f67945b = true;
                }
            }, this.f67944a);
            mo97216a(view);
        }
    }
}
