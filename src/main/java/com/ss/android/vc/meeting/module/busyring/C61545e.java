package com.ss.android.vc.meeting.module.busyring;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.MultiMeetingDefaultEventListener;
import com.ss.android.vc.statistics.event.bn;

/* renamed from: com.ss.android.vc.meeting.module.busyring.e */
public class C61545e extends MultiMeetingDefaultEventListener {

    /* renamed from: b */
    protected String f154390b = "MultiBusyRingEventListener";

    @Override // com.ss.android.vc.meeting.framework.statemachine.MultiMeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: h */
    public void mo212321h(C61303k kVar) {
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MultiMeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: i */
    public void mo212322i(C61303k kVar) {
        C60700b.m235851b(this.f154390b, "[endRinging]", "...");
        C61543c.m240212a(kVar, false);
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MultiMeetingDefaultEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: g */
    public void mo212320g(C61303k kVar) {
        C60700b.m235851b(this.f154390b, "[enterRingingState]", "...");
        C61543c.m240212a(kVar, true);
        bn.m250196a(kVar.mo212056e(), kVar.mo212093K());
    }
}
