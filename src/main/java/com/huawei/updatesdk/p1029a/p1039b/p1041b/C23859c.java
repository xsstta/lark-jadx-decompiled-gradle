package com.huawei.updatesdk.p1029a.p1039b.p1041b;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.p1029a.p1030a.p1031a.C23832d;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i.C23848b;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;
import java.io.File;
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

/* renamed from: com.huawei.updatesdk.a.b.b.c */
public class C23859c {

    /* renamed from: a */
    private static volatile C23859c f59090a;

    /* renamed from: a */
    public static synchronized C23859c m87233a() {
        C23859c cVar;
        synchronized (C23859c.class) {
            if (f59090a == null) {
                f59090a = new C23859c();
            }
            cVar = f59090a;
        }
        return cVar;
    }

    /* renamed from: b */
    public static String m87234b() {
        String b = C23854a.m87210c().mo85583b();
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        String str = b + "/updatesdk";
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : "";
    }

    /* renamed from: c */
    private Proxy m87235c() {
        if (C23848b.m87196e(C23854a.m87210c().mo85582a())) {
            return C23848b.m87189a();
        }
        return null;
    }

    /* renamed from: a */
    public HttpURLConnection mo85599a(String str) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IllegalAccessException {
        URL url = new URL(str);
        Proxy c = m87235c();
        HttpURLConnection httpURLConnection = (HttpURLConnection) (c == null ? url.openConnection() : url.openConnection(c));
        httpURLConnection.setConnectTimeout(7000);
        httpURLConnection.setReadTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setInstanceFollowRedirects(true);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(C23832d.m87115a(C23854a.m87210c().mo85582a()));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
        return httpURLConnection;
    }
}
