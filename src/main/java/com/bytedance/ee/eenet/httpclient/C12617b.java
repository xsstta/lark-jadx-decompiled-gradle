package com.bytedance.ee.eenet.httpclient;

import com.bytedance.ee.eenet.AbstractC12610a;
import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;

/* renamed from: com.bytedance.ee.eenet.httpclient.b */
public class C12617b {

    /* renamed from: a */
    private static AtomicReference<C12618c> f33793a = new AtomicReference<>(null);

    /* renamed from: b */
    private static AtomicReference<C12629i> f33794b = new AtomicReference<>(null);

    /* renamed from: c */
    private static AtomicReference<C12628h> f33795c = new AtomicReference<>(null);

    /* renamed from: d */
    private static HttpChannel f33796d = HttpChannel.RustChannel;

    /* renamed from: e */
    private static AbstractC12610a f33797e = null;

    /* renamed from: f */
    private static AtomicBoolean f33798f = new AtomicBoolean(false);

    /* renamed from: b */
    public static AbstractC12610a m52362b() {
        return f33797e;
    }

    /* renamed from: d */
    public static HttpChannel m52367d() {
        return f33796d;
    }

    /* renamed from: c */
    public static AbstractC12625f m52365c() {
        m52358a();
        return f33793a.get();
    }

    /* renamed from: e */
    private static void m52368e() {
        f33793a.get().mo47923a(m52363b(f33796d));
    }

    /* renamed from: a */
    public static void m52358a() {
        if (!f33798f.get()) {
            C13479a.m54764b("eenet_EEHttpClient", "init eeHttpClient: " + f33796d.toString());
            f33793a.compareAndSet(null, new C12618c(m52363b(f33796d)));
            f33798f.set(true);
        }
    }

    /* renamed from: a */
    public static void m52359a(AbstractC12610a aVar) {
        f33797e = aVar;
    }

    /* renamed from: a */
    public static AbstractC12625f m52357a(OkHttpClient okHttpClient) {
        m52358a();
        return f33793a.get().mo47924b(okHttpClient);
    }

    /* renamed from: a */
    public static AbstractC12625f m52356a(OkHttpClient.Builder builder) {
        m52358a();
        return f33793a.get().mo47924b(builder.build());
    }

    /* renamed from: b */
    public static AbstractC12625f m52364b(OkHttpClient.Builder builder) {
        if (builder == null) {
            return new C12629i(new C12623e().mo47927a());
        }
        return new C12629i(builder.build());
    }

    /* renamed from: c */
    public static AbstractC12625f m52366c(OkHttpClient.Builder builder) {
        if (builder == null) {
            return new C12628h(new C12623e().mo47927a());
        }
        return new C12628h(builder.build());
    }

    /* renamed from: a */
    public static void m52360a(HttpChannel httpChannel) {
        m52358a();
        if (f33796d != httpChannel) {
            C13479a.m54764b("eenet_EEHttpClient", "setNetworkChannel channel: " + httpChannel.toString());
            f33796d = httpChannel;
            m52368e();
        }
    }

    /* renamed from: b */
    static AbstractC12625f m52363b(HttpChannel httpChannel) {
        if (httpChannel == HttpChannel.RustChannel) {
            if (f33794b.get() == null) {
                f33794b.compareAndSet(null, new C12629i(new C12623e().mo47927a()));
            }
            return f33794b.get();
        }
        if (f33795c.get() == null) {
            f33795c.compareAndSet(null, new C12628h(new C12623e().mo47927a()));
        }
        return f33795c.get();
    }

    /* renamed from: a */
    static boolean m52361a(OkHttpClient okHttpClient, HttpChannel httpChannel) {
        if (httpChannel == HttpChannel.OkHttpChannel && (okHttpClient instanceof C12628h)) {
            return true;
        }
        if (httpChannel != HttpChannel.RustChannel || !(okHttpClient instanceof C12629i)) {
            return false;
        }
        return true;
    }
}
