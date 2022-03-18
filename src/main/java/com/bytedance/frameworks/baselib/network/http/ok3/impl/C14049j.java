package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.j */
public class C14049j extends EventListener {

    /* renamed from: a */
    private final C14050k f36828a;

    /* renamed from: b */
    private final EventListener f36829b;

    /* renamed from: c */
    private final String f36830c = C14049j.class.getSimpleName();

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        super.callEnd(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.callEnd(call);
        }
        this.f36828a.f36868p = System.currentTimeMillis();
        this.f36828a.f36841K = EnumC14024d.IDLE;
        this.f36828a.f36844N = EnumC14060p.SUCCESS;
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        super.callStart(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.callStart(call);
        }
        this.f36828a.f36853a = System.currentTimeMillis();
        this.f36828a.f36844N = EnumC14060p.IO_PENDING;
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.requestBodyStart(call);
        }
        this.f36828a.f36862j = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.requestHeadersStart(call);
        }
        this.f36828a.f36841K = EnumC14024d.SENDING_REQUEST;
        this.f36828a.f36860h = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.responseBodyStart(call);
        }
        this.f36828a.f36841K = EnumC14024d.READING_RESPONSE;
        this.f36828a.f36866n = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.responseHeadersStart(call);
        }
        this.f36828a.f36864l = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.secureConnectStart(call);
        }
        this.f36828a.f36858f = System.currentTimeMillis();
        this.f36828a.f36841K = EnumC14024d.SSL_HANDSHAKE;
    }

    /* renamed from: a */
    private int m56876a(IOException iOException) {
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return -104;
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if (!(iOException instanceof ProtocolException) && !(iOException instanceof HttpRetryException) && !(iOException instanceof UnknownServiceException) && "java.io.IOException: Exception in connect".equals(iOException.getMessage())) {
            return -15;
        }
        return -1;
    }

    public C14049j(EventListener eventListener, C14050k kVar) {
        this.f36829b = eventListener;
        this.f36828a = kVar;
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.connectionReleased(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.dnsStart(call, str);
        }
        this.f36828a.f36854b = System.currentTimeMillis();
        this.f36828a.f36841K = EnumC14024d.RESOLVING_HOST;
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        super.requestBodyEnd(call, j);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.requestBodyEnd(call, j);
        }
        this.f36828a.f36863k = System.currentTimeMillis();
        this.f36828a.f36876x = j;
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        super.responseBodyEnd(call, j);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.responseBodyEnd(call, j);
        }
        this.f36828a.f36867o = System.currentTimeMillis();
        this.f36828a.f36831A = j;
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.secureConnectEnd(call, handshake);
        }
        this.f36828a.f36859g = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.callFailed(call, iOException);
        }
        this.f36828a.f36868p = System.currentTimeMillis();
        this.f36828a.f36841K = EnumC14024d.IDLE;
        if ("Canceled".equals(iOException.getMessage())) {
            this.f36828a.f36844N = EnumC14060p.CANCELED;
        } else {
            this.f36828a.f36844N = EnumC14060p.FAILED;
        }
        this.f36828a.f36843M = m56876a(iOException);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.requestHeadersEnd(call, request);
        }
        this.f36828a.f36861i = System.currentTimeMillis();
        if (request != null) {
            this.f36828a.f36877y = request.headers();
        }
        this.f36828a.f36841K = EnumC14024d.WAITING_FOR_RESPONSE;
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.connectionAcquired(call, connection);
        }
        if (connection != null) {
            if (!(connection.socket() == null || connection.socket().getInetAddress() == null || connection.socket().getInetAddress().getHostAddress() == null)) {
                this.f36828a.f36835E = connection.socket().getInetAddress().getHostAddress();
            }
            this.f36828a.f36836F = connection.socket();
        }
        this.f36828a.f36869q = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.responseHeadersEnd(call, response);
        }
        this.f36828a.f36865m = System.currentTimeMillis();
        if (this.f36828a.f36859g != -1) {
            this.f36828a.f36873u = EnumC14023c.HANDSHAKE_FULL;
        } else {
            this.f36828a.f36873u = EnumC14023c.HANDSHAKE_RESUME;
        }
        if (response != null) {
            this.f36828a.f36878z = response.code();
            this.f36828a.f36832B = response.protocol();
            if (response.handshake() != null) {
                this.f36828a.f36874v = response.handshake().tlsVersion();
                this.f36828a.f36875w = response.handshake().cipherSuite();
            }
            if (response.isRedirect()) {
                this.f36828a.f36839I++;
                C14053m mVar = new C14053m();
                mVar.f36881a = response.code();
                mVar.f36882b = response.request().method();
                String header = response.header("location");
                if (!TextUtils.isEmpty(header)) {
                    mVar.f36883c = header;
                }
                this.f36828a.f36840J.add(mVar);
            }
            if (response.isSuccessful()) {
                String header2 = response.header("content-type");
                if (!TextUtils.isEmpty(header2)) {
                    this.f36828a.f36838H = header2;
                }
            }
            this.f36828a.f36837G = response.headers();
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.connectStart(call, inetSocketAddress, proxy);
        }
        this.f36828a.f36856d = System.currentTimeMillis();
        this.f36828a.f36841K = EnumC14024d.CONNECTING;
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.dnsEnd(call, str, list);
        }
        this.f36828a.f36855c = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
        }
        this.f36828a.f36857e = System.currentTimeMillis();
        if (proxy != null) {
            this.f36828a.f36872t = proxy.type();
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        EventListener eventListener = this.f36829b;
        if (eventListener != null) {
            eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        }
        if (inetSocketAddress != null) {
            this.f36828a.f36871s.add(new Pair<>(inetSocketAddress, Integer.valueOf(m56876a(iOException))));
        }
    }
}
