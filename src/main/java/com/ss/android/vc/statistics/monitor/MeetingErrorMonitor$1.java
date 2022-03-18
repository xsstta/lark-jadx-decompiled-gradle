package com.ss.android.vc.statistics.monitor;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.trace.C63784a;
import java.util.List;

class MeetingErrorMonitor$1 implements IMeetingsSizeChangeListener {
    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    /* renamed from: a */
    public /* synthetic */ void mo208172a(List list) {
        IMeetingsSizeChangeListener.CC.$default$a(this, list);
    }

    MeetingErrorMonitor$1() {
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    public void onMeetingsEnd() {
        C60700b.m235851b("MeetingErrorMonitor", "[onMeetingsEnd]", "clearMeetingCrashFlag");
        C63780b.m250412c();
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    public void onMeetingsBegin(boolean z) {
        C60700b.m235851b("MeetingErrorMonitor", "[onMeetingsBegin]", "setMeetingCrashFlag");
        C63784a.m250428a("[VideoChat_MeetingErrorMonitor_beginMeet]");
        C63780b.m250410b();
        C63784a.m250429b("[VideoChat_MeetingErrorMonitor_beginMeet]");
    }
}
