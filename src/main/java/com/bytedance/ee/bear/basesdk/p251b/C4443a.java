package com.bytedance.ee.bear.basesdk.p251b;

import android.os.SystemClock;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.basesdk.b.a */
public class C4443a {

    /* renamed from: a */
    private static C10917c f13100a = new C10917c(new C10929e());

    /* renamed from: b */
    private static AtomicBoolean f13101b = new AtomicBoolean(false);

    /* renamed from: b */
    public static void m18373b() {
        try {
            if (f13101b.get()) {
                UserSP.getInstance().putBoolean("docs_idle_preload_hit_rate", false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, SystemClock.uptimeMillis() - C4511g.m18594d().mo17357f());
                jSONObject.put("docs_idle_preload", 1);
                C5234y.m21391b().mo21080a("docs_idle_preload_hit_rate", jSONObject);
            }
        } catch (Exception e) {
            C13479a.m54761a("IdleReport", e);
        }
    }

    /* renamed from: a */
    public static void m18372a() {
        try {
            if (UserSP.getInstance().getBoolean("docs_idle_preload_hit_rate", false)) {
                UserSP.getInstance().putBoolean("docs_idle_preload_hit_rate", false);
                f13101b.set(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, UserSP.getInstance().getLong("cost_time_app_launch_to_doc_init", 0));
                jSONObject.put("docs_idle_preload", 0);
                C5234y.m21391b().mo21080a("docs_idle_preload_hit_rate", jSONObject);
            }
        } catch (Exception e) {
            C13479a.m54761a("IdleReport", e);
        }
    }
}
