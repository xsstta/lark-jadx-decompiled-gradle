package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.e */
public class C63755e {
    /* renamed from: a */
    public static void m250282a(VideoChat videoChat, String str, String str2) {
        m250283a("video", videoChat, str, str2);
    }

    /* renamed from: b */
    public static void m250284b(VideoChat videoChat, String str, String str2) {
        m250283a("voice", videoChat, str, str2);
    }

    /* renamed from: a */
    private static void m250283a(String str, VideoChat videoChat, String str2, String str3) {
        if (videoChat != null && videoChat.getType() == VideoChat.Type.CALL) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("accept_type", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("context_id", str3);
                }
                C63726b.m249915a("vc_call_accept", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
