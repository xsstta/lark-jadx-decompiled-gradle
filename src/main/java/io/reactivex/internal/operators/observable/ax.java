package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ax<T> extends AbstractC68259a implements AbstractC68367d<T> {

    /* renamed from: a */
    final ObservableSource<T> f172244a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68293e> f172245b;

    /* renamed from: c */
    final boolean f172246c;

    /* renamed from: io.reactivex.internal.operators.observable.ax$a */
    static final class C68690a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final AbstractC68273c downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends AbstractC68293e> mapper;
        final C68289a set = new C68289a();
        Disposable upstream;

        /* renamed from: io.reactivex.internal.operators.observable.ax$a$a */
        final class C68691a extends AtomicReference<Disposable> implements AbstractC68273c, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC68273c
            public void onComplete() {
                C68690a.this.innerComplete(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            @Override // io.reactivex.AbstractC68273c
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68691a() {
            }

            @Override // io.reactivex.AbstractC68273c
            public void onError(Throwable th) {
                C68690a.this.innerError(this, th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable terminate = this.errors.terminate();
                if (terminate != null) {
                    this.downstream.onError(terminate);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void innerComplete(C68690a<T>.C68691a aVar) {
            this.set.mo237941c(aVar);
            onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (!this.delayErrors) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(this.errors.terminate());
                }
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            try {
                AbstractC68293e eVar = (AbstractC68293e) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C68691a aVar = new C68691a();
                if (!this.disposed && this.set.mo237937a(aVar)) {
                    eVar.mo237885a(aVar);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(C68690a<T>.C68691a aVar, Throwable th) {
            this.set.mo237941c(aVar);
            onError(th);
        }

        C68690a(AbstractC68273c cVar, Function<? super T, ? extends AbstractC68293e> function, boolean z) {
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z;
            lazySet(1);
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<T> cE_() {
        return RxJavaPlugins.onAssembly(new aw(this.f172244a, this.f172245b, this.f172246c));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        this.f172244a.subscribe(new C68690a(cVar, this.f172245b, this.f172246c));
    }

    public ax(ObservableSource<T> observableSource, Function<? super T, ? extends AbstractC68293e> function, boolean z) {
        this.f172244a = observableSource;
        this.f172245b = function;
        this.f172246c = z;
    }
}
