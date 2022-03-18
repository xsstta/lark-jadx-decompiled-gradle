package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.y */
public class C63777y {
    /* renamed from: a */
    public static void m250402a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "attend_new");
            if (z) {
                C63726b.m249917b("vc_meeting_lark_hint", jSONObject);
            } else {
                C63726b.m249919c("vc_meeting_lark_hint", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250401a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            jSONObject.put("from_source", "calendar_reminder");
            jSONObject.put("conference_id", str);
            C63726b.m249919c("vc_meeting_lark_hint", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250403a(boolean z, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "join_meeting";
            } else {
                str2 = "cancel";
            }
            jSONObject.put("action_name", str2);
            jSONObject.put("from_source", "calendar_reminder");
            jSONObject.put("conference_id", str);
            C63726b.m249919c("vc_meeting_lark_hint", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
