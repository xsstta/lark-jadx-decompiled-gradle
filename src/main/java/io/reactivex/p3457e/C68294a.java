package io.reactivex.p3457e;

import io.reactivex.AbstractC69009q;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68975a;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: io.reactivex.e.a */
public final class C68294a<T> extends AbstractC68299d<T> {

    /* renamed from: c */
    static final C68295a[] f171594c = new C68295a[0];

    /* renamed from: d */
    static final C68295a[] f171595d = new C68295a[0];

    /* renamed from: j */
    private static final Object[] f171596j = new Object[0];

    /* renamed from: a */
    final AtomicReference<Object> f171597a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<C68295a<T>[]> f171598b = new AtomicReference<>(f171594c);

    /* renamed from: e */
    final ReadWriteLock f171599e;

    /* renamed from: f */
    final Lock f171600f;

    /* renamed from: g */
    final Lock f171601g;

    /* renamed from: h */
    final AtomicReference<Throwable> f171602h = new AtomicReference<>();

    /* renamed from: i */
    long f171603i;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.e.a$a */
    public static final class C68295a<T> implements Disposable, C68975a.AbstractC68976a<Object> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f171604a;

        /* renamed from: b */
        final C68294a<T> f171605b;

        /* renamed from: c */
        boolean f171606c;

        /* renamed from: d */
        boolean f171607d;

        /* renamed from: e */
        C68975a<Object> f171608e;

        /* renamed from: f */
        boolean f171609f;

        /* renamed from: g */
        volatile boolean f171610g;

        /* renamed from: h */
        long f171611h;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171610g;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f171610g) {
                this.f171610g = true;
                this.f171605b.mo237948b((C68295a) this);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo238757a((io.reactivex.internal.util.C68975a.AbstractC68976a<? super java.lang.Object>) r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo237952b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f171610g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f171608e     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f171607d = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f171608e = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo238757a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.p3457e.C68294a.C68295a.mo237952b():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo237952b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo237950a() {
            /*
                r4 = this;
                boolean r0 = r4.f171610g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f171610g     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f171606c     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                io.reactivex.e.a<T> r0 = r4.f171605b     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f171600f     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f171603i     // Catch:{ all -> 0x003e }
                r4.f171611h = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f171597a     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f171607d = r2     // Catch:{ all -> 0x003e }
                r4.f171606c = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo237952b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.p3457e.C68294a.C68295a.mo237950a():void");
        }

        @Override // io.reactivex.internal.util.C68975a.AbstractC68976a, io.reactivex.functions.AbstractC68322n
        public boolean test(Object obj) {
            if (this.f171610g || NotificationLite.accept(obj, this.f171604a)) {
                return true;
            }
            return false;
        }

        C68295a(AbstractC69009q<? super T> qVar, C68294a<T> aVar) {
            this.f171604a = qVar;
            this.f171605b = aVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f171609f = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo237951a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f171610g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f171609f
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f171610g     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f171611h     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f171607d     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.internal.util.a<java.lang.Object> r5 = r3.f171608e     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.internal.util.a r5 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f171608e = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo238758a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f171606c = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f171609f = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.p3457e.C68294a.C68295a.mo237951a(java.lang.Object, long):void");
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C68294a<T> m265043a() {
        return new C68294a<>();
    }

    /* renamed from: b */
    public T mo237947b() {
        Object obj = this.f171597a.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    C68294a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f171599e = reentrantReadWriteLock;
        this.f171600f = reentrantReadWriteLock.readLock();
        this.f171601g = reentrantReadWriteLock.writeLock();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (this.f171602h.compareAndSet(null, C68981f.f172984a)) {
            Object complete = NotificationLite.complete();
            for (C68295a<T> aVar : mo237946a(complete)) {
                aVar.mo237951a(complete, this.f171603i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C68295a<T>[] mo237946a(Object obj) {
        AtomicReference<C68295a<T>[]> atomicReference = this.f171598b;
        C68295a<T>[] aVarArr = f171595d;
        C68295a<T>[] andSet = atomicReference.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            mo237949b(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (this.f171602h.get() != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237945a(C68295a<T> aVar) {
        C68295a<T>[] aVarArr;
        C68295a<T>[] aVarArr2;
        do {
            aVarArr = this.f171598b.get();
            if (aVarArr == f171595d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C68295a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f171598b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo237948b(C68295a<T> aVar) {
        C68295a<T>[] aVarArr;
        C68295a<T>[] aVarArr2;
        do {
            aVarArr = this.f171598b.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f171594c;
                    } else {
                        C68295a<T>[] aVarArr3 = new C68295a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f171598b.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        C68362b.m265229a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f171602h.compareAndSet(null, th)) {
            RxJavaPlugins.onError(th);
            return;
        }
        Object error = NotificationLite.error(th);
        for (C68295a<T> aVar : mo237946a(error)) {
            aVar.mo237951a(error, this.f171603i);
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        C68362b.m265229a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f171602h.get() == null) {
            Object next = NotificationLite.next(t);
            mo237949b(next);
            for (C68295a<T> aVar : this.f171598b.get()) {
                aVar.mo237951a(next, this.f171603i);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68295a<T> aVar = new C68295a<>(qVar, this);
        qVar.onSubscribe(aVar);
        if (!mo237945a((C68295a) aVar)) {
            Throwable th = this.f171602h.get();
            if (th == C68981f.f172984a) {
                qVar.onComplete();
            } else {
                qVar.onError(th);
            }
        } else if (aVar.f171610g) {
            mo237948b((C68295a) aVar);
        } else {
            aVar.mo237950a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo237949b(Object obj) {
        this.f171601g.lock();
        this.f171603i++;
        this.f171597a.lazySet(obj);
        this.f171601g.unlock();
    }
}
