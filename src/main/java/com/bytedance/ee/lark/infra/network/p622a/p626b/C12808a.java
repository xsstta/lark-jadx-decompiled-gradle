package com.bytedance.ee.lark.infra.network.p622a.p626b;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import okhttp3.Dns;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.lark.infra.network.a.b.a */
public class C12808a extends SocketFactory implements Dns {

    /* renamed from: a */
    private final Map<String, String> f34196a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, String> f34197b = new LinkedHashMap();

    /* renamed from: c */
    private int f34198c = 1;

    /* renamed from: com.bytedance.ee.lark.infra.network.a.b.a$a */
    class C12809a extends Socket {

        /* renamed from: b */
        private LocalSocket f34200b;

        @Override // java.net.Socket
        public InputStream getInputStream() throws IOException {
            return this.f34200b.getInputStream();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() throws IOException {
            return this.f34200b.getOutputStream();
        }

        public boolean isConnected() {
            return this.f34200b.isConnected();
        }

        C12809a() {
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) throws IOException {
            this.f34200b.bind(new LocalSocketAddress(socketAddress.toString()));
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i) throws IOException {
            String a = C12808a.this.mo48367a(((InetSocketAddress) socketAddress).getAddress());
            System.out.println(a);
            if (a != null) {
                LocalSocket localSocket = new LocalSocket();
                this.f34200b = localSocket;
                localSocket.connect(new LocalSocketAddress(a));
                return;
            }
            throw new IOException("can not find path with this socket");
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return new C12809a();
    }

    /* renamed from: a */
    public synchronized String mo48367a(InetAddress inetAddress) {
        return this.f34197b.get(inetAddress.getHostName());
    }

    /* renamed from: a */
    private synchronized String m52909a(String str) {
        String str2;
        str2 = this.f34196a.get(str);
        if (str2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("p");
            int i = this.f34198c;
            this.f34198c = i + 1;
            sb.append(i);
            sb.append(".socket");
            str2 = sb.toString();
            this.f34196a.put(str, str2);
            this.f34197b.put(str2, str);
        }
        return str2;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        if (str.endsWith(".socket")) {
            return Collections.singletonList(InetAddress.getByAddress(str, new byte[]{0, 0, 0, 0}));
        }
        return Dns.SYSTEM.lookup(str);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public HttpUrl mo48368a(String str, String str2) {
        return new HttpUrl.Builder().scheme("http").host(m52909a(str)).addPathSegment(str2).build();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public HttpUrl mo48369a(String str, String str2, String str3, String str4) {
        return new HttpUrl.Builder().scheme("http").host(m52909a(str)).addPathSegment(str2).addPathSegment(str3).addPathSegment(str4).build();
    }
}
