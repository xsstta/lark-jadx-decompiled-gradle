package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.p3091e.C60917a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ$\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/ControlOptionShowHelper;", "", "()V", "canShowActionMore", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "participant", "Lcom/ss/android/vc/entity/Participant;", "scene", "Lcom/ss/android/vc/meeting/module/meetingdialog/participantmanage/popupwindow/InMeetingParticipantControlPopWindow$GridType;", "canShowSwitchCamera", "isOnTheCall", "p", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.a */
public final class ControlOptionShowHelper {

    /* renamed from: a */
    public static final ControlOptionShowHelper f156623a = new ControlOptionShowHelper();

    private ControlOptionShowHelper() {
    }

    /* renamed from: a */
    private final boolean m243456a(Participant participant) {
        if (participant == null || participant.getStatus() != Participant.Status.ON_THE_CALL) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo215543a(com.ss.android.vc.meeting.framework.meeting.C61303k r4, com.ss.android.vc.entity.Participant r5, com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow.GridType r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x003c
            if (r5 == 0) goto L_0x003c
            if (r6 != 0) goto L_0x0008
            goto L_0x003c
        L_0x0008:
            int[] r1 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62319b.f156624a
            int r6 = r6.ordinal()
            r6 = r1[r6]
            r1 = 1
            if (r6 == r1) goto L_0x0025
            r2 = 2
            if (r6 == r2) goto L_0x0025
            r4 = 3
            if (r6 == r4) goto L_0x001e
            r4 = 4
            if (r6 == r4) goto L_0x001d
            goto L_0x003c
        L_0x001d:
            return r1
        L_0x001e:
            boolean r4 = r3.m243456a(r5)
            if (r4 == 0) goto L_0x003c
            return r1
        L_0x0025:
            boolean r6 = r3.m243456a(r5)
            if (r6 == 0) goto L_0x003c
            com.ss.android.vc.meeting.module.multi.gridcontent.a r6 = r4.aw()
            boolean r6 = r6.mo216148d()
            if (r6 == 0) goto L_0x003b
            boolean r4 = com.ss.android.vc.meeting.utils.C63496i.m248843a(r5, r4)
            if (r4 == 0) goto L_0x003c
        L_0x003b:
            return r1
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.ControlOptionShowHelper.mo215543a(com.ss.android.vc.meeting.framework.meeting.k, com.ss.android.vc.entity.Participant, com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow$GridType):boolean");
    }

    /* renamed from: b */
    public final boolean mo215544b(C61303k kVar, Participant participant, InMeetingParticipantControlPopWindow.GridType gridType) {
        if (kVar == null || participant == null || gridType == null || !m243456a(participant) || !ParticipantUtil.m248732c(participant) || !C60788y.m236247a(ar.m236694a()) || DataAdapterUtil.f154006a.mo212855c(kVar) || C60917a.m236770b()) {
            return false;
        }
        return true;
    }
}
