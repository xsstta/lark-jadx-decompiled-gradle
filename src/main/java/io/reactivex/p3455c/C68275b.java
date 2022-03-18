package io.reactivex.p3455c;

import io.reactivex.internal.util.C68975a;
import io.reactivex.internal.util.NotificationLite;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.c.b */
final class C68275b<T> extends AbstractC68274a<T> {

    /* renamed from: b */
    final AbstractC68274a<T> f171565b;

    /* renamed from: c */
    boolean f171566c;

    /* renamed from: d */
    C68975a<Object> f171567d;

    /* renamed from: e */
    volatile boolean f171568e;

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo237906m() {
        C68975a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f171567d;
                if (aVar == null) {
                    this.f171566c = false;
                    return;
                }
                this.f171567d = null;
            }
            aVar.mo238760a((AbstractC70021c) this.f171565b);
        }
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        if (!this.f171568e) {
            synchronized (this) {
                if (!this.f171568e) {
                    this.f171568e = true;
                    if (this.f171566c) {
                        C68975a<Object> aVar = this.f171567d;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171567d = aVar;
                        }
                        aVar.mo238758a(NotificationLite.complete());
                        return;
                    }
                    this.f171566c = true;
                    this.f171565b.onComplete();
                }
            }
        }
    }

    C68275b(AbstractC68274a<T> aVar) {
        this.f171565b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171565b.subscribe(cVar);
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
        r2.f171565b.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    @Override // org.p3511d.AbstractC70021c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f171568e
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f171568e     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r2.f171568e = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f171566c     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f171567d     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f171567d = r0     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo238761b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002a:
            r0 = 0
            r2.f171566c = r1     // Catch:{ all -> 0x003b }
            r1 = 0
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x0035:
            io.reactivex.c.a<T> r0 = r2.f171565b
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.p3455c.C68275b.onError(java.lang.Throwable):void");
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        if (!this.f171568e) {
            synchronized (this) {
                if (!this.f171568e) {
                    if (this.f171566c) {
                        C68975a<Object> aVar = this.f171567d;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171567d = aVar;
                        }
                        aVar.mo238758a(NotificationLite.next(t));
                        return;
                    }
                    this.f171566c = true;
                    this.f171565b.onNext(t);
                    mo237906m();
                }
            }
        }
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        boolean z = true;
        if (!this.f171568e) {
            synchronized (this) {
                if (!this.f171568e) {
                    if (this.f171566c) {
                        C68975a<Object> aVar = this.f171567d;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171567d = aVar;
                        }
                        aVar.mo238758a(NotificationLite.subscription(dVar));
                        return;
                    }
                    this.f171566c = true;
                    z = false;
                }
            }
        }
        if (z) {
            dVar.cancel();
            return;
        }
        this.f171565b.onSubscribe(dVar);
        mo237906m();
    }
}
