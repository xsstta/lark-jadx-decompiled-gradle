package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.C68290b;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.android.schedulers.a */
final class C68267a extends Scheduler {

    /* renamed from: a */
    private final Handler f171558a;

    /* renamed from: io.reactivex.android.schedulers.a$a */
    private static final class C68268a extends Scheduler.AbstractC68257c {

        /* renamed from: a */
        private final Handler f171559a;

        /* renamed from: b */
        private volatile boolean f171560b;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171560b;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171560b = true;
            this.f171559a.removeCallbacksAndMessages(this);
        }

        C68268a(Handler handler) {
            this.f171559a = handler;
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f171560b) {
                return C68290b.m265041b();
            }
            RunnableC68269b bVar = new RunnableC68269b(this.f171559a, RxJavaPlugins.onSchedule(runnable));
            Message obtain = Message.obtain(this.f171559a, bVar);
            obtain.obj = this;
            this.f171559a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f171560b) {
                return bVar;
            }
            this.f171559a.removeCallbacks(bVar);
            return C68290b.m265041b();
        }
    }

    /* renamed from: io.reactivex.android.schedulers.a$b */
    private static final class RunnableC68269b implements Disposable, Runnable {

        /* renamed from: a */
        private final Handler f171561a;

        /* renamed from: b */
        private final Runnable f171562b;

        /* renamed from: c */
        private volatile boolean f171563c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171563c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171563c = true;
            this.f171561a.removeCallbacks(this);
        }

        public void run() {
            try {
                this.f171562b.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }

        RunnableC68269b(Handler handler, Runnable runnable) {
            this.f171561a = handler;
            this.f171562b = runnable;
        }
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        return new C68268a(this.f171558a);
    }

    C68267a(Handler handler) {
        this.f171558a = handler;
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        RunnableC68269b bVar = new RunnableC68269b(this.f171558a, RxJavaPlugins.onSchedule(runnable));
        this.f171558a.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
