package com.ss.android.vc.meeting.module.preview.p3153b;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.p3153b.C62670a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.event.C63737ag;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;

/* renamed from: com.ss.android.vc.meeting.module.preview.b.c */
public class C62676c extends AbstractC62710d<C62670a.AbstractC62671a.AbstractC62672a> implements C62670a.AbstractC62671a {

    /* renamed from: d */
    String f157726d;

    /* renamed from: e */
    Boolean f157727e;

    @Override // com.ss.android.vc.meeting.module.preview.p3153b.C62670a.AbstractC62671a
    /* renamed from: f */
    public void mo216584f() {
        mo216659a(this.f157726d, IDTypeEntity.MEETING_ID);
    }

    @Override // com.ss.android.vc.meeting.module.preview.p3153b.C62670a.AbstractC62671a
    /* renamed from: e */
    public void mo216583e() {
        C63737ag.m250006a("unknown", this.f157726d, false, ((C62670a.AbstractC62671a.AbstractC62672a) this.f157788a).mo216524h());
    }

    @Override // com.ss.android.vc.meeting.module.preview.p3153b.C62670a.AbstractC62671a
    /* renamed from: a */
    public void mo216582a(AbstractC63598b<JoinMeetingEntity> bVar) {
        C63736af.m250000a(((C62670a.AbstractC62671a.AbstractC62672a) this.f157788a).mo216523g(), this.f157726d, ((C62670a.AbstractC62671a.AbstractC62672a) this.f157788a).mo216524h(), m245182a(this.f157726d, this.f157727e.booleanValue(), bVar));
    }

    /* renamed from: a */
    private String m245182a(String str, boolean z, final AbstractC63598b<JoinMeetingEntity> bVar) {
        C60700b.m235851b("MeetingPreviewNormalJoinModel", "[sendJoinMeetingRequest]", "meetingId = " + str + ", force = " + z);
        VCLauncherStatistics.m250421a();
        C63693e.m249686c();
        VcBizTask<JoinMeetingEntity> b = VcBizSender.m249237b(str, ((C62670a.AbstractC62671a.AbstractC62672a) this.f157788a).mo216518b() ^ true, ((C62670a.AbstractC62671a.AbstractC62672a) this.f157788a).mo216517a() ^ true, z);
        b.mo219889a(new AbstractC63598b<JoinMeetingEntity>() {
            /* class com.ss.android.vc.meeting.module.preview.p3153b.C62676c.C626771 */

            /* renamed from: a */
            public void onSuccess(JoinMeetingEntity joinMeetingEntity) {
                bVar.onSuccess(joinMeetingEntity);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }
        });
        return b.mo219895c();
    }
}
