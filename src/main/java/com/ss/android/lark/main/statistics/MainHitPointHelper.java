package com.ss.android.lark.main.statistics;

import android.os.SystemClock;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

public class MainHitPointHelper extends BaseHitPoint {

    /* renamed from: a */
    private static long f112886a = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Stage {
    }

    /* renamed from: a */
    public static void m176662a() {
        Statistics.sendEvent("click_new_activity");
    }

    /* renamed from: b */
    public static void m176670b() {
        Statistics.sendEvent("navigation_more_edit_done");
    }

    /* renamed from: c */
    public static void m176672c() {
        Statistics.sendEvent("navigation_more_edit_cancel");
    }

    /* renamed from: f */
    public static void m176676f() {
        Statistics.sendEvent("privacy_policy_accept");
    }

    /* renamed from: g */
    public static void m176677g() {
        Statistics.sendEvent("navigation_more");
    }

    /* renamed from: d */
    public static void m176674d() {
        if (f112886a == -1) {
            f112886a = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public static void m176675e() {
        if (f112886a != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f112886a;
            f112886a = -1;
            long b = C44134a.m174959a().mo133203W().mo133303b();
            long c = C44134a.m174959a().mo133203W().mo133304c();
            if (elapsedRealtime <= b && elapsedRealtime <= c) {
                boolean z = !C44134a.m174959a().mo133203W().mo133305d();
                long a = C44134a.m174959a().mo133203W().mo133302a();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("latency", elapsedRealtime);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("since_startup", a);
                    jSONObject2.put("since_latest_enter_foreground", b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("is_startup", z);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                m176669a("main_tab_loading_time", jSONObject3, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: a */
    public static void m176663a(int i) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 1) {
                str = "success";
            } else {
                str = "start";
            }
            jSONObject.put("stage", str);
            Statistics.sendEvent("splash_ad_pull_request_dev", jSONObject);
        } catch (Exception unused) {
            Log.m165383e("MainHitPoint", "reportSplashAdPullRequest fail");
        }
    }

    /* renamed from: b */
    public static void m176671b(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("splash_id", j);
            jSONObject.put("click", "confirm");
            Statistics.sendEvent("splash_page_click", jSONObject);
        } catch (Exception unused) {
            Log.m165383e("MainHitPoint", "reportSplashAdClick fail");
        }
    }

    /* renamed from: c */
    public static void m176673c(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("splash_id", j);
            jSONObject.put("click", "confirm");
            Statistics.sendEvent("splash_page_skip_click", jSONObject);
        } catch (Exception unused) {
            Log.m165383e("MainHitPoint", "reportSplashAdSkip fail");
        }
    }

    /* renamed from: a */
    public static void m176666a(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("launch_type", "cold_launch");
            jSONObject.put("splash_id", j);
            Statistics.sendEvent("splash_page_view", jSONObject);
        } catch (Exception unused) {
            Log.m165383e("MainHitPoint", "reportSplashAdShow fail");
        }
    }

    /* renamed from: a */
    public static void m176667a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("calltype", str);
            Statistics.sendEvent("quick_navigation", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m176664a(int i, long j) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 1) {
                str = "success";
            } else {
                str = "start";
            }
            jSONObject.put("stage", str);
            if (i == 1) {
                jSONObject.put("download_time", (int) j);
            }
            Statistics.sendEvent("splash_ad_download_resource_dev", jSONObject);
        } catch (Exception unused) {
            Log.m165383e("MainHitPoint", "reportSplashAdDownloadResource fail");
        }
    }

    /* renamed from: a */
    public static void m176668a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_line", str);
            jSONObject.put("size", str2);
            jSONObject.put("click", str);
            Statistics.sendEvent("public_widget_click", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m176665a(int i, String str, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("navigation_type", i);
            jSONObject.put("key", str);
            jSONObject.put("position", i2);
            Statistics.sendEvent("navigation", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m176669a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        MonitorUtils.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }
}
