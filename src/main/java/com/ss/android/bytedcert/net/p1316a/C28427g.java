package com.ss.android.bytedcert.net.p1316a;

import android.text.TextUtils;
import java.net.URL;

/* renamed from: com.ss.android.bytedcert.net.a.g */
public class C28427g {

    /* renamed from: a */
    private String f71504a;

    /* renamed from: b */
    private String f71505b;

    /* renamed from: c */
    private String f71506c;

    /* renamed from: a */
    public String mo101224a() {
        return this.f71505b;
    }

    /* renamed from: b */
    public String mo101225b() {
        return this.f71506c;
    }

    /* renamed from: c */
    public C28427g mo101226c() {
        String str;
        if (!m104175a(this.f71504a)) {
            return this;
        }
        try {
            URL url = new URL(this.f71504a);
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            StringBuilder sb = new StringBuilder();
            if (host != null) {
                if (protocol != null) {
                    sb.append(protocol);
                    sb.append("://");
                }
                sb.append(host);
                if (port > 0) {
                    sb.append(':');
                    sb.append(port);
                }
                sb.append("/");
            }
            this.f71505b = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(url.getPath());
            if (url.getQuery() == null) {
                str = "";
            } else {
                str = "?" + url.getQuery();
            }
            sb2.append(str);
            this.f71506c = sb2.toString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this;
    }

    public C28427g(String str) {
        this.f71504a = str;
    }

    /* renamed from: a */
    public static boolean m104175a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            return true;
        }
        return false;
    }
}
