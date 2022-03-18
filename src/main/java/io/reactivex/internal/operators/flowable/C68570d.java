package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68365b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.d */
public final class C68570d<T, U> extends Single<U> implements AbstractC68365b<U> {

    /* renamed from: a */
    final AbstractC68307f<T> f172001a;

    /* renamed from: b */
    final Callable<? extends U> f172002b;

    /* renamed from: c */
    final AbstractC68310b<? super U, ? super T> f172003c;

    /* renamed from: io.reactivex.internal.operators.flowable.d$a */
    static final class C68571a<T, U> implements Disposable, AbstractC68325i<T> {

        /* renamed from: a */
        final AbstractC69012t<? super U> f172004a;

        /* renamed from: b */
        final AbstractC68310b<? super U, ? super T> f172005b;

        /* renamed from: c */
        final U f172006c;

        /* renamed from: d */
        AbstractC70022d f172007d;

        /* renamed from: e */
        boolean f172008e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172007d.cancel();
            this.f172007d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172007d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.f172008e) {
                this.f172008e = true;
                this.f172007d = SubscriptionHelper.CANCELLED;
                this.f172004a.onSuccess(this.f172006c);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.f172008e) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172008e = true;
            this.f172007d = SubscriptionHelper.CANCELLED;
            this.f172004a.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f172008e) {
                try {
                    this.f172005b.accept(this.f172006c, t);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172007d.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f172007d, dVar)) {
                this.f172007d = dVar;
                this.f172004a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        C68571a(AbstractC69012t<? super U> tVar, U u, AbstractC68310b<? super U, ? super T> bVar) {
            this.f172004a = tVar;
            this.f172005b = bVar;
            this.f172006c = u;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68365b
    /* renamed from: a */
    public AbstractC68307f<U> mo238078a() {
        return RxJavaPlugins.onAssembly(new C68568c(this.f172001a, this.f172002b, this.f172003c));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super U> tVar) {
        try {
            this.f172001a.mo238000a((AbstractC68325i) new C68571a(tVar, C68362b.m265229a(this.f172002b.call(), "The initialSupplier returned a null value"), this.f172003c));
        } catch (Throwable th) {
            EmptyDisposable.error(th, tVar);
        }
    }

    public C68570d(AbstractC68307f<T> fVar, Callable<? extends U> callable, AbstractC68310b<? super U, ? super T> bVar) {
        this.f172001a = fVar;
        this.f172002b = callable;
        this.f172003c = bVar;
    }
}
