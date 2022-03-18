package com.bytedance.retrofit2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.C20637a;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.retrofit2.m */
public class C20642m<T> implements Call<T>, IMetricsCollect, IRequestInfo {

    /* renamed from: a */
    public static AbstractC20646b f50357a;

    /* renamed from: b */
    public static AbstractC20645a f50358b;

    /* renamed from: c */
    public int f50359c = -1;

    /* renamed from: d */
    public final C20640l<T> f50360d;

    /* renamed from: e */
    public final Object[] f50361e;

    /* renamed from: f */
    public Request f50362f;

    /* renamed from: g */
    public Throwable f50363g;

    /* renamed from: h */
    private final C20588b f50364h;

    /* renamed from: i */
    private long f50365i;

    /* renamed from: com.bytedance.retrofit2.m$a */
    public interface AbstractC20645a {
        /* renamed from: a */
        int mo69462a(String str);

        /* renamed from: a */
        void mo69463a(int i);

        /* renamed from: a */
        boolean mo69464a();

        /* renamed from: a */
        boolean mo69465a(Executor executor, Runnable runnable);

        /* renamed from: b */
        void mo69466b();
    }

    /* renamed from: com.bytedance.retrofit2.m$b */
    public interface AbstractC20646b {
        /* renamed from: a */
        int mo69467a(String str);

        /* renamed from: a */
        int mo69468a(String str, String str2);

        /* renamed from: a */
        boolean mo69469a();

        /* renamed from: b */
        boolean mo69470b();
    }

    @Override // com.bytedance.retrofit2.Call
    public void cancel() {
        C20588b bVar = this.f50364h;
        if (bVar != null) {
            bVar.mo69343d();
        }
    }

    @Override // com.bytedance.retrofit2.IMetricsCollect
    public void doCollect() {
        C20588b bVar = this.f50364h;
        if (bVar != null) {
            bVar.doCollect();
        }
    }

    /* renamed from: a */
    public C20642m<T> clone() {
        return new C20642m<>(this.f50360d, this.f50361e);
    }

    @Override // com.bytedance.retrofit2.IRequestInfo
    public Object getRequestInfo() {
        C20588b bVar = this.f50364h;
        if (bVar != null) {
            return bVar.getRequestInfo();
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.Call
    public boolean isCanceled() {
        C20588b bVar = this.f50364h;
        if (bVar == null || !bVar.mo69344e()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.retrofit2.Call
    public synchronized boolean isExecuted() {
        boolean z;
        C20588b bVar = this.f50364h;
        if (bVar == null || !bVar.mo69341b()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // com.bytedance.retrofit2.Call
    public Request request() {
        Request a;
        C20588b bVar = this.f50364h;
        if (bVar != null && (a = bVar.mo69340a()) != null) {
            return a;
        }
        if (this.f50362f == null) {
            try {
                C20639k a2 = this.f50360d.mo69451a();
                a2.f50288r = SystemClock.uptimeMillis();
                this.f50362f = this.f50360d.mo69450a(null, this.f50361e);
                a2.f50289s = SystemClock.uptimeMillis();
            } catch (RuntimeException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Unable to create request.", e2);
            }
        }
        return this.f50362f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SsResponse mo69456b() throws Exception {
        C20639k a = this.f50360d.mo69451a();
        a.f50287q = SystemClock.uptimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f50360d.f50302e);
        linkedList.add(this.f50364h);
        a.f50277g = this.f50365i;
        a.f50278h = System.currentTimeMillis();
        this.f50362f.setMetrics(a);
        SsResponse proceed = new C20637a(linkedList, 0, this.f50362f, this, a).proceed(this.f50362f);
        proceed.setRetrofitMetrics(a);
        return proceed;
    }

    @Override // com.bytedance.retrofit2.Call
    public SsResponse<T> execute() throws Exception {
        String str;
        Request request;
        C20639k a = this.f50360d.mo69451a();
        a.f50285o = SystemClock.uptimeMillis();
        this.f50365i = System.currentTimeMillis();
        a.f50288r = SystemClock.uptimeMillis();
        this.f50362f = this.f50360d.mo69450a(null, this.f50361e);
        a.f50289s = SystemClock.uptimeMillis();
        AbstractC20645a aVar = f50358b;
        if (aVar != null && aVar.mo69464a() && (request = this.f50362f) != null && !TextUtils.isEmpty(request.getPath())) {
            int a2 = f50358b.mo69462a(this.f50362f.getPath());
            this.f50359c = a2;
            if (a2 == 2) {
                cancel();
                throw new IOException("Canceled by Requset Controller");
            } else if (a2 == 1) {
                f50358b.mo69466b();
            }
        }
        AbstractC20646b bVar = f50357a;
        if (bVar != null && this.f50359c == -1) {
            int i = 0;
            if (bVar.mo69469a()) {
                Request request2 = this.f50362f;
                if (request2 != null && !TextUtils.isEmpty(request2.getPath())) {
                    i = f50357a.mo69467a(this.f50362f.getPath());
                }
            } else if (f50357a.mo69470b()) {
                List<Header> headers = this.f50362f.headers("x-tt-request-tag");
                if (headers == null || headers.size() < 1 || TextUtils.isEmpty(headers.get(0).getValue())) {
                    str = "";
                } else {
                    str = headers.get(0).getValue();
                }
                i = f50357a.mo69468a(this.f50362f.getUrl(), str);
            }
            long j = (long) i;
            a.f50286p = j;
            Thread.sleep(j);
        }
        SsResponse<T> b = mo69456b();
        AbstractC20645a aVar2 = f50358b;
        if (aVar2 != null && aVar2.mo69464a()) {
            f50358b.mo69463a(this.f50359c);
        }
        return b;
    }

    /* renamed from: a */
    public static void m75055a(AbstractC20646b bVar) {
        f50357a = bVar;
    }

    @Override // com.bytedance.retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        final ExpandCallback expandCallback;
        Request request;
        final C20639k a = this.f50360d.mo69451a();
        a.f50284n = SystemClock.uptimeMillis();
        this.f50365i = System.currentTimeMillis();
        Objects.requireNonNull(callback, "callback == null");
        C20588b bVar = this.f50364h;
        if (bVar == null || !bVar.mo69341b()) {
            final Executor executor = this.f50360d.f50303f;
            if (callback instanceof ExpandCallback) {
                expandCallback = (ExpandCallback) callback;
            } else {
                expandCallback = null;
            }
            final C206431 r4 = new AbstractRunnableC20652n() {
                /* class com.bytedance.retrofit2.C20642m.C206431 */

                @Override // com.bytedance.retrofit2.AbstractRunnableC20652n
                /* renamed from: a */
                public int mo69457a() {
                    return C20642m.this.f50360d.f50304g;
                }

                @Override // com.bytedance.retrofit2.AbstractRunnableC20652n
                /* renamed from: b */
                public boolean mo69458b() {
                    return C20642m.this.f50360d.f50307j;
                }

                @Override // com.bytedance.retrofit2.AbstractRunnableC20652n
                /* renamed from: c */
                public int mo69459c() {
                    String str;
                    int i = 0;
                    if (C20642m.f50357a != null) {
                        if (C20642m.f50357a.mo69469a()) {
                            if (C20642m.this.f50362f != null && !TextUtils.isEmpty(C20642m.this.f50362f.getPath())) {
                                i = C20642m.f50357a.mo69467a(C20642m.this.f50362f.getPath());
                            }
                        } else if (C20642m.f50357a.mo69470b()) {
                            List<Header> headers = C20642m.this.f50362f.headers("x-tt-request-tag");
                            if (headers == null || headers.size() < 1 || TextUtils.isEmpty(headers.get(0).getValue())) {
                                str = "";
                            } else {
                                str = headers.get(0).getValue();
                            }
                            i = C20642m.f50357a.mo69468a(C20642m.this.f50362f.getUrl(), str);
                        }
                    }
                    a.f50286p = (long) i;
                    return i;
                }

                public void run() {
                    try {
                        if (C20642m.this.f50363g == null) {
                            if (C20642m.this.f50362f == null) {
                                a.f50288r = SystemClock.uptimeMillis();
                                C20642m mVar = C20642m.this;
                                mVar.f50362f = mVar.f50360d.mo69450a(expandCallback, C20642m.this.f50361e);
                                a.f50289s = SystemClock.uptimeMillis();
                            }
                            SsResponse b = C20642m.this.mo69456b();
                            if (C20642m.f50358b != null && C20642m.f50358b.mo69464a()) {
                                C20642m.f50358b.mo69463a(C20642m.this.f50359c);
                            }
                            m75058a(b);
                            return;
                        }
                        throw C20642m.this.f50363g;
                    } catch (Throwable th) {
                        m75059a(th);
                    }
                }

                /* renamed from: a */
                private void m75059a(Throwable th) {
                    try {
                        callback.onFailure(C20642m.this, th);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }

                /* renamed from: a */
                private void m75058a(SsResponse<T> ssResponse) {
                    try {
                        callback.onResponse(C20642m.this, ssResponse);
                        ExpandCallback expandCallback = expandCallback;
                        if (expandCallback != null) {
                            expandCallback.onAsyncResponse(C20642m.this, ssResponse);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            try {
                this.f50362f = this.f50360d.mo69450a(null, this.f50361e);
            } catch (IOException e) {
                e.printStackTrace();
            }
            AbstractC20645a aVar = f50358b;
            if (aVar != null && aVar.mo69464a() && (request = this.f50362f) != null && !TextUtils.isEmpty(request.getPath())) {
                int a2 = f50358b.mo69462a(this.f50362f.getPath());
                this.f50359c = a2;
                if (a2 == 2) {
                    cancel();
                    callback.onFailure(this, new IOException("Canceled by Requset Controller"));
                    return;
                } else if (a2 == 1 && f50358b.mo69465a(executor, r4)) {
                    return;
                }
            }
            AbstractC20646b bVar2 = f50357a;
            if (bVar2 == null || ((!bVar2.mo69469a() && !f50357a.mo69470b()) || this.f50359c != -1)) {
                executor.execute(r4);
            } else {
                executor.execute(new AbstractRunnableC20652n() {
                    /* class com.bytedance.retrofit2.C20642m.C206442 */

                    @Override // com.bytedance.retrofit2.AbstractRunnableC20652n
                    /* renamed from: c */
                    public int mo69459c() {
                        return 0;
                    }

                    @Override // com.bytedance.retrofit2.AbstractRunnableC20652n
                    /* renamed from: a */
                    public int mo69457a() {
                        return C20642m.this.f50360d.f50304g;
                    }

                    @Override // com.bytedance.retrofit2.AbstractRunnableC20652n
                    /* renamed from: b */
                    public boolean mo69458b() {
                        return C20642m.this.f50360d.f50307j;
                    }

                    public void run() {
                        try {
                            if (C20642m.this.f50362f == null) {
                                C20639k a = C20642m.this.f50360d.mo69451a();
                                a.f50288r = SystemClock.uptimeMillis();
                                C20642m mVar = C20642m.this;
                                mVar.f50362f = mVar.f50360d.mo69450a(expandCallback, C20642m.this.f50361e);
                                a.f50289s = SystemClock.uptimeMillis();
                            }
                        } catch (Throwable th) {
                            C20642m.this.f50363g = th;
                        }
                        executor.execute(r4);
                    }
                });
            }
        } else {
            throw new IllegalStateException("Already executed.");
        }
    }

    C20642m(C20640l<T> lVar, Object[] objArr) {
        this.f50360d = lVar;
        this.f50361e = objArr;
        this.f50364h = new C20588b(lVar);
    }
}
