package com.facebook.react.modules.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.facebook.react.modules.network.q */
public class C21239q extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f51739a;

    public String[] getDefaultCipherSuites() {
        return this.f51739a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f51739a.getSupportedCipherSuites();
    }

    public C21239q() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, null, null);
        this.f51739a = instance.getSocketFactory();
    }

    /* renamed from: a */
    private Socket m77025a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return m77025a(this.f51739a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m77025a(this.f51739a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return m77025a(this.f51739a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m77025a(this.f51739a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m77025a(this.f51739a.createSocket(socket, str, i, z));
    }
}
