package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.volley.i */
public class C1934i {

    /* renamed from: a */
    private final AtomicInteger f6603a;

    /* renamed from: b */
    private final Set<Request<?>> f6604b;

    /* renamed from: c */
    private final PriorityBlockingQueue<Request<?>> f6605c;

    /* renamed from: d */
    private final PriorityBlockingQueue<Request<?>> f6606d;

    /* renamed from: e */
    private final AbstractC1921a f6607e;

    /* renamed from: f */
    private final AbstractC1931f f6608f;

    /* renamed from: g */
    private final AbstractC1939k f6609g;

    /* renamed from: h */
    private final C1932g[] f6610h;

    /* renamed from: i */
    private C1923b f6611i;

    /* renamed from: j */
    private final List<AbstractC1935a> f6612j;

    /* renamed from: com.android.volley.i$a */
    public interface AbstractC1935a<T> {
        /* renamed from: a */
        void mo9813a(Request<T> request);
    }

    /* renamed from: c */
    public int mo9812c() {
        return this.f6603a.incrementAndGet();
    }

    /* renamed from: b */
    public void mo9810b() {
        C1923b bVar = this.f6611i;
        if (bVar != null) {
            bVar.mo9785a();
        }
        C1932g[] gVarArr = this.f6610h;
        for (C1932g gVar : gVarArr) {
            if (gVar != null) {
                gVar.mo9805a();
            }
        }
    }

    /* renamed from: a */
    public void mo9809a() {
        mo9810b();
        C1923b bVar = new C1923b(this.f6605c, this.f6606d, this.f6607e, this.f6609g);
        this.f6611i = bVar;
        bVar.start();
        for (int i = 0; i < this.f6610h.length; i++) {
            C1932g gVar = new C1932g(this.f6606d, this.f6608f, this.f6607e, this.f6609g);
            this.f6610h[i] = gVar;
            gVar.start();
        }
    }

    /* renamed from: a */
    public <T> Request<T> mo9808a(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.f6604b) {
            this.f6604b.add(request);
        }
        request.setSequence(mo9812c());
        request.addMarker("add-to-queue");
        if (!request.shouldCache()) {
            this.f6606d.add(request);
            return request;
        }
        this.f6605c.add(request);
        return request;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void mo9811b(Request<T> request) {
        synchronized (this.f6604b) {
            this.f6604b.remove(request);
        }
        synchronized (this.f6612j) {
            for (AbstractC1935a aVar : this.f6612j) {
                aVar.mo9813a(request);
            }
        }
    }

    public C1934i(AbstractC1921a aVar, AbstractC1931f fVar) {
        this(aVar, fVar, 4);
    }

    public C1934i(AbstractC1921a aVar, AbstractC1931f fVar, int i) {
        this(aVar, fVar, i, new C1927d(new Handler(Looper.getMainLooper())));
    }

    public C1934i(AbstractC1921a aVar, AbstractC1931f fVar, int i, AbstractC1939k kVar) {
        this.f6603a = new AtomicInteger();
        this.f6604b = new HashSet();
        this.f6605c = new PriorityBlockingQueue<>();
        this.f6606d = new PriorityBlockingQueue<>();
        this.f6612j = new ArrayList();
        this.f6607e = aVar;
        this.f6608f = fVar;
        this.f6610h = new C1932g[i];
        this.f6609g = kVar;
    }
}
