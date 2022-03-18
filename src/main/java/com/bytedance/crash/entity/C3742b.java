package com.bytedance.crash.entity;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.nativecrash.C3794e;
import com.bytedance.crash.nativecrash.C3798g;
import com.bytedance.crash.p225i.C3763b;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.util.C3927aa;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3953o;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.NativeTools;
import com.google.firebase.messaging.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.b */
public class C3742b {

    /* renamed from: a */
    private final JSONObject f11531a;

    /* renamed from: b */
    private Header f11532b;

    /* renamed from: a */
    private static String m15429a(long j) {
        return j <= 1024 ? "0 - 1K" : j <= 65536 ? "1K - 64K" : j <= 524288 ? "64K - 512K" : j <= 1048576 ? "512K - 1M" : j <= 67108864 ? "1M - 64M" : "64M - ";
    }

    /* renamed from: e */
    public JSONObject mo15252e() {
        return this.f11531a;
    }

    /* renamed from: a */
    public void mo15240a() {
        mo15235a("is_64_devices", String.valueOf(Header.m15401a()));
        mo15235a("is_64_runtime", String.valueOf(NativeTools.m16236b().mo15613e()));
        mo15235a("is_x86_devices", String.valueOf(Header.m15404b()));
        mo15235a("kernel_version", C3953o.m16435b());
        mo15235a("is_hm_os", String.valueOf(C3927aa.m16281c()));
        mo15235a("is_sandbox_virtual", String.valueOf(NativeTools.m16236b().mo15626n()));
    }

    /* renamed from: a */
    public static boolean m15436a(String str) {
        return ((long) C3798g.m15761c(str)) > C3794e.m15727e();
    }

    /* renamed from: a */
    public static void m15434a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15433a(JSONObject jSONObject, Throwable th) {
        if (jSONObject.opt("npth_err_info") == null) {
            try {
                jSONObject.put("npth_err_info", C3930ad.m16298a(th));
            } catch (Throwable unused) {
            }
        } else {
            for (int i = 0; i < 5; i++) {
                if (jSONObject.opt("npth_err_info" + i) == null) {
                    jSONObject.put("npth_err_info" + i, C3930ad.m16298a(th));
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public C3742b mo15229a(long j, long j2) {
        try {
            mo15241a("app_start_time", Long.valueOf(j));
            if (j2 != 0) {
                mo15241a("app_start_up_time", Long.valueOf(j2));
            }
            mo15241a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C3742b mo15232a(C3824a aVar) {
        mo15241a("activity_trace", aVar.mo15403h());
        m15428a("activity_track", aVar.mo15405j());
        return this;
    }

    /* renamed from: a */
    public C3742b mo15230a(ICommonParams iCommonParams) {
        JSONArray jSONArray;
        Throwable th;
        boolean b = C3763b.m15571b();
        C3955q.m16447a(this.f11531a, "mira_init", Boolean.valueOf(b));
        if (b) {
            jSONArray = C3763b.m15569a();
            if (jSONArray == null) {
                try {
                    Map<String, Integer> pluginInfo = iCommonParams.getPluginInfo();
                    if (pluginInfo != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        try {
                            for (Map.Entry<String, Integer> entry : pluginInfo.entrySet()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("package_name", entry.getKey());
                                jSONObject.put("version_code", entry.getValue());
                                jSONArray2.put(jSONObject);
                            }
                            jSONArray = jSONArray2;
                        } catch (Throwable th2) {
                            th = th2;
                            jSONArray = jSONArray2;
                            try {
                                JSONObject jSONObject2 = this.f11531a;
                                jSONObject2.put("Code err:\n" + C3930ad.m16298a(th), 0);
                            } catch (Throwable unused) {
                            }
                            C3955q.m16447a(this.f11531a, "plugin_info", jSONArray);
                            return this;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    JSONObject jSONObject22 = this.f11531a;
                    jSONObject22.put("Code err:\n" + C3930ad.m16298a(th), 0);
                    C3955q.m16447a(this.f11531a, "plugin_info", jSONArray);
                    return this;
                }
            }
        } else {
            jSONArray = null;
        }
        C3955q.m16447a(this.f11531a, "plugin_info", jSONArray);
        return this;
    }

    /* renamed from: a */
    public C3742b mo15238a(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                C3955q.m16447a(jSONObject, String.valueOf(num), map.get(num));
            }
            C3955q.m16447a(this.f11531a, "sdk_info", jSONObject);
        }
        return this;
    }

    /* renamed from: a */
    public C3742b mo15228a(int i, String str) {
        C3955q.m16447a(this.f11531a, "miniapp_id", Integer.valueOf(i));
        C3955q.m16447a(this.f11531a, "miniapp_version", str);
        return this;
    }

    /* renamed from: a */
    public C3742b mo15237a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo15241a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String str : list) {
            jSONArray.put(str);
        }
        mo15241a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public static void m15435a(JSONObject jSONObject, JSONObject jSONObject2) {
        C3955q.m16447a(jSONObject, "storage", jSONObject2);
        long optLong = jSONObject2.optLong("inner_free");
        long optLong2 = jSONObject2.optLong("sdcard_free");
        long optLong3 = jSONObject2.optLong("inner_free_real");
        String a = m15429a(optLong);
        String a2 = m15429a(optLong2);
        String a3 = m15429a(optLong3);
        m15432a(jSONObject, "filters", "inner_free", a);
        m15432a(jSONObject, "filters", "inner_free_real", a3);
        m15432a(jSONObject, "filters", "sdcard_free", a2);
    }

    /* renamed from: a */
    public C3742b mo15236a(String str, List<String> list) {
        if (list == null) {
            return this;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : list) {
            jSONArray.put(str2);
        }
        m15428a(str, jSONArray);
        return this;
    }

    /* renamed from: a */
    public C3742b mo15235a(String str, String str2) {
        m15432a(mo15254g(), "filters", str, str2);
        return this;
    }

    /* renamed from: a */
    public C3742b mo15233a(String str, float f) {
        m15430a(mo15252e(), "features_num", str, f);
        return this;
    }

    /* renamed from: a */
    public C3742b mo15234a(String str, long j) {
        m15431a(mo15252e(), "features_num", str, j);
        return this;
    }

    /* renamed from: a */
    public static void m15432a(JSONObject jSONObject, String str, String str2, Object obj) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                C3955q.m16447a(jSONObject, str, optJSONObject);
            }
            C3955q.m16447a(optJSONObject, str2, obj);
        }
    }

    /* renamed from: a */
    public void mo15241a(String str, Object obj) {
        C3955q.m16447a(this.f11531a, str, obj);
    }

    public C3742b() {
        this.f11531a = new JSONObject();
    }

    /* renamed from: f */
    public Header mo15253f() {
        if (this.f11532b == null) {
            Header header = new Header(C3774m.m15609j());
            this.f11532b = header;
            mo15231a(header);
        }
        return this.f11532b;
    }

    /* renamed from: g */
    public JSONObject mo15254g() {
        Object opt = mo15252e().opt(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (opt instanceof JSONArray) {
            return ((JSONArray) opt).optJSONObject(0);
        }
        return mo15252e();
    }

    /* renamed from: b */
    public boolean mo15245b() {
        return m15438b(C3774m.m15606g());
    }

    /* renamed from: c */
    public boolean mo15248c() {
        return m15439c(C3774m.m15606g());
    }

    /* renamed from: d */
    public boolean mo15251d() {
        return m15436a(C3774m.m15606g());
    }

    public C3742b(JSONObject jSONObject) {
        this.f11531a = jSONObject;
    }

    /* renamed from: a */
    public C3742b mo15239a(JSONObject jSONObject) {
        mo15241a("header", jSONObject);
        return this;
    }

    /* renamed from: b */
    public C3742b mo15244b(JSONObject jSONObject) {
        m15435a(this.f11531a, jSONObject);
        return this;
    }

    /* renamed from: c */
    public void mo15247c(JSONObject jSONObject) {
        m15437b(this.f11531a, jSONObject);
    }

    /* renamed from: b */
    public static boolean m15438b(String str) {
        if (C3798g.m15756a(str) > 960) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m15439c(String str) {
        if (C3798g.m15759b(str) > 350) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C3742b mo15231a(Header header) {
        mo15241a("header", header.mo15227f());
        this.f11532b = header;
        return this;
    }

    /* renamed from: d */
    public C3742b mo15249d(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo15241a("session_id", (Object) str);
        }
        return this;
    }

    /* renamed from: e */
    private JSONObject m15440e(String str) {
        JSONObject jSONObject;
        Object opt = mo15252e().opt(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (opt instanceof JSONArray) {
            jSONObject = ((JSONArray) opt).optJSONObject(0);
        } else {
            jSONObject = mo15252e();
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        mo15241a(str, jSONObject2);
        return jSONObject2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r6.hasNext() != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r2 = r6.next();
        com.bytedance.crash.util.C3955q.m16447a(r1, (java.lang.String) r2.getKey(), r2.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r6 = r6.entrySet().iterator();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.crash.entity.C3742b mo15243b(java.util.Map<? extends java.lang.String, ? extends java.lang.String> r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x004f
            java.lang.String r0 = "filters"
            org.json.JSONObject r1 = r5.m15440e(r0)
            java.util.Set r2 = r6.entrySet()     // Catch:{ all -> 0x002a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x002a }
        L_0x0010:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x002a }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x002a }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x002a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x002a }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x002a }
            com.bytedance.crash.util.C3955q.m16447a(r1, r4, r3)     // Catch:{ all -> 0x002a }
            goto L_0x0010
        L_0x002a:
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x004c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004c }
        L_0x0032:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x004c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x004c }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x004c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x004c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x004c }
            com.bytedance.crash.util.C3955q.m16447a(r1, r3, r2)     // Catch:{ all -> 0x004c }
            goto L_0x0032
        L_0x004c:
            r5.mo15241a(r0, r1)
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.entity.C3742b.mo15243b(java.util.Map):com.bytedance.crash.entity.b");
    }

    /* renamed from: a */
    private C3742b m15428a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = mo15252e().optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo15241a("custom_long", optJSONObject);
        }
        C3955q.m16447a(optJSONObject, str, jSONArray);
        return this;
    }

    /* renamed from: b */
    public C3742b mo15242b(String str, String str2) {
        m15432a(mo15252e(), "features_str", str, str2);
        return this;
    }

    /* renamed from: c */
    public C3742b mo15246c(String str, String str2) {
        m15432a(mo15254g(), "custom", str, str2);
        return this;
    }

    /* renamed from: d */
    public C3742b mo15250d(String str, String str2) {
        m15432a(mo15252e(), "anr_timestamp", str, str2);
        return this;
    }

    /* renamed from: b */
    public static void m15437b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (opt == null) {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } else if (opt instanceof JSONObject) {
                        m15437b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                    } else if (opt instanceof JSONArray) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                        if (optJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (jSONArray.length() != 1 || !(jSONArray.opt(0) instanceof JSONObject) || !(optJSONArray.opt(0) instanceof JSONObject)) {
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    jSONArray.put(optJSONArray.get(i));
                                }
                            } else {
                                m15437b(jSONArray.getJSONObject(0), optJSONArray.getJSONObject(0));
                            }
                        }
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static C3742b m15425a(long j, Context context, String str) {
        C3742b bVar = new C3742b();
        bVar.mo15241a("is_dart", (Object) 1);
        bVar.mo15241a("crash_time", Long.valueOf(j));
        bVar.mo15241a("process_name", (Object) C3933b.m16337c(context));
        bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) str);
        C3933b.m16328a(context, bVar.mo15252e());
        return bVar;
    }

    /* renamed from: a */
    public static C3742b m15426a(long j, Context context, Thread thread, Throwable th) {
        String str;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        C3742b bVar = new C3742b();
        bVar.mo15241a("isJava", (Object) 1);
        bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) C3930ad.m16298a(th));
        bVar.mo15241a("crash_time", Long.valueOf(j));
        bVar.mo15241a("process_name", (Object) C3933b.m16337c(context));
        if (!C3933b.m16336b(context)) {
            bVar.mo15241a("remote_process", (Object) 1);
        }
        if (thread == null) {
            str = null;
        } else {
            str = thread.getName();
        }
        if (str != null) {
            bVar.mo15241a("crash_thread_name", (Object) str);
        }
        return bVar;
    }

    /* renamed from: a */
    public static C3742b m15427a(Context context, String str, String str2, String str3) {
        C3742b bVar = new C3742b();
        bVar.mo15241a("crash_time", Long.valueOf(System.currentTimeMillis()));
        bVar.mo15241a("process_name", (Object) C3933b.m16337c(context));
        bVar.mo15241a("crash_name", (Object) str);
        bVar.mo15241a("crash_reason", (Object) str2);
        bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) str3);
        bVar.mo15241a("crash_type", (Object) CrashType.GAME.getName());
        C3933b.m16328a(context, bVar.mo15252e());
        return bVar;
    }

    /* renamed from: a */
    public static void m15430a(JSONObject jSONObject, String str, String str2, float f) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, (double) f);
        }
    }

    /* renamed from: a */
    public static void m15431a(JSONObject jSONObject, String str, String str2, long j) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, j);
        }
    }
}
