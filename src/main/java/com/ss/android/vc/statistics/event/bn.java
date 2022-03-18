package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.notification.ringing.offline.C61171a;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bn {
    /* renamed from: a */
    public static void m250196a(VideoChat videoChat, String str) {
        String str2;
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "ringing");
                jSONObject.put("sid", videoChat.getPushSid());
                if (videoChat.getIsOfflineRecovery()) {
                    str2 = "pull";
                } else {
                    str2 = "ws";
                }
                jSONObject.put("from_source", str2);
                if (C61171a.m237878a(videoChat) != null) {
                    jSONObject.put("from_source", "voip");
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("env_id", str);
                }
                if (videoChat.getType() == VideoChat.Type.CALL) {
                    C63726b.m249915a("vc_call_page_ringing", jSONObject, videoChat);
                } else {
                    C63726b.m249915a("vc_meeting_page_ringing", jSONObject, videoChat);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250197a(VideoChat videoChat, boolean z, String str) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "refuse");
                if (z) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("reason", "in_meeting");
                    jSONObject.put("extend_value", jSONObject2);
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("env_id", str);
                }
                if (videoChat.getType() == VideoChat.Type.CALL) {
                    C63726b.m249915a("vc_call_page_ringing", jSONObject, videoChat);
                } else {
                    C63726b.m249915a("vc_meeting_page_ringing", jSONObject, videoChat);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
