package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class an {
    /* renamed from: a */
    public static void m250023a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            C63726b.m249915a("vc_meeting_page_feedback", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250024a(boolean z, String str, String str2, String str3, VideoChat videoChat) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "click");
            jSONObject.put("action_name", "confirm");
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                str4 = "good_click";
            } else {
                str4 = "bad_click";
            }
            jSONObject2.put("click_type", str4);
            jSONObject2.put("product_type", "meeting/screen_share");
            if (!z) {
                jSONObject2.put("video_reason", str);
                jSONObject2.put("share_reason", str2);
                if (str3 != null) {
                    jSONObject2.put("other_reason", str3);
                }
            }
            jSONObject.put("extend_value", jSONObject2);
            C63726b.m249915a("vc_meeting_page_feedback", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
