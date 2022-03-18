package com.ss.android.vc.meeting.utils;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParticipantUtil {

    /* renamed from: a */
    public static HashMap<String, Integer> f160321a = new HashMap<>();

    public enum DIFF_TYPE {
        SAME,
        ALL_DIFF,
        STATIC_VIEW_DIFF
    }

    /* renamed from: a */
    public static boolean m248715a(Participant participant, Participant participant2) {
        return (participant == null || participant2 == null || !C60938g.m237060a(participant).equals(C60938g.m237060a(participant2))) ? false : true;
    }

    /* renamed from: a */
    public static boolean m248717a(Participant participant, String str, String str2, ParticipantType participantType) {
        return participant != null && participant.getId() != null && participant.getId().equals(str) && participant.getDeviceId() != null && participant.getDeviceId().equals(str2) && (participantType == null || participant.getParticipantType() == participantType);
    }

    /* renamed from: a */
    public static boolean m248721a(VCLobbyParticipant vCLobbyParticipant, String str, String str2, ParticipantType participantType) {
        return (vCLobbyParticipant == null || vCLobbyParticipant.getUser() == null || vCLobbyParticipant.getUser().getUserId() == null || !vCLobbyParticipant.getUser().getUserId().equals(str) || vCLobbyParticipant.getUser().getDeviceId() == null || !vCLobbyParticipant.getUser().getDeviceId().equals(str2) || (participantType != null && vCLobbyParticipant.getParticipantType() != participantType)) ? false : true;
    }

    /* renamed from: a */
    public static boolean m248711a(ByteviewUser byteviewUser, ByteviewUser byteviewUser2) {
        return (byteviewUser == null || byteviewUser2 == null || byteviewUser.getUserId() == null || !byteviewUser.getUserId().equals(byteviewUser2.getUserId()) || byteviewUser.getDeviceId() == null || !byteviewUser.getDeviceId().equals(byteviewUser2.getDeviceId()) || byteviewUser.getParticipantType() != byteviewUser2.getParticipantType()) ? false : true;
    }

    /* renamed from: a */
    public static boolean m248714a(Participant participant, ByteviewUser byteviewUser) {
        return byteviewUser != null && m248717a(participant, byteviewUser.getUserId(), byteviewUser.getDeviceId(), byteviewUser.getParticipantType());
    }

    /* renamed from: a */
    public static boolean m248716a(Participant participant, String str) {
        if (participant == null || str == null) {
            return false;
        }
        return str.equals(participant.getRtcJoinId());
    }

    /* renamed from: a */
    public static boolean m248722a(String str, ParticipantType participantType, String str2) {
        return str != null && str2 != null && str.equals(VideoChatModuleDependency.m236630c()) && str2.equals(VideoChatModuleDependency.m236629b()) && (participantType == null || ParticipantType.LARK_USER == participantType);
    }

    /* renamed from: a */
    public static boolean m248712a(ByteviewUser byteviewUser, List<Participant> list) {
        if (!(byteviewUser == null || list == null)) {
            for (Participant participant : list) {
                if (m248717a(participant, byteviewUser.getUserId(), byteviewUser.getDeviceId(), byteviewUser.getParticipantType())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m248713a(InMeetingData.ScreenSharedData screenSharedData, InMeetingData.ScreenSharedData screenSharedData2) {
        return (screenSharedData == null || screenSharedData2 == null || screenSharedData.getParticipantId() == null || !screenSharedData.getParticipantId().equals(screenSharedData2.getParticipantId()) || screenSharedData.getParticipantDeviceId() == null || !screenSharedData.getParticipantDeviceId().equals(screenSharedData2.getParticipantDeviceId()) || screenSharedData.getParticipantType() != screenSharedData2.getParticipantType()) ? false : true;
    }

    /* renamed from: a */
    public static boolean m248719a(FollowInfo followInfo, FollowInfo followInfo2) {
        return (followInfo == null || followInfo2 == null || followInfo.getUserId() == null || !followInfo.getUserId().equals(followInfo2.getUserId()) || followInfo.getDeviceId() == null || !followInfo.getDeviceId().equals(followInfo2.getDeviceId()) || followInfo.getUserType() != followInfo2.getUserType()) ? false : true;
    }

    /* renamed from: a */
    public static boolean m248718a(FollowInfo followInfo, Participant participant) {
        return (followInfo == null || participant == null || followInfo.getUserId() == null || !followInfo.getUserId().equals(participant.getId()) || followInfo.getDeviceId() == null || !followInfo.getDeviceId().equals(participant.getDeviceId()) || followInfo.getUserType() != participant.getParticipantType()) ? false : true;
    }

    /* renamed from: a */
    public static boolean m248720a(VCLobbyParticipant vCLobbyParticipant) {
        if (vCLobbyParticipant.isGuest()) {
            return false;
        }
        if (vCLobbyParticipant.getParticipantType() != ParticipantType.NEO_USER && vCLobbyParticipant.getParticipantType() != ParticipantType.NEO_GUEST_USER && vCLobbyParticipant.getParticipantType() != ParticipantType.LARK_USER && vCLobbyParticipant.getParticipantType() != ParticipantType.ROOM && vCLobbyParticipant.getParticipantType() != ParticipantType.STANDALONE_VC_USER) {
            return false;
        }
        boolean e = VideoChatModuleDependency.m236632e();
        String d = VideoChatModuleDependency.m236631d();
        if (!e) {
            return false;
        }
        return !d.equals(vCLobbyParticipant.getTenantId());
    }

    /* renamed from: a */
    public static String m248706a(Participant participant) {
        if (participant == null) {
            return "";
        }
        return C60938g.m237060a(participant);
    }

    /* renamed from: b */
    public static ParticipantSettings m248724b(List<Participant> list) {
        Participant c;
        if (list == null || (c = m248731c(list)) == null) {
            return null;
        }
        return c.getParticipantSettings();
    }

    /* renamed from: c */
    public static boolean m248732c(Participant participant) {
        return m248717a(participant, VideoChatModuleDependency.m236630c(), VideoChatModuleDependency.m236629b(), ParticipantType.LARK_USER);
    }

    /* renamed from: d */
    public static Participant m248734d(List<Participant> list) {
        Participant c = m248731c(list);
        if (c == null || c.getStatus() != Participant.Status.ON_THE_CALL) {
            return null;
        }
        return c;
    }

    /* renamed from: c */
    public static Participant m248731c(List<Participant> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String c = VideoChatModuleDependency.m236630c();
        String b = VideoChatModuleDependency.m236629b();
        for (Participant participant : list) {
            if (m248717a(participant, c, b, ParticipantType.LARK_USER)) {
                return participant;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m248736d(C61303k kVar) {
        Participant j;
        if (kVar == null || kVar.mo212091I().mo212494b() == null || (j = kVar.mo212091I().mo212494b().mo212605j()) == null || !j.isCoHost() || kVar.mo212056e().getType() != VideoChat.Type.MEET || kVar.mo212098P()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static List<Participant> m248737e(List<Participant> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Participant participant : list) {
                if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
                    arrayList.add(participant);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ParticipantSettings m248704a(C61303k kVar) {
        Participant j;
        if (kVar == null || kVar.mo212091I() == null || (j = kVar.mo212091I().mo212494b().mo212605j()) == null) {
            return null;
        }
        return j.getParticipantSettings();
    }

    /* renamed from: b */
    public static String m248726b(ByteviewUser byteviewUser) {
        if (byteviewUser == null) {
            return "";
        }
        return m248729b(byteviewUser.getUserId(), byteviewUser.getParticipantType(), byteviewUser.getDeviceId());
    }

    /* renamed from: c */
    public static boolean m248733c(C61303k kVar) {
        Participant j;
        if (kVar == null || kVar.mo212091I().mo212494b() == null || (j = kVar.mo212091I().mo212494b().mo212605j()) == null || !j.is_host() || kVar.mo212056e().getType() != VideoChat.Type.MEET || ((kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && j.getParticipantRole() == ParticipantRole.INTERVIEWEE) || j.isGuest() || kVar.mo212098P())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m248735d(Participant participant) {
        if (participant.isGuest() || C57782ag.m224241a(participant.getTenantId()) || participant.getTenantTag() == null || participant.getTenantId().equals("-1") || (participant.getParticipantType() != ParticipantType.NEO_USER && participant.getParticipantType() != ParticipantType.NEO_GUEST_USER && participant.getParticipantType() != ParticipantType.LARK_USER && participant.getParticipantType() != ParticipantType.ROOM && participant.getParticipantType() != ParticipantType.STANDALONE_VC_USER)) {
            return false;
        }
        boolean c = VideoChatModuleDependency.getLoginDependency().mo196421c();
        boolean e = VideoChatModuleDependency.m236632e();
        String d = VideoChatModuleDependency.m236631d();
        if (e && !c) {
            return !d.equals(participant.getTenantId());
        }
        return false;
    }

    /* renamed from: b */
    public static String m248727b(Participant participant) {
        if (participant == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{[UserId]");
            sb.append(participant.getId());
            sb.append(", [DeviceId]");
            sb.append(participant.getDeviceId());
            sb.append(", [RtcJoinId]");
            sb.append(participant.getRtcJoinId());
            sb.append(", [IsHost]");
            sb.append(participant.is_host());
            ParticipantSettings participantSettings = participant.getParticipantSettings();
            if (participantSettings != null) {
                sb.append(", [Microphone]");
                sb.append(participantSettings.isMicrophoneMuted());
                sb.append(", [Camera]");
                sb.append(participantSettings.isCameraMuted());
            } else {
                sb.append(", [Settings] null");
            }
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C60775q.m236136a(e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, Participant> m248707a(List<Participant> list) {
        if (C60742af.m236059a(list)) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (Participant participant : list) {
            hashMap.put(m248706a(participant), participant);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static String m248728b(C61303k kVar) {
        if (kVar == null) {
            return VideoChatModuleDependency.m236629b();
        }
        VideoChat e = kVar.mo212056e();
        if (e != null && !TextUtils.isEmpty(e.getZoomUserId())) {
            return e.getZoomUserId();
        }
        Participant participant = null;
        if (kVar.mo212091I().mo212494b() != null) {
            participant = kVar.mo212091I().mo212494b().mo212605j();
        }
        if (participant == null && e != null) {
            participant = m248731c(e.getParticipants());
        }
        if (participant != null) {
            return participant.getRtcJoinId();
        }
        return VideoChatModuleDependency.m236629b();
    }

    /* renamed from: a */
    public static boolean m248710a(ByteviewUser byteviewUser) {
        if (byteviewUser == null || !m248722a(byteviewUser.getUserId(), byteviewUser.getParticipantType(), byteviewUser.getDeviceId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Participant m248703a(String str, List<Participant> list) {
        if (!TextUtils.isEmpty(str) && list != null) {
            for (Participant participant : list) {
                if (m248716a(participant, str)) {
                    return participant;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Participant m248723b(String str, List<Participant> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (Participant participant : list) {
            if (TextUtils.equals(str, participant.getId())) {
                return participant;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m248730b(Participant participant, String str) {
        return m248717a(participant, VideoChatModuleDependency.m236630c(), str, ParticipantType.LARK_USER);
    }

    /* renamed from: a */
    public static DIFF_TYPE m248705a(List<Participant> list, List<Participant> list2, String str) {
        if (C60742af.m236059a(list) || list.size() != list2.size()) {
            return DIFF_TYPE.ALL_DIFF;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(m248706a(list.get(i)), m248706a(list2.get(i)))) {
                return DIFF_TYPE.ALL_DIFF;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            Participant participant = list2.get(i2);
            Participant participant2 = list.get(i2);
            if (!(participant2.getParticipantSettings().isCameraMuted() == participant.getParticipantSettings().isCameraMuted() && participant2.getParticipantSettings().isMicrophoneMuted() == participant.getParticipantSettings().isMicrophoneMuted() && (participant2.getParticipantMeetingRole() == null || participant.getParticipantMeetingRole() == null || participant2.getParticipantMeetingRole() == participant.getParticipantMeetingRole()))) {
                return DIFF_TYPE.STATIC_VIEW_DIFF;
            }
            if (!(participant2.getParticipantSettings().getCameraStatus() == participant.getParticipantSettings().getCameraStatus() && participant2.getParticipantSettings().getMicrophoneStatus() == participant.getParticipantSettings().getMicrophoneStatus())) {
                return DIFF_TYPE.STATIC_VIEW_DIFF;
            }
            if (!TextUtils.equals(participant2.getParticipantSettings().getNickname(), participant.getParticipantSettings().getNickname())) {
                return DIFF_TYPE.STATIC_VIEW_DIFF;
            }
            if (!(m248730b(participant, str) || participant2.getStatus() == participant.getStatus())) {
                return DIFF_TYPE.STATIC_VIEW_DIFF;
            }
        }
        return DIFF_TYPE.SAME;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248708a(String str, AbstractC63488d dVar, VideoChatUser videoChatUser) {
        if (videoChatUser == null || !videoChatUser.getId().equals(str)) {
            dVar.mo215583a();
        } else {
            dVar.mo215584a(videoChatUser.getName());
        }
    }

    /* renamed from: b */
    public static String m248729b(String str, ParticipantType participantType, String str2) {
        return str + "_" + participantType.getNumber() + "_" + str2;
    }

    /* renamed from: a */
    public static Participant m248702a(String str, ParticipantType participantType, String str2, List<Participant> list) {
        if (list == null) {
            return null;
        }
        for (Participant participant : list) {
            if (m248717a(participant, str, str2, participantType)) {
                return participant;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static VCLobbyParticipant m248725b(String str, ParticipantType participantType, String str2, List<VCLobbyParticipant> list) {
        if (list == null) {
            return null;
        }
        for (VCLobbyParticipant vCLobbyParticipant : list) {
            if (m248721a(vCLobbyParticipant, str, str2, participantType)) {
                return vCLobbyParticipant;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m248709a(String str, String str2, ParticipantType participantType, AbstractC63488d dVar) {
        VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(str2, participantType);
        if (userInfoInCache == null) {
            UserInfoService.getUserInfoById(str, str2, participantType, new GetUserInfoListener(str2, dVar) {
                /* class com.ss.android.vc.meeting.utils.$$Lambda$ParticipantUtil$EvVVyXOKBzH_19gshem1Yz0Mu64 */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ AbstractC63488d f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    ParticipantUtil.m248708a(this.f$0, this.f$1, videoChatUser);
                }
            });
        } else {
            dVar.mo215584a(userInfoInCache.getName());
        }
    }
}
