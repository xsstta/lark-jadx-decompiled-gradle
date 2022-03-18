package com.huawei.updatesdk.p1029a.p1030a.p1031a;

import android.content.Context;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.C23848b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.huawei.updatesdk.a.a.a.b */
public class C23829b {

    /* renamed from: a */
    private HttpURLConnection f59032a = null;

    /* renamed from: com.huawei.updatesdk.a.a.a.b$a */
    public static class C23830a {

        /* renamed from: a */
        private String f59033a;

        /* renamed from: b */
        private int f59034b;

        /* renamed from: a */
        public int mo85557a() {
            return this.f59034b;
        }

        /* renamed from: b */
        public String mo85558b() {
            return this.f59033a;
        }
    }

    /* renamed from: a */
    private HttpURLConnection m87100a(String str, Context context) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IllegalAccessException {
        HttpsURLConnection httpsURLConnection;
        URL url = new URL(str);
        Proxy b = C23848b.m87193b(context);
        if ("https".equals(url.getProtocol())) {
            httpsURLConnection = (HttpsURLConnection) (b == null ? url.openConnection() : url.openConnection(b));
            httpsURLConnection.setSSLSocketFactory(C23832d.m87115a(context));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        } else {
            httpsURLConnection = null;
        }
        return "http".equals(url.getProtocol()) ? (HttpURLConnection) url.openConnection() : httpsURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m87101a(byte[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = "gzip error!"
            java.lang.String r1 = "HttpsUtil"
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x002b }
            r3.<init>()     // Catch:{ IOException -> 0x002b }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0027 }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0027 }
            int r6 = r8.length     // Catch:{ IOException -> 0x0027 }
            r5.<init>(r3, r6)     // Catch:{ IOException -> 0x0027 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0027 }
            r2 = 0
            int r5 = r8.length     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r4.write(r8, r2, r5)     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r4.flush()     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r4.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0021:
            r8 = move-exception
            r2 = r4
            goto L_0x003f
        L_0x0024:
            r8 = move-exception
            r2 = r4
            goto L_0x002d
        L_0x0027:
            r8 = move-exception
            goto L_0x002d
        L_0x0029:
            r8 = move-exception
            goto L_0x003f
        L_0x002b:
            r8 = move-exception
            r3 = r2
        L_0x002d:
            com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a.m87117a(r1, r0, r8)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x003a
            r2.close()
            goto L_0x003a
        L_0x0036:
            r8 = move-exception
            com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a.m87117a(r1, r0, r8)
        L_0x003a:
            byte[] r8 = r3.toByteArray()
            return r8
        L_0x003f:
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a.m87117a(r1, r0, r2)
        L_0x0049:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1030a.p1031a.C23829b.m87101a(byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.huawei.updatesdk.p1029a.p1030a.p1031a.C23829b.C23830a mo85555a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.content.Context r8) throws java.io.IOException, java.security.cert.CertificateException, java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.KeyManagementException {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1030a.p1031a.C23829b.mo85555a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context):com.huawei.updatesdk.a.a.a.b$a");
    }

    /* renamed from: a */
    public void mo85556a() {
        HttpURLConnection httpURLConnection = this.f59032a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
