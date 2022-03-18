package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.subscribers.b */
public abstract class AbstractC68968b<T, R> implements AbstractC68325i<T>, AbstractC68370g<R> {

    /* renamed from: e */
    protected final AbstractC70021c<? super R> f172969e;

    /* renamed from: f */
    protected AbstractC70022d f172970f;

    /* renamed from: g */
    protected AbstractC68370g<T> f172971g;

    /* renamed from: h */
    protected boolean f172972h;

    /* renamed from: i */
    protected int f172973i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo238694a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo238695b() {
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        this.f172970f.cancel();
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
        this.f172971g.clear();
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        return this.f172971g.isEmpty();
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        if (!this.f172972h) {
            this.f172972h = true;
            this.f172969e.onComplete();
        }
    }

    public AbstractC68968b(AbstractC70021c<? super R> cVar) {
        this.f172969e = cVar;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        this.f172970f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo238693a(Throwable th) {
        C68306a.m265071b(th);
        this.f172970f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo238692a(int i) {
        AbstractC68370g<T> gVar = this.f172971g;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = gVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f172973i = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        if (this.f172972h) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f172972h = true;
        this.f172969e.onError(th);
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public final void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.validate(this.f172970f, dVar)) {
            this.f172970f = dVar;
            if (dVar instanceof AbstractC68370g) {
                this.f172971g = (AbstractC68370g) dVar;
            }
            if (mo238694a()) {
                this.f172969e.onSubscribe(this);
                mo238695b();
            }
        }
    }
}
