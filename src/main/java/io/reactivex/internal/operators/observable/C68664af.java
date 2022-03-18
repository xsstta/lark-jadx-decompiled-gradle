package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C69004d;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.operators.observable.af */
public final class C68664af<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172153b;

    /* renamed from: c */
    final TimeUnit f172154c;

    /* renamed from: d */
    final Scheduler f172155d;

    /* renamed from: e */
    final boolean f172156e;

    /* renamed from: io.reactivex.internal.operators.observable.af$a */
    static final class C68665a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172157a;

        /* renamed from: b */
        final long f172158b;

        /* renamed from: c */
        final TimeUnit f172159c;

        /* renamed from: d */
        final Scheduler.AbstractC68257c f172160d;

        /* renamed from: e */
        final boolean f172161e;

        /* renamed from: f */
        Disposable f172162f;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172160d.isDisposed();
        }

        /* renamed from: io.reactivex.internal.operators.observable.af$a$c */
        final class RunnableC68668c implements Runnable {

            /* renamed from: b */
            private final T f172167b;

            public void run() {
                C68665a.this.f172157a.onNext(this.f172167b);
            }

            RunnableC68668c(T t) {
                this.f172167b = t;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172162f.dispose();
            this.f172160d.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172160d.mo44779a(new RunnableC68666a(), this.f172158b, this.f172159c);
        }

        /* renamed from: io.reactivex.internal.operators.observable.af$a$a */
        final class RunnableC68666a implements Runnable {
            public void run() {
                try {
                    C68665a.this.f172157a.onComplete();
                } finally {
                    C68665a.this.f172160d.dispose();
                }
            }

            RunnableC68666a() {
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.af$a$b */
        final class RunnableC68667b implements Runnable {

            /* renamed from: b */
            private final Throwable f172165b;

            public void run() {
                try {
                    C68665a.this.f172157a.onError(this.f172165b);
                } finally {
                    C68665a.this.f172160d.dispose();
                }
            }

            RunnableC68667b(Throwable th) {
                this.f172165b = th;
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172160d.mo44779a(new RunnableC68668c(t), this.f172158b, this.f172159c);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172162f, disposable)) {
                this.f172162f = disposable;
                this.f172157a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            long j;
            Scheduler.AbstractC68257c cVar = this.f172160d;
            RunnableC68667b bVar = new RunnableC68667b(th);
            if (this.f172161e) {
                j = this.f172158b;
            } else {
                j = 0;
            }
            cVar.mo44779a(bVar, j, this.f172159c);
        }

        C68665a(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar, boolean z) {
            this.f172157a = qVar;
            this.f172158b = j;
            this.f172159c = timeUnit;
            this.f172160d = cVar;
            this.f172161e = z;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C69004d dVar;
        if (this.f172156e) {
            dVar = qVar;
        } else {
            dVar = new C69004d(qVar);
        }
        this.f172123a.subscribe(new C68665a(dVar, this.f172153b, this.f172154c, this.f172155d.createWorker(), this.f172156e));
    }

    public C68664af(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observableSource);
        this.f172153b = j;
        this.f172154c = timeUnit;
        this.f172155d = scheduler;
        this.f172156e = z;
    }
}
