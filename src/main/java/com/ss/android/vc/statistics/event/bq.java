package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bq {
    /* renamed from: a */
    public static void m250207a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("unique_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            C63726b.m249919c("vc_meeting_page_preview", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("PreviewShowEvent", "[sendCalendarPreviewShow]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250209b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("interview_unique_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            C63726b.m249919c("vc_meeting_page_preview", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("PreviewShowEvent", "[sendInterviewPreviewShow]", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m250211c(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("group_id", C57859q.m224565a(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            C63726b.m249917b("vc_meeting_page_preview", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("PreviewShowEvent", "[sendGroupPreviewShow]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250208a(boolean z, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("conference_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            if (z) {
                C63726b.m249917b("vc_meeting_page_preview", jSONObject);
            } else {
                C63726b.m249919c("vc_meeting_page_preview", jSONObject);
            }
        } catch (JSONException e) {
            C60700b.m235864f("PreviewShowEvent", "[sendPreviewShow]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250210b(boolean z, String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (z) {
                str3 = "landing_page";
            } else {
                str3 = "app_login_page";
            }
            jSONObject.put("from_source", str3);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("web_id", str2);
            }
            C63726b.m249919c("vc_meeting_page_preview", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("PreviewShowEvent", "[sendGuestPreviewShow]", e.getMessage());
        }
    }
}
