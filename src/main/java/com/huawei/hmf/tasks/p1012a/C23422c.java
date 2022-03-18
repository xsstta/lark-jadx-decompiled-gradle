package com.huawei.hmf.tasks.p1012a;

import com.huawei.hmf.tasks.AbstractC23428b;
import com.huawei.hmf.tasks.AbstractC23430d;
import com.huawei.hmf.tasks.AbstractC23432f;
import java.util.concurrent.Executor;

/* renamed from: com.huawei.hmf.tasks.a.c */
public final class C23422c<TResult> implements AbstractC23428b<TResult> {

    /* renamed from: a */
    private AbstractC23430d f57743a;

    /* renamed from: b */
    private Executor f57744b;

    /* renamed from: c */
    private final Object f57745c = new Object();

    C23422c(Executor executor, AbstractC23430d dVar) {
        this.f57743a = dVar;
        this.f57744b = executor;
    }

    @Override // com.huawei.hmf.tasks.AbstractC23428b
    /* renamed from: a */
    public final void mo81821a() {
        synchronized (this.f57745c) {
            this.f57743a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.AbstractC23428b
    /* renamed from: a */
    public final void mo81822a(final AbstractC23432f<TResult> fVar) {
        if (!fVar.mo81834a() && !fVar.mo81835b()) {
            this.f57744b.execute(new Runnable() {
                /* class com.huawei.hmf.tasks.p1012a.C23422c.RunnableC234231 */

                public final void run() {
                    synchronized (C23422c.this.f57745c) {
                        if (C23422c.this.f57743a != null) {
                            C23422c.this.f57743a.onFailure(fVar.mo81837d());
                        }
                    }
                }
            });
        }
    }
}
