package com.bytedance.ee.bear.net;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.net.t */
public class C10299t implements AbstractC10289j {

    /* renamed from: a */
    private static String f27793a;

    /* renamed from: b */
    private int f27794b = 2;

    /* renamed from: c */
    private final String f27795c;

    /* renamed from: d */
    private HashMap<String, String> f27796d = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, String> f27797e = new HashMap<>();

    /* renamed from: f */
    private HashMap<String, String> f27798f = new HashMap<>();

    /* renamed from: g */
    private Map<String, List<String>> f27799g;

    /* renamed from: h */
    private Map<String, List<String>> f27800h;

    /* renamed from: i */
    private String f27801i = f27793a;

    /* renamed from: j */
    private String f27802j;

    @Override // com.bytedance.ee.bear.net.AbstractC10289j
    /* renamed from: b */
    public int mo39258b() {
        return this.f27794b;
    }

    @Override // com.bytedance.ee.bear.net.AbstractC10289j
    /* renamed from: c */
    public Map<String, String> mo39259c() {
        return this.f27796d;
    }

    @Override // com.bytedance.ee.bear.net.AbstractC10289j
    /* renamed from: d */
    public Map<String, String> mo39260d() {
        return this.f27797e;
    }

    @Override // com.bytedance.ee.bear.net.AbstractC10289j
    /* renamed from: e */
    public Map<String, List<String>> mo39261e() {
        return this.f27800h;
    }

    @Override // com.bytedance.ee.bear.net.AbstractC10289j
    /* renamed from: f */
    public String mo39262f() {
        return this.f27802j;
    }

    public String toString() {
        return "SimpleNetRequest{requestMethod=" + this.f27794b + ", mPath='" + this.f27795c + '\'' + ", mBodyParams=" + this.f27796d + ", mHeaderParams=" + this.f27797e + ", mUrlParams=" + this.f27798f + ", mHost='" + this.f27801i + '\'' + '}';
    }

    @Override // com.bytedance.ee.bear.net.AbstractC10289j
    /* renamed from: a */
    public String mo39257a() {
        Uri.Builder builder;
        String str = this.f27801i;
        if (str == null) {
            str = "";
        }
        String str2 = this.f27795c;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = false;
        if (str.toLowerCase().startsWith("https://")) {
            str = str.replaceFirst("https://", "");
        }
        if (str.toLowerCase().startsWith("http://")) {
            z = true;
            str = str.replaceFirst("http://", "");
        }
        Uri.Builder builder2 = new Uri.Builder();
        if (z) {
            builder = builder2.scheme("http");
        } else {
            builder = builder2.scheme("https");
        }
        Uri.Builder authority = builder.authority(str);
        if (str2.contains("?")) {
            String str3 = this.f27801i;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.f27795c;
            if (str4 == null) {
                str4 = "";
            }
            if (!str3.endsWith("/")) {
                str3 = str3 + "/";
            }
            if (!str3.startsWith("http")) {
                str3 = "https://" + str3;
            }
            if (str4.startsWith("/")) {
                str4 = str4.replaceFirst("/", "");
            }
            Uri parse = Uri.parse(str3 + str4);
            authority.path(parse.getPath());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null) {
                for (String str5 : queryParameterNames) {
                    authority.appendQueryParameter(str5, parse.getQueryParameter(str5));
                }
            }
        } else {
            authority.path(this.f27795c);
        }
        for (Map.Entry<String, String> entry : this.f27798f.entrySet()) {
            authority.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Map<String, List<String>> map = this.f27799g;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry2 : this.f27799g.entrySet()) {
                List<String> value = entry2.getValue();
                if (value != null && value.size() > 0) {
                    for (String str6 : value) {
                        authority.appendQueryParameter(entry2.getKey(), str6);
                    }
                }
            }
        }
        return authority.build().toString();
    }

    /* renamed from: a */
    static void m42917a(String str) {
        f27793a = str;
    }

    /* renamed from: a */
    public void mo39318a(int i) {
        this.f27794b = i;
    }

    /* renamed from: b */
    public void mo39320b(String str) {
        this.f27801i = str;
    }

    /* renamed from: c */
    public void mo39322c(String str) {
        this.f27802j = str;
    }

    /* renamed from: d */
    public void mo39324d(Map<String, List<String>> map) {
        this.f27799g = map;
    }

    /* renamed from: e */
    public void mo39325e(Map<String, List<String>> map) {
        this.f27800h = map;
    }

    /* renamed from: a */
    public void mo39319a(Map<String, String> map) {
        this.f27796d.putAll(map);
    }

    /* renamed from: b */
    public void mo39321b(Map<String, String> map) {
        this.f27797e.putAll(map);
    }

    /* renamed from: c */
    public void mo39323c(Map<String, String> map) {
        this.f27798f.putAll(map);
    }

    public C10299t(String str) {
        this.f27795c = str;
    }
}
