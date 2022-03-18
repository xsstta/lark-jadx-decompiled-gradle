package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3460b.AbstractC68364a;
import io.reactivex.internal.p3460b.AbstractC68370g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.subscribers.a */
public abstract class AbstractC68967a<T, R> implements AbstractC68364a<T>, AbstractC68370g<R> {

    /* renamed from: e */
    protected final AbstractC68364a<? super R> f172964e;

    /* renamed from: f */
    protected AbstractC70022d f172965f;

    /* renamed from: g */
    protected AbstractC68370g<T> f172966g;

    /* renamed from: h */
    protected boolean f172967h;

    /* renamed from: i */
    protected int f172968i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo238690a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo238691b() {
    }

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        this.f172965f.cancel();
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public void clear() {
        this.f172966g.clear();
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public boolean isEmpty() {
        return this.f172966g.isEmpty();
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        if (!this.f172967h) {
            this.f172967h = true;
            this.f172964e.onComplete();
        }
    }

    public AbstractC68967a(AbstractC68364a<? super R> aVar) {
        this.f172964e = aVar;
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68373j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        this.f172965f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo238689a(Throwable th) {
        C68306a.m265071b(th);
        this.f172965f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo238688a(int i) {
        AbstractC68370g<T> gVar = this.f172966g;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = gVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f172968i = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        if (this.f172967h) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f172967h = true;
        this.f172964e.onError(th);
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public final void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.validate(this.f172965f, dVar)) {
            this.f172965f = dVar;
            if (dVar instanceof AbstractC68370g) {
                this.f172966g = (AbstractC68370g) dVar;
            }
            if (mo238690a()) {
                this.f172964e.onSubscribe(this);
                mo238691b();
            }
        }
    }
}
