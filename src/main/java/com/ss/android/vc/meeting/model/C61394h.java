package com.ss.android.vc.meeting.model;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.p3108b.C61377b;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.model.h */
public class C61394h {

    /* renamed from: a */
    private final String f153917a = "ScreenShareProcessor";

    /* renamed from: b */
    private C61303k f153918b;

    /* renamed from: c */
    private List<AbstractC61395a> f153919c = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.vc.meeting.model.h$a */
    public interface AbstractC61395a {
        /* renamed from: a */
        void mo212628a(boolean z);

        /* renamed from: b */
        void mo212629b(boolean z);
    }

    public C61394h(C61303k kVar) {
        this.f153918b = kVar;
    }

    /* renamed from: a */
    private void m239396a(boolean z) {
        this.f153918b.ax().mo214360n();
        for (AbstractC61395a aVar : this.f153919c) {
            aVar.mo212628a(z);
        }
    }

    /* renamed from: b */
    private void m239397b(boolean z) {
        for (AbstractC61395a aVar : this.f153919c) {
            aVar.mo212629b(z);
        }
    }

    /* renamed from: a */
    public void mo212627a(AbstractC61395a aVar) {
        if (!this.f153919c.contains(aVar)) {
            C61377b.m239188a(aVar, this.f153919c);
            this.f153919c.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo212626a(VideoChatInMeetingInfo videoChatInMeetingInfo, VideoChatInMeetingInfo videoChatInMeetingInfo2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (videoChatInMeetingInfo == null || videoChatInMeetingInfo.getScreenSharedData() == null || !videoChatInMeetingInfo.getScreenSharedData().isSharing() || ParticipantUtil.m248722a(videoChatInMeetingInfo.getScreenSharedData().getParticipantId(), videoChatInMeetingInfo.getScreenSharedData().getParticipantType(), videoChatInMeetingInfo.getScreenSharedData().getParticipantDeviceId())) {
            z = false;
        } else {
            z = true;
        }
        if (videoChatInMeetingInfo2 == null || videoChatInMeetingInfo2.getScreenSharedData() == null || !videoChatInMeetingInfo2.getScreenSharedData().isSharing() || ParticipantUtil.m248722a(videoChatInMeetingInfo2.getScreenSharedData().getParticipantId(), videoChatInMeetingInfo2.getScreenSharedData().getParticipantType(), videoChatInMeetingInfo2.getScreenSharedData().getParticipantDeviceId())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            C60700b.m235851b("ScreenShareProcessor", "[dealScreenShare]", "screen share changed, old = " + z + ", new = " + z2);
            this.f153918b.ag().onPushScreenShareData(z2, videoChatInMeetingInfo2.getScreenSharedData());
            if (z2) {
                InMeetingData.ScreenSharedData screenSharedData = videoChatInMeetingInfo2.getScreenSharedData();
                this.f153918b.mo212092J().mo212538e(screenSharedData.getParticipantDeviceId());
                this.f153918b.mo212092J().mo212541f(screenSharedData.getParticipantId());
                this.f153918b.mo212092J().mo212518a(screenSharedData.getParticipantType());
                this.f153918b.mo212092J().mo212576z();
            } else {
                this.f153918b.mo212092J().mo212538e("");
                this.f153918b.mo212092J().mo212541f("");
                this.f153918b.mo212092J().mo212518a((ParticipantType) null);
                this.f153918b.mo212092J().mo212576z();
            }
            m239396a(C61806b.m241475b(videoChatInMeetingInfo2.getFollowInfo()));
        } else if (z && z2) {
            InMeetingData.ScreenSharedData screenSharedData2 = videoChatInMeetingInfo2.getScreenSharedData();
            String participantDeviceId = videoChatInMeetingInfo.getScreenSharedData().getParticipantDeviceId();
            String participantDeviceId2 = screenSharedData2.getParticipantDeviceId();
            C60700b.m235851b("ScreenShareProcessor", "[dealScreenShare2]", "other screen share, oldDeviceId = " + participantDeviceId + ", newDeviceId = " + participantDeviceId2);
            if (!ParticipantUtil.m248713a(screenSharedData2, videoChatInMeetingInfo.getScreenSharedData())) {
                this.f153918b.mo212092J().mo212538e(screenSharedData2.getParticipantDeviceId());
                this.f153918b.mo212092J().mo212541f(screenSharedData2.getParticipantId());
                this.f153918b.mo212092J().mo212518a(screenSharedData2.getParticipantType());
                this.f153918b.mo212092J().mo212576z();
                m239396a(false);
            }
        } else if (!z && !z2 && videoChatInMeetingInfo != null && videoChatInMeetingInfo2.getScreenSharedData() != null) {
            AbstractC62612a aj = this.f153918b.aj();
            if (videoChatInMeetingInfo.getScreenSharedData() == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            aj.mo216407a(z4, ParticipantUtil.m248722a(videoChatInMeetingInfo2.getScreenSharedData().getParticipantId(), videoChatInMeetingInfo2.getScreenSharedData().getParticipantType(), videoChatInMeetingInfo2.getScreenSharedData().getParticipantDeviceId()));
        }
        if (z2) {
            this.f153918b.ag().onPushScreenShareData(true, videoChatInMeetingInfo2.getScreenSharedData());
            this.f153918b.aj().mo216417g();
            this.f153918b.ax().mo214338d(videoChatInMeetingInfo2.getScreenSharedData().getIsPortraitMode());
            m239397b(false);
            return;
        }
        if (videoChatInMeetingInfo == null || videoChatInMeetingInfo.getScreenSharedData() == null || !videoChatInMeetingInfo.getScreenSharedData().isSharing() || !ParticipantUtil.m248722a(videoChatInMeetingInfo.getScreenSharedData().getParticipantId(), videoChatInMeetingInfo.getScreenSharedData().getParticipantType(), videoChatInMeetingInfo.getScreenSharedData().getParticipantDeviceId())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (videoChatInMeetingInfo2 == null || videoChatInMeetingInfo2.getScreenSharedData() == null || !videoChatInMeetingInfo2.getScreenSharedData().isSharing() || !ParticipantUtil.m248722a(videoChatInMeetingInfo2.getScreenSharedData().getParticipantId(), videoChatInMeetingInfo2.getScreenSharedData().getParticipantType(), videoChatInMeetingInfo2.getScreenSharedData().getParticipantDeviceId())) {
            z5 = false;
        }
        if (z3 && !z5) {
            this.f153918b.aj().mo216418h();
        }
        m239397b(z5);
        this.f153918b.ax().mo214338d(false);
    }
}
