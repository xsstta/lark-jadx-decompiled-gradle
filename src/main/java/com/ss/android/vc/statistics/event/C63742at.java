package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.at */
public class C63742at {
    /* renamed from: a */
    private static void m250071a(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendOnTheCallEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250074a(boolean z, boolean z2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "unmute";
            jSONObject.put("mic", z ? str : "mute");
            if (!z2) {
                str = "mute";
            }
            jSONObject.put("camera", str);
            String str2 = "";
            if (MeetingAudioManager.m239471k().mo212721z()) {
                str2 = "speaker";
            } else {
                int i = C637431.f160888a[MeetingAudioManager.m239471k().mo212720y().ordinal()];
                if (i == 1) {
                    str2 = "earpiece";
                } else if (i == 2) {
                    str2 = "bluetooth";
                } else if (i == 3) {
                    str2 = "headphone";
                }
            }
            jSONObject.put("audio_output", str2);
            m250071a("hardware_status", (String) null, jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendInitHardwareStatusEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250073a(boolean z, VideoChat videoChat, Boolean bool) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            jSONObject.put("action_enabled", z ? 0 : 1);
            if (bool.booleanValue()) {
                i = 1;
            }
            jSONObject.put("is_sharing", i);
            m250071a("camera", "control_bar", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendSwitchCameraEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250064a(VideoChat videoChat, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", str);
            jSONObject.put("attendee_device_id", str2);
            m250071a("assign_interpreter", (String) null, jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendAssignInterpreterClickEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250067a(FollowInfo followInfo, Participant participant, VideoChat videoChat) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("attendee_uuid", C57859q.m224565a(participant.getId()));
                jSONObject.put("attendee_device_id", participant.getDeviceId());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("assign_present", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowAssignPresent]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m250065a(VideoChat videoChat, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action_enabled", z ? 1 : 0);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendShareDeviceAudio]", e.getMessage());
        }
        m250071a("share_device_audio", (String) null, jSONObject, videoChat);
    }

    /* renamed from: a */
    public static void m250072a(boolean z, VideoChat videoChat) {
        m250071a(z ? "record_start" : "record_end", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250063a(VideoChat videoChat, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "record_request_reconfirm");
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendRecordPopupEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250070a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", str);
            m250071a("share", (String) null, jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendShareMeeting]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250066a(VideoChat videoChat, boolean z, MeetingSecuritySetting.SecurityLevel securityLevel) {
        if (securityLevel != null) {
            int i = C637431.f160889b[securityLevel.ordinal()];
            int i2 = 1;
            String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "host_invited" : "selected" : "organizer_company" : "anyone";
            try {
                JSONObject jSONObject = new JSONObject();
                if (!z) {
                    i2 = 0;
                }
                jSONObject.put("action_enabled", i2);
                jSONObject.put("join_permission", str);
                m250071a("lobby_entry", "control_bar", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendLobbyEnableEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m250068a(C61303k kVar, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", str2);
            jSONObject.put("attendee_device_id", str3);
            bi.m250167a(kVar, str, "", jSONObject, kVar.mo212056e());
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendWaitingRoomModifyEvent]", e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.statistics.event.at$1 */
    public static /* synthetic */ class C637431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160888a;

        /* renamed from: b */
        static final /* synthetic */ int[] f160889b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel[] r0 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.statistics.event.C63742at.C637431.f160889b = r0
                r1 = 1
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r2 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.PUBLIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.vc.statistics.event.C63742at.C637431.f160889b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r3 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.TENANT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.vc.statistics.event.C63742at.C637431.f160889b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r4 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = com.ss.android.vc.statistics.event.C63742at.C637431.f160889b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.MeetingSecuritySetting$SecurityLevel r4 = com.ss.android.vc.entity.MeetingSecuritySetting.SecurityLevel.ONLY_HOST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType[] r3 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.vc.statistics.event.C63742at.C637431.f160888a = r3
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r4 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Default     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.android.vc.statistics.event.C63742at.C637431.f160888a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r3 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = com.ss.android.vc.statistics.event.C63742at.C637431.f160888a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.C63742at.C637431.<clinit>():void");
        }
    }

    /* renamed from: k */
    public static void m250104k(VideoChat videoChat) {
        m250055A(videoChat);
    }

    /* renamed from: e */
    public static void m250092e(VideoChat videoChat) {
        m250071a("request_record", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: g */
    public static void m250097g(VideoChat videoChat) {
        m250071a("switch_language", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: i */
    public static void m250101i(VideoChat videoChat) {
        m250071a("calendar_detail", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: j */
    public static void m250103j(VideoChat videoChat) {
        m250080b("enter_meeting_group", videoChat);
    }

    /* renamed from: l */
    public static void m250105l(VideoChat videoChat) {
        m250071a("share_screen", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: m */
    public static void m250106m(VideoChat videoChat) {
        m250071a("share_drive_files", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: n */
    public static void m250107n(VideoChat videoChat) {
        m250071a("stop_sharing", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: o */
    public static void m250108o(VideoChat videoChat) {
        m250071a("share_content", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: p */
    public static void m250109p(VideoChat videoChat) {
        m250071a("copy_livestreaminglink", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: q */
    public static void m250110q(VideoChat videoChat) {
        m250080b("copy_join_info", videoChat);
    }

    /* renamed from: r */
    public static void m250111r(VideoChat videoChat) {
        m250080b("more_phone_numbers", videoChat);
    }

    /* renamed from: s */
    public static void m250112s(VideoChat videoChat) {
        m250071a("all_subtitles", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: t */
    public static void m250113t(VideoChat videoChat) {
        m250071a("annotate", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: u */
    public static void m250114u(VideoChat videoChat) {
        m250080b("show_meeting_info", videoChat);
    }

    /* renamed from: v */
    public static void m250115v(VideoChat videoChat) {
        m250071a("user_list", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: w */
    public static void m250116w(VideoChat videoChat) {
        m250071a("flip_camera", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: x */
    public static void m250117x(VideoChat videoChat) {
        m250071a("click_fold", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: y */
    public static void m250118y(VideoChat videoChat) {
        m250071a("click_unfold", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: z */
    public static void m250119z(VideoChat videoChat) {
        m250071a("click_settings", (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: f */
    public static void m250095f(VideoChat videoChat) {
        m250071a("click_interpretation", "control_bar", (JSONObject) null, videoChat);
    }

    /* renamed from: h */
    public static void m250099h(VideoChat videoChat) {
        m250071a("hangup", "control_bar", (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250056a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "show_external_share_banner");
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendShowExternalShareBanner]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250075b(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "close_external_share_banner");
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendCloseExternalShareBanner]", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m250084c(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "cancel_external_share");
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendCancelExternalShare]", e.getMessage());
        }
    }

    /* renamed from: d */
    public static void m250089d(VideoChat videoChat) {
        m250071a("unstable", "self", (JSONObject) null, videoChat);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "unstable");
            jSONObject.put("from_source", "self");
            jSONObject.put("network_status", "weak");
            C63726b.m249915a("vc_voip_connection", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendWeakConnectionEvent]", e.getMessage());
        }
    }

    /* renamed from: A */
    private static void m250055A(VideoChat videoChat) {
        int i;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (VideoChatModule.getDependency().isNotificationUndisturbed()) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("msg_notifications", i);
            VirtualBackgroundInfo g = C62269o.m243189g();
            if (g == null) {
                str = null;
            } else {
                str = g.name;
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("picture_name", str);
            }
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendMessageNotificationUndisturbedEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250078b(VideoChat videoChat, String str) {
        m250071a(str, "", (JSONObject) null, videoChat);
    }

    /* renamed from: b */
    public static void m250079b(VideoChat videoChat, boolean z) {
        String str;
        if (z) {
            str = "mute_original";
        } else {
            str = "unmute_original";
        }
        m250071a(str, (String) null, (JSONObject) null, videoChat);
    }

    /* renamed from: c */
    public static void m250088c(boolean z, VideoChat videoChat) {
        String str;
        if (z) {
            str = "confirm";
        } else {
            str = "refuse";
        }
        m250071a(str, "record_invite_hint", (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250057a(VideoChat videoChat, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            jSONObject.put("from_source", "muted_turn_on_to_speak");
            jSONObject.put("audio_value", i);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendLocalAudioVolumeEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    private static void m250080b(String str, VideoChat videoChat) {
        m250071a(str, "meeting_info", (JSONObject) null, videoChat);
    }

    /* renamed from: c */
    public static void m250087c(VideoChat videoChat, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_minimised", z);
            C63726b.m249915a("vc_meeting_onthecall_view", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendFloatingWindowEvent]", e.getMessage());
        }
    }

    /* renamed from: e */
    public static void m250094e(boolean z, VideoChat videoChat) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "onthecall_page";
            } else {
                str = "calling_page";
            }
            jSONObject.put("from_source", str);
            C63726b.m249915a("vc_phone_call_interrupt", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendPhoneCallInterruptEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250076b(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("stop_sharecontent", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowStopShareEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m250085c(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("follow", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowToPresenterEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public static void m250090d(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("steal_present", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowTakeControlClickEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public static void m250093e(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("cancel", "steal_present_confirm", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowTackControlCancelEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static void m250096f(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("confirm", "steal_present_confirm", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowTackControlConfirmEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: g */
    public static void m250098g(VideoChat videoChat, FollowInfo followInfo) {
        int i;
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                if (C61806b.m241471a(followInfo)) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_presenter", i);
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("forward", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowOpenLinkEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: h */
    public static void m250100h(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("unfollow", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendUnFollowEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: i */
    public static void m250102i(VideoChat videoChat, FollowInfo followInfo) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("follow", "presenter_icon", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendPresenterIconClickedEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public static void m250091d(boolean z, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enabled", i);
            m250071a("subtitle", (String) null, jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendSubtitleEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250060a(VideoChat videoChat, FollowInfo followInfo) {
        int i;
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                if (C61806b.m241471a(followInfo)) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_presenter", i);
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("copy_file_link", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowCopyFileLinkEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m250081b(boolean z, VideoChat videoChat) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from_source", "record_reconfirm");
            if (z) {
                str = "confirm";
            } else {
                str = "cancel";
            }
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_meeting_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendRecordStartEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250062a(VideoChat videoChat, Boolean bool) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 1;
            jSONObject.put("action_enabled", 1);
            if (!bool.booleanValue()) {
                i = 0;
            }
            jSONObject.put("is_sharing", i);
            m250071a("minimize", "control_bar", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendOnMinimizeEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250069a(MeetingAudioManager.AudioType audioType, boolean z, VideoChat videoChat) {
        m250071a(C61405a.m239521a(audioType, z), "control_bar", (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250058a(VideoChat videoChat, int i, FollowInfo followInfo) {
        int i2;
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("duration", i);
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                if (C61806b.m241471a(followInfo)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_presenter", i2);
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("loading_finish", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowLoadingFinish]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m250059a(VideoChat videoChat, MeetingSecuritySetting.SecurityLevel securityLevel, MeetingSecuritySetting.SecurityLevel securityLevel2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_permission", securityLevel.eventString());
            jSONObject.put("after_permission", securityLevel2.eventString());
            m250071a("join_permission", (String) null, jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendJoinPermissionEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250077b(VideoChat videoChat, FollowInfo followInfo, int i) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("is_presenter", i);
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("refresh", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowRefreshEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m250086c(VideoChat videoChat, FollowInfo followInfo, int i) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("is_presenter", i);
                m250071a("forward", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowOpenLinkEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m250061a(VideoChat videoChat, FollowInfo followInfo, int i) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("is_presenter", i);
                jSONObject.put("share_id", followInfo.getShareId());
                m250071a("backward", (String) null, jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingOnTheCallEvent", "[sendFollowBackwardEvent]", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m250082b(boolean z, VideoChat videoChat, Boolean bool) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            if (bool.booleanValue()) {
                i2 = 1;
            }
            jSONObject.put("is_sharing", i2);
            m250071a("mic", "control_bar", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendSwitchMicrophoneEvent]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250083b(boolean z, boolean z2, VideoChat videoChat) {
        int i;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z2) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_owner", i);
            if (z) {
                str = "confirm";
            } else {
                str = "cancel";
            }
            m250071a(str, "record_finish_hint", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingOnTheCallEvent", "[sendRecordStopEvent]", e.getMessage());
        }
    }
}
