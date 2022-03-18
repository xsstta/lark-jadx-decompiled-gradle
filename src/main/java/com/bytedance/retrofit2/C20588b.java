package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;

/* renamed from: com.bytedance.retrofit2.b */
public class C20588b<T> implements IMetricsCollect, IRequestInfo, Interceptor {

    /* renamed from: a */
    private final C20640l<T> f50167a;

    /* renamed from: b */
    private volatile AbstractC20594b f50168b;

    /* renamed from: c */
    private Request f50169c;

    /* renamed from: d */
    private volatile boolean f50170d;

    /* renamed from: e */
    private Throwable f50171e;

    /* renamed from: f */
    private volatile boolean f50172f;

    /* renamed from: g */
    private volatile long f50173g;

    /* renamed from: a */
    public Request mo69340a() {
        return this.f50169c;
    }

    /* renamed from: e */
    public boolean mo69344e() {
        return this.f50170d;
    }

    /* renamed from: b */
    public synchronized boolean mo69341b() {
        return this.f50172f;
    }

    /* renamed from: c */
    public synchronized void mo69342c() {
        this.f50172f = false;
    }

    /* renamed from: d */
    public void mo69343d() {
        this.f50170d = true;
        if (this.f50168b != null) {
            this.f50168b.mo51525b();
        }
    }

    @Override // com.bytedance.retrofit2.IMetricsCollect
    public void doCollect() {
        if (this.f50168b instanceof IMetricsCollect) {
            ((IMetricsCollect) this.f50168b).doCollect();
        }
    }

    @Override // com.bytedance.retrofit2.IRequestInfo
    public Object getRequestInfo() {
        if (!(this.f50168b instanceof IRequestInfo)) {
            return null;
        }
        ((IRequestInfo) this.f50168b).getRequestInfo();
        return null;
    }

    public C20588b(C20640l<T> lVar) {
        this.f50167a = lVar;
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor
    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        Response response;
        Response a;
        C20639k metrics = chain.metrics();
        if (metrics != null) {
            metrics.f50279i = System.currentTimeMillis();
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        this.f50169c = chain.request();
        synchronized (this) {
            if (!this.f50172f) {
                this.f50172f = true;
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        Throwable th = this.f50171e;
        if (th == null) {
            this.f50169c.setMetrics(metrics);
            if (this.f50167a.f50312o != null) {
                if (metrics != null) {
                    metrics.f50294x.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                }
                response = this.f50167a.f50312o.mo69337a(this.f50169c);
            } else {
                response = null;
            }
            if (response == null) {
                try {
                    this.f50168b = m74940a((ExpandCallback) null, this.f50169c);
                    if (this.f50173g > 0) {
                        this.f50168b.mo51524a(this.f50173g);
                    }
                    if (this.f50170d) {
                        this.f50168b.mo51525b();
                    }
                    if (metrics != null) {
                        metrics.f50294x.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                    }
                    response = m74939a(this.f50168b, metrics);
                    if (!(this.f50167a.f50312o == null || (a = this.f50167a.f50312o.mo69338a(this.f50169c, response)) == null)) {
                        response = a;
                    }
                } catch (IOException | RuntimeException e) {
                    this.f50171e = e;
                    throw e;
                } catch (Throwable th2) {
                    this.f50171e = th2;
                    if (th2 instanceof Exception) {
                        throw th2;
                    }
                    throw new Exception(th2);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            SsResponse<T> a2 = mo69339a(response, metrics);
            if (metrics != null) {
                metrics.f50295y.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
            return a2;
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else {
            throw new Exception(this.f50171e);
        }
    }

    /* renamed from: a */
    private Response m74939a(AbstractC20594b bVar, C20639k kVar) throws IOException {
        if (kVar != null) {
            kVar.f50290t = SystemClock.uptimeMillis();
        }
        return bVar.mo51523a();
    }

    /* renamed from: a */
    private AbstractC20594b m74940a(ExpandCallback expandCallback, Request request) throws IOException {
        return this.f50167a.f50300c.mo69391a().mo51540a(request);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SsResponse<T> mo69339a(Response response, C20639k kVar) throws IOException {
        if (response != null) {
            TypedInput body = response.getBody();
            int status = response.getStatus();
            if (status < 200 || status >= 300) {
                return SsResponse.error(body, response);
            }
            if (status == 204 || status == 205) {
                return SsResponse.success(null, response);
            }
            if (kVar != null) {
                try {
                    kVar.f50292v = SystemClock.uptimeMillis();
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            T a = this.f50167a.mo69452a(body);
            if (kVar != null) {
                kVar.f50293w = SystemClock.uptimeMillis();
            }
            return SsResponse.success(a, response);
        }
        throw new IOException("SsResponse is null");
    }
}
