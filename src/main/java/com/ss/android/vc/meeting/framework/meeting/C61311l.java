package com.ss.android.vc.meeting.framework.meeting;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.C61275c;
import com.ss.android.vc.meeting.framework.manager.C61281d;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.statistics.event.C63766o;
import java.util.Iterator;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.l */
public class C61311l implements C61275c.AbstractC61280b {
    @Override // com.ss.android.vc.meeting.framework.manager.C61275c.AbstractC61280b
    /* renamed from: a */
    public boolean mo211935a(C61344j jVar) {
        boolean z;
        Participant b;
        MeetingManager a = MeetingManager.m238341a();
        C61281d c = a.mo211896c();
        AbstractC61285b d = a.mo211897d();
        int i = jVar.f153703a;
        VideoChat videoChat = jVar.f153704b;
        Iterator<AbstractC61294b> it = a.mo211894b().iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (it.hasNext()) {
                z3 = c.mo211938a(jVar.f153704b, it.next().mo212056e());
                if (z3) {
                    C60700b.m235851b("EventQueuePolicy", "[shouldEnqueue]", "id isMatch , id=" + videoChat.getCreatingId());
                    break;
                }
            } else {
                break;
            }
        }
        boolean i2 = a.mo211903i();
        if (i == 109) {
            z = true;
        } else {
            z = false;
        }
        C60700b.m235851b("EventQueuePolicy", "[shouldEnqueue2]", "fianlly isMatch=" + z3 + " , noActive=" + i2 + " , isEventNR=" + z);
        if (i2) {
            if (!z || (b = MeetingUtil.m238370b(videoChat)) == null || TextUtils.isEmpty(b.getOngoingMeetingId()) || TextUtils.isEmpty(b.getOngoingInteractiveId()) || d.mo211951a(b.getOngoingMeetingId(), b.getOngoingInteractiveId())) {
                return false;
            }
            C60700b.m235851b("EventQueuePolicy", "[shouldEnqueue3]", "current no meetings and attach ongoing meeting not end");
            return true;
        } else if (z3) {
            return false;
        } else {
            if (z && ((a.mo211902h() || a.mo211900g()) && !a.mo211898e())) {
                z2 = true;
            }
            boolean z4 = !z2;
            if (!z || !z4) {
                return z4;
            }
            if (a.mo211898e()) {
                C63766o.m250324a(videoChat);
                return z4;
            } else if (!a.mo211899f()) {
                return z4;
            } else {
                C63766o.m250324a(videoChat);
                return z4;
            }
        }
    }
}
