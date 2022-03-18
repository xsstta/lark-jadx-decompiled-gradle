package com.bytedance.ee.lark.infra.network.ref.p635a;

import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.a.b */
public abstract class AbstractC12848b extends AbstractC12855g {

    /* renamed from: a */
    private AbstractC12625f f34309a;

    /* renamed from: a */
    public abstract AbstractC12625f mo48482a(OkHttpClient.Builder builder);

    public AbstractC12848b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12855g
    /* renamed from: a */
    public void mo48484a() {
        if (this.f34309a == null) {
            this.f34309a = mo48482a(new OkHttpClient.Builder().readTimeout(mo48490b().mo48491a(), TimeUnit.MILLISECONDS).writeTimeout(mo48490b().mo48492b(), TimeUnit.MILLISECONDS).connectTimeout(mo48490b().mo48493c(), TimeUnit.MILLISECONDS).retryOnConnectionFailure(mo48490b().mo48494d()).eventListener(new EventListener() {
                /* class com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12848b.C128491 */

                @Override // okhttp3.EventListener
                public void callEnd(Call call) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48561b();
                }

                @Override // okhttp3.EventListener
                public void callStart(Call call) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48554a();
                }

                @Override // okhttp3.EventListener
                public void callFailed(Call call, IOException iOException) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48555a(iOException);
                }

                @Override // okhttp3.EventListener
                public void dnsStart(Call call, String str) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48556a(str);
                }

                @Override // okhttp3.EventListener
                public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48558a(inetSocketAddress, proxy);
                }

                @Override // okhttp3.EventListener
                public void dnsEnd(Call call, String str, List<InetAddress> list) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48557a(str, list);
                }

                @Override // okhttp3.EventListener
                public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48559a(inetSocketAddress, proxy, protocol);
                }

                @Override // okhttp3.EventListener
                public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
                    AbstractC12848b.this.mo48490b().mo48495e().mo48560a(inetSocketAddress, proxy, protocol, iOException);
                }
            }));
        }
    }

    public AbstractC12848b(C12856h hVar) {
        super(hVar);
    }

    @Override // com.bytedance.ee.lark.infra.network.ref.p635a.AbstractC12855g
    /* renamed from: a */
    public AbstractC12860j mo48483a(C12878e eVar, C12880g gVar) {
        mo48484a();
        return new C12852d(eVar, gVar, this.f34309a.newCall(C12850c.m53061a(gVar)));
    }
}
