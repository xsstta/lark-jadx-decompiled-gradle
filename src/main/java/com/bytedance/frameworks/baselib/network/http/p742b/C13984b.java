package com.bytedance.frameworks.baselib.network.http.p742b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.util.UrlBuilder;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.b */
public class C13984b {

    /* renamed from: a */
    static final /* synthetic */ boolean f36546a = true;

    /* renamed from: b */
    private static volatile C13984b f36547b = null;

    /* renamed from: c */
    private static final String f36548c = "b";

    /* renamed from: d */
    private String f36549d = "";

    /* renamed from: e */
    private String f36550e = "";

    /* renamed from: f */
    private String f36551f = "";

    /* renamed from: g */
    private String f36552g = "";

    /* renamed from: h */
    private String f36553h = "";

    /* renamed from: i */
    private String f36554i = "";

    /* renamed from: j */
    private List<String> f36555j = new ArrayList();

    /* renamed from: k */
    private List<String> f36556k = new ArrayList();

    /* renamed from: l */
    private Context f36557l;

    /* renamed from: m */
    private boolean f36558m = false;

    /* renamed from: n */
    private boolean f36559n = false;

    /* renamed from: o */
    private AbstractC13983a f36560o;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.b.b$a */
    public interface AbstractC13985a {
        void notifyStoreRegionUpdatedForCronet(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    /* renamed from: c */
    public String mo51420c() {
        return this.f36549d;
    }

    /* renamed from: d */
    public String mo51421d() {
        return this.f36553h;
    }

    /* renamed from: a */
    public void mo51418a(boolean z) {
        Context context = this.f36557l;
        if (context != null && this.f36558m && this.f36559n != z) {
            this.f36559n = z;
            SharedPreferences.Editor edit = context.getSharedPreferences("ttnet_store_region", 0).edit();
            edit.putBoolean("disable_store_region", this.f36559n);
            edit.apply();
        }
    }

    /* renamed from: a */
    public void mo51413a(String str, String str2, Context context, AbstractC13983a aVar) {
        String str3 = f36548c;
        Logger.m15167d(str3, "rule json: " + str2);
        if (!TextUtils.isEmpty(str2) && context != null && aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("update_store_idc_path_list");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        this.f36555j.add(string);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("add_store_idc_host_list");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String string2 = optJSONArray2.getString(i2);
                    if (!TextUtils.isEmpty(string2)) {
                        this.f36556k.add(string2);
                    }
                }
                this.f36557l = context;
                this.f36560o = aVar;
                if (!TextUtils.isEmpty(str)) {
                    this.f36554i = str;
                }
                if (!(this.f36555j.isEmpty() || this.f36555j.isEmpty())) {
                    this.f36558m = f36546a;
                    m56555e();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo51416a(Map<String, String> map) {
        if (this.f36558m && !this.f36559n && map != null) {
            if (!this.f36550e.isEmpty()) {
                map.put("x-tt-store-idc", this.f36550e);
            }
            if (!this.f36549d.isEmpty()) {
                map.put("x-tt-store-region", this.f36549d);
            }
            if (!this.f36553h.isEmpty()) {
                map.put("x-tt-store-region-src", this.f36553h);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0183  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51417a(okhttp3.Response r16, java.lang.String r17, byte[] r18) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p742b.C13984b.mo51417a(okhttp3.Response, java.lang.String, byte[]):void");
    }

    /* renamed from: a */
    public void mo51414a(String str, String str2, String str3) {
        if (this.f36557l != null && this.f36558m && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (!f36546a && (this.f36550e == null || this.f36549d == null || this.f36553h == null)) {
                throw new AssertionError();
            } else if (!this.f36550e.equalsIgnoreCase(str) || !this.f36549d.equalsIgnoreCase(str2) || !this.f36553h.equalsIgnoreCase(str3)) {
                SharedPreferences.Editor edit = this.f36557l.getSharedPreferences("ttnet_store_region", 0).edit();
                if (!TextUtils.isEmpty(str)) {
                    this.f36550e = str;
                }
                this.f36549d = str2;
                if (str3.equalsIgnoreCase("uid")) {
                    this.f36553h = "uid";
                    this.f36552g = str2;
                } else if (str3.equalsIgnoreCase("did")) {
                    this.f36553h = "did";
                    this.f36551f = str2;
                }
                String str4 = f36548c;
                Logger.m15167d(str4, "saveStoreRegionForCronet idc:" + this.f36550e + " region:" + this.f36549d + " source:" + this.f36553h);
                edit.putString("store_region", this.f36549d);
                edit.putString("store_idc", this.f36550e);
                edit.putString("store_region_src", this.f36553h);
                edit.putString("store_region_did", this.f36551f);
                edit.putString("store_region_uid", this.f36552g);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public void mo51415a(HttpURLConnection httpURLConnection, byte[] bArr, AbstractC13985a aVar) {
        String str;
        if (httpURLConnection != null && this.f36558m && !this.f36559n && m56554b(httpURLConnection.getURL().getPath())) {
            String a = m56549a(httpURLConnection, "x-tt-store-region");
            String a2 = m56549a(httpURLConnection, "x-tt-store-region-src");
            if (m56553a(a, a2)) {
                String a3 = m56549a(httpURLConnection, "x-tt-store-idc");
                String a4 = m56549a(httpURLConnection, "x-tt-with-tnc");
                String a5 = m56549a(httpURLConnection, "x-tt-tnc-attr");
                String a6 = m56549a(httpURLConnection, "x-ss-etag");
                String a7 = m56549a(httpURLConnection, "x-tt-tnc-config");
                if (!TextUtils.isEmpty(a4) && a4.equals("1") && !TextUtils.isEmpty(a5)) {
                    try {
                        str = "{\"data\": " + new JSONObject(new String(bArr)).getString("tnc_data") + "}";
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    String url = httpURLConnection.getURL().toString();
                    String obj = httpURLConnection.getHeaderFields().toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", url);
                    jSONObject.put("headers", obj);
                    aVar.notifyStoreRegionUpdatedForCronet(a3, a, a2, a5, a6, a7, str, jSONObject.toString());
                }
                str = "";
                String url2 = httpURLConnection.getURL().toString();
                String obj2 = httpURLConnection.getHeaderFields().toString();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("url", url2);
                    jSONObject2.put("headers", obj2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                aVar.notifyStoreRegionUpdatedForCronet(a3, a, a2, a5, a6, a7, str, jSONObject2.toString());
            }
        }
    }

    /* renamed from: b */
    public boolean mo51419b() {
        if (!this.f36558m || this.f36559n) {
            return false;
        }
        return f36546a;
    }

    /* renamed from: a */
    public static C13984b m56548a() {
        if (f36547b == null) {
            synchronized (C13984b.class) {
                if (f36547b == null) {
                    f36547b = new C13984b();
                }
            }
        }
        return f36547b;
    }

    private C13984b() {
    }

    /* renamed from: f */
    private void m56556f() {
        if (!this.f36552g.isEmpty()) {
            this.f36549d = this.f36552g;
            this.f36553h = "uid";
        } else if (!this.f36551f.isEmpty()) {
            this.f36549d = this.f36551f;
            this.f36553h = "did";
        } else if (!this.f36554i.isEmpty()) {
            this.f36549d = this.f36554i;
            this.f36553h = "local";
        } else {
            this.f36553h = "none";
            this.f36549d = "";
        }
    }

    /* renamed from: e */
    private void m56555e() {
        SharedPreferences sharedPreferences = this.f36557l.getSharedPreferences("ttnet_store_region", 0);
        this.f36550e = sharedPreferences.getString("store_idc", "");
        this.f36549d = sharedPreferences.getString("store_region", "");
        this.f36552g = sharedPreferences.getString("store_region_uid", "");
        this.f36551f = sharedPreferences.getString("store_region_did", "");
        this.f36553h = sharedPreferences.getString("store_region_src", "");
        this.f36559n = sharedPreferences.getBoolean("disable_store_region", false);
        m56556f();
        this.f36560o.mo51410a(this.f36550e, this.f36549d, this.f36553h);
        String str = f36548c;
        Logger.m15167d(str, "Init idc: " + this.f36550e + " region: " + this.f36549d + " source: " + this.f36553h + " did: " + this.f36551f + " uid: " + this.f36552g + " local: " + this.f36554i);
    }

    /* renamed from: b */
    private boolean m56554b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : this.f36555j) {
            if (UrlUtils.matchPattern(str, str2)) {
                return f36546a;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m56552a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("uid") || str.equals("did")) {
            return f36546a;
        }
        return false;
    }

    /* renamed from: a */
    public Request mo51412a(Request request) {
        if (!this.f36558m || this.f36559n || TextUtils.isEmpty(request.getHost())) {
            return null;
        }
        boolean z = false;
        Iterator<String> it = this.f36556k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (UrlUtils.matchPattern(request.getHost(), it.next())) {
                z = f36546a;
                break;
            }
        }
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        if (!TextUtils.isEmpty(this.f36550e)) {
            arrayList.add(new Header("x-tt-store-idc", this.f36550e));
        }
        if (TextUtils.isEmpty(this.f36549d)) {
            arrayList.add(new Header("x-tt-local-region", "unknown"));
        } else if (m56552a(this.f36553h)) {
            arrayList.add(new Header("x-tt-store-region", this.f36549d));
            arrayList.add(new Header("x-tt-store-region-src", this.f36553h));
        } else if (this.f36553h.equals("local")) {
            arrayList.add(new Header("x-tt-local-region", this.f36554i));
        }
        Request.C20591a newBuilder = request.newBuilder();
        m56551a(request, newBuilder, arrayList);
        newBuilder.mo69379a(arrayList);
        return newBuilder.mo69380b();
    }

    /* renamed from: a */
    private static String m56549a(HttpURLConnection httpURLConnection, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* renamed from: a */
    private String m56550a(Response response, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str);
            jSONObject2.put("headers", response.headers().toString());
            jSONObject.put("base", jSONObject2);
            jSONObject.put("report_time", System.currentTimeMillis());
            jSONObject.put("store_idc", this.f36550e);
            jSONObject.put("store_region", this.f36549d);
            jSONObject.put(ShareHitPoint.f121868c, this.f36553h);
            jSONObject.put("did_region", this.f36551f);
            jSONObject.put("uid_region", this.f36552g);
            jSONObject.put("local", this.f36554i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private boolean m56553a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str2.equals("uid") || str2.equals("did")) {
            return f36546a;
        }
        return false;
    }

    /* renamed from: a */
    private void m56551a(Request request, Request.C20591a aVar, List<Header> list) {
        if (!TextUtils.isEmpty(request.getPath())) {
            boolean z = false;
            Iterator<String> it = this.f36555j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (UrlUtils.matchPattern(request.getPath(), it.next())) {
                    z = f36546a;
                    break;
                }
            }
            if (z) {
                if (!this.f36551f.isEmpty()) {
                    list.add(new Header("x-tt-store-region-did", this.f36551f));
                } else {
                    list.add(new Header("x-tt-store-region-did", "none"));
                }
                if (!this.f36552g.isEmpty()) {
                    list.add(new Header("x-tt-store-region-uid", this.f36552g));
                } else {
                    list.add(new Header("x-tt-store-region-uid", "none"));
                }
                UrlBuilder urlBuilder = new UrlBuilder(request.getUrl());
                urlBuilder.addParam("okhttp_version", "4.0.78.3-tudp");
                aVar.mo69377a(urlBuilder.build());
            }
        }
    }
}
