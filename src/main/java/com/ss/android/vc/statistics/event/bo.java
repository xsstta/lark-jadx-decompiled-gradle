package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bo {
    /* renamed from: a */
    public static void m250198a(C61303k kVar) {
        if (kVar != null && kVar.mo212056e() != null) {
            m250200a("vc_phone_page", "hung_up", null, kVar.mo212056e());
        }
    }

    /* renamed from: a */
    public static void m250199a(String str, VideoChat videoChat) {
        if (videoChat != null) {
            m250200a(str, "phone_invite", null, videoChat);
        }
    }

    /* renamed from: a */
    public static void m250201a(boolean z, C61303k kVar) {
        int i;
        if (kVar != null && kVar.mo212056e() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("invitee_user_name_update", i);
                m250200a("vc_phone_page", "dial_phone", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m250200a(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str2);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a(str, jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
