package com.ss.android.vc.meeting.module.preview.p3152a;

import com.p063a.p064a.p065a.p066a.C1713b;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.p3152a.C62656a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63737ag;
import com.ss.android.vc.statistics.p3180a.C63693e;

/* renamed from: com.ss.android.vc.meeting.module.preview.a.c */
public class C62662c extends AbstractC62710d<C62656a.AbstractC62657a.AbstractC62658a> implements C62656a.AbstractC62657a {
    @Override // com.ss.android.vc.meeting.module.preview.p3152a.C62656a.AbstractC62657a
    /* renamed from: e */
    public void mo216554e() {
        C63737ag.m250008c("unknown", ((C62656a.AbstractC62657a.AbstractC62658a) this.f157788a).mo216555i(), ((C62656a.AbstractC62657a.AbstractC62658a) this.f157788a).mo216524h());
    }

    @Override // com.ss.android.vc.meeting.module.preview.p3152a.C62656a.AbstractC62657a
    /* renamed from: a */
    public void mo216553a(AbstractC63598b<JoinMeetingEntity> bVar, String str) {
        C1713b.m7632b("MeetingPreviewMeetingNumberModel", "Click go meeting button");
        C63693e.m249686c();
        VideoChatService.m249602d().joinMeetingById(str, !((C62656a.AbstractC62657a.AbstractC62658a) this.f157788a).mo216517a(), !((C62656a.AbstractC62657a.AbstractC62658a) this.f157788a).mo216518b(), ((C62656a.AbstractC62657a.AbstractC62658a) this.f157788a).mo216523g(), ((C62656a.AbstractC62657a.AbstractC62658a) this.f157788a).mo216524h(), bVar);
    }
}
