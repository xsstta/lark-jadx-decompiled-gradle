package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;

/* renamed from: io.reactivex.internal.operators.maybe.d */
public final class C68640d<T, R> extends AbstractC68635a<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends R> f172105b;

    /* renamed from: io.reactivex.internal.operators.maybe.d$a */
    static final class C68641a<T, R> implements Disposable, AbstractC68989k<T> {

        /* renamed from: a */
        final AbstractC68989k<? super R> f172106a;

        /* renamed from: b */
        final Function<? super T, ? extends R> f172107b;

        /* renamed from: c */
        Disposable f172108c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172108c.isDisposed();
        }

        @Override // io.reactivex.AbstractC68989k
        public void onComplete() {
            this.f172106a.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f172108c;
            this.f172108c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.AbstractC68989k
        public void onError(Throwable th) {
            this.f172106a.onError(th);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172108c, disposable)) {
                this.f172108c = disposable;
                this.f172106a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSuccess(T t) {
            try {
                this.f172106a.onSuccess(C68362b.m265229a(this.f172107b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f172106a.onError(th);
            }
        }

        C68641a(AbstractC68989k<? super R> kVar, Function<? super T, ? extends R> function) {
            this.f172106a = kVar;
            this.f172107b = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super R> kVar) {
        this.f172096a.mo238772a(new C68641a(kVar, this.f172105b));
    }

    public C68640d(AbstractC68990l<T> lVar, Function<? super T, ? extends R> function) {
        super(lVar);
        this.f172105b = function;
    }
}
