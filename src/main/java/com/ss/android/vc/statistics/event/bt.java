package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class bt {

    /* renamed from: a */
    private static HashMap<String, Boolean> f160904a = new HashMap<>();

    /* renamed from: a */
    public static void m250215a(VideoChat videoChat) {
        if (videoChat != null && videoChat.getActionTime() != null && videoChat.getActionTime().getInviteTime() >= 15000000) {
            Boolean bool = f160904a.get(videoChat.getId());
            if (bool == null || !bool.booleanValue()) {
                int i = 1;
                f160904a.put(videoChat.getId(), true);
                long syncNtpTimeMillis = VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis() - videoChat.getActionTime().getInviteTime();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("client_duration", syncNtpTimeMillis);
                    if (!videoChat.getIsOfflineRecovery()) {
                        i = 0;
                    }
                    jSONObject.put("is_offline", i);
                    C63726b.m249915a("vc_call_receiveduration", jSONObject, videoChat);
                } catch (JSONException e) {
                    C60700b.m235864f("ReceiveRingDurationEvent", "[sendReceiveRingDuration]", e.getMessage());
                }
            }
        }
    }
}
