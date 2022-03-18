package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.x */
public final class C68513x<T> extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC69015w<T> f171921a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68293e> f171922b;

    /* renamed from: io.reactivex.internal.operators.c.x$a */
    static final class C68514a<T> extends AtomicReference<Disposable> implements AbstractC68273c, Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = -2177128922851101253L;
        final AbstractC68273c downstream;
        final Function<? super T, ? extends AbstractC68293e> mapper;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC68273c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                AbstractC68293e eVar = (AbstractC68293e) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    eVar.mo237885a(this);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                onError(th);
            }
        }

        C68514a(AbstractC68273c cVar, Function<? super T, ? extends AbstractC68293e> function) {
            this.downstream = cVar;
            this.mapper = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        C68514a aVar = new C68514a(cVar, this.f171922b);
        cVar.onSubscribe(aVar);
        this.f171921a.subscribe(aVar);
    }

    public C68513x(AbstractC69015w<T> wVar, Function<? super T, ? extends AbstractC68293e> function) {
        this.f171921a = wVar;
        this.f171922b = function;
    }
}
