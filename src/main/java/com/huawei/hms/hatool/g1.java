package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class g1 {

    /* renamed from: c */
    public static g1 f58207c;

    /* renamed from: a */
    public Context f58208a;

    /* renamed from: b */
    public final Object f58209b = new Object();

    /* renamed from: a */
    public static g1 m85726a() {
        if (f58207c == null) {
            m85727b();
        }
        return f58207c;
    }

    /* renamed from: b */
    public static synchronized void m85727b() {
        synchronized (g1.class) {
            if (f58207c == null) {
                f58207c = new g1();
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo83004a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                C23625y.m85974b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo83005a(Context context) {
        synchronized (this.f58209b) {
            if (this.f58208a == null) {
                this.f58208a = context;
                h0.m85735a().mo83009a(context);
            }
        }
    }

    /* renamed from: a */
    public void mo83006a(String str, int i) {
        h0.m85735a().mo83010a(str, i);
    }

    /* renamed from: a */
    public void mo83007a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h0.m85735a().mo83011a(str, i, str2, mo83004a(linkedHashMap));
    }

    /* renamed from: a */
    public void mo83008a(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            h0.m85735a().mo83011a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            C23625y.m85982f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }
}
