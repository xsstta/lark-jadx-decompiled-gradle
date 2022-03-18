package com.bytedance.ee.bear.document.offline.sync.preloadexecutor;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.b */
public class C6020b {

    /* renamed from: e */
    protected static CountDownLatch f16857e = new CountDownLatch(1);

    /* renamed from: a */
    private Runnable f16858a = new Runnable() {
        /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6020b.RunnableC60211 */

        public void run() {
            C13479a.m54775e("PreloadExecutor", "backgroundSleepRunnable======");
            C6020b.this.f16859d = true;
        }
    };

    /* renamed from: d */
    protected boolean f16859d;

    /* renamed from: d */
    public void mo24321d() throws Exception {
        if (this.f16859d) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            f16857e = countDownLatch;
            countDownLatch.await();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo24249a() {
        C5102ai.m20872j().mo20215g().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$b$RKOY8tY6jytcf3dYTRxyHUHUzuU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C6020b.this.m24381a((Boolean) obj);
            }
        });
    }

    public C6020b(C10917c cVar) {
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.sync.preloadexecutor.$$Lambda$b$gyWAeOZ3U6NFkDRcfayOWoRlRXM */

            public final void run() {
                C6020b.this.mo24249a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24381a(Boolean bool) {
        if (bool == Boolean.TRUE) {
            C13748k.m55735c(this.f16858a);
            if (this.f16859d) {
                this.f16859d = false;
                f16857e.countDown();
                return;
            }
            return;
        }
        C13748k.m55735c(this.f16858a);
        C13748k.m55733a(this.f16858a, C5102ai.m20872j().mo20216h());
    }
}
