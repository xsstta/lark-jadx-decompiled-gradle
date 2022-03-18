package com.bytedance.ee.eenet.httpclient;

import com.bytedance.ee.eenet.httpclient.rust.C12630a;
import com.bytedance.ee.eenet.httpclient.rust.C12635b;
import com.bytedance.ee.eenet.httpclient.rust.p602b.C12638b;
import com.bytedance.ee.eenet.util.C12641a;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;

/* renamed from: com.bytedance.ee.eenet.httpclient.i */
public final class C12629i extends AbstractC12625f {

    /* renamed from: c */
    protected C12630a f33831c;

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public Authenticator authenticator() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport authenticator setting");
        return super.authenticator();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public Cache cache() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport cache setting");
        return super.cache();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public CertificatePinner certificatePinner() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport certificatePinner setting");
        return super.certificatePinner();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public ConnectionPool connectionPool() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport connectionPool setting");
        return super.connectionPool();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public Dns dns() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport dns setting");
        return super.dns();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public boolean followSslRedirects() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport followSslRedirects setting");
        return super.followSslRedirects();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public HostnameVerifier hostnameVerifier() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport hostnameVerifier setting");
        return super.hostnameVerifier();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public List<Protocol> protocols() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport protocols setting");
        return super.protocols();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public Authenticator proxyAuthenticator() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport proxyAuthenticator setting");
        return super.proxyAuthenticator();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public boolean retryOnConnectionFailure() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport retryOnConnectionFailure setting");
        return super.retryOnConnectionFailure();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public SocketFactory socketFactory() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport socketFactory setting");
        return super.socketFactory();
    }

    @Override // okhttp3.OkHttpClient, com.bytedance.ee.eenet.httpclient.AbstractC12625f
    public SSLSocketFactory sslSocketFactory() {
        C13479a.m54775e("eenet_RustOkHttpClientWrapper", "rust channel nonsupport sslSocketFactory setting");
        return super.sslSocketFactory();
    }

    /* renamed from: b */
    public final C12630a mo47955b() {
        if (this.f33831c == null) {
            this.f33831c = C12638b.m52409a(dispatcher());
        }
        return this.f33831c;
    }

    @Override // com.bytedance.ee.eenet.httpclient.AbstractC12627g
    /* renamed from: b */
    public AbstractC12625f mo47924b(OkHttpClient okHttpClient) {
        return new C12629i(okHttpClient);
    }

    C12629i(OkHttpClient okHttpClient) {
        this.f33827a = okHttpClient.newBuilder().build();
    }

    @Override // okhttp3.OkHttpClient, okhttp3.Call.Factory
    public Call newCall(Request request) {
        C12641a.m52415a(this.f33827a);
        return C12635b.m52400a(this, request, false);
    }
}
