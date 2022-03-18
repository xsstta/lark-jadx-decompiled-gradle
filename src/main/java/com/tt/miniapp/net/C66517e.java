package com.tt.miniapp.net;

import com.bytedance.ee.lark.infra.cookie.p617b.C12759b;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a;
import com.tt.miniapp.net.p3310c.C66514b;
import com.tt.miniapp.net.p3310c.C66515c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import java.util.Collections;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;

/* renamed from: com.tt.miniapp.net.e */
public class C66517e {
    /* renamed from: a */
    public static OkHttpClient m259917a() {
        return ContextSingletonInstance.getInstance().getNetBusInstance().mo232082a();
    }

    /* renamed from: b */
    public static OkHttpClient m259918b() {
        return ContextSingletonInstance.getInstance().getNetBusInstance().mo232083b();
    }

    /* renamed from: com.tt.miniapp.net.e$a */
    public static class C66518a {

        /* renamed from: a */
        private volatile Dispatcher f167902a = new Dispatcher(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("TmaOkHttp Dispatcher", false)));

        /* renamed from: b */
        private OkHttpClient.Builder f167903b = new OkHttpClient.Builder();

        /* renamed from: c */
        private OkHttpClient f167904c;

        /* renamed from: d */
        private final Object f167905d = new Object();

        /* renamed from: e */
        private OkHttpClient f167906e;

        /* renamed from: f */
        private final Object f167907f = new Object();

        public C66518a() {
            this.f167902a.setMaxRequestsPerHost(10);
        }

        /* renamed from: a */
        public OkHttpClient mo232082a() {
            if (this.f167904c == null) {
                synchronized (this.f167905d) {
                    if (this.f167904c == null) {
                        this.f167904c = this.f167903b.connectTimeout(60000, TimeUnit.MILLISECONDS).writeTimeout(60000, TimeUnit.MILLISECONDS).readTimeout(60000, TimeUnit.MILLISECONDS).addInterceptor(new C66514b()).protocols(Collections.singletonList(Protocol.HTTP_1_1)).cookieJar(new C12759b(AppbrandContext.getInst().getApplicationContext())).dispatcher(this.f167902a).build();
                    }
                }
            }
            return this.f167904c;
        }

        /* renamed from: b */
        public OkHttpClient mo232083b() {
            OkHttpClient.Builder builder;
            if (this.f167906e == null) {
                synchronized (this.f167907f) {
                    if (this.f167906e == null) {
                        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.rust_pkg_downloader", false)) {
                            builder = C12837a.m53013a().newBuilder();
                        } else {
                            builder = new OkHttpClient.Builder();
                        }
                        this.f167906e = builder.connectTimeout(8000, TimeUnit.MILLISECONDS).writeTimeout(8000, TimeUnit.MILLISECONDS).readTimeout(8000, TimeUnit.MILLISECONDS).addInterceptor(new C66515c()).protocols(Collections.singletonList(Protocol.HTTP_1_1)).dispatcher(this.f167902a).build();
                    }
                }
            }
            return this.f167906e;
        }
    }
}
