package com.bytedance.ee.bear.bizwidget;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.bear.facade.common.widget.Toast;

/* renamed from: com.bytedance.ee.bear.bizwidget.c */
public class C4878c {

    /* renamed from: a */
    private Context f14356a;

    /* renamed from: b */
    private boolean f14357b;

    /* renamed from: c */
    private Runnable f14358c = new Runnable() {
        /* class com.bytedance.ee.bear.bizwidget.$$Lambda$c$1ex1SkRwyHdLMjepts1NfuBQD4Q */

        public final void run() {
            C4878c.lambda$1ex1SkRwyHdLMjepts1NfuBQD4Q(C4878c.this);
        }
    };

    /* renamed from: d */
    private final Handler f14359d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private int f14360e = 0;

    /* renamed from: f */
    private int f14361f = -1;

    /* renamed from: a */
    public boolean mo19129a() {
        return this.f14357b;
    }

    /* renamed from: b */
    public void mo19130b() {
        this.f14359d.removeCallbacks(this.f14358c);
        Toast.cancelLoading();
        this.f14357b = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20114d() {
        int i;
        Context context = this.f14356a;
        if ((context instanceof Activity) && !((Activity) context).isDestroyed() && (i = this.f14361f) != -1) {
            Context context2 = this.f14356a;
            Toast.showLoading(context2, context2.getString(i));
        }
    }

    /* renamed from: c */
    public void mo19132c() {
        long j;
        this.f14359d.removeCallbacks(this.f14358c);
        Handler handler = this.f14359d;
        Runnable runnable = this.f14358c;
        int i = this.f14360e;
        if (i <= 0) {
            j = 300;
        } else {
            j = (long) i;
        }
        handler.postDelayed(runnable, j);
        this.f14357b = true;
    }

    /* renamed from: a */
    public void mo19128a(int i) {
        this.f14360e = i;
    }

    /* renamed from: b */
    public void mo19131b(int i) {
        this.f14361f = i;
    }

    public C4878c(Context context) {
        this.f14356a = context;
    }
}
