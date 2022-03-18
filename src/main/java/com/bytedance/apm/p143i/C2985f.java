package com.bytedance.apm.p143i;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.util.C3113c;
import com.bytedance.apm.util.C3122i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.f */
public class C2985f {

    /* renamed from: c */
    private static volatile C2985f f9590c;

    /* renamed from: a */
    private CopyOnWriteArraySet<String> f9591a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, String> f9592b = new ConcurrentHashMap<>();

    private C2985f() {
    }

    /* renamed from: a */
    public static C2985f m12541a() {
        if (f9590c == null) {
            synchronized (C2985f.class) {
                if (f9590c == null) {
                    f9590c = new C2985f();
                }
            }
        }
        return f9590c;
    }

    /* renamed from: b */
    public String mo12730b() {
        String a = C3122i.m13007a(this.f9591a.toArray(), "#");
        if (TextUtils.isEmpty(a)) {
            return ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
        return a;
    }

    /* renamed from: a */
    public void mo12728a(String str) {
        this.f9591a.add(str);
    }

    /* renamed from: b */
    public void mo12731b(String str) {
        this.f9591a.remove(str);
    }

    /* renamed from: a */
    public JSONObject mo12727a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f9592b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (z) {
                C3113c.m12960a().mo13050e(jSONObject);
                C3113c.m12960a().mo13051f(jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo12729a(String str, String str2) {
        this.f9592b.put(str, str2);
    }

    /* renamed from: b */
    public void mo12732b(String str, String str2) {
        this.f9592b.remove(str, str2);
    }
}
