package com.ss.android.vc.statistics.p3182c;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.NetworkUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.c.a */
public class C63724a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.statistics.c.a$1 */
    public static /* synthetic */ class C637251 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.larksuite.framework.utils.NetworkUtils$NetworkType[] r0 = com.larksuite.framework.utils.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.statistics.p3182c.C63724a.C637251.f160864a = r0
                com.larksuite.framework.utils.NetworkUtils$NetworkType r1 = com.larksuite.framework.utils.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.statistics.p3182c.C63724a.C637251.f160864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.framework.utils.NetworkUtils$NetworkType r1 = com.larksuite.framework.utils.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.statistics.p3182c.C63724a.C637251.f160864a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.framework.utils.NetworkUtils$NetworkType r1 = com.larksuite.framework.utils.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.statistics.p3182c.C63724a.C637251.f160864a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.framework.utils.NetworkUtils$NetworkType r1 = com.larksuite.framework.utils.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.p3182c.C63724a.C637251.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static boolean m249909b(VideoChat videoChat) {
        return !m249907a(videoChat);
    }

    /* renamed from: a */
    public static boolean m249907a(VideoChat videoChat) {
        VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
        if (currentUser == null) {
            return false;
        }
        String id = currentUser.getId();
        if (TextUtils.isEmpty(id) || videoChat == null) {
            return false;
        }
        return id.equalsIgnoreCase(videoChat.getHostId());
    }

    /* renamed from: a */
    public static String m249903a(Context context) {
        NetworkUtils.NetworkType c = NetworkUtils.m94916c(context);
        if (c != null) {
            int i = C637251.f160864a[c.ordinal()];
            if (i == 1) {
                return "wifi";
            }
            if (i == 2) {
                return "2g";
            }
            if (i == 3) {
                return "3g";
            }
            if (i != 4) {
                return "others";
            }
            return "4g";
        }
        return "others";
    }

    /* renamed from: b */
    static JSONObject m249908b(JSONObject jSONObject) {
        return m249904a(ar.m236694a(), jSONObject, null, "host", "meeting", null, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis(), VideoChatModuleDependency.getFeatureGatingDependency().mo196394b(), null);
    }

    /* renamed from: c */
    static JSONObject m249910c(JSONObject jSONObject) {
        return m249904a(ar.m236694a(), jSONObject, null, "attendee", "meeting", null, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis(), VideoChatModuleDependency.getFeatureGatingDependency().mo196394b(), null);
    }

    /* renamed from: a */
    static JSONObject m249905a(JSONObject jSONObject) {
        return m249904a(ar.m236694a(), jSONObject, null, "caller", "call", null, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis(), VideoChatModuleDependency.getFeatureGatingDependency().mo196394b(), null);
    }

    /* renamed from: a */
    public static JSONObject m249906a(JSONObject jSONObject, VideoChat videoChat) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        String str9 = null;
        if (videoChat != null) {
            String id = videoChat.getId();
            if (videoChat.getType() == VideoChat.Type.CALL) {
                str6 = "call";
            } else if (videoChat.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                str6 = "interview";
            } else {
                str6 = "meeting";
            }
            Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
            boolean z2 = false;
            if (c != null) {
                String interactiveId = c.getInteractiveId();
                boolean is_host = c.is_host();
                z = c.isCoHost();
                if (videoChat.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    if (c.getParticipantRole() == ParticipantRole.INTERVIEWER) {
                        str9 = "interviewer";
                    } else if (c.getParticipantRole() == ParticipantRole.INTERVIEWEE) {
                        str9 = "candidate";
                    }
                }
                str7 = str9;
                str9 = interactiveId;
                z2 = is_host;
            } else {
                str7 = null;
                z = false;
            }
            if (videoChat.getType() == VideoChat.Type.MEET) {
                if (z2) {
                    str8 = "host";
                } else if (z) {
                    str8 = "cohost";
                } else {
                    str8 = "attendee";
                }
            } else if (z2) {
                str8 = "caller";
            } else {
                str8 = "callee";
            }
            str4 = str8;
            str = str9;
            str5 = id;
            str3 = str6;
            str2 = str7;
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        return m249904a(ar.m236694a(), jSONObject, str5, str4, str3, str2, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis(), VideoChatModuleDependency.getFeatureGatingDependency().mo196394b(), str);
    }

    /* renamed from: a */
    private static JSONObject m249904a(Context context, JSONObject jSONObject, String str, String str2, String str3, String str4, long j, Map<String, Boolean> map, String str5) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("conference_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("user_type", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("call_type", str3);
            }
            if (TextUtils.equals(str3, "interview")) {
                jSONObject.put("meeting_type", "interview");
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("interview_participant_type", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("interactive_id", str5);
            }
            jSONObject.put("sdk_name", "bytertc");
            jSONObject.put("network_type", m249903a(context));
            jSONObject.put("client_ntp_time", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
