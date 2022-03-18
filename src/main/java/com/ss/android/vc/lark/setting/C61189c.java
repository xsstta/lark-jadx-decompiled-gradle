package com.ss.android.vc.lark.setting;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.lark.setting.c */
public class C61189c {
    /* renamed from: a */
    public static void m237973a() {
        m237974a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, null);
    }

    /* renamed from: a */
    public static void m237975a(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enable", i);
            m237974a("calendar_remind", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m237976b(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enable", i);
            m237974a("attendee_remind", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m237977c(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enable", i);
            m237974a("subtitle", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m237978d(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enable", i);
            m237974a("interpretation", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m237974a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            jSONObject2.put("from_source", "lark_setting");
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63685a.m249653a("vc_meeting_page_setting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
