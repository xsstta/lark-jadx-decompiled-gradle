package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.bm */
public class C63750bm {
    /* renamed from: a */
    public static void m250191a(String str) {
        m250192a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, str);
    }

    /* renamed from: b */
    public static void m250194b(String str) {
        m250192a("join", str);
    }

    /* renamed from: c */
    public static void m250195c(String str) {
        m250192a("cancal", str);
    }

    /* renamed from: a */
    private static void m250192a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("action_name", str);
            }
            C63726b.m249919c("vc_privacy_policy_popup", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250193a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("action_name", str2);
                }
                C63726b.m249919c(str, jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
