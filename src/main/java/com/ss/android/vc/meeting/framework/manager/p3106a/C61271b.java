package com.ss.android.vc.meeting.framework.manager.p3106a;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatExtraInfo;
import com.ss.android.vc.entity.livestream.LiveExtraInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.livestream.AbstractC62011a;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;

/* renamed from: com.ss.android.vc.meeting.framework.manager.a.b */
public class C61271b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.manager.a.b$1 */
    public static /* synthetic */ class C612721 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153503a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.VideoChatExtraInfo$Type[] r0 = com.ss.android.vc.entity.VideoChatExtraInfo.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.framework.manager.p3106a.C61271b.C612721.f153503a = r0
                com.ss.android.vc.entity.VideoChatExtraInfo$Type r1 = com.ss.android.vc.entity.VideoChatExtraInfo.Type.RINGING_RECEIVED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.framework.manager.p3106a.C61271b.C612721.f153503a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.VideoChatExtraInfo$Type r1 = com.ss.android.vc.entity.VideoChatExtraInfo.Type.SUBTITLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.framework.manager.p3106a.C61271b.C612721.f153503a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.VideoChatExtraInfo$Type r1 = com.ss.android.vc.entity.VideoChatExtraInfo.Type.UPDATE_LIVE_EXTRA_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.framework.manager.p3106a.C61271b.C612721.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m238392a(VideoChatExtraInfo videoChatExtraInfo) {
        if (videoChatExtraInfo == null || videoChatExtraInfo.type != VideoChatExtraInfo.Type.RINGING_RECEIVED || videoChatExtraInfo.ringingReceivedData == null) {
            return null;
        }
        return videoChatExtraInfo.ringingReceivedData.meetingId;
    }

    /* renamed from: b */
    public static void m238395b(VideoChatExtraInfo videoChatExtraInfo) {
        if (videoChatExtraInfo == null) {
            C60700b.m235864f("PushExtraInfoUtil", "[onPushExtraInfo]", "extrainfo is null");
        } else {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.framework.manager.p3106a.$$Lambda$b$HfYcuTR4jczJ51skSYWJuxNxKnA */

                public final void run() {
                    C61271b.lambda$HfYcuTR4jczJ51skSYWJuxNxKnA(VideoChatExtraInfo.this);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m238393a(MeetingSubtitleData meetingSubtitleData) {
        C61303k kVar;
        if (meetingSubtitleData != null && !TextUtils.isEmpty(meetingSubtitleData.mMeetingId) && (kVar = (C61303k) MeetingManager.m238341a().getMeeting(meetingSubtitleData.mMeetingId)) != null && kVar.mo212056e() != null && kVar.mo212059h() == 4) {
            kVar.mo212107Y().mo218626a(meetingSubtitleData);
        }
    }

    /* renamed from: c */
    public static void m238396c(VideoChatExtraInfo videoChatExtraInfo) {
        if (videoChatExtraInfo != null && videoChatExtraInfo.type != null) {
            int i = C612721.f153503a[videoChatExtraInfo.type.ordinal()];
            if (i == 1) {
                m238397d(videoChatExtraInfo);
            } else if (i == 2) {
                m238393a(videoChatExtraInfo.mMeetingSubtitleData);
            } else if (i == 3) {
                m238394a(videoChatExtraInfo.mLiveExtraInfo);
            }
        }
    }

    /* renamed from: a */
    private static void m238394a(LiveExtraInfo liveExtraInfo) {
        C61303k kVar;
        AbstractC62011a am;
        if (liveExtraInfo != null && (kVar = (C61303k) MeetingManager.m238341a().mo211906j()) != null && (am = kVar.am()) != null) {
            am.mo214791a(liveExtraInfo);
        }
    }

    /* renamed from: d */
    private static void m238397d(VideoChatExtraInfo videoChatExtraInfo) {
        C61303k kVar;
        if (videoChatExtraInfo != null && videoChatExtraInfo.type == VideoChatExtraInfo.Type.RINGING_RECEIVED && videoChatExtraInfo.ringingReceivedData != null) {
            String str = videoChatExtraInfo.ringingReceivedData.meetingId;
            if (!TextUtils.isEmpty(str) && (kVar = (C61303k) MeetingManager.m238341a().getMeeting(str)) != null && kVar.mo212056e() != null) {
                String id = kVar.mo212056e().getId();
                Participant participant = videoChatExtraInfo.ringingReceivedData.participant;
                VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
                if (participant != null && participant.getId() != null && currentUser != null && !TextUtils.equals(participant.getId(), currentUser.getId()) && str != null && str.equals(id)) {
                    C60700b.m235864f("PushExtraInfoUtil", "[ringingReceived]", "ringingReceived");
                    kVar.mo212083A();
                }
            }
        }
    }
}
