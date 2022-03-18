package com.ss.android.vc.meeting.framework.manager.p3106a;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.C61345k;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.p3069b.p3072c.C60675a;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.ao;
import com.ss.android.vc.statistics.event.bs;
import com.ss.android.vc.statistics.event.bt;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.framework.manager.a.c */
public class C61273c {
    /* renamed from: a */
    private static void m238401a(C61344j jVar) {
        MeetingManager.m238341a().mo211891a(jVar);
    }

    /* renamed from: a */
    public static void m238399a(VideoChat videoChat) {
        if (videoChat != null && videoChat.getForce()) {
            C60700b.m235851b("PushStatusUtil", "[updateStatus]", "force end the meeting local by send EVENT_FT!");
            List<AbstractC61294b> b = MeetingManager.m238341a().mo211894b();
            if (b != null) {
                for (AbstractC61294b bVar : b) {
                    if (bVar != null) {
                        bVar.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_FT).mo212331a(EventSource.EVENT_PUSH));
                    }
                }
            }
        }
        Participant b2 = MeetingUtil.m238370b(videoChat);
        if (b2 == null) {
            C60700b.m235864f("PushStatusUtil", "[updateStatus]", "me is null");
            return;
        }
        C60700b.m235851b("PushStatusUtil", "[updateStatus2]", "me:  " + b2.getId());
        if (b2.getStatus().getNumber() == Participant.Status.CALLING.getNumber()) {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "updateStatus CALLING", "PushStatusUtil", "[updateStatus] push event = 108,push status=CALLING");
        } else if (b2.getStatus().getNumber() == Participant.Status.RINGING.getNumber()) {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "updateStatus RINGING", "PushStatusUtil", "[updateStatus] push event = 109,push status=RINGING");
            bt.m250215a(videoChat);
            m238401a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NR).mo212330a(videoChat));
        } else if (b2.getStatus().getNumber() == Participant.Status.ON_THE_CALL.getNumber()) {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "updateStatus ON_THE_CALL", "PushStatusUtil", "[updateStatus] push event = 110,push status=ON_THE_CALL");
            if (videoChat != null && videoChat.getType() == VideoChat.Type.CALL) {
                C60675a.m235774e().mo208234a();
            }
            bs.m250214a(videoChat);
            m238401a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NO).mo212330a(videoChat));
        } else if (b2.getStatus().getNumber() == Participant.Status.IDLE.getNumber()) {
            C60700b.m235841a(videoChat, "Rust", "StateEngine", "updateStatus IDLE", "PushStatusUtil", "[updateStatus] push event = 111,push status=IDLE");
            C61303k kVar = (C61303k) MeetingManager.m238341a().mo211890a(videoChat);
            if (kVar != null && kVar.mo212065n()) {
                if (videoChat.getType() == VideoChat.Type.CALL) {
                    C63761k.m250297a(videoChat);
                } else if (videoChat.getType() == VideoChat.Type.MEET) {
                    ao.m250025a(videoChat, b2);
                }
            }
            m238401a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NT).mo212330a(videoChat));
        } else {
            C60700b.m235851b("PushStatusUtil", "[updateStatus3]", "me status = " + b2.getStatus());
        }
    }

    /* renamed from: a */
    public static void m238400a(VideoChat videoChat, C62149b bVar) {
        VideoChat a = MeetingUtil.m238363a(videoChat, bVar);
        if (a == null) {
            C60700b.m235851b("PushStatusUtil", "[gotoWaitingState]", "videoChat is null");
            return;
        }
        if (a.getParticipants() != null) {
            a.getParticipants().clear();
        }
        C61344j a2 = C61344j.m239002a().mo212329a(SmEvents.EVENT_NW).mo212330a(a);
        C61345k kVar = new C61345k();
        kVar.mo212340a(bVar);
        a2.mo212332a(kVar);
        m238401a(a2);
    }
}
