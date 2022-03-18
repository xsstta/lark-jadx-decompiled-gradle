package com.bytedance.ee.lark.infra.network.p622a.p623a.p625b;

import android.text.TextUtils;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.b.c */
public class C12803c {

    /* renamed from: a */
    public String f34181a;

    /* renamed from: b */
    public List<String> f34182b = new ArrayList();

    /* renamed from: c */
    public List<InetAddress> f34183c = new ArrayList();

    /* renamed from: d */
    public String f34184d;

    /* renamed from: e */
    private long f34185e;

    /* renamed from: f */
    private long f34186f;

    /* renamed from: a */
    public static C12803c m52891a(String str) {
        JSONException e;
        C12803c cVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("host");
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            C12803c cVar2 = new C12803c();
            try {
                cVar2.f34181a = optString;
                cVar2.f34185e = jSONObject.optLong("ttl");
                cVar2.f34186f = System.currentTimeMillis() / 1000;
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString2 = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString2)) {
                            cVar2.f34182b.add(optString2);
                            InetAddress a = C12802b.m52890a(optString2);
                            if (a != null) {
                                cVar2.f34183c.add(a);
                            }
                        }
                    }
                }
                cVar2.f34184d = jSONObject.optString("cip");
                return cVar2;
            } catch (JSONException e2) {
                e = e2;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return cVar;
        }
    }
}
