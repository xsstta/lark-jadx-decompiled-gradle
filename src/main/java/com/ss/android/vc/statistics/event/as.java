package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class as {

    /* renamed from: a */
    private static long f160884a;

    /* renamed from: b */
    private static String f160885b;

    /* renamed from: c */
    private static boolean f160886c;

    /* renamed from: d */
    private static boolean f160887d;

    /* renamed from: a */
    public static void m250051a() {
        f160884a = 0;
        f160885b = null;
        f160886c = false;
        f160887d = false;
    }

    /* renamed from: a */
    public static void m250052a(String str) {
        f160884a = System.currentTimeMillis();
        f160885b = str;
    }

    /* renamed from: a */
    public static void m250053a(String str, VideoChat videoChat) {
        Participant a = ParticipantUtil.m248703a(str, videoChat.getParticipants());
        if (a != null && ParticipantUtil.m248717a(a, videoChat.getHostId(), videoChat.getHostDeviceId(), videoChat.getHostType()) && f160884a > 0 && !f160886c) {
            try {
                f160886c = true;
                long currentTimeMillis = System.currentTimeMillis() - f160884a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("video_duration", currentTimeMillis);
                JSONObject jSONObject2 = new JSONObject();
                if (a != null) {
                    jSONObject2.put("from_uuid", C57859q.m224565a(videoChat.getHostId()));
                    jSONObject2.put("from_device_id", a.getDeviceId());
                    jSONObject2.put("from_interactive_id", a.getInteractiveId());
                    jSONObject.put("extend_value", jSONObject2);
                }
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250054b(String str, VideoChat videoChat) {
        Participant a = ParticipantUtil.m248703a(str, videoChat.getParticipants());
        if (a != null && ParticipantUtil.m248717a(a, videoChat.getHostId(), videoChat.getHostDeviceId(), videoChat.getHostType()) && f160884a > 0 && !f160887d) {
            try {
                f160887d = true;
                long currentTimeMillis = System.currentTimeMillis() - f160884a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("audio_duration", currentTimeMillis);
                JSONObject jSONObject2 = new JSONObject();
                if (a != null) {
                    jSONObject2.put("from_uuid", C57859q.m224565a(videoChat.getHostId()));
                    jSONObject2.put("from_device_id", a.getDeviceId());
                    jSONObject2.put("from_interactive_id", a.getInteractiveId());
                    jSONObject.put("extend_value", jSONObject2);
                }
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
