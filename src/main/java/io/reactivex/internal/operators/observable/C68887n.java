package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.AbstractC68387k;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.observers.C69004d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.n */
public final class C68887n<T, U extends Collection<? super T>, B> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Callable<? extends ObservableSource<B>> f172757b;

    /* renamed from: c */
    final Callable<U> f172758c;

    /* renamed from: io.reactivex.internal.operators.observable.n$b */
    static final class C68889b<T, U extends Collection<? super T>, B> extends AbstractC68387k<T, U, U> implements Disposable, AbstractC69009q<T> {

        /* renamed from: g */
        final Callable<U> f172761g;

        /* renamed from: h */
        final Callable<? extends ObservableSource<B>> f172762h;

        /* renamed from: i */
        Disposable f172763i;

        /* renamed from: j */
        final AtomicReference<Disposable> f172764j = new AtomicReference<>();

        /* renamed from: k */
        U f172765k;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo238579f() {
            DisposableHelper.dispose(this.f172764j);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f171708c) {
                this.f171708c = true;
                this.f172763i.dispose();
                mo238579f();
                if (mo238131c()) {
                    this.f171707b.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            io.reactivex.internal.util.C68987k.m265582a(r3.f171707b, r3.f171706a, false, r3, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r3.f171707b.offer(r0);
            r3.f171709d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo238131c() == false) goto L_?;
         */
        @Override // io.reactivex.AbstractC69009q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.f172765k     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f172765k = r1     // Catch:{ all -> 0x0022 }
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                io.reactivex.internal.b.i r1 = r3.f171707b
                r1.offer(r0)
                r0 = 1
                r3.f171709d = r0
                boolean r0 = r3.mo238131c()
                if (r0 == 0) goto L_0x0021
                io.reactivex.internal.b.i r0 = r3.f171707b
                io.reactivex.q r1 = r3.f171706a
                r2 = 0
                io.reactivex.internal.util.C68987k.m265582a(r0, r1, r2, r3, r3)
            L_0x0021:
                return
            L_0x0022:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68887n.C68889b.onComplete():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo238580g() {
            try {
                U u = (U) ((Collection) C68362b.m265229a((Object) this.f172761g.call(), "The buffer supplied is null"));
                try {
                    ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172762h.call(), "The boundary ObservableSource supplied is null");
                    C68888a aVar = new C68888a(this);
                    if (DisposableHelper.replace(this.f172764j, aVar)) {
                        synchronized (this) {
                            U u2 = this.f172765k;
                            if (u2 != null) {
                                this.f172765k = u;
                                observableSource.subscribe(aVar);
                                mo238127a(u2, false, this);
                            }
                        }
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171708c = true;
                    this.f172763i.dispose();
                    this.f171706a.onError(th);
                }
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                dispose();
                this.f171706a.onError(th2);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            dispose();
            this.f171706a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f172765k;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172763i, disposable)) {
                this.f172763i = disposable;
                AbstractC69009q qVar = this.f171706a;
                try {
                    this.f172765k = (U) ((Collection) C68362b.m265229a((Object) this.f172761g.call(), "The buffer supplied is null"));
                    try {
                        ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.f172762h.call(), "The boundary ObservableSource supplied is null");
                        C68888a aVar = new C68888a(this);
                        this.f172764j.set(aVar);
                        qVar.onSubscribe(this);
                        if (!this.f171708c) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.f171708c = true;
                        disposable.dispose();
                        EmptyDisposable.error(th, qVar);
                    }
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    this.f171708c = true;
                    disposable.dispose();
                    EmptyDisposable.error(th2, qVar);
                }
            }
        }

        /* renamed from: a */
        public void mo238126a(AbstractC69009q<? super U> qVar, U u) {
            this.f171706a.onNext(u);
        }

        C68889b(AbstractC69009q<? super U> qVar, Callable<U> callable, Callable<? extends ObservableSource<B>> callable2) {
            super(qVar, new C68924a());
            this.f172761g = callable;
            this.f172762h = callable2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.n$a */
    public static final class C68888a<T, U extends Collection<? super T>, B> extends AbstractC69002b<B> {

        /* renamed from: a */
        final C68889b<T, U, B> f172759a;

        /* renamed from: b */
        boolean f172760b;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172760b) {
                this.f172760b = true;
                this.f172759a.mo238580g();
            }
        }

        C68888a(C68889b<T, U, B> bVar) {
            this.f172759a = bVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172760b) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172760b = true;
            this.f172759a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(B b) {
            if (!this.f172760b) {
                this.f172760b = true;
                dispose();
                this.f172759a.mo238580g();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        this.f172123a.subscribe(new C68889b(new C69004d(qVar), this.f172758c, this.f172757b));
    }

    public C68887n(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        super(observableSource);
        this.f172757b = callable;
        this.f172758c = callable2;
    }
}
