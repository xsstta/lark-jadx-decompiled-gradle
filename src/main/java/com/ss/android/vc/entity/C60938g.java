package com.ss.android.vc.entity;

import android.text.TextUtils;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;

/* renamed from: com.ss.android.vc.entity.g */
public class C60938g {
    /* renamed from: a */
    public static String m237060a(Participant participant) {
        String uniqueKey = participant.getUniqueKey();
        if (!TextUtils.isEmpty(uniqueKey)) {
            return uniqueKey;
        }
        String b = ParticipantUtil.m248729b(participant.getId(), participant.getParticipantType(), participant.getDeviceId());
        participant.setUniqueKey(b);
        return b;
    }

    /* renamed from: c */
    public static boolean m237063c(Participant participant) {
        ParticipantSettings participantSettings = participant.getParticipantSettings();
        if (participantSettings == null || participantSettings.getInterpreterSetting() == null || participantSettings.getInterpreterSetting().interpretingLanguage == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m237062b(Participant participant) {
        ParticipantSettings participantSettings = participant.getParticipantSettings();
        if (participantSettings == null || participantSettings.getInterpreterSetting() == null || participantSettings.getInterpreterSetting().confirmStatus != InterpreterSetting.ConfirmStatus.CONFIRMED || participantSettings.getInterpreterSetting().interpretingLanguage == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m237061a(Participant participant, C61303k kVar) {
        if (kVar.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && participant.getParticipantRole() == ParticipantRole.INTERVIEWER) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Participant.SortType m237059a(Participant participant, C61303k kVar, String str) {
        if (ParticipantUtil.m248730b(participant, str)) {
            return Participant.SortType.SELF;
        }
        if (participant.is_host() && !m237061a(participant, kVar)) {
            return Participant.SortType.HOST;
        }
        if (participant.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
            return Participant.SortType.HANDS_UP;
        }
        if (participant.isCoHost()) {
            return Participant.SortType.CO_HOST;
        }
        if (m237062b(participant)) {
            return Participant.SortType.INTERPRETER;
        }
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            return Participant.SortType.ON_THE_CALL;
        }
        if (participant.getStatus() == Participant.Status.RINGING) {
            return Participant.SortType.RINGING;
        }
        return Participant.SortType.UNKNOWN;
    }
}
