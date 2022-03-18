package com.ss.android.vc.meeting.module.busyring;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.ao;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.busyring.c */
public class C61543c {
    /* renamed from: a */
    public static boolean m240213a(C61303k kVar) {
        List<AbstractC61294b> b = MeetingManager.m238341a().mo211894b();
        boolean z = false;
        if (b != null) {
            for (AbstractC61294b bVar : b) {
                if (!MeetingUtil.m238367a((C61303k) bVar, kVar) && (!bVar.mo212062k())) {
                    break;
                }
            }
        }
        C60700b.m235851b("BusyRingUtil", "hasActiveExcept", "hasActive=" + z);
        return z;
    }

    /* renamed from: b */
    public static void m240215b(C61303k kVar) {
        VideoChatUser videoChatUser;
        boolean z;
        C61303k kVar2 = (C61303k) kVar.mo212068q();
        if (kVar2 == null || !kVar2.mo212063l() || kVar2.mo212068q() != kVar) {
            C60700b.m235851b("BusyRingUtil", "[refreshAttachMeeting4]", "not show busy ring");
        } else {
            C60700b.m235851b("BusyRingUtil", "[refreshAttachMeeting]", "refMeeting is valid");
            kVar.mo212069r();
            if (kVar2.mo212057f() == VideoChat.Type.CALL) {
                videoChatUser = kVar2.mo212088F().getSingleCallerUser();
            } else {
                videoChatUser = kVar2.mo212088F().getMultiCaller();
            }
            if (videoChatUser == null || kVar2.mo212104V() != 0) {
                z = false;
            } else {
                z = true;
            }
            C60700b.m235851b("BusyRingUtil", "[refreshAttachMeeting2]", "shouldShowRinging is " + z);
            if (z) {
                VideoChat.Type f = kVar2.mo212057f();
                C60700b.m235851b("BusyRingUtil", "[refreshAttachMeeting3]", "show busy ring , ref meeting type is " + f);
                if (f == VideoChat.Type.CALL) {
                    ByteRTCMeetingActivity.m244033a(kVar2, false);
                } else {
                    ByteRTCMeetingActivity.m244039b(kVar2, false);
                }
            }
        }
        kVar.mo212069r();
    }

    /* renamed from: a */
    public static void m240212a(C61303k kVar, boolean z) {
        C61303k kVar2 = (C61303k) kVar.mo212068q();
        if (kVar2 == null || ((!kVar2.mo212065n() && !kVar2.mo212066o()) || kVar2.mo212068q() != kVar)) {
            C60700b.m235851b("BusyRingUtil", "[refreshHostMeeting2]", "refMeeting is invalid");
        } else {
            DisplayMode p = kVar2.mo212067p();
            C60700b.m235851b("BusyRingUtil", "[refreshHostMeeting]", "refMeeting's displayMode=" + p + " , type=" + kVar2.mo212057f());
            if (!z) {
                kVar.mo212069r();
            }
            if (p == DisplayMode.ACTIVITY) {
                if (kVar2.mo212065n()) {
                    ByteRTCMeetingActivity.m244034a(kVar2, false, false);
                } else if (kVar2.mo212066o()) {
                    ByteRTCMeetingActivity.m244043c(kVar2, false);
                }
            } else if (z) {
                kVar2.ae().mo213804a();
                kVar2.at().mo213574b();
                if (kVar2.mo212065n()) {
                    ByteRTCMeetingActivity.m244034a(kVar2, true, false);
                } else if (kVar2.mo212066o()) {
                    ByteRTCMeetingActivity.m244043c(kVar2, true);
                }
            }
        }
        if (!z) {
            kVar.mo212069r();
        }
    }

    /* renamed from: a */
    public static boolean m240214a(C61303k kVar, int i) {
        if (kVar == null) {
            return false;
        }
        C61303k kVar2 = (C61303k) kVar.mo212068q();
        if (!kVar.mo212063l() || kVar2 == null || ((!kVar2.mo212065n() && !kVar2.mo212066o()) || kVar2.mo212068q() != kVar)) {
            return false;
        }
        C60700b.m235851b("BusyRingUtil", "[shouldForceStopHostMeeting]", "force end onthecall meeting because of busyring");
        kVar2.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_FT).mo212331a(EventSource.EVENT_NONE));
        if (i != 144 || !kVar2.mo212065n()) {
            return true;
        }
        if (kVar2.mo212057f() == VideoChat.Type.CALL) {
            C63761k.m250298a(kVar2.mo212056e(), 8, "another_accept");
            return true;
        }
        ao.m250026a(kVar2.mo212056e(), "another_accept");
        return true;
    }
}
