package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class bs {

    /* renamed from: a */
    private static HashMap<String, Boolean> f160903a = new HashMap<>();

    /* renamed from: a */
    public static void m250214a(VideoChat videoChat) {
        if (videoChat != null && videoChat.getActionTime() != null && videoChat.getActionTime().getAcceptTime() >= 15000000) {
            Boolean bool = f160903a.get(videoChat.getId());
            if (bool == null || !bool.booleanValue()) {
                f160903a.put(videoChat.getId(), true);
                long syncNtpTimeMillis = VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis() - videoChat.getActionTime().getAcceptTime();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("client_duration", syncNtpTimeMillis);
                    C63726b.m249915a("vc_call_oncallLoading", jSONObject, videoChat);
                } catch (JSONException e) {
                    C60700b.m235864f("ReceiveOnCallDurationEvent", "[sendReceiveOnCallDuration]", e.getMessage());
                }
            }
        }
    }
}
