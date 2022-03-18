package com.bytedance.ee.eenet.httpclient.rust;

import android.os.SystemClock;
import com.bytedance.ee.eenet.httpclient.C12629i;
import com.bytedance.ee.eenet.httpclient.p600a.C12615a;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.eenet.httpclient.rust.p601a.C12631a;
import com.bytedance.ee.eenet.httpclient.rust.p601a.C12632b;
import com.bytedance.ee.eenet.httpclient.rust.p601a.C12633c;
import com.bytedance.ee.eenet.httpclient.rust.p601a.C12634d;
import com.bytedance.ee.eenet.httpclient.rust.p602b.C12637a;
import com.bytedance.ee.eenet.p598a.C12611a;
import com.bytedance.ee.eenet.p599b.AbstractC12612a;
import com.bytedance.ee.eenet.p599b.C12613b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.sdk.LarkNetApi;
import com.bytedance.lark.sdk.Sdk;
import com.bytedance.lark.sdk.api.LarkProxyApi;
import java.io.IOException;
import java.util.LinkedList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.connection.StreamAllocation;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.b */
public class C12635b implements Call {

    /* renamed from: a */
    public C12630a f33859a;

    /* renamed from: b */
    public EventListener f33860b;

    /* renamed from: c */
    final Request f33861c;

    /* renamed from: d */
    final boolean f33862d;

    /* renamed from: e */
    private C12629i f33863e;

    /* renamed from: f */
    private LarkNetApi f33864f = ((LarkNetApi) Sdk.getInstance().getApi(LarkNetApi.class));

    /* renamed from: g */
    private LarkProxyApi f33865g = ((LarkProxyApi) Sdk.getInstance().getApi(LarkProxyApi.class));

    /* renamed from: h */
    private long f33866h;

    /* renamed from: i */
    private final C12632b f33867i;

    /* renamed from: j */
    private boolean f33868j;

    @Override // okhttp3.Call
    public StreamAllocation streamAllocation() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.eenet.httpclient.rust.b$a */
    public final class C12636a extends NamedRunnable {

        /* renamed from: b */
        private final Callback f33870b;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12635b mo47991b() {
            return C12635b.this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo47990a() {
            return C12635b.this.f33861c.url().host();
        }

        /* access modifiers changed from: protected */
        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            IOException iOException;
            try {
                Response c = C12635b.this.mo47981c();
                C12635b.this.f33860b.callEnd(C12635b.this);
                this.f33870b.onResponse(C12635b.this, c);
                C12635b.this.mo47979a(null, c);
            } catch (Throwable th) {
                C12635b.this.f33859a.mo47963b(this);
                throw th;
            }
            C12635b.this.f33859a.mo47963b(this);
        }

        C12636a(Callback callback) {
            super("eenet_RustCall_RustNet %s", C12635b.this.mo47980b());
            this.f33870b = callback;
        }
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.f33861c;
    }

    @Override // okhttp3.Call
    public void cancel() {
        this.f33867i.mo47966b();
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.f33867i.mo47967c();
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.f33868j;
    }

    /* renamed from: a */
    public C12635b clone() {
        return m52400a(this.f33863e, this.f33861c, this.f33862d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo47980b() {
        return this.f33861c.url().redact();
    }

    /* renamed from: c */
    public Response mo47981c() throws IOException {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f33863e.interceptors());
        if (C12615a.m52353a()) {
            linkedList.add(new C12633c(this.f33863e.proxy(), this.f33863e.proxySelector(), this.f33865g));
        }
        linkedList.add(new C12631a(this.f33863e.cookieJar()));
        linkedList.addAll(this.f33863e.networkInterceptors());
        linkedList.add(this.f33867i);
        return new C12634d(linkedList, 0, this.f33861c, this, this.f33863e.connectTimeoutMillis(), this.f33863e.readTimeoutMillis(), this.f33863e.writeTimeoutMillis()).proceed(this.f33861c);
    }

    @Override // okhttp3.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (!this.f33868j) {
                this.f33868j = true;
            } else {
                throw new RustIOException(new IllegalStateException("Already Executed"), -3331002);
            }
        }
        this.f33866h = SystemClock.elapsedRealtime();
        this.f33860b.callStart(this);
        try {
            this.f33859a.mo47959a(this);
            Response c = mo47981c();
            if (c != null) {
                mo47979a(null, c);
                this.f33860b.callEnd(this);
                this.f33859a.mo47964b(this);
                return c;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            mo47979a(e, null);
            this.f33860b.callFailed(this, e);
            C13479a.m54764b("eenet_RustCall", "error: " + e.getMessage());
            throw e;
        } catch (Throwable th) {
            this.f33859a.mo47964b(this);
            throw th;
        }
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.f33868j) {
                this.f33868j = true;
            } else {
                throw new IllegalStateException("eenet_RustCall:Already Executed");
            }
        }
        this.f33866h = SystemClock.elapsedRealtime();
        this.f33860b.callStart(this);
        this.f33859a.mo47958a(new C12636a(callback));
    }

    /* renamed from: a */
    public void mo47979a(Throwable th, Response response) {
        AbstractC12612a a = C12613b.m52340a();
        if (a != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f33866h;
            if (th instanceof RustIOException) {
                C12611a requestCallInfo = ((RustIOException) th).getRequestCallInfo();
                if (requestCallInfo == null) {
                    requestCallInfo = C12637a.m52407a(this.f33861c);
                }
                a.mo23875a(elapsedRealtime, this.f33866h, requestCallInfo, th);
                C13479a.m54764b("eenet_RustCall", "rustCall xRequestId: " + requestCallInfo.f33781q);
            } else if (response != null) {
                a.mo23874a(elapsedRealtime, this.f33866h, C12637a.m52408a(response));
            } else if (th instanceof Throwable) {
                RustIOException rustIOException = new RustIOException(th, -3331000);
                a.mo23875a(elapsedRealtime, this.f33866h, C12637a.m52407a(this.f33861c), rustIOException);
            }
        }
    }

    /* renamed from: a */
    public static C12635b m52400a(C12629i iVar, Request request, boolean z) {
        return new C12635b(iVar, request, z);
    }

    public C12635b(C12629i iVar, Request request, boolean z) {
        this.f33863e = iVar;
        this.f33859a = iVar.mo47955b();
        this.f33861c = request;
        this.f33862d = z;
        this.f33867i = new C12632b(iVar, this.f33864f);
        this.f33860b = iVar.eventListenerFactory().create(this);
    }
}
