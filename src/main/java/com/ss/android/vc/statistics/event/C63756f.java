package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.f */
public class C63756f {
    /* renamed from: a */
    public static void m250285a(VideoChat videoChat) {
        boolean z;
        if (videoChat != null) {
            z = videoChat.isVoiceCall();
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("only_voice", 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (videoChat == null || TextUtils.isEmpty(videoChat.getId())) {
            C63726b.m249914a("vc_call_cancel", jSONObject);
        } else {
            C63726b.m249915a("vc_call_cancel", jSONObject, videoChat);
        }
    }
}
