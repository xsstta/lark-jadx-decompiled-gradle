package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.c */
public class C63752c {
    /* renamed from: a */
    public static void m250234a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "display_leaveButton");
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250238b(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "leave_meeting");
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m250240c(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "leave");
            jSONObject.put("from_source", "mobile_leaveroom");
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250235a(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("from_source", str2);
            }
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250239b(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250236a(String str, String str2, String str3, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("from_source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("user_location", str3);
            }
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250237a(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_breakoutrooms_popup", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
