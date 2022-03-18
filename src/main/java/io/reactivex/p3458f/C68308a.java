package io.reactivex.p3458f;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68975a;
import io.reactivex.internal.util.NotificationLite;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.f.a */
public final class C68308a<T> implements AbstractC68325i<T>, AbstractC70022d {

    /* renamed from: a */
    final AbstractC70021c<? super T> f171633a;

    /* renamed from: b */
    final boolean f171634b;

    /* renamed from: c */
    AbstractC70022d f171635c;

    /* renamed from: d */
    boolean f171636d;

    /* renamed from: e */
    C68975a<Object> f171637e;

    /* renamed from: f */
    volatile boolean f171638f;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
        this.f171635c.cancel();
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.d.c<? super T>, org.d.c<? super U> */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238038a() {
        C68975a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f171637e;
                if (aVar == null) {
                    this.f171636d = false;
                    return;
                }
                this.f171637e = null;
            }
        } while (!aVar.mo238760a((AbstractC70021c<? super T>) this.f171633a));
    }

    @Override // org.p3511d.AbstractC70021c
    public void onComplete() {
        if (!this.f171638f) {
            synchronized (this) {
                if (!this.f171638f) {
                    if (this.f171636d) {
                        C68975a<Object> aVar = this.f171637e;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171637e = aVar;
                        }
                        aVar.mo238758a(NotificationLite.complete());
                        return;
                    }
                    this.f171638f = true;
                    this.f171636d = true;
                    this.f171633a.onComplete();
                }
            }
        }
    }

    public C68308a(AbstractC70021c<? super T> cVar) {
        this(cVar, false);
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
        this.f171635c.request(j);
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.validate(this.f171635c, dVar)) {
            this.f171635c = dVar;
            this.f171633a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        io.reactivex.plugins.RxJavaPlugins.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f171633a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    @Override // org.p3511d.AbstractC70021c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f171638f
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f171638f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f171636d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f171638f = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f171637e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f171637e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f171634b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo238758a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo238761b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f171638f = r1     // Catch:{ all -> 0x0044 }
            r2.f171636d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x003e:
            org.d.c<? super T> r0 = r2.f171633a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.p3458f.C68308a.onError(java.lang.Throwable):void");
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        if (!this.f171638f) {
            if (t == null) {
                this.f171635c.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f171638f) {
                    if (this.f171636d) {
                        C68975a<Object> aVar = this.f171637e;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f171637e = aVar;
                        }
                        aVar.mo238758a(NotificationLite.next(t));
                        return;
                    }
                    this.f171636d = true;
                    this.f171633a.onNext(t);
                    mo238038a();
                }
            }
        }
    }

    public C68308a(AbstractC70021c<? super T> cVar, boolean z) {
        this.f171633a = cVar;
        this.f171634b = z;
    }
}
