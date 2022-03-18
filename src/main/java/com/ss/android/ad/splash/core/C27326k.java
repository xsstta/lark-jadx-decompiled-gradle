package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.utils.C27474d;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27480i;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.k */
public class C27326k {

    /* renamed from: a */
    private static volatile C27326k f68122a;

    /* renamed from: b */
    private ConcurrentHashMap<String, String> f68123b = new ConcurrentHashMap<>();

    private C27326k() {
    }

    /* renamed from: a */
    public static C27326k m99414a() {
        if (f68122a == null) {
            synchronized (C27326k.class) {
                if (f68122a == null) {
                    f68122a = new C27326k();
                }
            }
        }
        return f68122a;
    }

    /* renamed from: g */
    private void m99419g() {
        String L = C27287e.m99213L();
        if (!C27480i.m100385a(L)) {
            m99417b(L);
        }
        m99415a(L);
        String N = C27287e.m99215N();
        if (!TextUtils.isEmpty(N)) {
            m99417b(N);
        }
    }

    /* renamed from: c */
    public void mo97416c() {
        m99419g();
        m99418f();
        C27368t.m99732a().mo97673h().mo97681l();
    }

    /* renamed from: e */
    public void mo97418e() {
        String L = C27287e.m99213L();
        if (!C27480i.m100385a(L)) {
            m99416a(L, false);
        }
        String N = C27287e.m99215N();
        if (!TextUtils.isEmpty(N)) {
            m99416a(N, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo97415b() {
        if (C27287e.m99244a()) {
            if (Math.abs(System.currentTimeMillis() - C27368t.m99732a().mo97675i()) >= Math.min(C27287e.m99216O(), 3600000L)) {
                C27287e.m99211J().execute(new Runnable() {
                    /* class com.ss.android.ad.splash.core.C27326k.RunnableC273271 */

                    public void run() {
                        C27326k.this.mo97416c();
                    }
                });
            }
        }
    }

    /* renamed from: f */
    private void m99418f() {
        try {
            JSONArray jSONArray = new JSONArray(C27368t.m99732a().mo97680k());
            JSONArray jSONArray2 = new JSONArray();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("local_url");
                    long optLong = optJSONObject.optLong("local_data_expire_time");
                    if (!C27480i.m100385a(optString)) {
                        File file = new File(optString);
                        if (file.exists()) {
                            if (currentTimeMillis <= optLong) {
                                jSONArray2.put(optJSONObject);
                            } else {
                                file.delete();
                                C27477g.m100326a("SplashAdSdk", "file " + optString + " is expired, delete it ");
                            }
                        }
                    }
                }
            }
            C27368t.m99732a().mo97676i(jSONArray2.toString()).mo97681l();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo97417d() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f68123b;
        if (!(concurrentHashMap == null || concurrentHashMap.isEmpty())) {
            for (Map.Entry<String, String> entry : this.f68123b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    File file = new File(key);
                    if (file.exists() && !C27368t.m99732a().mo97674h(value)) {
                        file.delete();
                    }
                }
            }
            this.f68123b.clear();
        }
    }

    /* renamed from: a */
    private void m99415a(String str) {
        if (C27287e.m99259e().mo97697b()) {
            String M = C27287e.m99214M();
            if (!TextUtils.isEmpty(M) && !M.equals(str)) {
                m99417b(M);
            }
        }
    }

    /* renamed from: b */
    private void m99417b(String str) {
        File[] listFiles;
        try {
            File file = new File(str);
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                if (listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        if (C27474d.m100318a(file2, C27287e.m99216O())) {
                            if (file2 != null && file2.exists()) {
                                file2.delete();
                            }
                            C27477g.m100326a("SplashAdSdk", "file " + str + " is expired, delete it");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m99416a(String str, boolean z) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_splash_cache_size", C27474d.m100313a(new File(str)) / 1024);
            if (z) {
                str2 = "service_ad_extra_res_disk_cache_size_in_mb";
            } else {
                str2 = "service_ad_res_disk_cache_size_in_mb";
            }
            C27234a.m98988a().mo97123a(str2, jSONObject, (JSONObject) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97414a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            this.f68123b.put(str2, str);
        }
    }
}
