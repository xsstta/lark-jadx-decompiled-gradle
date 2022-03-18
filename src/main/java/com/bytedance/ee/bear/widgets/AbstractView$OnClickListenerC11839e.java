package com.bytedance.ee.bear.widgets;

import android.view.View;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.widgets.e */
public abstract class AbstractView$OnClickListenerC11839e implements View.OnClickListener {

    /* renamed from: a */
    private long f31981a;

    /* renamed from: b */
    private long f31982b = 200;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16698a(View view);

    public AbstractView$OnClickListenerC11839e() {
    }

    public AbstractView$OnClickListenerC11839e(int i) {
        this.f31982b = (long) i;
    }

    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f31981a = currentTimeMillis;
        if (currentTimeMillis - this.f31981a > this.f31982b) {
            mo16698a(view);
        } else {
            C13479a.m54775e("SafeClickListener", "So fast click , ignored !");
        }
    }
}
