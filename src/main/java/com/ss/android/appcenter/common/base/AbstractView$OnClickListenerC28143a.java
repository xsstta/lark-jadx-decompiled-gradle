package com.ss.android.appcenter.common.base;

import android.view.View;

/* renamed from: com.ss.android.appcenter.common.base.a */
public abstract class AbstractView$OnClickListenerC28143a implements View.OnClickListener {

    /* renamed from: a */
    private long f70533a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo98319a(View view);

    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f70533a > 1000) {
            this.f70533a = currentTimeMillis;
            mo98319a(view);
        }
    }
}
