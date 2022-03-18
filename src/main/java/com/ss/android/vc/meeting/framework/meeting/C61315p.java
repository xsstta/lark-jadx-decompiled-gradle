package com.ss.android.vc.meeting.framework.meeting;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61286c;
import com.ss.android.vc.service.VideoChatManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.p */
public class C61315p implements AbstractC61286c {
    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61286c
    /* renamed from: a */
    public void mo211954a(AbstractC61294b bVar) {
    }

    /* renamed from: b */
    private C61303k m238730b(C61303k kVar) {
        List<AbstractC61294b> b = MeetingManager.m238341a().mo211894b();
        if (b != null && b.size() >= 1) {
            Iterator<AbstractC61294b> it = b.iterator();
            while (it.hasNext()) {
                C61303k kVar2 = (C61303k) it.next();
                if (!MeetingUtil.m238367a(kVar2, kVar)) {
                    return kVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m238728a(C61303k kVar) {
        Boolean b = VideoChatManager.m249444a().mo220116b();
        if (b != null) {
            kVar.mo212092J().mo212539e(b.booleanValue());
        }
        Boolean c = VideoChatManager.m249444a().mo220119c();
        if (c != null) {
            kVar.mo212092J().mo212542f(c.booleanValue());
        }
        Boolean d = VideoChatManager.m249444a().mo220122d();
        if (d != null) {
            kVar.mo212092J().mo212549i(d.booleanValue());
        }
        Boolean e = VideoChatManager.m249444a().mo220125e();
        if (e != null) {
            kVar.mo212092J().mo212557m(e.booleanValue());
        }
        kVar.mo212092J().mo212526a(VideoChatManager.m249444a().mo220128f().booleanValue());
        kVar.mo212092J().mo212530b(VideoChatManager.m249444a().mo220129g().booleanValue());
        kVar.mo212092J().mo212552k(VideoChatManager.m249444a().mo220130h());
        kVar.mo212092J().mo212567r(VideoChatManager.m249444a().mo220124d(true));
        kVar.mo212092J().mo212569s(VideoChatManager.m249444a().mo220131i().booleanValue());
        C60700b.m235851b("MeetingManagerListener", "[preConfig]", "videoMuted = " + kVar.mo212092J().mo212504A() + ", audioMuted = " + kVar.mo212092J().mo212505B() + ", speakerMuted = " + kVar.mo212092J().mo212508E() + ", isFontCamera = " + kVar.mo212092J().mo212513J() + ", autoShareScreen = " + kVar.mo212092J().mo212553k() + ", playbackDigitalMute = " + kVar.mo212092J().mo212510G());
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61286c
    /* renamed from: a */
    public void mo211955a(AbstractC61294b bVar, int i) {
        C61303k kVar = (C61303k) bVar;
        m238728a(kVar);
        m238729a(kVar, i);
    }

    /* renamed from: a */
    private void m238729a(C61303k kVar, int i) {
        C61303k b;
        if (i == 109 && (b = m238730b(kVar)) != null) {
            if (b.mo212065n() || b.mo212066o()) {
                kVar.mo212049a(b, MeetingDerive.ATTACH);
                b.mo212049a(kVar, MeetingDerive.HOST);
                C60700b.m235851b("MeetingManagerListener", "[bindForBusyRinging]", "done");
            }
        }
    }
}
