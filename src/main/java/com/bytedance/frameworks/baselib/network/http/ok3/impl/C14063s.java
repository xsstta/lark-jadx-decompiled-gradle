package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.s */
public class C14063s extends SSLSocketFactory {

    /* renamed from: b */
    private static final String[] f36929b = {"TLSv1.2"};

    /* renamed from: a */
    final SSLSocketFactory f36930a;

    public String[] getDefaultCipherSuites() {
        return this.f36930a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f36930a.getSupportedCipherSuites();
    }

    public C14063s(SSLSocketFactory sSLSocketFactory) {
        this.f36930a = sSLSocketFactory;
    }

    /* renamed from: a */
    private Socket m56924a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f36929b);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return m56924a(this.f36930a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m56924a(this.f36930a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m56924a(this.f36930a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m56924a(this.f36930a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m56924a(this.f36930a.createSocket(socket, str, i, z));
    }
}
