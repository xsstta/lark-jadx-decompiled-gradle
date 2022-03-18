package com.huawei.hmf.tasks.p1012a;

import com.huawei.hmf.tasks.AbstractC23428b;
import com.huawei.hmf.tasks.AbstractC23431e;
import com.huawei.hmf.tasks.AbstractC23432f;
import java.util.concurrent.Executor;

/* renamed from: com.huawei.hmf.tasks.a.d */
public final class C23424d<TResult> implements AbstractC23428b<TResult> {

    /* renamed from: a */
    private AbstractC23431e<TResult> f57748a;

    /* renamed from: b */
    private Executor f57749b;

    /* renamed from: c */
    private final Object f57750c = new Object();

    C23424d(Executor executor, AbstractC23431e<TResult> eVar) {
        this.f57748a = eVar;
        this.f57749b = executor;
    }

    @Override // com.huawei.hmf.tasks.AbstractC23428b
    /* renamed from: a */
    public final void mo81821a() {
        synchronized (this.f57750c) {
            this.f57748a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.AbstractC23428b
    /* renamed from: a */
    public final void mo81822a(final AbstractC23432f<TResult> fVar) {
        if (fVar.mo81834a() && !fVar.mo81835b()) {
            this.f57749b.execute(new Runnable() {
                /* class com.huawei.hmf.tasks.p1012a.C23424d.RunnableC234251 */

                /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.huawei.hmf.tasks.e */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    synchronized (C23424d.this.f57750c) {
                        if (C23424d.this.f57748a != null) {
                            C23424d.this.f57748a.onSuccess(fVar.mo81836c());
                        }
                    }
                }
            });
        }
    }
}
