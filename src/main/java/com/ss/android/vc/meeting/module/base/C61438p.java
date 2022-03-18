package com.ss.android.vc.meeting.module.base;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61296d;
import com.ss.android.vc.meeting.framework.meeting.C61295c;

/* renamed from: com.ss.android.vc.meeting.module.base.p */
public class C61438p extends C61437o {
    private C61295c mListenerWrap = new C61295c("RtcViewModel");

    @Override // com.ss.android.vc.meeting.module.base.C61437o
    public void destroy() {
        C60700b.m235851b("RtcViewModel", "[destroy]", "destroy");
        super.destroy();
        if (getByteRtc() != null) {
            getByteRtc().mo212010b(this.mListenerWrap);
        }
        this.mListenerWrap.mo212074d();
    }

    public void addByteRtcListener(AbstractC61296d dVar) {
        this.mListenerWrap.mo212072a(dVar);
        C60700b.m235851b("RtcViewModel", "[addByteRtcListener]", "addByteRtcListener");
    }

    public void removeByteRtcListener(AbstractC61296d dVar) {
        this.mListenerWrap.mo212073b(dVar);
        C60700b.m235851b("RtcViewModel", "[removeByteRtcListener]", "removeByteRtcListener");
    }

    @Override // com.ss.android.vc.meeting.module.base.C61437o
    public boolean init(String str) {
        C60700b.m235851b("RtcViewModel", "[init]", "meetingId =  " + str);
        super.init(str);
        if (getByteRtc() == null) {
            return true;
        }
        getByteRtc().mo211997a(this.mListenerWrap);
        return true;
    }
}
