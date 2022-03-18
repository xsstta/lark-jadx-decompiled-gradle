package io.reactivex.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C68975a;
import io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.observers.d */
public final class C69004d<T> implements Disposable, AbstractC69009q<T> {

    /* renamed from: a */
    final AbstractC69009q<? super T> f173005a;

    /* renamed from: b */
    final boolean f173006b;

    /* renamed from: c */
    Disposable f173007c;

    /* renamed from: d */
    boolean f173008d;

    /* renamed from: e */
    C68975a<Object> f173009e;

    /* renamed from: f */
    volatile boolean f173010f;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f173007c.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f173007c.isDisposed();
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: io.reactivex.q<? super T>, io.reactivex.q<? super U> */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238789a() {
        C68975a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f173009e;
                if (aVar == null) {
                    this.f173008d = false;
                    return;
                }
                this.f173009e = null;
            }
        } while (!aVar.mo238759a((AbstractC69009q<? super T>) this.f173005a));
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.f173010f) {
            synchronized (this) {
                if (!this.f173010f) {
                    if (this.f173008d) {
                        C68975a<Object> aVar = this.f173009e;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f173009e = aVar;
                        }
                        aVar.mo238758a(NotificationLite.complete());
                        return;
                    }
                    this.f173010f = true;
                    this.f173008d = true;
                    this.f173005a.onComplete();
                }
            }
        }
    }

    public C69004d(AbstractC69009q<? super T> qVar) {
        this(qVar, false);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f173007c, disposable)) {
            this.f173007c = disposable;
            this.f173005a.onSubscribe(this);
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
        r2.f173005a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    @Override // io.reactivex.AbstractC69009q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f173010f
            if (r0 == 0) goto L_0x0008
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f173010f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f173008d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f173010f = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f173009e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f173009e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f173006b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo238758a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo238761b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f173010f = r1     // Catch:{ all -> 0x0044 }
            r2.f173008d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L_0x003e:
            io.reactivex.q<? super T> r0 = r2.f173005a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.C69004d.onError(java.lang.Throwable):void");
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (!this.f173010f) {
            if (t == null) {
                this.f173007c.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f173010f) {
                    if (this.f173008d) {
                        C68975a<Object> aVar = this.f173009e;
                        if (aVar == null) {
                            aVar = new C68975a<>(4);
                            this.f173009e = aVar;
                        }
                        aVar.mo238758a(NotificationLite.next(t));
                        return;
                    }
                    this.f173008d = true;
                    this.f173005a.onNext(t);
                    mo238789a();
                }
            }
        }
    }

    public C69004d(AbstractC69009q<? super T> qVar, boolean z) {
        this.f173005a = qVar;
        this.f173006b = z;
    }
}
