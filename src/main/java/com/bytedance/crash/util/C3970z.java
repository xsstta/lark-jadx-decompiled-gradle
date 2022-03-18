package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.z */
public final class C3970z {
    /* renamed from: a */
    public static void m16559a(C3742b bVar, Header header, CrashType crashType) {
        if (bVar != null) {
            m16560a(bVar.mo15252e(), header, crashType);
        }
    }

    /* renamed from: a */
    private static void m16560a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            String a = C3774m.m15603d().mo15504a();
            if (optLong > 0 && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    String str = "android__" + a + "_" + optLong + "_" + crashType;
                    if (header != null) {
                        JSONObject f = header.mo15227f();
                        if (f != null) {
                            f.put("unique_key", str);
                            return;
                        }
                        return;
                    }
                    jSONObject.put("unique_key", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
