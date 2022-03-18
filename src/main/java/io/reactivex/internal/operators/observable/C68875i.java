package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.i */
public final class C68875i<T> extends AbstractC68651a<T, Boolean> {

    /* renamed from: b */
    final AbstractC68322n<? super T> f172734b;

    /* renamed from: io.reactivex.internal.operators.observable.i$a */
    static final class C68876a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super Boolean> f172735a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172736b;

        /* renamed from: c */
        Disposable f172737c;

        /* renamed from: d */
        boolean f172738d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172737c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172737c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172738d) {
                this.f172738d = true;
                this.f172735a.onNext(false);
                this.f172735a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172737c, disposable)) {
                this.f172737c = disposable;
                this.f172735a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172738d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172738d = true;
            this.f172735a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172738d) {
                try {
                    if (this.f172736b.test(t)) {
                        this.f172738d = true;
                        this.f172737c.dispose();
                        this.f172735a.onNext(true);
                        this.f172735a.onComplete();
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172737c.dispose();
                    onError(th);
                }
            }
        }

        C68876a(AbstractC69009q<? super Boolean> qVar, AbstractC68322n<? super T> nVar) {
            this.f172735a = qVar;
            this.f172736b = nVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Boolean> qVar) {
        this.f172123a.subscribe(new C68876a(qVar, this.f172734b));
    }

    public C68875i(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        super(observableSource);
        this.f172734b = nVar;
    }
}
