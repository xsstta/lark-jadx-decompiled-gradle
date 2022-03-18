package com.bytedance.ee.webapp.p722c;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.webapp.c.a */
public class C13765a {
    /* renamed from: a */
    public static void m55783a(String str) {
        try {
            Statistics.sendEvent("app_share", new JSONObject().put("app_capability_type", str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m55784a(String str, String str2) {
        try {
            Statistics.sendEvent("op_h5_share_view", new JSONObject().put("appId", str).put(ShareHitPoint.f121869d, str2));
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebAppHitPoint", "send app share event err ", e);
        }
    }

    /* renamed from: b */
    public static void m55786b(String str, String str2) {
        try {
            Statistics.sendEvent("op_h5_share_success", new JSONObject().put("appId", str).put(ShareHitPoint.f121869d, str2));
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebAppHitPoint", "send app share success event err ", e);
        }
    }

    /* renamed from: a */
    public static void m55785a(String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        try {
            JSONObject put = new JSONObject().put("user_id", str).put("h5app_url", str2).put("h5app_id", str3).put("scene", i).put("h5app_name", str4);
            if (z) {
                str5 = "yes";
            } else {
                str5 = "no";
            }
            Statistics.sendEvent("h5application_launch", put.put("is_success", str5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
