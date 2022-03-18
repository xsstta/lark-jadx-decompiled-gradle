package io.reactivex.p3457e;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C68975a;
import io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.e.c */
final class C68298c<T> extends AbstractC68299d<T> implements C68975a.AbstractC68976a<Object> {

    /* renamed from: a */
    final AbstractC68299d<T> f171616a;

    /* renamed from: b */
    boolean f171617b;

    /* renamed from: c */
    C68975a<Object> f171618c;

    /* renamed from: d */
    volatile boolean f171619d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo237959a() {
        C68975a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f171618c;
                if (aVar == null) {
                    this.f171617b = false;
                    return;
                }
                this.f171618c = null;
            }
            aVar.mo238757a((C68975a.AbstractC68976a<? super Object>) this);
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.f171619d) {
            synchronized (this) {
                if (!this.f171619d) {
                    this.f171619d = true;
                    if (this.f171617b) {
                        C68975a<Object> aVar = this.f171618c;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171618c = aVar;
                        }
                        aVar.mo238758a(NotificationLite.complete());
                        return;
                    }
                    this.f171617b = true;
                    this.f171616a.onComplete();
                }
            }
        }
    }

    C68298c(AbstractC68299d<T> dVar) {
        this.f171616a = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f171616a.subscribe(qVar);
    }

    @Override // io.reactivex.internal.util.C68975a.AbstractC68976a, io.reactivex.functions.AbstractC68322n
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f171616a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        io.reactivex.plugins.RxJavaPlugins.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f171616a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    @Override // io.reactivex.AbstractC69009q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f171619d
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f171619d     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r2.f171619d = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f171617b     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f171618c     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f171618c = r0     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo238761b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002a:
            r0 = 0
            r2.f171617b = r1     // Catch:{ all -> 0x003b }
            r1 = 0
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x0035:
            io.reactivex.e.d<T> r0 = r2.f171616a
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.p3457e.C68298c.onError(java.lang.Throwable):void");
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (!this.f171619d) {
            synchronized (this) {
                if (!this.f171619d) {
                    if (this.f171617b) {
                        C68975a<Object> aVar = this.f171618c;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171618c = aVar;
                        }
                        aVar.mo238758a(NotificationLite.next(t));
                        return;
                    }
                    this.f171617b = true;
                    this.f171616a.onNext(t);
                    mo237959a();
                }
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.f171619d) {
            synchronized (this) {
                if (!this.f171619d) {
                    if (this.f171617b) {
                        C68975a<Object> aVar = this.f171618c;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171618c = aVar;
                        }
                        aVar.mo238758a(NotificationLite.disposable(disposable));
                        return;
                    }
                    this.f171617b = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.dispose();
            return;
        }
        this.f171616a.onSubscribe(disposable);
        mo237959a();
    }
}
