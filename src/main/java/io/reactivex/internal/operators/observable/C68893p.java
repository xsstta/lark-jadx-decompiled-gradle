package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.AbstractC68387k;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.internal.util.C68987k;
import io.reactivex.observers.C69004d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.p */
public final class C68893p<T, U extends Collection<? super T>> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final long f172774b;

    /* renamed from: c */
    final long f172775c;

    /* renamed from: d */
    final TimeUnit f172776d;

    /* renamed from: e */
    final Scheduler f172777e;

    /* renamed from: f */
    final Callable<U> f172778f;

    /* renamed from: g */
    final int f172779g;

    /* renamed from: h */
    final boolean f172780h;

    /* renamed from: io.reactivex.internal.operators.observable.p$a */
    static final class RunnableC68894a<T, U extends Collection<? super T>> extends AbstractC68387k<T, U, U> implements Disposable, Runnable {

        /* renamed from: g */
        final Callable<U> f172781g;

        /* renamed from: h */
        final long f172782h;

        /* renamed from: i */
        final TimeUnit f172783i;

        /* renamed from: j */
        final int f172784j;

        /* renamed from: k */
        final boolean f172785k;

        /* renamed from: l */
        final Scheduler.AbstractC68257c f172786l;

        /* renamed from: m */
        U f172787m;

        /* renamed from: n */
        Disposable f172788n;

        /* renamed from: o */
        Disposable f172789o;

        /* renamed from: p */
        long f172790p;

        /* renamed from: q */
        long f172791q;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f171708c) {
                this.f171708c = true;
                this.f172789o.dispose();
                this.f172786l.dispose();
                synchronized (this) {
                    this.f172787m = null;
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            U u;
            this.f172786l.dispose();
            synchronized (this) {
                u = this.f172787m;
                this.f172787m = null;
            }
            this.f171707b.offer(u);
            this.f171709d = true;
            if (mo238131c()) {
                C68987k.m265582a(this.f171707b, this.f171706a, false, this, this);
            }
        }

        public void run() {
            try {
                U u = (U) ((Collection) C68362b.m265229a((Object) this.f172781g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    U u2 = this.f172787m;
                    if (u2 != null) {
                        if (this.f172790p == this.f172791q) {
                            this.f172787m = u;
                            mo238129b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                dispose();
                this.f171706a.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            synchronized (this) {
                this.f172787m = null;
            }
            this.f171706a.onError(th);
            this.f172786l.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172789o, disposable)) {
                this.f172789o = disposable;
                try {
                    this.f172787m = (U) ((Collection) C68362b.m265229a((Object) this.f172781g.call(), "The buffer supplied is null"));
                    this.f171706a.onSubscribe(this);
                    Scheduler.AbstractC68257c cVar = this.f172786l;
                    long j = this.f172782h;
                    this.f172788n = cVar.mo237796a(this, j, j, this.f172783i);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.f171706a);
                    this.f172786l.dispose();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f172785k == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f172788n.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo238129b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (U) ((java.util.Collection) io.reactivex.internal.p3459a.C68362b.m265229a((java.lang.Object) r7.f172781g.call(), "The buffer supplied is null"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f172787m = r8;
            r7.f172791q++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            if (r7.f172785k == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r0 = r7.f172786l;
            r4 = r7.f172782h;
            r7.f172788n = r0.mo237796a(r7, r4, r4, r7.f172783i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
            io.reactivex.exceptions.C68306a.m265071b(r8);
            r7.f171706a.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        @Override // io.reactivex.AbstractC69009q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r8) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68893p.RunnableC68894a.onNext(java.lang.Object):void");
        }

        /* renamed from: a */
        public void mo238126a(AbstractC69009q<? super U> qVar, U u) {
            qVar.onNext(u);
        }

        RunnableC68894a(AbstractC69009q<? super U> qVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.AbstractC68257c cVar) {
            super(qVar, new C68924a());
            this.f172781g = callable;
            this.f172782h = j;
            this.f172783i = timeUnit;
            this.f172784j = i;
            this.f172785k = z;
            this.f172786l = cVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p$c */
    static final class RunnableC68896c<T, U extends Collection<? super T>> extends AbstractC68387k<T, U, U> implements Disposable, Runnable {

        /* renamed from: g */
        final Callable<U> f172799g;

        /* renamed from: h */
        final long f172800h;

        /* renamed from: i */
        final long f172801i;

        /* renamed from: j */
        final TimeUnit f172802j;

        /* renamed from: k */
        final Scheduler.AbstractC68257c f172803k;

        /* renamed from: l */
        final List<U> f172804l = new LinkedList();

        /* renamed from: m */
        Disposable f172805m;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo238588f() {
            synchronized (this) {
                this.f172804l.clear();
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.p$c$a */
        final class RunnableC68897a implements Runnable {

            /* renamed from: b */
            private final U f172807b;

            public void run() {
                synchronized (RunnableC68896c.this) {
                    RunnableC68896c.this.f172804l.remove(this.f172807b);
                }
                RunnableC68896c cVar = RunnableC68896c.this;
                cVar.mo238129b(this.f172807b, false, cVar.f172803k);
            }

            RunnableC68897a(U u) {
                this.f172807b = u;
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.p$c$b */
        final class RunnableC68898b implements Runnable {

            /* renamed from: b */
            private final U f172809b;

            public void run() {
                synchronized (RunnableC68896c.this) {
                    RunnableC68896c.this.f172804l.remove(this.f172809b);
                }
                RunnableC68896c cVar = RunnableC68896c.this;
                cVar.mo238129b(this.f172809b, false, cVar.f172803k);
            }

            RunnableC68898b(U u) {
                this.f172809b = u;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f171708c) {
                this.f171708c = true;
                mo238588f();
                this.f172805m.dispose();
                this.f172803k.dispose();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f172804l);
                this.f172804l.clear();
            }
            for (Collection collection : arrayList) {
                this.f171707b.offer(collection);
            }
            this.f171709d = true;
            if (mo238131c()) {
                C68987k.m265582a(this.f171707b, this.f171706a, false, this.f172803k, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.List<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            if (!this.f171708c) {
                try {
                    Collection collection = (Collection) C68362b.m265229a((Object) this.f172799g.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (!this.f171708c) {
                            this.f172804l.add(collection);
                            this.f172803k.mo44779a(new RunnableC68897a(collection), this.f172800h, this.f172802j);
                        }
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171706a.onError(th);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f171709d = true;
            mo238588f();
            this.f171706a.onError(th);
            this.f172803k.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            synchronized (this) {
                for (U u : this.f172804l) {
                    u.add(t);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: java.util.List<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172805m, disposable)) {
                this.f172805m = disposable;
                try {
                    Collection collection = (Collection) C68362b.m265229a((Object) this.f172799g.call(), "The buffer supplied is null");
                    this.f172804l.add(collection);
                    this.f171706a.onSubscribe(this);
                    Scheduler.AbstractC68257c cVar = this.f172803k;
                    long j = this.f172801i;
                    cVar.mo237796a(this, j, j, this.f172802j);
                    this.f172803k.mo44779a(new RunnableC68898b(collection), this.f172800h, this.f172802j);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.f171706a);
                    this.f172803k.dispose();
                }
            }
        }

        /* renamed from: a */
        public void mo238126a(AbstractC69009q<? super U> qVar, U u) {
            qVar.onNext(u);
        }

        RunnableC68896c(AbstractC69009q<? super U> qVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar) {
            super(qVar, new C68924a());
            this.f172799g = callable;
            this.f172800h = j;
            this.f172801i = j2;
            this.f172802j = timeUnit;
            this.f172803k = cVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.p$b */
    static final class RunnableC68895b<T, U extends Collection<? super T>> extends AbstractC68387k<T, U, U> implements Disposable, Runnable {

        /* renamed from: g */
        final Callable<U> f172792g;

        /* renamed from: h */
        final long f172793h;

        /* renamed from: i */
        final TimeUnit f172794i;

        /* renamed from: j */
        final Scheduler f172795j;

        /* renamed from: k */
        Disposable f172796k;

        /* renamed from: l */
        U f172797l;

        /* renamed from: m */
        final AtomicReference<Disposable> f172798m = new AtomicReference<>();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.f172798m);
            this.f172796k.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172798m.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f172797l;
                this.f172797l = null;
            }
            if (u != null) {
                this.f171707b.offer(u);
                this.f171709d = true;
                if (mo238131c()) {
                    C68987k.m265582a(this.f171707b, this.f171706a, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f172798m);
        }

        public void run() {
            U u;
            try {
                U u2 = (U) ((Collection) C68362b.m265229a((Object) this.f172792g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    u = this.f172797l;
                    if (u != null) {
                        this.f172797l = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.dispose(this.f172798m);
                } else {
                    mo238127a(u, false, this);
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171706a.onError(th);
                dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f172797l;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            synchronized (this) {
                this.f172797l = null;
            }
            this.f171706a.onError(th);
            DisposableHelper.dispose(this.f172798m);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172796k, disposable)) {
                this.f172796k = disposable;
                try {
                    this.f172797l = (U) ((Collection) C68362b.m265229a((Object) this.f172792g.call(), "The buffer supplied is null"));
                    this.f171706a.onSubscribe(this);
                    if (!this.f171708c) {
                        Scheduler scheduler = this.f172795j;
                        long j = this.f172793h;
                        Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.f172794i);
                        if (!this.f172798m.compareAndSet(null, schedulePeriodicallyDirect)) {
                            schedulePeriodicallyDirect.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    dispose();
                    EmptyDisposable.error(th, this.f171706a);
                }
            }
        }

        /* renamed from: a */
        public void mo238126a(AbstractC69009q<? super U> qVar, U u) {
            this.f171706a.onNext(u);
        }

        RunnableC68895b(AbstractC69009q<? super U> qVar, Callable<U> callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(qVar, new C68924a());
            this.f172792g = callable;
            this.f172793h = j;
            this.f172794i = timeUnit;
            this.f172795j = scheduler;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        if (this.f172774b == this.f172775c && this.f172779g == Integer.MAX_VALUE) {
            this.f172123a.subscribe(new RunnableC68895b(new C69004d(qVar), this.f172778f, this.f172774b, this.f172776d, this.f172777e));
            return;
        }
        Scheduler.AbstractC68257c createWorker = this.f172777e.createWorker();
        if (this.f172774b == this.f172775c) {
            this.f172123a.subscribe(new RunnableC68894a(new C69004d(qVar), this.f172778f, this.f172774b, this.f172776d, this.f172779g, this.f172780h, createWorker));
        } else {
            this.f172123a.subscribe(new RunnableC68896c(new C69004d(qVar), this.f172778f, this.f172774b, this.f172775c, this.f172776d, createWorker));
        }
    }

    public C68893p(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.f172774b = j;
        this.f172775c = j2;
        this.f172776d = timeUnit;
        this.f172777e = scheduler;
        this.f172778f = callable;
        this.f172779g = i;
        this.f172780h = z;
    }
}
