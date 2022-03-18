package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bv {
    /* renamed from: a */
    public static void m250219a(String str, VideoChat videoChat) {
        if (videoChat != null) {
            m250221a(str, "rooms_sys", null, videoChat);
        }
    }

    /* renamed from: a */
    public static void m250220a(String str, C61303k kVar) {
        if (kVar != null && kVar.mo212056e() != null) {
            m250221a("vc_meeting_popup", str, "sip_dial_phone_page", kVar.mo212056e());
        }
    }

    /* renamed from: a */
    private static void m250221a(String str, String str2, String str3, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("from_source", str3);
            }
            C63726b.m249915a(str, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
