package com.bytedance.apm.p143i;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p126b.C2753f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.b */
public class C2949b {
    /* renamed from: a */
    public static void m12420a(C2753f fVar) {
        String b = C2985f.m12541a().mo12730b();
        JSONObject jSONObject = fVar.f8850e;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(b)) {
                b = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put("scene", b);
            jSONObject.put("process_name", C2785b.m11756d());
            jSONObject.put("is_main_process", C2785b.m11761e());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            fVar.f8850e = jSONObject;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m12421a(C2753f fVar, boolean z) {
        fVar.mo11821d(C2985f.m12541a().mo12727a(z));
    }

    /* renamed from: a */
    public static void m12422a(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", C2785b.m11761e());
        jSONObject.put("process_name", C2785b.m11756d());
        jSONObject.put("event_type", str);
        jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
    }
}
