package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* renamed from: io.reactivex.internal.operators.observable.ai */
public final class C68674ai<T> extends AbstractC68651a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.ai$a */
    static final class C68675a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        AbstractC69009q<? super T> f172180a;

        /* renamed from: b */
        Disposable f172181b;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172181b.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f172181b;
            this.f172181b = EmptyComponent.INSTANCE;
            this.f172180a = EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            AbstractC69009q<? super T> qVar = this.f172180a;
            this.f172181b = EmptyComponent.INSTANCE;
            this.f172180a = EmptyComponent.asObserver();
            qVar.onComplete();
        }

        C68675a(AbstractC69009q<? super T> qVar) {
            this.f172180a = qVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172180a.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            AbstractC69009q<? super T> qVar = this.f172180a;
            this.f172181b = EmptyComponent.INSTANCE;
            this.f172180a = EmptyComponent.asObserver();
            qVar.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172181b, disposable)) {
                this.f172181b = disposable;
                this.f172180a.onSubscribe(this);
            }
        }
    }

    public C68674ai(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68675a(qVar));
    }
}
