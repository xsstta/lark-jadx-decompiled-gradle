package com.ss.android.lark.thirdshare.container.p2745c;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.thirdshare.container.c.c */
public class C55735c {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m215924b(ApiUtils.AbstractC57749b bVar, ApiUtils.AbstractC57748a aVar) {
        ViewUtils.m224148a(new Runnable(bVar.mo189978a()) {
            /* class com.ss.android.lark.thirdshare.container.p2745c.$$Lambda$c$1j2VV9c9YbwOzd_aJV2c1_0N2g */
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55735c.m270994lambda$1j2VV9c9YbwOzd_aJV2c1_0N2g(ApiUtils.AbstractC57748a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static <T> void m215923a(ApiUtils.AbstractC57749b<T> bVar, ApiUtils.AbstractC57748a<T> aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable(aVar) {
            /* class com.ss.android.lark.thirdshare.container.p2745c.$$Lambda$c$huaA99QT2PfwsmA2uyf9mq8z3hk */
            public final /* synthetic */ ApiUtils.AbstractC57748a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C55735c.lambda$huaA99QT2PfwsmA2uyf9mq8z3hk(ApiUtils.AbstractC57749b.this, this.f$1);
            }
        });
    }
}
