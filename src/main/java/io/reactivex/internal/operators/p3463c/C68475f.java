package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.operators.c.f */
public final class C68475f<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171850a;

    /* renamed from: b */
    final long f171851b;

    /* renamed from: c */
    final TimeUnit f171852c;

    /* renamed from: d */
    final Scheduler f171853d;

    /* renamed from: e */
    final boolean f171854e;

    /* renamed from: io.reactivex.internal.operators.c.f$a */
    final class C68476a implements AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171855a;

        /* renamed from: c */
        private final SequentialDisposable f171857c;

        /* renamed from: io.reactivex.internal.operators.c.f$a$a */
        final class RunnableC68477a implements Runnable {

            /* renamed from: b */
            private final Throwable f171859b;

            public void run() {
                C68476a.this.f171855a.onError(this.f171859b);
            }

            RunnableC68477a(Throwable th) {
                this.f171859b = th;
            }
        }

        /* renamed from: io.reactivex.internal.operators.c.f$a$b */
        final class RunnableC68478b implements Runnable {

            /* renamed from: b */
            private final T f171861b;

            public void run() {
                C68476a.this.f171855a.onSuccess(this.f171861b);
            }

            RunnableC68478b(T t) {
                this.f171861b = t;
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171857c.replace(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171857c.replace(C68475f.this.f171853d.scheduleDirect(new RunnableC68478b(t), C68475f.this.f171851b, C68475f.this.f171852c));
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            long j;
            SequentialDisposable sequentialDisposable = this.f171857c;
            Scheduler scheduler = C68475f.this.f171853d;
            RunnableC68477a aVar = new RunnableC68477a(th);
            if (C68475f.this.f171854e) {
                j = C68475f.this.f171851b;
            } else {
                j = 0;
            }
            sequentialDisposable.replace(scheduler.scheduleDirect(aVar, j, C68475f.this.f171852c));
        }

        C68476a(SequentialDisposable sequentialDisposable, AbstractC69012t<? super T> tVar) {
            this.f171857c = sequentialDisposable;
            this.f171855a = tVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        tVar.onSubscribe(sequentialDisposable);
        this.f171850a.subscribe(new C68476a(sequentialDisposable, tVar));
    }

    public C68475f(AbstractC69015w<? extends T> wVar, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f171850a = wVar;
        this.f171851b = j;
        this.f171852c = timeUnit;
        this.f171853d = scheduler;
        this.f171854e = z;
    }
}
