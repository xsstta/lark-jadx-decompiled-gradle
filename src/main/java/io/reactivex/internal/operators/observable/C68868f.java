package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.f */
public final class C68868f<T> extends AbstractC68651a<T, Boolean> {

    /* renamed from: b */
    final AbstractC68322n<? super T> f172718b;

    /* renamed from: io.reactivex.internal.operators.observable.f$a */
    static final class C68869a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super Boolean> f172719a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172720b;

        /* renamed from: c */
        Disposable f172721c;

        /* renamed from: d */
        boolean f172722d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172721c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172721c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172722d) {
                this.f172722d = true;
                this.f172719a.onNext(true);
                this.f172719a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172721c, disposable)) {
                this.f172721c = disposable;
                this.f172719a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172722d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172722d = true;
            this.f172719a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172722d) {
                try {
                    if (!this.f172720b.test(t)) {
                        this.f172722d = true;
                        this.f172721c.dispose();
                        this.f172719a.onNext(false);
                        this.f172719a.onComplete();
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172721c.dispose();
                    onError(th);
                }
            }
        }

        C68869a(AbstractC69009q<? super Boolean> qVar, AbstractC68322n<? super T> nVar) {
            this.f172719a = qVar;
            this.f172720b = nVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Boolean> qVar) {
        this.f172123a.subscribe(new C68869a(qVar, this.f172718b));
    }

    public C68868f(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        super(observableSource);
        this.f172718b = nVar;
    }
}
