package com.ss.android.vc.common.p3077b.p3078a;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.C63685a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.common.b.a.a */
public class C60696a {
    /* renamed from: a */
    private static Map<String, String> m235829a() {
        HashMap hashMap = new HashMap();
        hashMap.put("device_id", VideoChatModuleDependency.m236629b());
        hashMap.put("user_id", VideoChatModuleDependency.m236630c());
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        hashMap.put("app_version", C26246a.m94977a(ar.m236694a()));
        hashMap.put("device_mode", RomUtils.m94959n());
        hashMap.put("os", RomUtils.m94958m());
        return hashMap;
    }

    /* renamed from: a */
    public static void m235830a(String str, C60697b bVar) {
        if (!(TextUtils.isEmpty(str) || bVar == null || !C63634c.m249496b("byteview.uplog"))) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(bVar.mo208264a());
            hashMap.putAll(m235829a());
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException e) {
                C60700b.m235864f("PaintLogger@", "senLog", e.getMessage());
            }
            C63685a.m249657b(str, jSONObject);
        }
    }
}
