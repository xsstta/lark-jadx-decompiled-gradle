package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.p095a.AbstractC2521i;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bumptech.glide.util.C2568k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.request.e */
public class C2534e<R> implements AbstractFutureC2532c<R>, AbstractC2536f<R> {

    /* renamed from: a */
    private static final C2535a f8208a = new C2535a();

    /* renamed from: b */
    private final int f8209b;

    /* renamed from: c */
    private final int f8210c;

    /* renamed from: d */
    private final boolean f8211d;

    /* renamed from: e */
    private final C2535a f8212e;

    /* renamed from: f */
    private R f8213f;

    /* renamed from: g */
    private AbstractC2533d f8214g;

    /* renamed from: h */
    private boolean f8215h;

    /* renamed from: i */
    private boolean f8216i;

    /* renamed from: j */
    private boolean f8217j;

    /* renamed from: k */
    private GlideException f8218k;

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo11036a(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public void mo11176b(AbstractC2521i iVar) {
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: c */
    public void mo11172c(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: f */
    public void mo10427f() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: g */
    public void mo10428g() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: h */
    public void mo10429h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.request.e$a */
    public static class C2535a {
        C2535a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11211a(Object obj) {
            obj.notifyAll();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11212a(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public synchronized AbstractC2533d mo11170a() {
        return this.f8214g;
    }

    public synchronized boolean isCancelled() {
        return this.f8215h;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m10769a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public synchronized boolean isDone() {
        boolean z;
        if (this.f8215h || this.f8216i || this.f8217j) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: b */
    public synchronized void mo10444b(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public void mo11175a(AbstractC2521i iVar) {
        iVar.mo11187a(this.f8209b, this.f8210c);
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public synchronized void mo11171a(AbstractC2533d dVar) {
        this.f8214g = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1.mo11197b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x000a:
            r0 = 1
            r2.f8215h = r0     // Catch:{ all -> 0x0021 }
            com.bumptech.glide.request.e$a r1 = r2.f8212e     // Catch:{ all -> 0x0021 }
            r1.mo11211a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            com.bumptech.glide.request.d r3 = r2.f8214g     // Catch:{ all -> 0x0021 }
            r2.f8214g = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.mo11197b()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C2534e.cancel(boolean):boolean");
    }

    /* renamed from: a */
    private synchronized R m10769a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f8211d && !isDone()) {
            C2568k.m10916b();
        }
        if (this.f8215h) {
            throw new CancellationException();
        } else if (this.f8217j) {
            throw new ExecutionException(this.f8218k);
        } else if (this.f8216i) {
            return this.f8213f;
        } else {
            if (l == null) {
                this.f8212e.mo11212a(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f8212e.mo11212a(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f8217j) {
                throw new ExecutionException(this.f8218k);
            } else if (this.f8215h) {
                throw new CancellationException();
            } else if (this.f8216i) {
                return this.f8213f;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public C2534e(int i, int i2) {
        this(i, i2, true, f8208a);
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m10769a(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
    /* renamed from: a */
    public synchronized void mo10442a(R r, AbstractC2529b<? super R> bVar) {
    }

    C2534e(int i, int i2, boolean z, C2535a aVar) {
        this.f8209b = i;
        this.f8210c = i2;
        this.f8211d = z;
        this.f8212e = aVar;
    }

    @Override // com.bumptech.glide.request.AbstractC2536f
    /* renamed from: a */
    public synchronized boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<R> jVar, boolean z) {
        this.f8217j = true;
        this.f8218k = glideException;
        this.f8212e.mo11211a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.AbstractC2536f
    /* renamed from: a */
    public synchronized boolean mo11205a(R r, Object obj, AbstractC2522j<R> jVar, DataSource dataSource, boolean z) {
        this.f8216i = true;
        this.f8213f = r;
        this.f8212e.mo11211a(this);
        return false;
    }
}
