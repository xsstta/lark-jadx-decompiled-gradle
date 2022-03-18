package com.ss.android.vc.statistics.p3183d;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.d.a */
public class C63727a {
    /* renamed from: a */
    private static String m249925a() {
        AbstractC61294b j = MeetingManager.m238341a().mo211906j();
        if (j instanceof C61303k) {
            return ((C61303k) j).mo212093K();
        }
        return "none";
    }

    /* renamed from: a */
    public static JSONObject m249927a(JSONObject jSONObject, VideoChat videoChat) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        String str8;
        String str9;
        String str10 = null;
        if (videoChat != null) {
            String id = videoChat.getId();
            String str11 = "meeting";
            if (videoChat.getType() == VideoChat.Type.CALL) {
                str11 = "call";
                str5 = null;
            } else if (videoChat.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                str5 = "interview";
            } else {
                str5 = "general";
            }
            Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
            boolean z2 = false;
            if (c != null) {
                String interactiveId = c.getInteractiveId();
                boolean is_host = c.is_host();
                z = c.isCoHost();
                if (videoChat.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    if (c.getParticipantRole() == ParticipantRole.INTERVIEWER) {
                        str10 = "interviewer";
                    } else if (c.getParticipantRole() == ParticipantRole.INTERVIEWEE) {
                        str10 = "candidate";
                    }
                }
                str8 = str10;
                str10 = interactiveId;
                z2 = is_host;
            } else {
                str8 = null;
                z = false;
            }
            if (videoChat.getType() == VideoChat.Type.MEET) {
                if (z2) {
                    str9 = "host";
                } else if (z) {
                    str9 = "cohost";
                } else {
                    str9 = "attendee";
                }
            } else if (z2) {
                str9 = "caller";
            } else {
                str9 = "callee";
            }
            str = str10;
            str10 = id;
            str2 = str8;
            str3 = str11;
            str4 = str9;
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("conference_id");
            if (!TextUtils.isEmpty(optString)) {
                str10 = optString;
            }
            String optString2 = jSONObject.optString("meeting_type");
            if (!TextUtils.isEmpty(optString)) {
                str7 = str10;
                str6 = optString2;
                return m249926a(ar.m236694a(), jSONObject, str7, str4, str3, str6, str2, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis(), VideoChatModuleDependency.getFeatureGatingDependency().mo196394b(), str);
            }
        }
        str7 = str10;
        str6 = str5;
        return m249926a(ar.m236694a(), jSONObject, str7, str4, str3, str6, str2, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis(), VideoChatModuleDependency.getFeatureGatingDependency().mo196394b(), str);
    }

    /* renamed from: a */
    private static JSONObject m249926a(Context context, JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, long j, Map<String, Boolean> map, String str6) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("conference_id", str);
            } else {
                jSONObject.put("conference_id", "none");
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("user_type", str2);
            } else {
                jSONObject.put("user_type", "none");
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("call_type", str3);
            } else {
                jSONObject.put("call_type", "none");
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("meeting_type", str4);
            } else {
                jSONObject.put("meeting_type", "none");
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("interview_participant_type", str5);
            } else {
                jSONObject.put("interview_participant_type", "none");
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("interactive_id", str6);
            } else {
                jSONObject.put("interactive_id", "none");
            }
            if (TextUtils.isEmpty(jSONObject.optString("env_id"))) {
                jSONObject.put("env_id", m249925a());
            }
            if (TextUtils.isEmpty(jSONObject.optString("share_id"))) {
                jSONObject.put("share_id", "none");
            }
            jSONObject.put("participant_type", "lark_user");
            if (RomUtils.m94954i() == null || RomUtils.m94954i().mo93347d() == null || RomUtils.m94954i().mo93344a() == null) {
                jSONObject.put("rom_version", "none");
            } else {
                jSONObject.put("rom_version", RomUtils.m94954i().mo93347d() + "_" + RomUtils.m94954i().mo93344a());
            }
        } catch (JSONException e) {
            C60700b.m235864f("CommonParamUtils2@", "[getParams]", "exception = " + e.getMessage());
        }
        return jSONObject;
    }
}
