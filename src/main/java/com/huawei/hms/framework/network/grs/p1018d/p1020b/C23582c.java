package com.huawei.hms.framework.network.grs.p1018d.p1020b;

import android.content.Context;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* renamed from: com.huawei.hms.framework.network.grs.d.b.c */
public class C23582c extends SSLSocketFactory {

    /* renamed from: a */
    public static final X509HostnameVerifier f58150a = new BrowserCompatHostnameVerifier();

    /* renamed from: b */
    public static final X509HostnameVerifier f58151b = new StrictHostnameVerifier();

    /* renamed from: c */
    private static volatile C23582c f58152c = null;

    /* renamed from: d */
    private static String[] f58153d = null;

    /* renamed from: e */
    private SSLContext f58154e = null;

    /* renamed from: f */
    private Context f58155f;

    private C23582c(Context context, String str) {
        this.f58155f = context;
        this.f58154e = AbstractC23581b.m85550a();
        C23583d dVar = new C23583d(this.f58155f, str);
        this.f58154e.init(null, new X509TrustManager[]{dVar}, null);
    }

    /* renamed from: a */
    public static C23582c m85558a(Context context, String str) {
        if (f58152c == null) {
            synchronized (C23582c.class) {
                if (f58152c == null) {
                    f58152c = new C23582c(context, str);
                }
            }
        }
        return f58152c;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = this.f58154e.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            AbstractC23581b.m85556d((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f58154e.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            AbstractC23581b.m85556d((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        String[] strArr = f58153d;
        return strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
