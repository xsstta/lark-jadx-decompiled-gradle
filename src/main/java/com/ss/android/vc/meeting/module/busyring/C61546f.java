package com.ss.android.vc.meeting.module.busyring;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.single.SingleMeetingDefaultEventListener;
import com.ss.android.vc.statistics.event.bn;

/* renamed from: com.ss.android.vc.meeting.module.busyring.f */
public class C61546f extends SingleMeetingDefaultEventListener {

    /* renamed from: a */
    protected String f154391a = "SingleBusyRingEventListener";

    @Override // com.ss.android.vc.meeting.module.single.SingleMeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: h */
    public void mo212321h(C61303k kVar) {
    }

    @Override // com.ss.android.vc.meeting.module.single.SingleMeetingBaseEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: i */
    public void mo212322i(C61303k kVar) {
        C60700b.m235851b(this.f154391a, "[endRinging]", "...");
        C61543c.m240212a(kVar, false);
    }

    @Override // com.ss.android.vc.meeting.module.single.SingleMeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: g */
    public void mo212320g(C61303k kVar) {
        C60700b.m235851b(this.f154391a, "[enterRingingState]", "...");
        C61543c.m240212a(kVar, true);
        bn.m250196a(kVar.mo212056e(), kVar.mo212093K());
    }
}
