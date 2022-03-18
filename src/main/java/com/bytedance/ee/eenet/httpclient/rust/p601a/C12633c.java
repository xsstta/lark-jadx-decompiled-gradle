package com.bytedance.ee.eenet.httpclient.rust.p601a;

import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.sdk.api.LarkProxyApi;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.a.c */
public class C12633c implements Interceptor {

    /* renamed from: d */
    private static AtomicBoolean f33847d = new AtomicBoolean(false);

    /* renamed from: a */
    private ProxySelector f33848a;

    /* renamed from: b */
    private Proxy f33849b;

    /* renamed from: c */
    private LarkProxyApi f33850c;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (this.f33849b == null) {
            List<Proxy> select = this.f33848a.select(URI.create("http://localhost"));
            if (select.size() > 0) {
                this.f33849b = select.get(0);
            }
        }
        if (this.f33849b != Proxy.NO_PROXY || !f33847d.getAndSet(false)) {
            Proxy proxy = this.f33849b;
            if (proxy != null) {
                SocketAddress address = proxy.address();
                if (address instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    if (!f33847d.getAndSet(true)) {
                        String hostName = inetSocketAddress.getHostName();
                        String valueOf = String.valueOf(inetSocketAddress.getPort());
                        C13479a.m54764b("eenet_HttpProxyInterceptor", "set proxy host: " + hostName + "->port: " + valueOf);
                        this.f33850c.mo67174a(hostName, valueOf, LarkProxyApi.ProxyType.HTTP);
                    }
                } else if (f33847d.getAndSet(false)) {
                    this.f33850c.mo67173a();
                    C13479a.m54764b("eenet_HttpProxyInterceptor", "clear proxy address not instance of InetSocketAddress");
                }
            }
        } else {
            C13479a.m54764b("eenet_HttpProxyInterceptor", "clear proxy");
            this.f33850c.mo67173a();
        }
        return chain.proceed(chain.request());
    }

    public C12633c(Proxy proxy, ProxySelector proxySelector, LarkProxyApi larkProxyApi) {
        this.f33849b = proxy;
        this.f33848a = proxySelector;
        this.f33850c = larkProxyApi;
    }
}
