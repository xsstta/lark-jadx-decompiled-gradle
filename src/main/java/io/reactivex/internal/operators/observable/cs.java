package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68983g;
import io.reactivex.p3457e.AbstractC68299d;
import io.reactivex.p3457e.C68296b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class cs<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super Observable<Throwable>, ? extends ObservableSource<?>> f172449b;

    /* renamed from: io.reactivex.internal.operators.observable.cs$a */
    static final class C68780a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final AbstractC69009q<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final C68780a<T>.C68781a inner = new C68781a();
        final AbstractC68299d<Throwable> signaller;
        final ObservableSource<T> source;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        public void innerNext() {
            subscribeNext();
        }

        /* renamed from: io.reactivex.internal.operators.observable.cs$a$a */
        final class C68781a extends AtomicReference<Disposable> implements AbstractC69009q<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                C68780a.this.innerComplete();
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68781a() {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                C68780a.this.innerError(th);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(Object obj) {
                C68780a.this.innerNext();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.inner);
        }

        /* access modifiers changed from: package-private */
        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            C68983g.m265564a(this.downstream, this, this.error);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            DisposableHelper.dispose(this.inner);
            C68983g.m265564a(this.downstream, this, this.error);
        }

        /* access modifiers changed from: package-private */
        public void subscribeNext() {
            if (this.wip.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68983g.m265562a((AbstractC69009q) this.downstream, (Object) t, (AtomicInteger) this, this.error);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.upstream, disposable);
        }

        /* access modifiers changed from: package-private */
        public void innerError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.replace(this.upstream, null);
            this.active = false;
            this.signaller.onNext(th);
        }

        C68780a(AbstractC69009q<? super T> qVar, AbstractC68299d<Throwable> dVar, ObservableSource<T> observableSource) {
            this.downstream = qVar;
            this.signaller = dVar;
            this.source = observableSource;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        AbstractC68299d<T> c = C68296b.m265052a().mo237960c();
        try {
            ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172449b.apply(c), "The handler returned a null ObservableSource");
            C68780a aVar = new C68780a(qVar, c, this.f172123a);
            qVar.onSubscribe(aVar);
            observableSource.subscribe(aVar.inner);
            aVar.subscribeNext();
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }

    public cs(ObservableSource<T> observableSource, Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f172449b = function;
    }
}
