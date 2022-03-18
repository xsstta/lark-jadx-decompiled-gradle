package com.bytedance.apm6.p184h.p185a;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.apm.util.C3113c;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p192e.AbstractC3343b;
import com.bytedance.apm6.util.C3356f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.h.a.c */
public class C3331c implements AbstractC3343b {

    /* renamed from: g */
    private static volatile C3331c f10619g;

    /* renamed from: a */
    private CopyOnWriteArraySet<String> f10620a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, String> f10621b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private long f10622c;

    /* renamed from: d */
    private boolean f10623d;

    /* renamed from: e */
    private long f10624e;

    /* renamed from: f */
    private long f10625f;

    private C3331c() {
    }

    /* renamed from: a */
    public static C3331c m13887a() {
        if (f10619g == null) {
            synchronized (C3331c.class) {
                if (f10619g == null) {
                    f10619g = new C3331c();
                }
            }
        }
        return f10619g;
    }

    /* renamed from: e */
    private void m13888e() {
        boolean z;
        this.f10622c = Debug.getNativeHeapAllocatedSize() / 1048576;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        this.f10624e = maxMemory / 1048576;
        long j2 = j - freeMemory;
        this.f10625f = j2 / 1048576;
        if (((float) j2) > ((float) maxMemory) * 0.95f) {
            z = true;
        } else {
            z = false;
        }
        this.f10623d = z;
    }

    /* renamed from: b */
    public String mo13566b() {
        String a = C3356f.m13963a(this.f10620a.toArray(), "#");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        AbstractC3338a aVar = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
        if (aVar != null) {
            return aVar.mo13549b();
        }
        return "";
    }

    /* renamed from: c */
    public JSONObject mo13569c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f10621b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: d */
    public JSONObject mo13570d() {
        try {
            JSONObject jSONObject = new JSONObject();
            m13888e();
            jSONObject.put("apm_native_heap_size", this.f10622c);
            jSONObject.put("apm_java_heap_leak", this.f10623d);
            jSONObject.put("apm_java_heap_used", this.f10625f);
            jSONObject.put("apm_java_heap_max", this.f10624e);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo13564a(String str) {
        this.f10620a.add(str);
    }

    /* renamed from: b */
    public void mo13567b(String str) {
        this.f10620a.remove(str);
    }

    /* renamed from: a */
    public JSONObject mo13563a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f10621b.entrySet()) {
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
    public void mo13565a(String str, String str2) {
        this.f10621b.put(str, str2);
    }

    /* renamed from: b */
    public void mo13568b(String str, String str2) {
        this.f10621b.remove(str, str2);
    }
}
