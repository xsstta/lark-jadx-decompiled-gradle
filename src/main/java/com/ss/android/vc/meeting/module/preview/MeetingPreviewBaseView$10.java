package com.ss.android.vc.meeting.module.preview;

import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vcxp.annotation.XMethod;

/* access modifiers changed from: package-private */
public class MeetingPreviewBaseView$10 implements XConsumer<MeetingCheckData> {

    /* renamed from: a */
    final /* synthetic */ AbstractC62715f f157715a;

    MeetingPreviewBaseView$10(AbstractC62715f fVar) {
        this.f157715a = fVar;
    }

    @XMethod
    public void accept(MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            if (this.f157715a.f157820c.mo216599a() == 5 || this.f157715a.f157820c.mo216599a() == 6) {
                this.f157715a.f157807K.mo214800b(this.f157715a.f157820c.mo216602d());
            }
            this.f157715a.f157807K.mo214799a(this.f157715a.f157810N, this.f157715a.f157811O, this.f157715a.f157820c.mo216603e());
        }
    }
}
