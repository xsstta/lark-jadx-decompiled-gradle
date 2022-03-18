package com.huawei.hms.framework.network.grs.p1018d.p1019a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.p1018d.C23577a;
import com.huawei.hms.framework.network.grs.p1018d.p1020b.C23580a;
import com.huawei.hms.framework.network.grs.p1018d.p1020b.C23582c;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.huawei.hms.framework.network.grs.d.a.a */
public class C23578a {
    /* renamed from: a */
    public static HttpsURLConnection m85544a(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            try {
                httpsURLConnection.setSSLSocketFactory(C23580a.m85549a(context));
                httpsURLConnection.setHostnameVerifier(C23582c.f58151b);
            } catch (IllegalArgumentException unused) {
                Logger.m85375w("URLConnectionHelper", "init https ssl socket failed.");
            }
            httpsURLConnection.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            httpsURLConnection.setReadTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            String b = C23577a.m85543b(context, "NetworkKit-grs", str2);
            Logger.m85366d("URLConnectionHelper", "request to grs server with a User-Agent header is:" + b);
            httpsURLConnection.setRequestProperty("User-Agent", b);
            return httpsURLConnection;
        }
        Logger.m85375w("URLConnectionHelper", "urlConnection is not an instance of HttpsURLConnection");
        return null;
    }
}
