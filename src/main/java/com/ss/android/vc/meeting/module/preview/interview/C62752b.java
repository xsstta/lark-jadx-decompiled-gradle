package com.ss.android.vc.meeting.module.preview.interview;

import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.response.C60956ac;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.interview.C62747a;
import com.ss.android.vc.meeting.module.preview.interview.MeetingPreviewInterviewFragment;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;

/* renamed from: com.ss.android.vc.meeting.module.preview.interview.b */
public class C62752b extends AbstractC62710d<C62747a.AbstractC62748a.AbstractC62749a> implements C62747a.AbstractC62748a {

    /* renamed from: d */
    String f157892d;

    /* renamed from: e */
    String f157893e;

    @Override // com.ss.android.vc.meeting.module.preview.interview.C62747a.AbstractC62748a
    /* renamed from: e */
    public String mo216748e() {
        return this.f157892d;
    }

    @Override // com.ss.android.vc.meeting.module.preview.interview.C62747a.AbstractC62748a
    public void o_(boolean z) {
        mo216660a(this.f157892d, IDTypeEntity.INTERVIEW_UID, z);
    }

    /* renamed from: a */
    private ParticipantRole m245566a(String str) {
        if (MeetingPreviewInterviewFragment.InterviewerType.INTERVIEWER.getType().equals(str)) {
            return ParticipantRole.INTERVIEWER;
        }
        if (MeetingPreviewInterviewFragment.InterviewerType.INTERVIEWEE.getType().equals(str)) {
            return ParticipantRole.INTERVIEWEE;
        }
        return ParticipantRole.UNKNOW_ROLE;
    }

    @Override // com.ss.android.vc.meeting.module.preview.interview.C62747a.AbstractC62748a
    /* renamed from: a */
    public void mo216747a(AbstractC63598b<C60956ac> bVar) {
        VCLauncherStatistics.m250421a();
        C63693e.m249686c();
        C63736af.m250003c(((C62747a.AbstractC62748a.AbstractC62749a) this.f157788a).mo216523g(), this.f157892d, ((C62747a.AbstractC62748a.AbstractC62749a) this.f157788a).mo216524h(), m245567a(this.f157892d, this.f157893e, ParticipantType.LARK_USER, false, bVar));
    }

    /* renamed from: a */
    private String m245567a(String str, String str2, ParticipantType participantType, boolean z, AbstractC63598b<C60956ac> bVar) {
        return VcBizSender.m249210a(str, str2, participantType, ((C62747a.AbstractC62748a.AbstractC62749a) this.f157788a).mo216518b(), ((C62747a.AbstractC62748a.AbstractC62749a) this.f157788a).mo216517a(), m245566a(str2), z, bVar);
    }
}
