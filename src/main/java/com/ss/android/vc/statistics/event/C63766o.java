package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.o */
public class C63766o {

    /* renamed from: a */
    private static long f160915a;

    /* renamed from: a */
    public static void m250324a(VideoChat videoChat) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "ring_pending");
                jSONObject.put("ring_conference_id", videoChat.getId());
                C63726b.m249915a("vc_client_signal_info", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250327a(String str) {
        f160915a = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "req_create");
            jSONObject.put("env_id", str);
            C63726b.m249915a("vc_client_signal_info", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250328b(VideoChat videoChat, String str) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "req_share_screen");
                jSONObject.put("env_id", str);
                C63726b.m249915a("vc_client_signal_info", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250325a(VideoChat videoChat, String str) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "recive_meeting_info");
                jSONObject.put("env_id", str);
                if (f160915a > 0) {
                    jSONObject.put("duration", System.currentTimeMillis() - f160915a);
                }
                C63726b.m249915a("vc_client_signal_info", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250329b(VideoChat videoChat, String str, String str2) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "begin_share_screen");
                jSONObject.put("share_screen_id", str);
                jSONObject.put("env_id", str2);
                C63726b.m249915a("vc_client_signal_info", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250326a(VideoChat videoChat, String str, String str2) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "share_screen_result");
                jSONObject.put("env_id", str2);
                if (str != null) {
                    jSONObject.put("share_screen_id", str);
                }
                C63726b.m249915a("vc_client_signal_info", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
