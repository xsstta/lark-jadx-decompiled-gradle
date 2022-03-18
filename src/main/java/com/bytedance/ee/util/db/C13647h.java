package com.bytedance.ee.util.db;

import androidx.p011a.p012a.p013a.C0182b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;

/* renamed from: com.bytedance.ee.util.db.h */
public class C13647h extends C0182b {
    /* renamed from: d */
    private Runnable m55373d(Runnable runnable) {
        return new Runnable(runnable) {
            /* class com.bytedance.ee.util.db.$$Lambda$h$bgIhLbbBEe39WtkP6zRapNQH4A */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C13647h.m55374e(this.f$0);
            }
        };
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c, androidx.p011a.p012a.p013a.C0182b
    /* renamed from: a */
    public void mo548a(Runnable runnable) {
        super.mo548a(m55373d(runnable));
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c, androidx.p011a.p012a.p013a.C0182b
    /* renamed from: b */
    public void mo549b(Runnable runnable) {
        super.mo549b(m55373d(runnable));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m55374e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            C13479a.m54761a("SecureTaskExecutor", e);
            C13606d.m55244a(e);
        }
    }
}
