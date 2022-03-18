package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bl {

    /* renamed from: a */
    private static long f160899a;

    /* renamed from: b */
    private static boolean f160900b;

    /* renamed from: c */
    private static boolean f160901c;

    /* renamed from: d */
    private static boolean f160902d;

    /* renamed from: a */
    public static void m250185a() {
        f160899a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m250188b() {
        f160899a = 0;
        f160900b = false;
        f160901c = false;
        f160902d = false;
    }

    /* renamed from: a */
    public static void m250186a(VideoChat videoChat) {
        if (f160899a > 0 && !f160900b) {
            try {
                f160900b = true;
                long currentTimeMillis = System.currentTimeMillis() - f160899a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("video_duration", currentTimeMillis);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250189b(VideoChat videoChat) {
        if (f160899a > 0 && !f160901c) {
            try {
                f160901c = true;
                long currentTimeMillis = System.currentTimeMillis() - f160899a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("audio_duration", currentTimeMillis);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m250190c(VideoChat videoChat) {
        if (f160899a > 0 && !f160902d) {
            try {
                f160902d = true;
                long currentTimeMillis = System.currentTimeMillis() - f160899a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("local_video_duration", currentTimeMillis);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250187a(VideoChat videoChat, C61303k kVar) {
        if (!C60785x.m236238b()) {
            C60700b.m235851b("OnCallToStreamEvent", "[endMeeting]", "no network");
            return;
        }
        if (!f160902d && !kVar.mo212092J().mo212504A()) {
            C60700b.m235851b("OnCallToStreamEvent", "[endMeeting2]", "no localVideoStream");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("local_video_duration", 1000000L);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject, videoChat);
            } catch (Exception unused) {
            }
        }
        if (!f160901c && !kVar.mo212092J().mo212506C()) {
            C60700b.m235851b("OnCallToStreamEvent", "[endMeeting3]", "no remoteAudioStream");
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("audio_duration", 1000000L);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject2, videoChat);
            } catch (Exception unused2) {
            }
        }
        if (!f160900b && !kVar.mo212092J().mo212507D()) {
            C60700b.m235851b("OnCallToStreamEvent", "[endMeeting4]", "no remoteVideoStream");
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("video_duration", 1000000L);
                C63726b.m249918b("vc_monitor_oncall_to_stream", jSONObject3, videoChat);
            } catch (Exception unused3) {
            }
        }
    }
}
