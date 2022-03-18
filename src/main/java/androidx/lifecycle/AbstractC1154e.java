package androidx.lifecycle;

import androidx.p011a.p012a.p013a.C0179a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.e */
public abstract class AbstractC1154e<T> {

    /* renamed from: a */
    final Executor f4274a;

    /* renamed from: b */
    final LiveData<T> f4275b;

    /* renamed from: c */
    final AtomicBoolean f4276c = new AtomicBoolean(true);

    /* renamed from: d */
    final AtomicBoolean f4277d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f4278e = new Runnable() {
        /* class androidx.lifecycle.AbstractC1154e.RunnableC11562 */

        /* JADX INFO: finally extract failed */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: androidx.lifecycle.LiveData<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            do {
                boolean z = false;
                if (AbstractC1154e.this.f4277d.compareAndSet(false, true)) {
                    Object obj = null;
                    boolean z2 = false;
                    while (AbstractC1154e.this.f4276c.compareAndSet(true, false)) {
                        try {
                            obj = AbstractC1154e.this.mo6021c();
                            z2 = true;
                        } catch (Throwable th) {
                            AbstractC1154e.this.f4277d.set(false);
                            throw th;
                        }
                    }
                    if (z2) {
                        AbstractC1154e.this.f4275b.mo5926a(obj);
                    }
                    AbstractC1154e.this.f4277d.set(false);
                    z = z2;
                }
                if (!z) {
                    return;
                }
            } while (AbstractC1154e.this.f4276c.get());
        }
    };

    /* renamed from: f */
    final Runnable f4279f = new Runnable() {
        /* class androidx.lifecycle.AbstractC1154e.RunnableC11573 */

        public void run() {
            boolean e = AbstractC1154e.this.f4275b.mo5932e();
            if (AbstractC1154e.this.f4276c.compareAndSet(false, true) && e) {
                AbstractC1154e.this.f4274a.execute(AbstractC1154e.this.f4278e);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo6021c();

    /* renamed from: a */
    public LiveData<T> mo6019a() {
        return this.f4275b;
    }

    /* renamed from: b */
    public void mo6020b() {
        C0179a.m584a().mo554c(this.f4279f);
    }

    public AbstractC1154e(Executor executor) {
        this.f4274a = executor;
        this.f4275b = new LiveData<T>() {
            /* class androidx.lifecycle.AbstractC1154e.C11551 */

            /* access modifiers changed from: protected */
            @Override // androidx.lifecycle.LiveData
            /* renamed from: a */
            public void mo5920a() {
                AbstractC1154e.this.f4274a.execute(AbstractC1154e.this.f4278e);
            }
        };
    }
}
