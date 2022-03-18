package com.ss.android.ttve.monitor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.i */
public class C60230i {

    /* renamed from: a */
    public Map<Integer, C60231a> f150344a = new HashMap();

    /* renamed from: b */
    public Map<Integer, C60231a> f150345b = new HashMap();

    /* renamed from: c */
    private int f150346c = -1;

    /* renamed from: com.ss.android.ttve.monitor.i$a */
    public static class C60231a {

        /* renamed from: a */
        public String f150347a;

        /* renamed from: b */
        public int f150348b;

        /* renamed from: c */
        public int f150349c;
    }

    /* renamed from: d */
    public int mo205714d() {
        return this.f150346c;
    }

    /* renamed from: b */
    public synchronized boolean mo205712b() {
        return this.f150344a.isEmpty();
    }

    /* renamed from: c */
    public synchronized boolean mo205713c() {
        return this.f150345b.isEmpty();
    }

    /* renamed from: a */
    public synchronized void mo205711a() {
        this.f150344a.clear();
        this.f150345b.clear();
        this.f150346c = -1;
    }

    /* renamed from: a */
    public synchronized String mo205710a(int i) {
        Iterator<Map.Entry<Integer, C60231a>> it;
        JSONArray jSONArray = new JSONArray();
        if (i == 0) {
            it = this.f150344a.entrySet().iterator();
        } else if (i == 1) {
            it = this.f150345b.entrySet().iterator();
        } else {
            it = null;
        }
        if (it == null) {
            return null;
        }
        while (it.hasNext()) {
            C60231a value = it.next().getValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", value.f150347a);
                jSONObject.put("start", value.f150348b);
                jSONObject.put("duration", value.f150349c);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray.toString();
    }
}
