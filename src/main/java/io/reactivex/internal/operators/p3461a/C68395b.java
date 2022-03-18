package io.reactivex.internal.operators.p3461a;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68270b;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68278d;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68313e;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.a.b */
public final class C68395b extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC68278d f171717a;

    /* renamed from: io.reactivex.internal.operators.a.b$a */
    static final class C68396a extends AtomicReference<Disposable> implements AbstractC68270b, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final AbstractC68273c downstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.AbstractC68270b
        public void onComplete() {
            Disposable disposable;
            if (get() != DisposableHelper.DISPOSED && (disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            }
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        C68396a(AbstractC68273c cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.AbstractC68270b
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        public void setCancellable(AbstractC68313e eVar) {
            setDisposable(new CancellableDisposable(eVar));
        }

        public boolean tryOnError(Throwable th) {
            Disposable disposable;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        }
    }

    public C68395b(AbstractC68278d dVar) {
        this.f171717a = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        C68396a aVar = new C68396a(cVar);
        cVar.onSubscribe(aVar);
        try {
            this.f171717a.mo165291a(aVar);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            aVar.onError(th);
        }
    }
}
