package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.plugins.RxJavaPlugins;

public final class am<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68309a f172194b;

    /* renamed from: io.reactivex.internal.operators.observable.am$a */
    static final class C68679a<T> extends BasicIntQueueDisposable<T> implements AbstractC69009q<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final AbstractC69009q<? super T> downstream;
        final AbstractC68309a onFinally;
        AbstractC68368e<T> qd;
        boolean syncFused;
        Disposable upstream;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.qd.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T poll = this.qd.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof AbstractC68368e) {
                    this.qd = (AbstractC68368e) disposable;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            AbstractC68368e<T> eVar = this.qd;
            boolean z = false;
            if (eVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = eVar.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        C68679a(AbstractC69009q<? super T> qVar, AbstractC68309a aVar) {
            this.downstream = qVar;
            this.onFinally = aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68679a(qVar, this.f172194b));
    }

    public am(ObservableSource<T> observableSource, AbstractC68309a aVar) {
        super(observableSource);
        this.f172194b = aVar;
    }
}
