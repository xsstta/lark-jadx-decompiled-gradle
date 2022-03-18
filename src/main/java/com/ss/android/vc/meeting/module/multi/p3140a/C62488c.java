package com.ss.android.vc.meeting.module.multi.p3140a;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;

/* renamed from: com.ss.android.vc.meeting.module.multi.a.c */
public class C62488c extends AbstractC62485a {
    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a
    /* renamed from: b */
    public void mo216036b() {
        for (AbstractC62485a.AbstractC62486a aVar : this.f157195a) {
            if (aVar != null) {
                aVar.mo216043d();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a
    /* renamed from: a */
    public boolean mo216034a() {
        for (AbstractC62485a.AbstractC62486a aVar : this.f157195a) {
            if (aVar != null && aVar.mo216042b()) {
                return true;
            }
        }
        return false;
    }

    public C62488c(C61303k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public void mo216063a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        for (AbstractC62485a.AbstractC62486a aVar : this.f157195a) {
            if (aVar != null) {
                aVar.mo216039a(videoChatInMeetingInfo);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a
    /* renamed from: a */
    public void mo216033a(String str) {
        for (AbstractC62485a.AbstractC62486a aVar : this.f157195a) {
            if (aVar != null) {
                aVar.mo216040a(str);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a
    /* renamed from: a */
    public boolean mo216035a(Participant participant) {
        for (AbstractC62485a.AbstractC62486a aVar : this.f157195a) {
            if (aVar != null && aVar.mo216041a(participant)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a
    /* renamed from: a */
    public void mo216031a(Participant participant, AbstractC62492f fVar) {
        if (participant != null) {
            for (AbstractC62485a.AbstractC62486a aVar : this.f157195a) {
                if (aVar != null) {
                    aVar.mo216038a(participant, fVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("showFullScreenVideo participant is null");
    }
}
