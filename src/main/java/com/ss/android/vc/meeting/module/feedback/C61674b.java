package com.ss.android.vc.meeting.module.feedback;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.feedback.b */
public class C61674b {
    /* renamed from: a */
    public static void m240730a(VideoChat videoChat) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (videoChat.getType() == VideoChat.Type.CALL) {
                str = "call";
            } else {
                str = "meeting";
            }
            jSONObject.put("call_type", str);
            jSONObject.put("participant_type", "lark_user");
            C63726b.m249915a("vc_display_feelgood_feedback", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
