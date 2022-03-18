package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.AbstractC69698d;
import okio.AbstractC69699e;
import okio.AbstractC69723u;
import okio.C69705k;

public final class RealConnection extends Http2Connection.Listener implements Connection {
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private AbstractC69698d sink;
    private Socket socket;
    private AbstractC69699e source;
    public int successCount;

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        return this.protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        return this.socket;
    }

    public void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    public boolean isMultiplexed() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    private Request createTunnelRequest() {
        return new Request.Builder().url(this.route.address().url()).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(":");
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake2 = this.handshake;
        if (handshake2 != null) {
            obj = handshake2.cipherSuite();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    public RealWebSocket.Streams newWebSocketStreams(final StreamAllocation streamAllocation) {
        return new RealWebSocket.Streams(true, this.source, this.sink) {
            /* class okhttp3.internal.connection.RealConnection.C696701 */

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                StreamAllocation streamAllocation = streamAllocation;
                streamAllocation.streamFinished(true, streamAllocation.codec(), -1, null);
            }
        };
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection http2Connection2) {
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection2.maxConcurrentStreams();
        }
    }

    private boolean isValid(SSLSession sSLSession) {
        if ("NONE".equals(sSLSession.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public boolean isHealthy(boolean z) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return !http2Connection2.isShutdown();
        }
        if (z) {
            try {
                int soTimeout = this.socket.getSoTimeout();
                try {
                    this.socket.setSoTimeout(1);
                    if (this.source.exhausted()) {
                        this.socket.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.socket.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.socket.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port() != this.route.address().url().port()) {
            return false;
        }
        if (httpUrl.host().equals(this.route.address().url().host())) {
            return true;
        }
        if (this.handshake == null || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.handshake.peerCertificates().get(0))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x011d A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0123 A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r8) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    public RealConnection(ConnectionPool connectionPool2, Route route2) {
        this.connectionPool = connectionPool2;
        this.route = route2;
    }

    public boolean isEligible(Address address, @Nullable Route route2) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.route.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || route2 == null || route2.proxy().type() != Proxy.Type.DIRECT || this.route.proxy().type() != Proxy.Type.DIRECT || !this.route.socketAddress().equals(route2.socketAddress()) || route2.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public HttpCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation) throws SocketException {
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, http2Connection2);
        }
        this.socket.setSoTimeout(chain.readTimeoutMillis());
        this.source.timeout().timeout((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(okHttpClient, streamAllocation, this.source, this.sink);
    }

    public static RealConnection testConnection(ConnectionPool connectionPool2, Route route2, Socket socket2, long j) {
        RealConnection realConnection = new RealConnection(connectionPool2, route2);
        realConnection.socket = socket2;
        realConnection.idleAtNanos = j;
        return realConnection;
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            this.protocol = Protocol.HTTP_1_1;
            this.socket = this.rawSocket;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            this.socket.setSoTimeout(0);
            Http2Connection build = new Http2Connection.Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(i).build();
            this.http2Connection = build;
            build.start();
        }
    }

    private void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket2;
        try {
            Proxy proxy = this.route.proxy();
            Address address = this.route.address();
            if (proxy.type() != Proxy.Type.DIRECT) {
                if (proxy.type() != Proxy.Type.HTTP) {
                    socket2 = new Socket(proxy);
                    this.rawSocket = socket2;
                    eventListener.connectStart(call, this.route.socketAddress(), proxy);
                    this.rawSocket.setSoTimeout(i2);
                    Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i);
                    this.source = C69705k.m267590a(C69705k.m267600b(this.rawSocket));
                    this.sink = C69705k.m267589a(C69705k.m267594a(this.rawSocket));
                }
            }
            socket2 = address.socketFactory().createSocket();
            this.rawSocket = socket2;
            eventListener.connectStart(call, this.route.socketAddress(), proxy);
            this.rawSocket.setSoTimeout(i2);
            try {
                Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i);
                try {
                    this.source = C69705k.m267590a(C69705k.m267600b(this.rawSocket));
                    this.sink = C69705k.m267589a(C69705k.m267594a(this.rawSocket));
                } catch (NullPointerException e) {
                    if ("throw with null exception".equals(e.getMessage())) {
                        throw new IOException(e);
                    }
                }
            } catch (ConnectException e2) {
                ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
                connectException.initCause(e2);
                throw connectException;
            }
        } finally {
            IOException iOException = new IOException(e);
        }
    }

    private Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.hostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            http1Codec.writeRequest(request.headers(), str);
            http1Codec.finishRequest();
            Response build = http1Codec.readResponseHeaders(false).request(request).build();
            long contentLength = HttpHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            AbstractC69723u newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(build.header("Connection"))) {
                        return authenticate;
                    } else {
                        request = authenticate;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + build.code());
                }
            } else if (this.source.buffer().exhausted() && this.sink.buffer().exhausted()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i4 = 0; i4 < 21; i4++) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Util.closeQuietly(this.rawSocket);
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }
}
