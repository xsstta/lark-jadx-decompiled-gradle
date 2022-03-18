package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68983g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bx<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68293e f172363b;

    /* renamed from: io.reactivex.internal.operators.observable.bx$a */
    static final class C68735a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -4592979584110982903L;
        final AbstractC69009q<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
        volatile boolean mainDone;
        volatile boolean otherDone;
        final C68736a otherObserver = new C68736a(this);

        /* renamed from: io.reactivex.internal.operators.observable.bx$a$a */
        static final class C68736a extends AtomicReference<Disposable> implements AbstractC68273c {
            private static final long serialVersionUID = -2935427570954647017L;
            final C68735a<?> parent;

            @Override // io.reactivex.AbstractC68273c
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.AbstractC68273c
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68736a(C68735a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC68273c
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                C68983g.m265564a(this.downstream, this, this.error);
            }
        }

        /* access modifiers changed from: package-private */
        public void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                C68983g.m265564a(this.downstream, this, this.error);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68983g.m265562a((AbstractC69009q) this.downstream, (Object) t, (AtomicInteger) this, this.error);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.mainDisposable, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.mainDisposable);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        /* access modifiers changed from: package-private */
        public void otherError(Throwable th) {
            DisposableHelper.dispose(this.mainDisposable);
            C68983g.m265563a((AbstractC69009q<?>) this.downstream, th, (AtomicInteger) this, this.error);
        }

        C68735a(AbstractC69009q<? super T> qVar) {
            this.downstream = qVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68735a aVar = new C68735a(qVar);
        qVar.onSubscribe(aVar);
        this.f172123a.subscribe(aVar);
        this.f172363b.mo237885a(aVar.otherObserver);
    }

    public bx(Observable<T> observable, AbstractC68293e eVar) {
        super(observable);
        this.f172363b = eVar;
    }
}
