package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import java.util.List;

public class MeetingUtil {

    public enum IdType {
        DeviceId,
        UserId
    }

    /* renamed from: com.ss.android.vc.meeting.framework.manager.MeetingUtil$1 */
    static /* synthetic */ class C612681 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153499a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.meeting.framework.manager.MeetingUtil$IdType[] r0 = com.ss.android.vc.meeting.framework.manager.MeetingUtil.IdType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.framework.manager.MeetingUtil.C612681.f153499a = r0
                com.ss.android.vc.meeting.framework.manager.MeetingUtil$IdType r1 = com.ss.android.vc.meeting.framework.manager.MeetingUtil.IdType.UserId     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.framework.manager.MeetingUtil.C612681.f153499a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.framework.manager.MeetingUtil$IdType r1 = com.ss.android.vc.meeting.framework.manager.MeetingUtil.IdType.DeviceId     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.framework.manager.MeetingUtil.C612681.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m238364a(VideoChat videoChat) {
        if (videoChat == null || videoChat.getType() != VideoChat.Type.CALL) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m238372c(VideoChat videoChat) {
        Participant b = m238370b(videoChat);
        if (b == null) {
            return null;
        }
        return b.getInteractiveId();
    }

    /* renamed from: b */
    public static Participant m238370b(VideoChat videoChat) {
        if (videoChat == null) {
            C60700b.m235851b("MeetingUtil", "[findLocalParticipant]", "videoChat == null");
            return null;
        }
        List<Participant> participants = videoChat.getParticipants();
        if (participants == null) {
            C60700b.m235851b("MeetingUtil", "[findLocalParticipant2]", "participants == null");
            return null;
        }
        Participant d = ParticipantUtil.m248734d(participants);
        if (d != null) {
            return d;
        }
        VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
        if (currentUser == null) {
            C60700b.m235851b("MeetingUtil", "[findLocalParticipant3]", "videoChatUser == null");
            return null;
        }
        for (Participant participant : participants) {
            if (participant.getId() != null && participant.getId().equals(currentUser.getId())) {
                return participant;
            }
        }
        return d;
    }

    /* renamed from: a */
    public static boolean m238366a(C61303k kVar, Participant participant) {
        if (kVar == null || participant == null || kVar.mo212090H() != VideoChat.MeetingSource.VC_FROM_INTERVIEW || kVar.mo212089G() != ParticipantRole.INTERVIEWEE || participant.getParticipantRole() == ParticipantRole.INTERVIEWEE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static VideoChat m238363a(VideoChat videoChat, C62149b bVar) {
        if (bVar == null || !bVar.f156117c || bVar.f156118d == null || TextUtils.isEmpty(bVar.f156118d.f156108b)) {
            return videoChat;
        }
        VideoChat videoChat2 = new VideoChat();
        videoChat2.setId(bVar.f156118d.f156108b);
        videoChat2.setType(VideoChat.Type.MEET);
        return videoChat2;
    }

    /* renamed from: a */
    public static boolean m238365a(VideoChat videoChat, VideoChat videoChat2) {
        boolean z = false;
        if (!(videoChat == null || videoChat2 == null || !m238369a(videoChat.getCreatingId(), videoChat2.getCreatingId()))) {
            C60700b.m235851b("MeetingUtil", "[isMatch]", "creatingId equal");
            String c = m238372c(videoChat);
            String c2 = m238372c(videoChat2);
            if (TextUtils.isEmpty(c) || TextUtils.isEmpty(c2) || TextUtils.equals(c, c2)) {
                z = true;
            } else {
                C60700b.m235851b("MeetingUtil", "[isMatch2]", "interactiveId not equal");
            }
        }
        C60700b.m235851b("MeetingUtil", "[isMatch3]", "finally return " + z);
        return z;
    }

    /* renamed from: a */
    public static boolean m238367a(C61303k kVar, C61303k kVar2) {
        if (kVar == null || kVar2 == null) {
            C60700b.m235851b("MeetingUtil", "[isMeetingEqual]", "meeting1 == null || meeting2 == null");
            return false;
        } else if (kVar == kVar2) {
            C60700b.m235851b("MeetingUtil", "[isMeetingEqual2]", "meeting1 == meeting2");
            return true;
        } else if (!TextUtils.equals(kVar.mo212054c(), kVar2.mo212054c())) {
            return false;
        } else {
            C60700b.m235851b("MeetingUtil", "[isMeetingEqual3]", "meeting1.getCreatingId == meeting2.getCreatingId");
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m238371b(String str, String str2) {
        AbstractC61294b bVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2 == null) {
            bVar = MeetingManager.m238341a().mo211906j();
        } else {
            bVar = MeetingManager.m238341a().getMeeting(str2);
        }
        if (bVar != null) {
            for (Participant participant : bVar.mo212056e().getParticipants()) {
                if (participant.getId().equals(str)) {
                    return participant.isGuest();
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m238369a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return TextUtils.equals(str, str2);
    }

    /* renamed from: a */
    public static boolean m238368a(String str, ByteviewUser byteviewUser, IdType idType) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
        if (kVar == null || kVar.mo212090H() != VideoChat.MeetingSource.VC_FROM_INTERVIEW || kVar.mo212089G() != ParticipantRole.INTERVIEWEE) {
            return false;
        }
        int i = C612681.f153499a[idType.ordinal()];
        if (i == 1) {
            return !m238370b(kVar.mo212056e()).getId().equals(byteviewUser.getUserId());
        }
        if (i != 2) {
            return false;
        }
        return m238366a(kVar, kVar.mo212091I().mo212494b().mo212587a(byteviewUser));
    }
}
