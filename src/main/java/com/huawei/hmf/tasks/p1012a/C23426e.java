package com.huawei.hmf.tasks.p1012a;

import com.huawei.hmf.tasks.AbstractC23428b;
import com.huawei.hmf.tasks.AbstractC23429c;
import com.huawei.hmf.tasks.AbstractC23430d;
import com.huawei.hmf.tasks.AbstractC23431e;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23435h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.huawei.hmf.tasks.a.e */
public final class C23426e<TResult> extends AbstractC23432f<TResult> {

    /* renamed from: a */
    private final Object f57753a = new Object();

    /* renamed from: b */
    private boolean f57754b;

    /* renamed from: c */
    private volatile boolean f57755c;

    /* renamed from: d */
    private TResult f57756d;

    /* renamed from: e */
    private Exception f57757e;

    /* renamed from: f */
    private List<AbstractC23428b<TResult>> f57758f = new ArrayList();

    /* renamed from: a */
    private AbstractC23432f<TResult> m84980a(AbstractC23428b<TResult> bVar) {
        boolean e;
        synchronized (this.f57753a) {
            e = mo81838e();
            if (!e) {
                this.f57758f.add(bVar);
            }
        }
        if (e) {
            bVar.mo81822a(this);
        }
        return this;
    }

    /* renamed from: g */
    private void m84981g() {
        synchronized (this.f57753a) {
            for (AbstractC23428b<TResult> bVar : this.f57758f) {
                try {
                    bVar.mo81822a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f57758f = null;
        }
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: a */
    public final AbstractC23432f<TResult> mo81826a(AbstractC23429c cVar) {
        return mo81829a(C23435h.m85010a(), cVar);
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: a */
    public final AbstractC23432f<TResult> mo81827a(AbstractC23430d dVar) {
        return mo81830a(C23435h.m85010a(), dVar);
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: a */
    public final AbstractC23432f<TResult> mo81828a(AbstractC23431e<TResult> eVar) {
        return mo81831a(C23435h.m85010a(), eVar);
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: a */
    public final AbstractC23432f<TResult> mo81829a(Executor executor, AbstractC23429c cVar) {
        return m84980a((AbstractC23428b) new C23420b(executor, cVar));
    }

    /* renamed from: a */
    public final AbstractC23432f<TResult> mo81830a(Executor executor, AbstractC23430d dVar) {
        return m84980a((AbstractC23428b) new C23422c(executor, dVar));
    }

    /* renamed from: a */
    public final AbstractC23432f<TResult> mo81831a(Executor executor, AbstractC23431e<TResult> eVar) {
        return m84980a((AbstractC23428b) new C23424d(executor, eVar));
    }

    /* renamed from: a */
    public final void mo81832a(Exception exc) {
        synchronized (this.f57753a) {
            if (!this.f57754b) {
                this.f57754b = true;
                this.f57757e = exc;
                this.f57753a.notifyAll();
                m84981g();
            }
        }
    }

    /* renamed from: a */
    public final void mo81833a(TResult tresult) {
        synchronized (this.f57753a) {
            if (!this.f57754b) {
                this.f57754b = true;
                this.f57756d = tresult;
                this.f57753a.notifyAll();
                m84981g();
            }
        }
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: a */
    public final boolean mo81834a() {
        boolean z;
        synchronized (this.f57753a) {
            z = this.f57754b && !mo81835b() && this.f57757e == null;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: b */
    public final boolean mo81835b() {
        return this.f57755c;
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: c */
    public final TResult mo81836c() {
        TResult tresult;
        synchronized (this.f57753a) {
            if (this.f57757e == null) {
                tresult = this.f57756d;
            } else {
                throw new RuntimeException(this.f57757e);
            }
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.AbstractC23432f
    /* renamed from: d */
    public final Exception mo81837d() {
        Exception exc;
        synchronized (this.f57753a) {
            exc = this.f57757e;
        }
        return exc;
    }

    /* renamed from: e */
    public final boolean mo81838e() {
        boolean z;
        synchronized (this.f57753a) {
            z = this.f57754b;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo81839f() {
        synchronized (this.f57753a) {
            if (this.f57754b) {
                return false;
            }
            this.f57754b = true;
            this.f57755c = true;
            this.f57753a.notifyAll();
            m84981g();
            return true;
        }
    }
}
