package com.bytedance.memory.p848d;

import android.text.TextUtils;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.apm.api.C20694a;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.memory.d.a */
public class C20076a {
    /* renamed from: d */
    public static boolean m73268d(String str) {
        return m73265a("performance_modules", "memory", str);
    }

    /* renamed from: e */
    public static boolean m73269e(String str) {
        return m73265a("custom_event_settings", "allow_service_name", str);
    }

    /* renamed from: c */
    public static boolean m73267c(String str) {
        if (m73265a("performance_modules", "memory", str) || C20055a.m73200c().mo68024b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m73263a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IApmAgent iApmAgent = (IApmAgent) C20216d.m73783a(IApmAgent.class);
                if (iApmAgent != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, 1);
                    iApmAgent.monitorEvent("memory_dump_event", jSONObject, null, null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m73266b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IApmAgent iApmAgent = (IApmAgent) C20216d.m73783a(IApmAgent.class);
                if (iApmAgent != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, 1);
                    iApmAgent.monitorEvent(C20694a.m75478g().mo69896a("memory_dump_event").mo69897a(jSONObject).mo69898a(true).mo69899a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m73264a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IApmAgent iApmAgent = (IApmAgent) C20216d.m73783a(IApmAgent.class);
                if (iApmAgent != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, j);
                    iApmAgent.monitorEvent("memory_dump_event", null, jSONObject, null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static boolean m73265a(String str, String str2, String str3) {
        JSONObject configJSON;
        JSONObject optJSONObject;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                IConfigManager iConfigManager = (IConfigManager) C20216d.m73783a(IConfigManager.class);
                if (iConfigManager == null || (configJSON = iConfigManager.getConfigJSON(str)) == null || (optJSONObject = configJSON.optJSONObject(str2)) == null || optJSONObject.optInt(str3, 0) != 1) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
