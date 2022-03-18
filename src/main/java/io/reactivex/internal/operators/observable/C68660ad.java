package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C69004d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.ad */
public final class C68660ad<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172141b;

    /* renamed from: c */
    final TimeUnit f172142c;

    /* renamed from: d */
    final Scheduler f172143d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ad$a */
    public static final class RunnableC68661a<T> extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final C68662b<T> parent;
        final T value;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.mo238324a(this.idx, this.value, this);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        RunnableC68661a(T t, long j, C68662b<T> bVar) {
            this.value = t;
            this.idx = j;
            this.parent = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ad$b */
    public static final class C68662b<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172144a;

        /* renamed from: b */
        final long f172145b;

        /* renamed from: c */
        final TimeUnit f172146c;

        /* renamed from: d */
        final Scheduler.AbstractC68257c f172147d;

        /* renamed from: e */
        Disposable f172148e;

        /* renamed from: f */
        Disposable f172149f;

        /* renamed from: g */
        volatile long f172150g;

        /* renamed from: h */
        boolean f172151h;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172147d.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172148e.dispose();
            this.f172147d.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172151h) {
                this.f172151h = true;
                Disposable disposable = this.f172149f;
                if (disposable != null) {
                    disposable.dispose();
                }
                RunnableC68661a aVar = (RunnableC68661a) disposable;
                if (aVar != null) {
                    aVar.run();
                }
                this.f172144a.onComplete();
                this.f172147d.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172148e, disposable)) {
                this.f172148e = disposable;
                this.f172144a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172151h) {
                RxJavaPlugins.onError(th);
                return;
            }
            Disposable disposable = this.f172149f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f172151h = true;
            this.f172144a.onError(th);
            this.f172147d.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172151h) {
                long j = this.f172150g + 1;
                this.f172150g = j;
                Disposable disposable = this.f172149f;
                if (disposable != null) {
                    disposable.dispose();
                }
                RunnableC68661a aVar = new RunnableC68661a(t, j, this);
                this.f172149f = aVar;
                aVar.setResource(this.f172147d.mo44779a(aVar, this.f172145b, this.f172146c));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238324a(long j, T t, RunnableC68661a<T> aVar) {
            if (j == this.f172150g) {
                this.f172144a.onNext(t);
                aVar.dispose();
            }
        }

        C68662b(AbstractC69009q<? super T> qVar, long j, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar) {
            this.f172144a = qVar;
            this.f172145b = j;
            this.f172146c = timeUnit;
            this.f172147d = cVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68662b(new C69004d(qVar), this.f172141b, this.f172142c, this.f172143d.createWorker()));
    }

    public C68660ad(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f172141b = j;
        this.f172142c = timeUnit;
        this.f172143d = scheduler;
    }
}
