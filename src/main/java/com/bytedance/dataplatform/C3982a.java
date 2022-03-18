package com.bytedance.dataplatform;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.dataplatform.p233a.C3985a;
import com.bytedance.dataplatform.p233a.C3986b;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.dataplatform.a */
class C3982a {

    /* renamed from: a */
    private final String f12108a;

    /* renamed from: b */
    private JSONObject f12109b;

    /* renamed from: c */
    private final Map<String, Object> f12110c = new ConcurrentHashMap();

    /* renamed from: d */
    private AbstractC3994g f12111d;

    /* renamed from: e */
    private AbstractC3993f f12112e;

    /* renamed from: f */
    private SharedPreferences f12113f;

    /* renamed from: g */
    private SharedPreferences f12114g;

    /* renamed from: h */
    private C3991d f12115h;

    /* renamed from: i */
    private Application f12116i;

    /* renamed from: j */
    private Future f12117j;

    /* renamed from: a */
    public void mo15676a() {
        try {
            JSONObject jSONObject = new JSONObject(this.f12112e.mo15697a(this.f12108a));
            if (!jSONObject.has("code")) {
                return;
            }
            if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                if (jSONObject.optInt("code", -1) == 0) {
                    m16602a(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T mo15675a(java.lang.String r2, java.lang.reflect.Type r3, T r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.dataplatform.C3982a.mo15675a(java.lang.String, java.lang.reflect.Type, java.lang.Object, boolean):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T mo15674a(String str, C3985a<T> aVar, boolean z) {
        int i;
        if (!(aVar == null || TextUtils.isEmpty(aVar.mo15680a()) || aVar.mo15682c() == null || aVar.mo15682c().length == 0)) {
            String a = aVar.mo15680a();
            if (this.f12113f.contains(a)) {
                i = this.f12113f.getInt(a, 0);
            } else {
                int nextInt = new Random().nextInt(1000);
                this.f12113f.edit().putInt(a, nextInt).apply();
                i = nextInt;
            }
            int b = (int) (aVar.mo15681b() * 1000.0d);
            if (i < b) {
                return null;
            }
            C3986b<T>[] c = aVar.mo15682c();
            for (C3986b<T> bVar : c) {
                if (bVar != null && i < (b = (int) (((double) b) + (bVar.mo15686b() * 1000.0d)))) {
                    if (z) {
                        this.f12115h.mo15694a(str, aVar, bVar.mo15685a());
                    }
                    return bVar.mo15687c();
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo15677b() {
        Future future = this.f12117j;
        if (future != null) {
            future.cancel(true);
        }
        this.f12117j = C3996i.m16639a(new Runnable() {
            /* class com.bytedance.dataplatform.C3982a.RunnableC39842 */

            public void run() {
                C3982a.this.mo15676a();
            }
        }, 0, 3600000);
    }

    /* renamed from: a */
    private void m16602a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                    long j = jSONObject3.getLong("et");
                    if (j > 0) {
                        hashMap2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        synchronized (this) {
            this.f12110c.clear();
            this.f12109b = jSONObject2;
            this.f12114g.edit().putString("SP_EXPERIMENT_CACHE", jSONObject2.toString()).apply();
        }
        this.f12115h.mo15695a(hashMap, hashMap2);
    }

    /* renamed from: a */
    private String m16601a(String str, String str2) {
        return this.f12109b.optString(str, str2);
    }

    /* renamed from: a */
    private Boolean m16595a(String str, Boolean bool) {
        if (this.f12109b.has(str)) {
            return Boolean.valueOf(this.f12109b.optBoolean(str));
        }
        return bool;
    }

    /* renamed from: a */
    private Double m16596a(String str, Double d) {
        if (this.f12109b.has(str)) {
            return Double.valueOf(this.f12109b.optDouble(str));
        }
        return d;
    }

    /* renamed from: a */
    private Float m16597a(String str, Float f) {
        if (this.f12109b.has(str)) {
            return Float.valueOf((float) this.f12109b.optDouble(str));
        }
        return f;
    }

    /* renamed from: a */
    private Integer m16598a(String str, Integer num) {
        if (this.f12109b.has(str)) {
            return Integer.valueOf(this.f12109b.optInt(str));
        }
        return num;
    }

    /* renamed from: a */
    private Long m16599a(String str, Long l) {
        if (this.f12109b.has(str)) {
            return Long.valueOf(this.f12109b.optLong(str));
        }
        return l;
    }

    /* renamed from: a */
    private <T> T m16600a(String str, Type type, T t) {
        try {
            if (this.f12110c.containsKey(str) && this.f12110c.get(str).getClass() == type) {
                return (T) this.f12110c.get(str);
            }
            T t2 = (T) this.f12111d.mo15698a(this.f12109b.optString(str, ""), type);
            if (t2 == null) {
                this.f12110c.remove(str);
                return t;
            }
            this.f12110c.put(str, t2);
            return t2;
        } catch (Exception unused) {
            this.f12110c.remove(str);
            return t;
        }
    }

    C3982a(Application application, String str, boolean z, AbstractC3994g gVar, AbstractC3992e eVar, AbstractC3993f fVar) {
        this.f12108a = str;
        this.f12115h = new C3991d(application, eVar);
        this.f12113f = application.getSharedPreferences("CLIENT_EXPERIMENT_CACHE_TAG", 0);
        SharedPreferences sharedPreferences = application.getSharedPreferences("SP_EXPERIMENT_CACHE", 0);
        this.f12114g = sharedPreferences;
        this.f12111d = gVar;
        this.f12112e = fVar;
        this.f12116i = application;
        try {
            this.f12109b = new JSONObject(sharedPreferences.getString("SP_EXPERIMENT_CACHE", ""));
        } catch (JSONException unused) {
            this.f12109b = new JSONObject();
        }
        if (z) {
            this.f12117j = C3996i.m16639a(new Runnable() {
                /* class com.bytedance.dataplatform.C3982a.RunnableC39831 */

                public void run() {
                    C3982a.this.mo15676a();
                }
            }, 2000, 3600000);
        }
    }
}
