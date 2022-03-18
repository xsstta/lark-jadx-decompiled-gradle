package com.huawei.updatesdk.p1029a.p1030a.p1031a;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.huawei.updatesdk.a.a.a.d */
public class C23832d extends SSLSocketFactory {

    /* renamed from: b */
    private static volatile C23832d f59038b;

    /* renamed from: a */
    private SSLContext f59039a;

    private C23832d(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f59039a = null;
        this.f59039a = AbstractC23831c.m87108a();
        C23833e eVar = new C23833e(context);
        this.f59039a.init(null, new X509TrustManager[]{eVar}, null);
    }

    /* renamed from: a */
    public static C23832d m87115a(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        if (f59038b == null) {
            synchronized (C23832d.class) {
                if (f59038b == null) {
                    f59038b = new C23832d(context);
                }
            }
        }
        return f59038b;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f59039a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            AbstractC23831c.m87113c((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f59039a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            AbstractC23831c.m87113c((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
