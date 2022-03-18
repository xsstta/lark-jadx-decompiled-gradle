package com.bytedance.ee.eenet.httpclient;

import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.ee.eenet.httpclient.p600a.C12615a;
import com.bytedance.ee.eenet.httpclient.rust.C12635b;
import com.bytedance.ee.eenet.p598a.C12611a;
import com.bytedance.ee.eenet.p599b.AbstractC12612a;
import com.bytedance.ee.eenet.p599b.C12613b;
import com.bytedance.ee.eenet.util.HttpChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.eenet.httpclient.d */
public class C12619d extends EventListener {

    /* renamed from: a */
    private LruCache<Call, C12621a> f33799a = new LruCache<>(10);

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.eenet.httpclient.d$b */
    public static class C12622b {

        /* renamed from: a */
        public long f33802a;

        /* renamed from: b */
        public long f33803b;

        /* renamed from: c */
        public long f33804c;

        /* renamed from: d */
        public long f33805d;

        /* renamed from: e */
        public long f33806e;

        /* renamed from: f */
        public long f33807f;

        /* renamed from: g */
        public long f33808g;

        /* renamed from: h */
        public long f33809h;

        /* renamed from: i */
        public long f33810i;

        /* renamed from: j */
        public long f33811j;

        /* renamed from: k */
        public long f33812k;

        /* renamed from: l */
        public long f33813l;

        /* renamed from: m */
        public long f33814m;

        /* renamed from: n */
        public long f33815n;

        /* renamed from: o */
        public long f33816o;

        /* renamed from: p */
        public long f33817p;

        /* renamed from: q */
        public long f33818q;

        /* renamed from: r */
        public long f33819r;

        /* renamed from: s */
        public long f33820s;

        /* renamed from: t */
        public String f33821t;

        /* renamed from: u */
        public IOException f33822u;

        private C12622b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.eenet.httpclient.d$a */
    public static class C12621a {

        /* renamed from: a */
        public EventListener f33800a;

        /* renamed from: b */
        public C12622b f33801b;

        private C12621a() {
            this.f33801b = new C12622b();
        }
    }

    /* renamed from: a */
    private long m52371a(long j) {
        if (j == 0) {
            return 0;
        }
        return SystemClock.elapsedRealtime() - j;
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.callStart(call);
            aVar.f33801b.f33802a = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.requestBodyStart(call);
            aVar.f33801b.f33808g = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.requestHeadersStart(call);
            aVar.f33801b.f33807f = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.responseBodyStart(call);
            aVar.f33801b.f33810i = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.responseHeadersStart(call);
            aVar.f33801b.f33809h = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.secureConnectStart(call);
            aVar.f33801b.f33805d = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        C12621a remove = this.f33799a.remove(call);
        if (remove != null) {
            remove.f33800a.callEnd(call);
            remove.f33801b.f33819r = m52371a(remove.f33801b.f33802a);
            m52372a(call, remove.f33801b, false);
        }
    }

    /* renamed from: a */
    public void mo47926a(Call call, EventListener eventListener) {
        if (call != null && eventListener != null) {
            C12621a aVar = new C12621a();
            aVar.f33800a = eventListener;
            this.f33799a.put(call, aVar);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.connectionAcquired(call, connection);
            aVar.f33801b.f33806e = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.connectionReleased(call, connection);
            aVar.f33801b.f33814m = m52371a(aVar.f33801b.f33806e);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.dnsStart(call, str);
            aVar.f33801b.f33803b = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.requestBodyEnd(call, j);
            aVar.f33801b.f33816o = m52371a(aVar.f33801b.f33808g);
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.requestHeadersEnd(call, request);
            aVar.f33801b.f33815n = m52371a(aVar.f33801b.f33807f);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.responseHeadersEnd(call, response);
            aVar.f33801b.f33817p = m52371a(aVar.f33801b.f33809h);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.secureConnectEnd(call, handshake);
            aVar.f33801b.f33813l = m52371a(aVar.f33801b.f33805d);
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        C12621a remove = this.f33799a.remove(call);
        if (remove != null) {
            remove.f33800a.callFailed(call, iOException);
            remove.f33801b.f33822u = iOException;
            remove.f33801b.f33819r = m52371a(remove.f33801b.f33802a);
            m52372a(call, remove.f33801b, true);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.responseBodyEnd(call, j);
            aVar.f33801b.f33820s = j;
            aVar.f33801b.f33818q = m52371a(aVar.f33801b.f33810i);
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.connectStart(call, inetSocketAddress, proxy);
            aVar.f33801b.f33804c = SystemClock.elapsedRealtime();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.dnsEnd(call, str, list);
            aVar.f33801b.f33811j = m52371a(aVar.f33801b.f33803b);
        }
    }

    /* renamed from: a */
    private void m52372a(Call call, C12622b bVar, boolean z) {
        AbstractC12612a a;
        if (!(call instanceof C12635b) && (a = C12613b.m52340a()) != null) {
            C12611a aVar = new C12611a();
            aVar.f33779o = HttpChannel.OkHttpChannel.toString();
            aVar.f33774j = bVar.f33821t;
            aVar.f33766b = (int) (bVar.f33812k - bVar.f33813l);
            aVar.f33767c = (int) bVar.f33813l;
            aVar.f33765a = (int) bVar.f33811j;
            aVar.f33768d = (int) bVar.f33815n;
            aVar.f33769e = (int) bVar.f33816o;
            aVar.f33770f = aVar.f33768d + aVar.f33769e;
            aVar.f33771g = (int) bVar.f33817p;
            aVar.f33772h = (int) bVar.f33818q;
            aVar.f33773i = aVar.f33771g + aVar.f33772h;
            aVar.f33785u = bVar.f33820s;
            Request request = call.request();
            if (request != null) {
                aVar.f33775k = request.url().toString();
                aVar.f33776l = request.url().host();
                aVar.f33778n = request.url().topPrivateDomain();
                String header = request.header("request-id");
                String str = "";
                if (header == null) {
                    header = str;
                }
                aVar.f33780p = header;
                String header2 = request.header("EENet-Request-Tag");
                if (header2 != null) {
                    str = header2;
                }
                aVar.f33783s = str;
                aVar.f33782r = request.method();
                aVar.f33784t = C12615a.m52354a(request);
            }
            if (!z) {
                a.mo23874a(bVar.f33819r, bVar.f33802a, aVar);
            } else {
                a.mo23875a(bVar.f33819r, bVar.f33802a, aVar, bVar.f33822u);
            }
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        String str;
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.connectEnd(call, inetSocketAddress, proxy, protocol);
            aVar.f33801b.f33812k = m52371a(aVar.f33801b.f33804c);
            C12622b bVar = aVar.f33801b;
            if (protocol == null) {
                str = " ";
            } else {
                str = protocol.toString();
            }
            bVar.f33821t = str;
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        String str;
        C12621a aVar = this.f33799a.get(call);
        if (aVar != null) {
            aVar.f33800a.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            aVar.f33801b.f33812k = m52371a(aVar.f33801b.f33804c);
            C12622b bVar = aVar.f33801b;
            if (protocol == null) {
                str = " ";
            } else {
                str = protocol.toString();
            }
            bVar.f33821t = str;
        }
    }
}
