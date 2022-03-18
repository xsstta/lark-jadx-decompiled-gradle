package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3460b.AbstractC68365b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.p3511d.AbstractC70022d;

public final class ar<T> extends Single<T> implements AbstractC68365b<T> {

    /* renamed from: a */
    final AbstractC68307f<T> f171961a;

    /* renamed from: b */
    final T f171962b;

    /* renamed from: io.reactivex.internal.operators.flowable.ar$a */
    static final class C68553a<T> implements Disposable, AbstractC68325i<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171963a;

        /* renamed from: b */
        final T f171964b;

        /* renamed from: c */
        AbstractC70022d f171965c;

        /* renamed from: d */
        boolean f171966d;

        /* renamed from: e */
        T f171967e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171965c.cancel();
            this.f171965c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f171965c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.f171966d) {
                this.f171966d = true;
                this.f171965c = SubscriptionHelper.CANCELLED;
                T t = this.f171967e;
                this.f171967e = null;
                if (t == null) {
                    t = this.f171964b;
                }
                if (t != null) {
                    this.f171963a.onSuccess(t);
                } else {
                    this.f171963a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.f171966d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f171966d = true;
            this.f171965c = SubscriptionHelper.CANCELLED;
            this.f171963a.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f171965c, dVar)) {
                this.f171965c = dVar;
                this.f171963a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f171966d) {
                if (this.f171967e != null) {
                    this.f171966d = true;
                    this.f171965c.cancel();
                    this.f171965c = SubscriptionHelper.CANCELLED;
                    this.f171963a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f171967e = t;
            }
        }

        C68553a(AbstractC69012t<? super T> tVar, T t) {
            this.f171963a = tVar;
            this.f171964b = t;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68365b
    /* renamed from: a */
    public AbstractC68307f<T> mo238078a() {
        return RxJavaPlugins.onAssembly(new aq(this.f171961a, this.f171962b, true));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171961a.mo238000a((AbstractC68325i) new C68553a(tVar, this.f171962b));
    }

    public ar(AbstractC68307f<T> fVar, T t) {
        this.f171961a = fVar;
        this.f171962b = t;
    }
}
