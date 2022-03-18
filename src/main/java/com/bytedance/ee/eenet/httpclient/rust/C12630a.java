package com.bytedance.ee.eenet.httpclient.rust;

import com.bytedance.ee.eenet.httpclient.rust.C12635b;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.a */
public final class C12630a {

    /* renamed from: a */
    private int f33832a = 64;

    /* renamed from: b */
    private int f33833b = 5;

    /* renamed from: c */
    private Runnable f33834c;

    /* renamed from: d */
    private ExecutorService f33835d;

    /* renamed from: e */
    private final Deque<C12635b.C12636a> f33836e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C12635b.C12636a> f33837f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C12635b> f33838g = new ArrayDeque();

    public C12630a() {
    }

    /* renamed from: b */
    public synchronized int mo47961b() {
        return this.f33837f.size() + this.f33838g.size();
    }

    /* renamed from: c */
    private void m52385c() {
        if (this.f33837f.size() < this.f33832a && !this.f33836e.isEmpty()) {
            Iterator<C12635b.C12636a> it = this.f33836e.iterator();
            while (it.hasNext()) {
                C12635b.C12636a next = it.next();
                if (m52384c(next) < this.f33833b) {
                    it.remove();
                    this.f33837f.add(next);
                    mo47956a().execute(next);
                }
                if (this.f33837f.size() >= this.f33832a) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized ExecutorService mo47956a() {
        if (this.f33835d == null) {
            this.f33835d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("eenet__RustNet Dispatcher", false));
        }
        return this.f33835d;
    }

    /* renamed from: a */
    public synchronized void mo47960a(Runnable runnable) {
        this.f33834c = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo47963b(C12635b.C12636a aVar) {
        m52383a(this.f33837f, aVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo47959a(C12635b bVar) {
        this.f33838g.add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo47964b(C12635b bVar) {
        m52383a(this.f33838g, bVar, false);
    }

    public C12630a(ExecutorService executorService) {
        this.f33835d = executorService;
    }

    /* renamed from: c */
    private int m52384c(C12635b.C12636a aVar) {
        int i = 0;
        for (C12635b.C12636a aVar2 : this.f33837f) {
            if (!aVar2.mo47991b().f33862d && aVar2.mo47990a().equals(aVar.mo47990a())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public synchronized void mo47962b(int i) {
        if (i >= 1) {
            this.f33833b = i;
            m52385c();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    /* renamed from: a */
    public synchronized void mo47957a(int i) {
        if (i >= 1) {
            this.f33832a = i;
            m52385c();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo47958a(C12635b.C12636a aVar) {
        if (this.f33837f.size() >= this.f33832a || m52384c(aVar) >= this.f33833b) {
            this.f33836e.add(aVar);
        } else {
            this.f33837f.add(aVar);
            mo47956a().execute(aVar);
        }
    }

    /* renamed from: a */
    private <T> void m52383a(Deque<T> deque, T t, boolean z) {
        int b;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    m52385c();
                }
                b = mo47961b();
                runnable = this.f33834c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b == 0 && runnable != null) {
            runnable.run();
        }
    }
}
