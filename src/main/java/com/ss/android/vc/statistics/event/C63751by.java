package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.by */
public class C63751by {
    /* renamed from: c */
    public static void m250232c(VideoChat videoChat) {
        m250230a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "vc_main_settings", null, videoChat);
    }

    /* renamed from: a */
    public static void m250228a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "mismatch_language_tip");
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250231b(VideoChat videoChat) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "subtitle");
            jSONObject.put("from_source", "lark_setting");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("extend_value", jSONObject2);
            jSONObject2.put("action_enable", 1);
            if (videoChat.getType() == VideoChat.Type.CALL) {
                str = "vc_call_page_onthecall";
            } else {
                str = "vc_meeting_page_onthecall";
            }
            C63726b.m249915a(str, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250229a(String str, String str2, VideoChat videoChat) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", "substitle_first_spoken_language");
                jSONObject.put("action_name", str);
                jSONObject.put("spoken_language", str2);
                C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m250230a(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_subtitle_setting_page", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250227a(int i, String str, String str2, String str3, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_language", str2);
            jSONObject.put("from_language", str3);
            String str4 = "";
            if (i == 0) {
                str4 = Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
                jSONObject.put("from_source", str);
            } else if (i == 1) {
                str4 = "spoken_language";
            } else if (i == 2) {
                str4 = "subtitle_language";
            }
            m250230a(str4, null, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
