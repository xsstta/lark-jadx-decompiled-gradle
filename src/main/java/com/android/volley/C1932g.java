package com.android.volley;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.g */
public class C1932g extends Thread {

    /* renamed from: a */
    private final BlockingQueue<Request<?>> f6592a;

    /* renamed from: b */
    private final AbstractC1931f f6593b;

    /* renamed from: c */
    private final AbstractC1921a f6594c;

    /* renamed from: d */
    private final AbstractC1939k f6595d;

    /* renamed from: e */
    private volatile boolean f6596e;

    /* renamed from: a */
    public void mo9805a() {
        this.f6596e = true;
        interrupt();
    }

    /* renamed from: b */
    private void m8581b() throws InterruptedException {
        mo9806a(this.f6592a.take());
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m8581b();
            } catch (InterruptedException unused) {
                if (this.f6596e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1941m.m8605c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private void m8582b(Request<?> request) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9806a(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            request.addMarker("network-queue-take");
            if (request.isCanceled()) {
                request.finish("network-discard-cancelled");
                request.notifyListenerResponseNotUsable();
                return;
            }
            m8582b(request);
            C1933h a = this.f6593b.mo9804a(request);
            request.addMarker("network-http-complete");
            if (!a.f6601e || !request.hasHadResponseDelivered()) {
                C1936j<?> parseNetworkResponse = request.parseNetworkResponse(a);
                request.addMarker("network-parse-complete");
                if (request.shouldCache() && parseNetworkResponse.f6614b != null) {
                    this.f6594c.mo9782a(request.getCacheKey(), parseNetworkResponse.f6614b);
                    request.addMarker("network-cache-written");
                }
                request.markDelivered();
                this.f6595d.mo9795a(request, parseNetworkResponse);
                request.notifyListenerResponseReceived(parseNetworkResponse);
                return;
            }
            request.finish("not-modified");
            request.notifyListenerResponseNotUsable();
        } catch (VolleyError e) {
            e.setNetworkTimeMs(SystemClock.elapsedRealtime() - elapsedRealtime);
            m8580a(request, e);
            request.notifyListenerResponseNotUsable();
        } catch (Exception e2) {
            C1941m.m8603a(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6595d.mo9794a(request, volleyError);
            request.notifyListenerResponseNotUsable();
        }
    }

    /* renamed from: a */
    private void m8580a(Request<?> request, VolleyError volleyError) {
        this.f6595d.mo9794a(request, request.parseNetworkError(volleyError));
    }

    public C1932g(BlockingQueue<Request<?>> blockingQueue, AbstractC1931f fVar, AbstractC1921a aVar, AbstractC1939k kVar) {
        this.f6592a = blockingQueue;
        this.f6593b = fVar;
        this.f6594c = aVar;
        this.f6595d = kVar;
    }
}
