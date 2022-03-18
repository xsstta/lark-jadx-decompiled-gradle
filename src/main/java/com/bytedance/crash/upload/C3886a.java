package com.bytedance.crash.upload;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3850d;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3966w;
import com.bytedance.crash.util.C3968x;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.a */
public class C3886a {

    /* renamed from: a */
    public static Runnable f11894a = new Runnable() {
        /* class com.bytedance.crash.upload.C3886a.RunnableC38871 */

        public void run() {
            C3886a.m16113b();
            if (C3886a.f11895b <= 0) {
                return;
            }
            if (C3933b.m16336b(C3774m.m15609j())) {
                C3866n.m16016b().mo15509a(C3886a.f11894a, 15000);
            } else {
                C3866n.m16016b().mo15509a(C3886a.f11894a, 60000);
            }
        }
    };

    /* renamed from: b */
    public static int f11895b = 0;

    /* renamed from: c */
    public static boolean f11896c = false;

    /* renamed from: d */
    public static boolean f11897d = false;

    /* renamed from: e */
    private static IConfigManager f11898e = null;

    /* renamed from: f */
    private static boolean f11899f = true;

    /* renamed from: d */
    public static boolean m16116d() {
        return f11899f;
    }

    /* renamed from: a */
    public static void m16111a() {
        f11895b = 40;
        C3866n.m16016b().mo15508a(f11894a);
    }

    /* renamed from: e */
    public static void m16117e() {
        C3968x.m16530a((Object) "try updateWhenCrash");
        C3919m.m16222a(true);
    }

    /* renamed from: c */
    public static IConfigManager m16115c() {
        if (f11899f && f11898e == null) {
            try {
                f11898e = (IConfigManager) C20216d.m73783a(IConfigManager.class);
            } catch (Throwable unused) {
                f11899f = false;
            }
            IConfigManager iConfigManager = f11898e;
            if (iConfigManager != null) {
                iConfigManager.registerConfigListener(new AbstractC20704a() {
                    /* class com.bytedance.crash.upload.C3886a.C38882 */

                    @Override // com.bytedance.services.slardar.config.AbstractC20704a
                    public void onReady() {
                        C3886a.f11897d = true;
                    }

                    @Override // com.bytedance.services.slardar.config.AbstractC20704a
                    public void onRefresh(JSONObject jSONObject, boolean z) {
                    }
                });
            }
        }
        if (!f11899f || !f11897d) {
            return null;
        }
        return f11898e;
    }

    /* renamed from: b */
    public static void m16113b() {
        int i = f11895b;
        if (i > 0) {
            f11895b = i - 1;
            C3968x.m16530a((Object) "try fetchApmConfig");
            if (C3933b.m16336b(C3774m.m15609j())) {
                try {
                    IConfigManager c = m16115c();
                    if (c != null) {
                        JSONObject jSONObject = new JSONObject(c.queryConfig());
                        f11895b = 0;
                        C3840b.m15876a(m16110a(C3774m.m15591a().mo15460e(), jSONObject), true);
                        C3968x.m16530a((Object) "success fetchApmConfig");
                    }
                } catch (JSONException unused) {
                } catch (Throwable unused2) {
                    f11895b = 0;
                }
            } else {
                C3919m.m16226c();
                if (C3919m.m16225b()) {
                    f11895b = 0;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16112a(Object obj) {
        byte[] b;
        if (C3919m.m16223a(C3743c.m15479d(obj)) && C3966w.m16528b(C3774m.m15609j()) && (b = m16114b(obj)) != null) {
            try {
                C3840b.m15876a(m16110a(C3743c.m15479d(obj), new JSONObject(new String(b)).optJSONObject("ret")), true);
                C3968x.m16530a((Object) "success fetchAidConfig net");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static byte[] m16114b(Object obj) {
        try {
            return CrashUploader.m16095a(C3774m.m15611l().getApmConfigUrl(), C3850d.m15955a(C3743c.m15478c(obj), "aid", "4444", "crash", "npth", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "device_id", C3774m.m15603d().mo15504a()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONArray m16110a(String str, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str, jSONObject);
            jSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
