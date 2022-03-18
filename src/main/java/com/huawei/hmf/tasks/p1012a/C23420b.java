package com.huawei.hmf.tasks.p1012a;

import com.huawei.hmf.tasks.AbstractC23428b;
import com.huawei.hmf.tasks.AbstractC23429c;
import com.huawei.hmf.tasks.AbstractC23432f;
import java.util.concurrent.Executor;

/* renamed from: com.huawei.hmf.tasks.a.b */
public final class C23420b<TResult> implements AbstractC23428b<TResult> {

    /* renamed from: a */
    private AbstractC23429c f57739a;

    /* renamed from: b */
    private Executor f57740b;

    /* renamed from: c */
    private final Object f57741c = new Object();

    C23420b(Executor executor, AbstractC23429c cVar) {
        this.f57739a = cVar;
        this.f57740b = executor;
    }

    @Override // com.huawei.hmf.tasks.AbstractC23428b
    /* renamed from: a */
    public final void mo81821a() {
        synchronized (this.f57741c) {
            this.f57739a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.AbstractC23428b
    /* renamed from: a */
    public final void mo81822a(AbstractC23432f<TResult> fVar) {
        if (fVar.mo81835b()) {
            this.f57740b.execute(new Runnable() {
                /* class com.huawei.hmf.tasks.p1012a.C23420b.RunnableC234211 */

                public final void run() {
                    synchronized (C23420b.this.f57741c) {
                        if (C23420b.this.f57739a != null) {
                            C23420b.this.f57739a.mo81841a();
                        }
                    }
                }
            });
        }
    }
}
