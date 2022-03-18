package com.ss.android.vc.meeting.utils;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.service.VideoChatUIConfigService;

/* renamed from: com.ss.android.vc.meeting.utils.i */
public class C63496i {
    /* renamed from: a */
    public static boolean m248842a(Participant participant) {
        return ParticipantUtil.m248732c(participant);
    }

    /* renamed from: b */
    public static boolean m248846b(C61303k kVar) {
        return m248845b(kVar.mo212091I().mo212494b().mo212605j(), kVar);
    }

    /* renamed from: e */
    public static boolean m248851e(C61303k kVar) {
        if (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && kVar.mo212089G() == ParticipantRole.INTERVIEWEE) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m248848c(C61303k kVar) {
        if (kVar.mo212091I().mo212494b().mo212605j() == null || !kVar.mo212091I().mo212494b().mo212605j().isCoHost()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m248850d(C61303k kVar) {
        if (m248846b(kVar) || m248848c(kVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m248852f(C61303k kVar) {
        if (kVar.mo212056e().getMeetingOwner() == null || !kVar.mo212056e().getMeetingOwner().getUserId().equals(VideoChatUserService.getCurrentUser().getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m248844a(C61303k kVar) {
        if (!m248850d(kVar) || !VideoChatUIConfigService.m249504g(kVar) || kVar.mo212098P() || m248851e(kVar) || GuestJoinMeetingUtil.m245480b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m248847c(Participant participant, C61303k kVar) {
        if (!m248851e(kVar) || participant == null || participant.getParticipantRole() == ParticipantRole.INTERVIEWEE) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m248849d(Participant participant, C61303k kVar) {
        if (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && participant != null && participant.getParticipantRole() == ParticipantRole.INTERVIEWEE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m248843a(Participant participant, C61303k kVar) {
        if (m248842a(participant)) {
            return true;
        }
        if (!m248850d(kVar) || participant.getStatus() != Participant.Status.ON_THE_CALL || !VideoChatUIConfigService.m249504g(kVar) || kVar.mo212098P()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m248845b(Participant participant, C61303k kVar) {
        if (participant == null || !participant.is_host() || kVar.mo212056e().getType() != VideoChat.Type.MEET || kVar.mo212098P() || participant.isGuest() || m248849d(participant, kVar)) {
            return false;
        }
        return true;
    }
}
