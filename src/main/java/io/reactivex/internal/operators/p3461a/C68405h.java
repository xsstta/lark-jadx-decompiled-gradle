package io.reactivex.internal.operators.p3461a;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.a.h */
public final class C68405h extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC68293e f171734a;

    /* renamed from: b */
    final Scheduler f171735b;

    /* renamed from: io.reactivex.internal.operators.a.h$a */
    static final class RunnableC68406a extends AtomicReference<Disposable> implements AbstractC68273c, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final AbstractC68273c downstream;
        final AbstractC68293e source;
        final SequentialDisposable task = new SequentialDisposable();

        @Override // io.reactivex.AbstractC68273c
        public void onComplete() {
            this.downstream.onComplete();
        }

        public void run() {
            this.source.mo237885a(this);
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

        @Override // io.reactivex.AbstractC68273c
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC68273c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        RunnableC68406a(AbstractC68273c cVar, AbstractC68293e eVar) {
            this.downstream = cVar;
            this.source = eVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        RunnableC68406a aVar = new RunnableC68406a(cVar, this.f171734a);
        cVar.onSubscribe(aVar);
        aVar.task.replace(this.f171735b.scheduleDirect(aVar));
    }

    public C68405h(AbstractC68293e eVar, Scheduler scheduler) {
        this.f171734a = eVar;
        this.f171735b = scheduler;
    }
}
