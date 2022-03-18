package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.AbstractC68387k;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.observers.C69004d;
import io.reactivex.p3457e.C68300e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ed<T, B, V> extends AbstractC68651a<T, Observable<T>> {

    /* renamed from: b */
    final ObservableSource<B> f172628b;

    /* renamed from: c */
    final Function<? super B, ? extends ObservableSource<V>> f172629c;

    /* renamed from: d */
    final int f172630d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ed$c */
    public static final class C68849c<T, B, V> extends AbstractC68387k<T, Object, Observable<T>> implements Disposable {

        /* renamed from: g */
        final ObservableSource<B> f172635g;

        /* renamed from: h */
        final Function<? super B, ? extends ObservableSource<V>> f172636h;

        /* renamed from: i */
        final int f172637i;

        /* renamed from: j */
        final C68289a f172638j;

        /* renamed from: k */
        Disposable f172639k;

        /* renamed from: l */
        final AtomicReference<Disposable> f172640l = new AtomicReference<>();

        /* renamed from: m */
        final List<C68300e<T>> f172641m;

        /* renamed from: n */
        final AtomicLong f172642n;

        @Override // io.reactivex.internal.observers.AbstractC68387k, io.reactivex.internal.util.AbstractC68984h
        /* renamed from: a */
        public void mo238126a(AbstractC69009q<? super Observable<T>> qVar, Object obj) {
        }

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
        public void mo238534f() {
            this.f172638j.dispose();
            DisposableHelper.dispose(this.f172640l);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f171709d) {
                this.f171709d = true;
                if (mo238131c()) {
                    mo238535g();
                }
                if (this.f172642n.decrementAndGet() == 0) {
                    this.f172638j.dispose();
                }
                this.f171706a.onComplete();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo238535g() {
            boolean z;
            C68924a aVar = (C68924a) this.f171707b;
            AbstractC69009q qVar = this.f171706a;
            List<C68300e<T>> list = this.f172641m;
            int i = 1;
            while (true) {
                boolean z2 = this.f171709d;
                Object poll = aVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    mo238534f();
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
                    list.clear();
                    return;
                } else if (z) {
                    i = mo238125a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C68850d) {
                    C68850d dVar = (C68850d) poll;
                    if (dVar.f172643a != null) {
                        if (list.remove(dVar.f172643a)) {
                            dVar.f172643a.onComplete();
                            if (this.f172642n.decrementAndGet() == 0) {
                                mo238534f();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f171708c) {
                        C68300e<T> a = C68300e.m265059a(this.f172637i);
                        list.add(a);
                        qVar.onNext(a);
                        try {
                            ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172636h.apply(dVar.f172644b), "The ObservableSource supplied is null");
                            C68847a aVar2 = new C68847a(this, a);
                            if (this.f172638j.mo237937a(aVar2)) {
                                this.f172642n.getAndIncrement();
                                observableSource.subscribe(aVar2);
                            }
                        } catch (Throwable th2) {
                            C68306a.m265071b(th2);
                            this.f171708c = true;
                            qVar.onError(th2);
                        }
                    }
                } else {
                    for (C68300e<T> eVar3 : list) {
                        eVar3.onNext((T) NotificationLite.getValue(poll));
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238533a(Throwable th) {
            this.f172639k.dispose();
            this.f172638j.dispose();
            onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238531a(C68847a<T, V> aVar) {
            this.f172638j.mo237941c(aVar);
            this.f171707b.offer(new C68850d(aVar.f172632b, null));
            if (mo238131c()) {
                mo238535g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo238532a(B b) {
            this.f171707b.offer(new C68850d(null, b));
            if (mo238131c()) {
                mo238535g();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f171709d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f171710e = th;
            this.f171709d = true;
            if (mo238131c()) {
                mo238535g();
            }
            if (this.f172642n.decrementAndGet() == 0) {
                this.f172638j.dispose();
            }
            this.f171706a.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.internal.b.i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (mo238132d()) {
                for (C68300e<T> eVar : this.f172641m) {
                    eVar.onNext(t);
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
            mo238535g();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172639k, disposable)) {
                this.f172639k = disposable;
                this.f171706a.onSubscribe(this);
                if (!this.f171708c) {
                    C68848b bVar = new C68848b(this);
                    if (this.f172640l.compareAndSet(null, bVar)) {
                        this.f172642n.getAndIncrement();
                        this.f172635g.subscribe(bVar);
                    }
                }
            }
        }

        C68849c(AbstractC69009q<? super Observable<T>> qVar, ObservableSource<B> observableSource, Function<? super B, ? extends ObservableSource<V>> function, int i) {
            super(qVar, new C68924a());
            AtomicLong atomicLong = new AtomicLong();
            this.f172642n = atomicLong;
            this.f172635g = observableSource;
            this.f172636h = function;
            this.f172637i = i;
            this.f172638j = new C68289a();
            this.f172641m = new ArrayList();
            atomicLong.lazySet(1);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ed$b */
    static final class C68848b<T, B> extends AbstractC69002b<B> {

        /* renamed from: a */
        final C68849c<T, B, ?> f172634a;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172634a.onComplete();
        }

        C68848b(C68849c<T, B, ?> cVar) {
            this.f172634a = cVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172634a.mo238533a(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(B b) {
            this.f172634a.mo238532a((Object) b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ed$a */
    public static final class C68847a<T, V> extends AbstractC69002b<V> {

        /* renamed from: a */
        final C68849c<T, ?, V> f172631a;

        /* renamed from: b */
        final C68300e<T> f172632b;

        /* renamed from: c */
        boolean f172633c;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172633c) {
                this.f172633c = true;
                this.f172631a.mo238531a((C68847a) this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(V v) {
            dispose();
            onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172633c) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172633c = true;
            this.f172631a.mo238533a(th);
        }

        C68847a(C68849c<T, ?, V> cVar, C68300e<T> eVar) {
            this.f172631a = cVar;
            this.f172632b = eVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Observable<T>> qVar) {
        this.f172123a.subscribe(new C68849c(new C69004d(qVar), this.f172628b, this.f172629c, this.f172630d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ed$d */
    public static final class C68850d<T, B> {

        /* renamed from: a */
        final C68300e<T> f172643a;

        /* renamed from: b */
        final B f172644b;

        C68850d(C68300e<T> eVar, B b) {
            this.f172643a = eVar;
            this.f172644b = b;
        }
    }

    public ed(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i) {
        super(observableSource);
        this.f172628b = observableSource2;
        this.f172629c = function;
        this.f172630d = i;
    }
}
