package com.huawei.secure.android.common.ssl;

import com.huawei.secure.android.common.ssl.p1028b.C23817b;
import com.huawei.secure.android.common.ssl.p1028b.C23821f;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* renamed from: com.huawei.secure.android.common.ssl.c */
public class C23824c extends SSLSocketFactory {

    /* renamed from: a */
    public static final X509HostnameVerifier f59002a = new BrowserCompatHostnameVerifier();

    /* renamed from: b */
    public static final X509HostnameVerifier f59003b = new StrictHostnameVerifier();

    /* renamed from: c */
    private static final String f59004c = C23824c.class.getSimpleName();

    /* renamed from: d */
    private static volatile C23824c f59005d = null;

    /* renamed from: e */
    private SSLContext f59006e = AbstractC23811a.m87027a();

    /* renamed from: f */
    private SSLSocket f59007f;

    /* renamed from: g */
    private String[] f59008g;

    /* renamed from: h */
    private X509TrustManager f59009h;

    /* renamed from: i */
    private String[] f59010i;

    /* renamed from: j */
    private String[] f59011j;

    /* renamed from: k */
    private String[] f59012k;

    @Override // org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.ssl.SSLSocketFactory
    public Socket createSocket() throws IOException {
        C23821f.m87076b(f59004c, "createSocket: ");
        Socket createSocket = this.f59006e.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            m87084a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f59007f = sSLSocket;
            this.f59008g = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    /* renamed from: b */
    public void mo85536b(X509TrustManager x509TrustManager) {
        this.f59009h = x509TrustManager;
    }

    /* renamed from: a */
    static void m87085a(X509TrustManager x509TrustManager) {
        C23821f.m87076b(f59004c, "sasf update socket factory trust manager");
        try {
            f59005d = new C23824c(null, x509TrustManager);
        } catch (NoSuchAlgorithmException unused) {
            C23821f.m87078d(f59004c, "NoSuchAlgorithmException");
        } catch (KeyManagementException unused2) {
            C23821f.m87078d(f59004c, "KeyManagementException");
        } catch (UnrecoverableKeyException unused3) {
            C23821f.m87078d(f59004c, "UnrecoverableKeyException");
        } catch (KeyStoreException unused4) {
            C23821f.m87078d(f59004c, "KeyStoreException");
        } catch (CertificateException unused5) {
            C23821f.m87078d(f59004c, "CertificateException");
        } catch (IOException unused6) {
            C23821f.m87078d(f59004c, "IOException");
        }
    }

    /* renamed from: a */
    private void m87084a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!C23817b.m87064a(this.f59012k)) {
            C23821f.m87076b(f59004c, "set protocols");
            AbstractC23811a.m87033c((SSLSocket) socket, this.f59012k);
            z = true;
        } else {
            z = false;
        }
        if (!C23817b.m87064a(this.f59011j) || !C23817b.m87064a(this.f59010i)) {
            C23821f.m87076b(f59004c, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            AbstractC23811a.m87034d(sSLSocket);
            if (!C23817b.m87064a(this.f59011j)) {
                AbstractC23811a.m87029a(sSLSocket, this.f59011j);
            } else {
                AbstractC23811a.m87031b(sSLSocket, this.f59010i);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            C23821f.m87076b(f59004c, "set default protocols");
            AbstractC23811a.m87034d((SSLSocket) socket);
        }
        if (!z2) {
            C23821f.m87076b(f59004c, "set default cipher suites");
            AbstractC23811a.m87028a((SSLSocket) socket);
        }
    }

    public C23824c(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        mo85536b(x509TrustManager);
        this.f59006e.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory, org.apache.http.conn.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        C23821f.m87076b(f59004c, "createSocket: socket host port autoClose");
        Socket createSocket = this.f59006e.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            m87084a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f59007f = sSLSocket;
            this.f59008g = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
