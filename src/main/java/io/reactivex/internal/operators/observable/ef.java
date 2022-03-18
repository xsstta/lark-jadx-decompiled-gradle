package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.AbstractC68387k;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.C69004d;
import io.reactivex.p3457e.C68300e;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ef<T> extends AbstractC68651a<T, Observable<T>> {

    /* renamed from: b */
    final long f172649b;

    /* renamed from: c */
    final long f172650c;

    /* renamed from: d */
    final TimeUnit f172651d;

    /* renamed from: e */
    final Scheduler f172652e;

    /* renamed from: f */
    final long f172653f;

    /* renamed from: g */
    final int f172654g;

    /* renamed from: h */
    final boolean f172655h;

    /* renamed from: io.reactivex.internal.operators.observable.ef$a */
    static final class C68854a<T> extends AbstractC68387k<T, Object, Observable<T>> implements Disposable {

        /* renamed from: g */
        final long f172656g;

        /* renamed from: h */
        final TimeUnit f172657h;

        /* renamed from: i */
        final Scheduler f172658i;

        /* renamed from: j */
        final int f172659j;

        /* renamed from: k */
        final boolean f172660k;

        /* renamed from: l */
        final long f172661l;

        /* renamed from: m */
        final Scheduler.AbstractC68257c f172662m;

        /* renamed from: n */
        long f172663n;

        /* renamed from: o */
        long f172664o;

        /* renamed from: p */
        Disposable f172665p;

        /* renamed from: q */
        C68300e<T> f172666q;

        /* renamed from: r */
        volatile boolean f172667r;

        /* renamed from: s */
        final AtomicReference<Disposable> f172668s = new AtomicReference<>();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171708c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo238542f() {
            DisposableHelper.dispose(this.f172668s);
            Scheduler.AbstractC68257c cVar = this.f172662m;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.ef$a$a */
        public static final class RunnableC68855a implements Runnable {

            /* renamed from: a */
            final long f172669a;

            /* renamed from: b */
            final C68854a<?> f172670b;

            public void run() {
                C68854a<?> aVar = this.f172670b;
                if (!aVar.f171708c) {
                    aVar.f171707b.offer(this);
                } else {
                    aVar.f172667r = true;
                    aVar.mo238542f();
                }
                if (aVar.mo238131c()) {
                    aVar.mo238543g();
                }
            }

            RunnableC68855a(long j, C68854a<?> aVar) {
                this.f172669a = j;
                this.f172670b = aVar;
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f171709d = true;
            if (mo238131c()) {
                mo238543g();
            }
            this.f171706a.onComplete();
            mo238542f();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.q */
        /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: io.reactivex.q */
        /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: io.reactivex.e.e */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo238543g() {
            boolean z;
            C68924a aVar = (C68924a) this.f171707b;
            AbstractC69009q qVar = this.f171706a;
            C68300e<T> eVar = this.f172666q;
            int i = 1;
            while (!this.f172667r) {
                boolean z2 = this.f171709d;
                Object poll = aVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof RunnableC68855a;
                if (z2 && (z || z3)) {
                    this.f172666q = null;
                    aVar.clear();
                    mo238542f();
                    Throwable th = this.f171710e;
                    if (th != null) {
                        eVar.onError(th);
                        return;
                    } else {
                        eVar.onComplete();
                        return;
                    }
                } else if (z) {
                    i = mo238125a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    RunnableC68855a aVar2 = (RunnableC68855a) poll;
                    if (this.f172660k || this.f172664o == aVar2.f172669a) {
                        eVar.onComplete();
                        this.f172663n = 0;
                        eVar = (C68300e<T>) C68300e.m265059a(this.f172659j);
                        this.f172666q = eVar;
                        qVar.onNext(eVar);
                    }
                } else {
                    eVar.onNext(NotificationLite.getValue(poll));
                    long j = this.f172663n + 1;
                    if (j >= this.f172661l) {
                        this.f172664o++;
                        this.f172663n = 0;
                        eVar.onComplete();
                        eVar = (C68300e<T>) C68300e.m265059a(this.f172659j);
                        this.f172666q = eVar;
                        this.f171706a.onNext(eVar);
                        if (this.f172660k) {
                            Disposable disposable = this.f172668s.get();
                            disposable.dispose();
                            Scheduler.AbstractC68257c cVar = this.f172662m;
                            RunnableC68855a aVar3 = new RunnableC68855a(this.f172664o, this);
                            long j2 = this.f172656g;
                            Disposable a = cVar.mo237796a(aVar3, j2, j2, this.f172657h);
                            if (!this.f172668s.compareAndSet(disposable, a)) {
                                a.dispose();
                            }
                        }
                    } else {
                        this.f172663n = j;
                    }
                }
            }
            this.f172665p.dispose();
            aVar.clear();
            mo238542f();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f171710e = th;
            this.f171709d = true;
            if (mo238131c()) {
                mo238543g();
            }
            this.f171706a.onError(th);
            mo238542f();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.internal.b.i */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172667r) {
                if (mo238132d()) {
                    C68300e<T> eVar = this.f172666q;
                    eVar.onNext(t);
                    long j = this.f172663n + 1;
                    if (j >= this.f172661l) {
                        this.f172664o++;
                        this.f172663n = 0;
                        eVar.onComplete();
                        C68300e<T> a = C68300e.m265059a(this.f172659j);
                        this.f172666q = a;
                        this.f171706a.onNext(a);
                        if (this.f172660k) {
                            this.f172668s.get().dispose();
                            Scheduler.AbstractC68257c cVar = this.f172662m;
                            RunnableC68855a aVar = new RunnableC68855a(this.f172664o, this);
                            long j2 = this.f172656g;
                            DisposableHelper.replace(this.f172668s, cVar.mo237796a(aVar, j2, j2, this.f172657h));
                        }
                    } else {
                        this.f172663n = j;
                    }
                    if (mo238125a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f171707b.offer(NotificationLite.next(t));
                    if (!mo238131c()) {
                        return;
                    }
                }
                mo238543g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            Disposable disposable2;
            if (DisposableHelper.validate(this.f172665p, disposable)) {
                this.f172665p = disposable;
                AbstractC69009q qVar = this.f171706a;
                qVar.onSubscribe(this);
                if (!this.f171708c) {
                    C68300e<T> a = C68300e.m265059a(this.f172659j);
                    this.f172666q = a;
                    qVar.onNext(a);
                    RunnableC68855a aVar = new RunnableC68855a(this.f172664o, this);
                    if (this.f172660k) {
                        Scheduler.AbstractC68257c cVar = this.f172662m;
                        long j = this.f172656g;
                        disposable2 = cVar.mo237796a(aVar, j, j, this.f172657h);
                    } else {
                        Scheduler scheduler = this.f172658i;
                        long j2 = this.f172656g;
                        disposable2 = scheduler.schedulePeriodicallyDirect(aVar, j2, j2, this.f172657h);
                    }
                    DisposableHelper.replace(this.f172668s, disposable2);
                }
            }
        }

        C68854a(AbstractC69009q<? super Observable<T>> qVar, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(qVar, new C68924a());
            this.f172656g = j;
            this.f172657h = timeUnit;
            this.f172658i = scheduler;
            this.f172659j = i;
            this.f172661l = j2;
            this.f172660k = z;
            if (z) {
                this.f172662m = scheduler.createWorker();
            } else {
                this.f172662m = null;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ef$b */
    static final class RunnableC68856b<T> extends AbstractC68387k<T, Object, Observable<T>> implements Disposable, AbstractC69009q<T>, Runnable {

        /* renamed from: n */
        static final Object f172671n = new Object();

        /* renamed from: g */
        final long f172672g;

        /* renamed from: h */
        final TimeUnit f172673h;

        /* renamed from: i */
        final Scheduler f172674i;

        /* renamed from: j */
        final int f172675j;

        /* renamed from: k */
        Disposable f172676k;

        /* renamed from: l */
        C68300e<T> f172677l;

        /* renamed from: m */
        final AtomicReference<Disposable> f172678m = new AtomicReference<>();

        /* renamed from: o */
        volatile boolean f172679o;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171708c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo238545f() {
            DisposableHelper.dispose(this.f172678m);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f171709d = true;
            if (mo238131c()) {
                mo238546g();
            }
            mo238545f();
            this.f171706a.onComplete();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            if (this.f171708c) {
                this.f172679o = true;
                mo238545f();
            }
            this.f171707b.offer(f172671n);
            if (mo238131c()) {
                mo238546g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.q */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: io.reactivex.e.e */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo238546g() {
            C68924a aVar = (C68924a) this.f171707b;
            AbstractC69009q qVar = this.f171706a;
            C68300e<T> eVar = this.f172677l;
            int i = 1;
            while (true) {
                boolean z = this.f172679o;
                boolean z2 = this.f171709d;
                Object poll = aVar.poll();
                if (!z2 || !(poll == null || poll == f172671n)) {
                    if (poll == null) {
                        i = mo238125a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == f172671n) {
                        eVar.onComplete();
                        if (!z) {
                            eVar = (C68300e<T>) C68300e.m265059a(this.f172675j);
                            this.f172677l = eVar;
                            qVar.onNext(eVar);
                        } else {
                            this.f172676k.dispose();
                        }
                    } else {
                        eVar.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
            this.f172677l = null;
            aVar.clear();
            mo238545f();
            Throwable th = this.f171710e;
            if (th != null) {
                eVar.onError(th);
            } else {
                eVar.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f171710e = th;
            this.f171709d = true;
            if (mo238131c()) {
                mo238546g();
            }
            mo238545f();
            this.f171706a.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172679o) {
                if (mo238132d()) {
                    this.f172677l.onNext(t);
                    if (mo238125a(-1) == 0) {
                        return;
                    }
                } else {
                    this.f171707b.offer(NotificationLite.next(t));
                    if (!mo238131c()) {
                        return;
                    }
                }
                mo238546g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172676k, disposable)) {
                this.f172676k = disposable;
                this.f172677l = C68300e.m265059a(this.f172675j);
                AbstractC69009q qVar = this.f171706a;
                qVar.onSubscribe(this);
                qVar.onNext(this.f172677l);
                if (!this.f171708c) {
                    Scheduler scheduler = this.f172674i;
                    long j = this.f172672g;
                    DisposableHelper.replace(this.f172678m, scheduler.schedulePeriodicallyDirect(this, j, j, this.f172673h));
                }
            }
        }

        RunnableC68856b(AbstractC69009q<? super Observable<T>> qVar, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(qVar, new C68924a());
            this.f172672g = j;
            this.f172673h = timeUnit;
            this.f172674i = scheduler;
            this.f172675j = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ef$c */
    static final class RunnableC68857c<T> extends AbstractC68387k<T, Object, Observable<T>> implements Disposable, Runnable {

        /* renamed from: g */
        final long f172680g;

        /* renamed from: h */
        final long f172681h;

        /* renamed from: i */
        final TimeUnit f172682i;

        /* renamed from: j */
        final Scheduler.AbstractC68257c f172683j;

        /* renamed from: k */
        final int f172684k;

        /* renamed from: l */
        final List<C68300e<T>> f172685l = new LinkedList();

        /* renamed from: m */
        Disposable f172686m;

        /* renamed from: n */
        volatile boolean f172687n;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171708c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.ef$c$a */
        public final class RunnableC68858a implements Runnable {

            /* renamed from: b */
            private final C68300e<T> f172689b;

            public void run() {
                RunnableC68857c.this.mo238548a(this.f172689b);
            }

            RunnableC68858a(C68300e<T> eVar) {
                this.f172689b = eVar;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo238549f() {
            this.f172683j.dispose();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f171709d = true;
            if (mo238131c()) {
                mo238550g();
            }
            this.f171706a.onComplete();
            mo238549f();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            C68859b bVar = new C68859b(C68300e.m265059a(this.f172684k), true);
            if (!this.f171708c) {
                this.f171707b.offer(bVar);
            }
            if (mo238131c()) {
                mo238550g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo238550g() {
            boolean z;
            C68924a aVar = (C68924a) this.f171707b;
            AbstractC69009q qVar = this.f171706a;
            List<C68300e<T>> list = this.f172685l;
            int i = 1;
            while (!this.f172687n) {
                boolean z2 = this.f171709d;
                T t = (T) aVar.poll();
                if (t == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = t instanceof C68859b;
                if (z2 && (z || z3)) {
                    aVar.clear();
                    Throwable th = this.f171710e;
                    if (th != null) {
                        for (C68300e<T> eVar : list) {
                            eVar.onError(th);
                        }
                    } else {
                        for (C68300e<T> eVar2 : list) {
                            eVar2.onComplete();
                        }
                    }
                    mo238549f();
                    list.clear();
                    return;
                } else if (z) {
                    i = mo238125a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    T t2 = t;
                    if (!t2.f172691b) {
                        list.remove(t2.f172690a);
                        t2.f172690a.onComplete();
                        if (list.isEmpty() && this.f171708c) {
                            this.f172687n = true;
                        }
                    } else if (!this.f171708c) {
                        C68300e<T> a = C68300e.m265059a(this.f172684k);
                        list.add(a);
                        qVar.onNext(a);
                        this.f172683j.mo44779a(new RunnableC68858a(a), this.f172680g, this.f172682i);
                    }
                } else {
                    for (C68300e<T> eVar3 : list) {
                        eVar3.onNext(t);
                    }
                }
            }
            this.f172686m.dispose();
            mo238549f();
            aVar.clear();
            list.clear();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238548a(C68300e<T> eVar) {
            this.f171707b.offer(new C68859b(eVar, false));
            if (mo238131c()) {
                mo238550g();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f171710e = th;
            this.f171709d = true;
            if (mo238131c()) {
                mo238550g();
            }
            this.f171706a.onError(th);
            mo238549f();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (mo238132d()) {
                for (C68300e<T> eVar : this.f172685l) {
                    eVar.onNext(t);
                }
                if (mo238125a(-1) == 0) {
                    return;
                }
            } else {
                this.f171707b.offer(t);
                if (!mo238131c()) {
                    return;
                }
            }
            mo238550g();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172686m, disposable)) {
                this.f172686m = disposable;
                this.f171706a.onSubscribe(this);
                if (!this.f171708c) {
                    C68300e<T> a = C68300e.m265059a(this.f172684k);
                    this.f172685l.add(a);
                    this.f171706a.onNext(a);
                    this.f172683j.mo44779a(new RunnableC68858a(a), this.f172680g, this.f172682i);
                    Scheduler.AbstractC68257c cVar = this.f172683j;
                    long j = this.f172681h;
                    cVar.mo237796a(this, j, j, this.f172682i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.ef$c$b */
        public static final class C68859b<T> {

            /* renamed from: a */
            final C68300e<T> f172690a;

            /* renamed from: b */
            final boolean f172691b;

            C68859b(C68300e<T> eVar, boolean z) {
                this.f172690a = eVar;
                this.f172691b = z;
            }
        }

        RunnableC68857c(AbstractC69009q<? super Observable<T>> qVar, long j, long j2, TimeUnit timeUnit, Scheduler.AbstractC68257c cVar, int i) {
            super(qVar, new C68924a());
            this.f172680g = j;
            this.f172681h = j2;
            this.f172682i = timeUnit;
            this.f172683j = cVar;
            this.f172684k = i;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Observable<T>> qVar) {
        C69004d dVar = new C69004d(qVar);
        if (this.f172649b != this.f172650c) {
            this.f172123a.subscribe(new RunnableC68857c(dVar, this.f172649b, this.f172650c, this.f172651d, this.f172652e.createWorker(), this.f172654g));
        } else if (this.f172653f == Long.MAX_VALUE) {
            this.f172123a.subscribe(new RunnableC68856b(dVar, this.f172649b, this.f172651d, this.f172652e, this.f172654g));
        } else {
            this.f172123a.subscribe(new C68854a(dVar, this.f172649b, this.f172651d, this.f172652e, this.f172654g, this.f172653f, this.f172655h));
        }
    }

    public ef(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(observableSource);
        this.f172649b = j;
        this.f172650c = j2;
        this.f172651d = timeUnit;
        this.f172652e = scheduler;
        this.f172653f = j3;
        this.f172654g = i;
        this.f172655h = z;
    }
}
