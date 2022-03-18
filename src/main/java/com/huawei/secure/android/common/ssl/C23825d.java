package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.p1028b.C23817b;
import com.huawei.secure.android.common.ssl.p1028b.C23818c;
import com.huawei.secure.android.common.ssl.p1028b.C23821f;
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
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* renamed from: com.huawei.secure.android.common.ssl.d */
public class C23825d extends SSLSocketFactory {

    /* renamed from: a */
    public static final X509HostnameVerifier f59013a = new BrowserCompatHostnameVerifier();

    /* renamed from: b */
    public static final X509HostnameVerifier f59014b = new StrictHostnameVerifier();

    /* renamed from: c */
    private static final String f59015c = C23825d.class.getSimpleName();

    /* renamed from: d */
    private static volatile C23825d f59016d = null;

    /* renamed from: e */
    private SSLContext f59017e;

    /* renamed from: f */
    private SSLSocket f59018f;

    /* renamed from: g */
    private Context f59019g;

    /* renamed from: h */
    private String[] f59020h;

    /* renamed from: i */
    private X509TrustManager f59021i;

    /* renamed from: j */
    private String[] f59022j;

    /* renamed from: k */
    private String[] f59023k;

    /* renamed from: l */
    private String[] f59024l;

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f59020h;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    /* renamed from: a */
    public void mo85539a(SSLContext sSLContext) {
        this.f59017e = sSLContext;
    }

    /* renamed from: b */
    public void mo85541b(X509TrustManager x509TrustManager) {
        this.f59021i = x509TrustManager;
    }

    /* renamed from: b */
    public void mo85540b(Context context) {
        this.f59019g = context.getApplicationContext();
    }

    public C23825d(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f59017e = AbstractC23811a.m87027a();
        mo85541b(x509TrustManager);
        this.f59017e.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    /* renamed from: a */
    static void m87089a(X509TrustManager x509TrustManager) {
        C23821f.m87076b(f59015c, "ssf update socket factory trust manager");
        try {
            f59016d = new C23825d(x509TrustManager);
        } catch (NoSuchAlgorithmException unused) {
            C23821f.m87078d(f59015c, "NoSuchAlgorithmException");
        } catch (KeyManagementException unused2) {
            C23821f.m87078d(f59015c, "KeyManagementException");
        }
    }

    private C23825d(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        if (context == null) {
            C23821f.m87078d(f59015c, "SecureSSLSocketFactory: context is null");
            return;
        }
        mo85540b(context);
        mo85539a(AbstractC23811a.m87027a());
        C23827f a = C23826e.m87093a(context);
        this.f59021i = a;
        this.f59017e.init(null, new X509TrustManager[]{a}, null);
    }

    /* renamed from: a */
    public static C23825d m87087a(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        C23818c.m87066a(context);
        if (f59016d == null) {
            synchronized (C23825d.class) {
                if (f59016d == null) {
                    f59016d = new C23825d(context);
                }
            }
        }
        if (f59016d.f59019g == null && context != null) {
            f59016d.mo85540b(context);
        }
        return f59016d;
    }

    /* renamed from: a */
    private void m87088a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!C23817b.m87064a(this.f59024l)) {
            C23821f.m87076b(f59015c, "set protocols");
            AbstractC23811a.m87033c((SSLSocket) socket, this.f59024l);
            z = true;
        } else {
            z = false;
        }
        if (!C23817b.m87064a(this.f59023k) || !C23817b.m87064a(this.f59022j)) {
            C23821f.m87076b(f59015c, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            AbstractC23811a.m87034d(sSLSocket);
            if (!C23817b.m87064a(this.f59023k)) {
                AbstractC23811a.m87029a(sSLSocket, this.f59023k);
            } else {
                AbstractC23811a.m87031b(sSLSocket, this.f59022j);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            C23821f.m87076b(f59015c, "set default protocols");
            AbstractC23811a.m87034d((SSLSocket) socket);
        }
        if (!z2) {
            C23821f.m87076b(f59015c, "set default cipher suites");
            AbstractC23811a.m87028a((SSLSocket) socket);
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        C23821f.m87076b(f59015c, "createSocket: host , port");
        Socket createSocket = this.f59017e.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            m87088a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f59018f = sSLSocket;
            this.f59020h = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        C23821f.m87076b(f59015c, "createSocket s host port autoClose");
        Socket createSocket = this.f59017e.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            m87088a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f59018f = sSLSocket;
            this.f59020h = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
