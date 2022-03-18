package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68307f;
import io.reactivex.Scheduler;
import io.reactivex.disposables.C68290b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.C68981f;
import io.reactivex.p3455c.AbstractC68274a;
import io.reactivex.p3455c.C68276c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.k */
public class C68951k extends Scheduler implements Disposable {

    /* renamed from: a */
    static final Disposable f172930a = new C68959g();

    /* renamed from: b */
    static final Disposable f172931b = C68290b.m265041b();

    /* renamed from: c */
    private final Scheduler f172932c;

    /* renamed from: d */
    private final AbstractC68274a<AbstractC68307f<AbstractC68259a>> f172933d;

    /* renamed from: e */
    private Disposable f172934e;

    /* renamed from: io.reactivex.internal.schedulers.k$g */
    static final class C68959g implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return false;
        }

        C68959g() {
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.k$e */
    static final class C68957e extends Scheduler.AbstractC68257c {

        /* renamed from: a */
        private final AtomicBoolean f172940a = new AtomicBoolean();

        /* renamed from: b */
        private final AbstractC68274a<AbstractC68958f> f172941b;

        /* renamed from: c */
        private final Scheduler.AbstractC68257c f172942c;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172940a.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f172940a.compareAndSet(false, true)) {
                this.f172941b.onComplete();
                this.f172942c.dispose();
            }
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo237795a(Runnable runnable) {
            C68955c cVar = new C68955c(runnable);
            this.f172941b.onNext(cVar);
            return cVar;
        }

        C68957e(AbstractC68274a<AbstractC68958f> aVar, Scheduler.AbstractC68257c cVar) {
            this.f172941b = aVar;
            this.f172942c = cVar;
        }

        @Override // io.reactivex.Scheduler.AbstractC68257c
        /* renamed from: a */
        public Disposable mo44779a(Runnable runnable, long j, TimeUnit timeUnit) {
            C68954b bVar = new C68954b(runnable, j, timeUnit);
            this.f172941b.onNext(bVar);
            return bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.schedulers.k$f */
    public static abstract class AbstractC68958f extends AtomicReference<Disposable> implements Disposable {
        /* access modifiers changed from: protected */
        public abstract Disposable callActual(Scheduler.AbstractC68257c cVar, AbstractC68273c cVar2);

        AbstractC68958f() {
            super(C68951k.f172930a);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return ((Disposable) get()).isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable;
            Disposable disposable2 = C68951k.f172931b;
            do {
                disposable = (Disposable) get();
                if (disposable == C68951k.f172931b) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != C68951k.f172930a) {
                disposable.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void call(Scheduler.AbstractC68257c cVar, AbstractC68273c cVar2) {
            Disposable disposable = (Disposable) get();
            if (disposable != C68951k.f172931b && disposable == C68951k.f172930a) {
                Disposable callActual = callActual(cVar, cVar2);
                if (!compareAndSet(C68951k.f172930a, callActual)) {
                    callActual.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f172934e.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f172934e.isDisposed();
    }

    /* renamed from: io.reactivex.internal.schedulers.k$d */
    static class RunnableC68956d implements Runnable {

        /* renamed from: a */
        final AbstractC68273c f172938a;

        /* renamed from: b */
        final Runnable f172939b;

        public void run() {
            try {
                this.f172939b.run();
            } finally {
                this.f172938a.onComplete();
            }
        }

        RunnableC68956d(Runnable runnable, AbstractC68273c cVar) {
            this.f172939b = runnable;
            this.f172938a = cVar;
        }
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.AbstractC68257c createWorker() {
        Scheduler.AbstractC68257c createWorker = this.f172932c.createWorker();
        AbstractC68274a l = C68276c.m265013m().mo237904l();
        AbstractC68307f<AbstractC68259a> d = l.mo238020d(new C68952a(createWorker));
        C68957e eVar = new C68957e(l, createWorker);
        this.f172933d.onNext(d);
        return eVar;
    }

    /* renamed from: io.reactivex.internal.schedulers.k$a */
    static final class C68952a implements Function<AbstractC68958f, AbstractC68259a> {

        /* renamed from: a */
        final Scheduler.AbstractC68257c f172935a;

        C68952a(Scheduler.AbstractC68257c cVar) {
            this.f172935a = cVar;
        }

        /* renamed from: a */
        public AbstractC68259a apply(AbstractC68958f fVar) {
            return new C68953a(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.schedulers.k$a$a */
        public final class C68953a extends AbstractC68259a {

            /* renamed from: a */
            final AbstractC68958f f172936a;

            /* access modifiers changed from: protected */
            @Override // io.reactivex.AbstractC68259a
            /* renamed from: b */
            public void mo237889b(AbstractC68273c cVar) {
                cVar.onSubscribe(this.f172936a);
                this.f172936a.call(C68952a.this.f172935a, cVar);
            }

            C68953a(AbstractC68958f fVar) {
                this.f172936a = fVar;
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.k$c */
    static class C68955c extends AbstractC68958f {
        private final Runnable action;

        C68955c(Runnable runnable) {
            this.action = runnable;
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.internal.schedulers.C68951k.AbstractC68958f
        public Disposable callActual(Scheduler.AbstractC68257c cVar, AbstractC68273c cVar2) {
            return cVar.mo237795a(new RunnableC68956d(this.action, cVar2));
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.k$b */
    static class C68954b extends AbstractC68958f {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        /* access modifiers changed from: protected */
        @Override // io.reactivex.internal.schedulers.C68951k.AbstractC68958f
        public Disposable callActual(Scheduler.AbstractC68257c cVar, AbstractC68273c cVar2) {
            return cVar.mo44779a(new RunnableC68956d(this.action, cVar2), this.delayTime, this.unit);
        }

        C68954b(Runnable runnable, long j, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j;
            this.unit = timeUnit;
        }
    }

    public C68951k(Function<AbstractC68307f<AbstractC68307f<AbstractC68259a>>, AbstractC68259a> function, Scheduler scheduler) {
        this.f172932c = scheduler;
        AbstractC68274a<AbstractC68307f<AbstractC68259a>> l = C68276c.m265013m().mo237904l();
        this.f172933d = l;
        try {
            this.f172934e = function.apply(l).mo237888b();
        } catch (Throwable th) {
            throw C68981f.m265557a(th);
        }
    }
}
