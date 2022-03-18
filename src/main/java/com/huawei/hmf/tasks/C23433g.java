package com.huawei.hmf.tasks;

import com.huawei.hmf.tasks.p1012a.C23426e;

/* renamed from: com.huawei.hmf.tasks.g */
public class C23433g<TResult> {

    /* renamed from: a */
    public final C23426e<TResult> f57761a = new C23426e<>();

    public C23433g() {
    }

    public C23433g(AbstractC23417a aVar) {
        aVar.mo81818a(new Runnable() {
            /* class com.huawei.hmf.tasks.C23433g.RunnableC234341 */

            public void run() {
                C23433g.this.f57761a.mo81839f();
            }
        });
    }

    /* renamed from: a */
    public AbstractC23432f<TResult> mo81844a() {
        return this.f57761a;
    }

    /* renamed from: a */
    public void mo81845a(Exception exc) {
        this.f57761a.mo81832a(exc);
    }

    /* renamed from: a */
    public void mo81846a(TResult tresult) {
        this.f57761a.mo81833a((Object) tresult);
    }
}
