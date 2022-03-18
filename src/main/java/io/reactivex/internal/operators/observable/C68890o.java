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
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.o */
public final class C68890o<T, U extends Collection<? super T>, B> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final ObservableSource<B> f172766b;

    /* renamed from: c */
    final Callable<U> f172767c;

    /* renamed from: io.reactivex.internal.operators.observable.o$b */
    static final class C68892b<T, U extends Collection<? super T>, B> extends AbstractC68387k<T, U, U> implements Disposable, AbstractC69009q<T> {

        /* renamed from: g */
        final Callable<U> f172769g;

        /* renamed from: h */
        final ObservableSource<B> f172770h;

        /* renamed from: i */
        Disposable f172771i;

        /* renamed from: j */
        Disposable f172772j;

        /* renamed from: k */
        U f172773k;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171708c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f171708c) {
                this.f171708c = true;
                this.f172772j.dispose();
                this.f172771i.dispose();
                if (mo238131c()) {
                    this.f171707b.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo238582f() {
            try {
                U u = (U) ((Collection) C68362b.m265229a((Object) this.f172769g.call(), "The buffer supplied is null"));
                synchronized (this) {
                    U u2 = this.f172773k;
                    if (u2 != null) {
                        this.f172773k = u;
                        mo238127a(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                dispose();
                this.f171706a.onError(th);
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
                U extends java.util.Collection<? super T> r0 = r3.f172773k     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f172773k = r1     // Catch:{ all -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68890o.C68892b.onComplete():void");
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            dispose();
            this.f171706a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f172773k;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172771i, disposable)) {
                this.f172771i = disposable;
                try {
                    this.f172773k = (U) ((Collection) C68362b.m265229a((Object) this.f172769g.call(), "The buffer supplied is null"));
                    C68891a aVar = new C68891a(this);
                    this.f172772j = aVar;
                    this.f171706a.onSubscribe(this);
                    if (!this.f171708c) {
                        this.f172770h.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171708c = true;
                    disposable.dispose();
                    EmptyDisposable.error(th, this.f171706a);
                }
            }
        }

        /* renamed from: a */
        public void mo238126a(AbstractC69009q<? super U> qVar, U u) {
            this.f171706a.onNext(u);
        }

        C68892b(AbstractC69009q<? super U> qVar, Callable<U> callable, ObservableSource<B> observableSource) {
            super(qVar, new C68924a());
            this.f172769g = callable;
            this.f172770h = observableSource;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    static final class C68891a<T, U extends Collection<? super T>, B> extends AbstractC69002b<B> {

        /* renamed from: a */
        final C68892b<T, U, B> f172768a;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172768a.onComplete();
        }

        C68891a(C68892b<T, U, B> bVar) {
            this.f172768a = bVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172768a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(B b) {
            this.f172768a.mo238582f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        this.f172123a.subscribe(new C68892b(new C69004d(qVar), this.f172767c, this.f172766b));
    }

    public C68890o(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Callable<U> callable) {
        super(observableSource);
        this.f172766b = observableSource2;
        this.f172767c = callable;
    }
}
