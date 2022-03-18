package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p3456d.C68288b;
import java.util.concurrent.TimeUnit;

public final class dt<T> extends AbstractC68651a<T, C68288b<T>> {

    /* renamed from: b */
    final Scheduler f172575b;

    /* renamed from: c */
    final TimeUnit f172576c;

    /* renamed from: io.reactivex.internal.operators.observable.dt$a */
    static final class C68824a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super C68288b<T>> f172577a;

        /* renamed from: b */
        final TimeUnit f172578b;

        /* renamed from: c */
        final Scheduler f172579c;

        /* renamed from: d */
        long f172580d;

        /* renamed from: e */
        Disposable f172581e;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172581e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172581e.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172577a.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172577a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long now = this.f172579c.now(this.f172578b);
            long j = this.f172580d;
            this.f172580d = now;
            this.f172577a.onNext(new C68288b(t, now - j, this.f172578b));
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172581e, disposable)) {
                this.f172581e = disposable;
                this.f172580d = this.f172579c.now(this.f172578b);
                this.f172577a.onSubscribe(this);
            }
        }

        C68824a(AbstractC69009q<? super C68288b<T>> qVar, TimeUnit timeUnit, Scheduler scheduler) {
            this.f172577a = qVar;
            this.f172579c = scheduler;
            this.f172578b = timeUnit;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super C68288b<T>> qVar) {
        this.f172123a.subscribe(new C68824a(qVar, this.f172576c, this.f172575b));
    }

    public dt(ObservableSource<T> observableSource, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f172575b = scheduler;
        this.f172576c = timeUnit;
    }
}
