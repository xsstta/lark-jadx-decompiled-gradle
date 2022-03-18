package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.p071c.C1787d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.l */
public class C1812l<T> {

    /* renamed from: a */
    public static Executor f6226a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public volatile C1811k<T> f6227b;

    /* renamed from: c */
    private final Set<AbstractC1807g<T>> f6228c;

    /* renamed from: d */
    private final Set<AbstractC1807g<Throwable>> f6229d;

    /* renamed from: e */
    private final Handler f6230e;

    /* renamed from: a */
    private void m8105a() {
        this.f6230e.post(new Runnable() {
            /* class com.airbnb.lottie.C1812l.RunnableC18131 */

            public void run() {
                if (C1812l.this.f6227b != null) {
                    C1811k<T> kVar = C1812l.this.f6227b;
                    if (kVar.mo9110a() != null) {
                        C1812l.this.mo9116a((Object) kVar.mo9110a());
                    } else {
                        C1812l.this.mo9117a(kVar.mo9111b());
                    }
                }
            }
        });
    }

    /* renamed from: com.airbnb.lottie.l$a */
    private class C1814a extends FutureTask<C1811k<T>> {
        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C1812l.this.mo9115a((C1811k) ((C1811k) get()));
                } catch (InterruptedException | ExecutionException e) {
                    C1812l.this.mo9115a((C1811k) new C1811k<>(e));
                }
            }
        }

        C1814a(Callable<C1811k<T>> callable) {
            super(callable);
        }
    }

    public C1812l(Callable<C1811k<T>> callable) {
        this(callable, false);
    }

    /* renamed from: b */
    public synchronized C1812l<T> mo9118b(AbstractC1807g<T> gVar) {
        this.f6228c.remove(gVar);
        return this;
    }

    /* renamed from: d */
    public synchronized C1812l<T> mo9120d(AbstractC1807g<Throwable> gVar) {
        this.f6229d.remove(gVar);
        return this;
    }

    /* renamed from: a */
    public synchronized C1812l<T> mo9114a(AbstractC1807g<T> gVar) {
        if (!(this.f6227b == null || this.f6227b.mo9110a() == null)) {
            gVar.mo8835a(this.f6227b.mo9110a());
        }
        this.f6228c.add(gVar);
        return this;
    }

    /* renamed from: c */
    public synchronized C1812l<T> mo9119c(AbstractC1807g<Throwable> gVar) {
        if (!(this.f6227b == null || this.f6227b.mo9111b() == null)) {
            gVar.mo8835a(this.f6227b.mo9111b());
        }
        this.f6229d.add(gVar);
        return this;
    }

    /* renamed from: a */
    public void mo9115a(C1811k<T> kVar) {
        if (this.f6227b == null) {
            this.f6227b = kVar;
            m8105a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public synchronized void mo9116a(T t) {
        for (AbstractC1807g gVar : new ArrayList(this.f6228c)) {
            gVar.mo8835a(t);
        }
    }

    /* renamed from: a */
    public synchronized void mo9117a(Throwable th) {
        ArrayList<AbstractC1807g> arrayList = new ArrayList(this.f6229d);
        if (arrayList.isEmpty()) {
            C1787d.m7972a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (AbstractC1807g gVar : arrayList) {
            gVar.mo8835a(th);
        }
    }

    C1812l(Callable<C1811k<T>> callable, boolean z) {
        this.f6228c = new LinkedHashSet(1);
        this.f6229d = new LinkedHashSet(1);
        this.f6230e = new Handler(Looper.getMainLooper());
        this.f6227b = null;
        if (z) {
            try {
                mo9115a((C1811k) callable.call());
            } catch (Throwable th) {
                mo9115a((C1811k) new C1811k<>(th));
            }
        } else {
            f6226a.execute(new C1814a(callable));
        }
    }
}
