package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class aw<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68293e> f172242b;

    /* renamed from: c */
    final boolean f172243c;

    /* renamed from: io.reactivex.internal.operators.observable.aw$a */
    static final class C68688a<T> extends BasicIntQueueDisposable<T> implements AbstractC69009q<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final AbstractC69009q<? super T> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends AbstractC68293e> mapper;
        final C68289a set = new C68289a();
        Disposable upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return i & 2;
        }

        /* renamed from: io.reactivex.internal.operators.observable.aw$a$a */
        final class C68689a extends AtomicReference<Disposable> implements AbstractC68273c, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC68273c
            public void onComplete() {
                C68688a.this.innerComplete(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            @Override // io.reactivex.AbstractC68273c
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68689a() {
            }

            @Override // io.reactivex.AbstractC68273c
            public void onError(Throwable th) {
                C68688a.this.innerError(this, th);
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
        public void innerComplete(C68688a<T>.C68689a aVar) {
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
                C68689a aVar = new C68689a();
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
        public void innerError(C68688a<T>.C68689a aVar, Throwable th) {
            this.set.mo237941c(aVar);
            onError(th);
        }

        C68688a(AbstractC69009q<? super T> qVar, Function<? super T, ? extends AbstractC68293e> function, boolean z) {
            this.downstream = qVar;
            this.mapper = function;
            this.delayErrors = z;
            lazySet(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68688a(qVar, this.f172242b, this.f172243c));
    }

    public aw(ObservableSource<T> observableSource, Function<? super T, ? extends AbstractC68293e> function, boolean z) {
        super(observableSource);
        this.f172242b = function;
        this.f172243c = z;
    }
}
