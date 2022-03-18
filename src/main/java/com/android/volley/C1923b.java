package com.android.volley;

import android.os.Process;
import com.android.volley.AbstractC1921a;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.b */
public class C1923b extends Thread {

    /* renamed from: c */
    private static final boolean f6569c = C1941m.f6618b;

    /* renamed from: a */
    public final BlockingQueue<Request<?>> f6570a;

    /* renamed from: b */
    public final AbstractC1939k f6571b;

    /* renamed from: d */
    private final BlockingQueue<Request<?>> f6572d;

    /* renamed from: e */
    private final AbstractC1921a f6573e;

    /* renamed from: f */
    private volatile boolean f6574f;

    /* renamed from: g */
    private final C1925a f6575g = new C1925a(this);

    /* renamed from: a */
    public void mo9785a() {
        this.f6574f = true;
        interrupt();
    }

    /* renamed from: b */
    private void m8564b() throws InterruptedException {
        mo9786a(this.f6572d.take());
    }

    public void run() {
        if (f6569c) {
            C1941m.m8602a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6573e.mo9781a();
        while (true) {
            try {
                m8564b();
            } catch (InterruptedException unused) {
                if (this.f6574f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1941m.m8605c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.android.volley.b$a */
    public static class C1925a implements Request.AbstractC1920a {

        /* renamed from: a */
        private final Map<String, List<Request<?>>> f6578a = new HashMap();

        /* renamed from: b */
        private final C1923b f6579b;

        C1925a(C1923b bVar) {
            this.f6579b = bVar;
        }

        @Override // com.android.volley.Request.AbstractC1920a
        /* renamed from: a */
        public synchronized void mo9776a(Request<?> request) {
            String cacheKey = request.getCacheKey();
            List<Request<?>> remove = this.f6578a.remove(cacheKey);
            if (remove != null && !remove.isEmpty()) {
                if (C1941m.f6618b) {
                    C1941m.m8602a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), cacheKey);
                }
                Request<?> remove2 = remove.remove(0);
                this.f6578a.put(cacheKey, remove);
                remove2.setNetworkRequestCompleteListener(this);
                try {
                    this.f6579b.f6570a.put(remove2);
                } catch (InterruptedException e) {
                    C1941m.m8605c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f6579b.mo9785a();
                }
            }
        }

        /* renamed from: b */
        public synchronized boolean mo9789b(Request<?> request) {
            String cacheKey = request.getCacheKey();
            if (this.f6578a.containsKey(cacheKey)) {
                List<Request<?>> list = this.f6578a.get(cacheKey);
                if (list == null) {
                    list = new ArrayList<>();
                }
                request.addMarker("waiting-for-response");
                list.add(request);
                this.f6578a.put(cacheKey, list);
                if (C1941m.f6618b) {
                    C1941m.m8604b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                }
                return true;
            }
            this.f6578a.put(cacheKey, null);
            request.setNetworkRequestCompleteListener(this);
            if (C1941m.f6618b) {
                C1941m.m8604b("new request, sending to network %s", cacheKey);
            }
            return false;
        }

        @Override // com.android.volley.Request.AbstractC1920a
        /* renamed from: a */
        public void mo9777a(Request<?> request, C1936j<?> jVar) {
            List<Request<?>> remove;
            if (jVar.f6614b == null || jVar.f6614b.mo9783a()) {
                mo9776a(request);
                return;
            }
            String cacheKey = request.getCacheKey();
            synchronized (this) {
                remove = this.f6578a.remove(cacheKey);
            }
            if (remove != null) {
                if (C1941m.f6618b) {
                    C1941m.m8602a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), cacheKey);
                }
                for (Request<?> request2 : remove) {
                    this.f6579b.f6571b.mo9795a(request2, jVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9786a(final Request<?> request) throws InterruptedException {
        request.addMarker("cache-queue-take");
        if (request.isCanceled()) {
            request.finish("cache-discard-canceled");
            return;
        }
        AbstractC1921a.C1922a a = this.f6573e.mo9780a(request.getCacheKey());
        if (a == null) {
            request.addMarker("cache-miss");
            if (!this.f6575g.mo9789b(request)) {
                this.f6570a.put(request);
            }
        } else if (a.mo9783a()) {
            request.addMarker("cache-hit-expired");
            request.setCacheEntry(a);
            if (!this.f6575g.mo9789b(request)) {
                this.f6570a.put(request);
            }
        } else {
            request.addMarker("cache-hit");
            C1936j<?> parseNetworkResponse = request.parseNetworkResponse(new C1933h(a.f6561a, a.f6567g));
            request.addMarker("cache-hit-parsed");
            if (!a.mo9784b()) {
                this.f6571b.mo9795a(request, parseNetworkResponse);
                return;
            }
            request.addMarker("cache-hit-refresh-needed");
            request.setCacheEntry(a);
            parseNetworkResponse.f6616d = true;
            if (!this.f6575g.mo9789b(request)) {
                this.f6571b.mo9796a(request, parseNetworkResponse, new Runnable() {
                    /* class com.android.volley.C1923b.RunnableC19241 */

                    public void run() {
                        try {
                            C1923b.this.f6570a.put(request);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                });
            } else {
                this.f6571b.mo9795a(request, parseNetworkResponse);
            }
        }
    }

    public C1923b(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, AbstractC1921a aVar, AbstractC1939k kVar) {
        this.f6572d = blockingQueue;
        this.f6570a = blockingQueue2;
        this.f6573e = aVar;
        this.f6571b = kVar;
    }
}
