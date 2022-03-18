package io.reactivex.internal.operators.p3461a;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.a.f */
public final class C68401f extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC68293e f171722a;

    /* renamed from: b */
    final Scheduler f171723b;

    /* renamed from: io.reactivex.internal.operators.a.f$a */
    static final class RunnableC68402a extends AtomicReference<Disposable> implements AbstractC68273c, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final AbstractC68273c downstream;
        Throwable error;
        final Scheduler scheduler;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC68273c
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.AbstractC68273c
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // io.reactivex.AbstractC68273c
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        RunnableC68402a(AbstractC68273c cVar, Scheduler scheduler2) {
            this.downstream = cVar;
            this.scheduler = scheduler2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        this.f171722a.mo237885a(new RunnableC68402a(cVar, this.f171723b));
    }

    public C68401f(AbstractC68293e eVar, Scheduler scheduler) {
        this.f171722a = eVar;
        this.f171723b = scheduler;
    }
}
