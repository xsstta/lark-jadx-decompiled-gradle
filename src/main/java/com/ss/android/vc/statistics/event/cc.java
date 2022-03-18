package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class cc {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.statistics.event.cc$1 */
    public static /* synthetic */ class C637531 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160906a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType[] r0 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.statistics.event.cc.C637531.f160906a = r0
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Default     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.statistics.event.cc.C637531.f160906a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.statistics.event.cc.C637531.f160906a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.cc.C637531.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m250255a(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", 0);
            m250257a("voice_source_unchanged", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatAudioEvent", "[sendAudioTypeUnchangedEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250257a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_call_page_onthecall", jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatAudioEvent", "[sendVideoChatAudioEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250258a(boolean z, boolean z2, VideoChat videoChat) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "unmute";
            if (z) {
                str = str2;
            } else {
                str = "mute";
            }
            jSONObject.put("mic", str);
            if (!z2) {
                str2 = "mute";
            }
            jSONObject.put("camera", str2);
            String str3 = "";
            if (MeetingAudioManager.m239471k().mo212721z()) {
                str3 = "speaker";
            } else {
                int i = C637531.f160906a[MeetingAudioManager.m239471k().mo212720y().ordinal()];
                if (i == 1) {
                    str3 = "earpiece";
                } else if (i == 2) {
                    str3 = "bluetooth";
                } else if (i == 3) {
                    str3 = "headphone";
                }
            }
            jSONObject.put("audio_output", str3);
            m250257a("hardware_status", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatAudioEvent", "[sendInitHardwareStatusEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250256a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", C61405a.m239521a(audioType, z));
            jSONObject.put("after_voice_source", C61405a.m239521a(audioType2, z2));
            m250257a("voice_source_changed", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("VideoChatAudioEvent", "[sendAudioTypeChangedEvent]", e.getMessage());
        }
    }
}
