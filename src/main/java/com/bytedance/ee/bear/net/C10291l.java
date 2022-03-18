package com.bytedance.ee.bear.net;

import android.os.SystemClock;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.eenet.httpclient.C12614a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* renamed from: com.bytedance.ee.bear.net.l */
public class C10291l {

    /* renamed from: a */
    private AbstractC12625f f27775a;

    /* renamed from: b */
    private long f27776b;

    /* renamed from: c */
    private Interceptor f27777c;

    /* renamed from: d */
    private long f27778d;

    /* renamed from: e */
    private CookieJar f27779e;

    /* renamed from: a */
    public AbstractC12625f mo39306a() {
        synchronized (this) {
            AbstractC12625f fVar = this.f27775a;
            if (fVar != null) {
                return fVar;
            }
            m42898b();
            return this.f27775a;
        }
    }

    /* renamed from: b */
    private void m42898b() {
        C12617b.m52358a();
        AbstractC12625f fVar = this.f27775a;
        if (fVar == null) {
            fVar = C12617b.m52365c();
        }
        C12614a a = fVar.mo47928a();
        a.mo47917a(new Dispatcher(BearExecutors.m48467b()));
        CookieJar cookieJar = this.f27779e;
        if (cookieJar != null) {
            a.mo47916a(cookieJar);
        }
        Interceptor interceptor = this.f27777c;
        if (interceptor != null) {
            a.mo47918a(interceptor);
        }
        long j = this.f27776b;
        if (j > 10000) {
            a.mo47915a(j, TimeUnit.MILLISECONDS);
            a.mo47920b(this.f27776b, TimeUnit.MILLISECONDS);
            a.mo47922c(this.f27776b, TimeUnit.MILLISECONDS);
        }
        synchronized (this) {
            this.f27775a = a.mo47919a();
            this.f27778d = SystemClock.elapsedRealtime();
            this.f27775a.dispatcher().setIdleCallback(new Runnable() {
                /* class com.bytedance.ee.bear.net.$$Lambda$l$j0zh9C6eznlXFtrm6lGpqZKQOhc */

                public final void run() {
                    C10291l.this.m42899c();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m42899c() {
        synchronized (this) {
            if (SystemClock.elapsedRealtime() - this.f27778d < 300000) {
                C13479a.m54772d("OkHttpInstance", "buildOkHttpClient: exit build < MAX_BUILD_INTERVAL");
            } else if (this.f27775a.dispatcher().queuedCallsCount() > 0) {
                C13479a.m54772d("OkHttpInstance", "run: you have queued count so exist rebuild.");
            } else {
                long j = this.f27776b;
                if (((long) this.f27775a.connectTimeoutMillis()) != j) {
                    if (j > 10000) {
                        m42898b();
                        return;
                    }
                }
                C13479a.m54772d("OkHttpInstance", "buildOkHttpClient: exit build condition not satisfied.");
            }
        }
    }

    /* renamed from: a */
    public void mo39307a(long j) {
        this.f27776b = j;
    }

    /* renamed from: a */
    public void mo39308a(CookieJar cookieJar) {
        this.f27779e = cookieJar;
    }

    /* renamed from: a */
    public void mo39309a(Interceptor interceptor) {
        this.f27777c = interceptor;
    }
}
