package com.ss.android.vc.statistics.event;

import android.os.Build;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.notification.ringing.offline.C61171a;
import com.ss.android.vc.lark.notification.ringing.offline.VCOfflineNotice;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bu {
    /* renamed from: b */
    public static void m250218b(VideoChat videoChat) {
        m250217a("ringing_open", videoChat, null);
    }

    /* renamed from: a */
    public static void m250216a(VideoChat videoChat) {
        m250217a("ringing_push", videoChat, C61171a.m237878a(videoChat));
    }

    /* renamed from: a */
    private static void m250217a(String str, VideoChat videoChat, VCOfflineNotice vCOfflineNotice) {
        String str2;
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                jSONObject.put("sid", videoChat.getPushSid());
                jSONObject.put("mobile_model", Build.MODEL + "_" + Build.MANUFACTURER);
                if (videoChat.getIsOfflineRecovery()) {
                    str2 = "pull";
                } else {
                    str2 = "ws";
                }
                jSONObject.put("from_source", str2);
                if (vCOfflineNotice != null) {
                    jSONObject.put("from_source", "voip");
                }
                C63726b.m249915a("vc_ringing_push_notification", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
