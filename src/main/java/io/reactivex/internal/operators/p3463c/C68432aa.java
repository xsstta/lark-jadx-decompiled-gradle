package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.aa */
public final class C68432aa<T, R> extends AbstractC68988j<R> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171772a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68990l<? extends R>> f171773b;

    /* renamed from: io.reactivex.internal.operators.c.aa$b */
    static final class C68434b<T, R> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = -5843758257109742742L;
        final AbstractC68989k<? super R> downstream;
        final Function<? super T, ? extends AbstractC68990l<? extends R>> mapper;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                AbstractC68990l lVar = (AbstractC68990l) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    lVar.mo238772a(new C68433a(this, this.downstream));
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                onError(th);
            }
        }

        C68434b(AbstractC68989k<? super R> kVar, Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
            this.downstream = kVar;
            this.mapper = function;
        }
    }

    /* renamed from: io.reactivex.internal.operators.c.aa$a */
    static final class C68433a<R> implements AbstractC68989k<R> {

        /* renamed from: a */
        final AtomicReference<Disposable> f171774a;

        /* renamed from: b */
        final AbstractC68989k<? super R> f171775b;

        @Override // io.reactivex.AbstractC68989k
        public void onComplete() {
            this.f171775b.onComplete();
        }

        @Override // io.reactivex.AbstractC68989k
        public void onError(Throwable th) {
            this.f171775b.onError(th);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f171774a, disposable);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSuccess(R r) {
            this.f171775b.onSuccess(r);
        }

        C68433a(AtomicReference<Disposable> atomicReference, AbstractC68989k<? super R> kVar) {
            this.f171774a = atomicReference;
            this.f171775b = kVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super R> kVar) {
        this.f171772a.subscribe(new C68434b(kVar, this.f171773b));
    }

    public C68432aa(AbstractC69015w<? extends T> wVar, Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        this.f171773b = function;
        this.f171772a = wVar;
    }
}
