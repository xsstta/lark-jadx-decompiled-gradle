package com.tt.miniapp.view.webcore;

import android.webkit.ValueCallback;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.view.webcore.i */
public abstract class AbstractC67280i<T> implements ValueCallback<T> {

    /* renamed from: a */
    private Runnable f169827a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo233917a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo233918a(T t);

    public AbstractC67280i(long j) {
        if (j > 0) {
            this.f169827a = new Runnable() {
                /* class com.tt.miniapp.view.webcore.AbstractC67280i.RunnableC672811 */

                public void run() {
                    AbstractC67280i.this.mo233917a();
                }
            };
            AppbrandContext.getMainHandler().postDelayed(this.f169827a, j);
        }
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(T t) {
        if (this.f169827a != null) {
            AppbrandContext.getMainHandler().removeCallbacks(this.f169827a);
            this.f169827a = null;
        }
        mo233918a(t);
    }
}
