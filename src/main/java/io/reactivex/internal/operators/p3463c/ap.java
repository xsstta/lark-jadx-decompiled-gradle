package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.ap */
public final class ap<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171810a;

    /* renamed from: b */
    final Scheduler f171811b;

    /* renamed from: io.reactivex.internal.operators.c.ap$a */
    static final class RunnableC68453a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T>, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final AbstractC69012t<? super T> downstream;
        final AbstractC69015w<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        public void run() {
            this.source.subscribe(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        RunnableC68453a(AbstractC69012t<? super T> tVar, AbstractC69015w<? extends T> wVar) {
            this.downstream = tVar;
            this.source = wVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        RunnableC68453a aVar = new RunnableC68453a(tVar, this.f171810a);
        tVar.onSubscribe(aVar);
        aVar.task.replace(this.f171811b.scheduleDirect(aVar));
    }

    public ap(AbstractC69015w<? extends T> wVar, Scheduler scheduler) {
        this.f171810a = wVar;
        this.f171811b = scheduler;
    }
}
