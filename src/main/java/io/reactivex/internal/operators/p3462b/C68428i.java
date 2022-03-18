package io.reactivex.internal.operators.p3462b;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.b.i */
public final class C68428i<T, R> extends Observable<R> {

    /* renamed from: a */
    final AbstractC69015w<T> f171768a;

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f171769b;

    /* renamed from: io.reactivex.internal.operators.b.i$a */
    static final class C68429a<T, R> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<R>, AbstractC69012t<T> {
        private static final long serialVersionUID = -8948264376121066672L;
        final AbstractC69009q<? super R> downstream;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69012t, io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.AbstractC69012t, io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                ((ObservableSource) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.downstream.onError(th);
            }
        }

        C68429a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.downstream = qVar;
            this.mapper = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        C68429a aVar = new C68429a(qVar, this.f171769b);
        qVar.onSubscribe(aVar);
        this.f171768a.subscribe(aVar);
    }

    public C68428i(AbstractC69015w<T> wVar, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.f171768a = wVar;
        this.f171769b = function;
    }
}
