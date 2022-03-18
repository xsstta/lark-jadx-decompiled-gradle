package com.ss.android.vc.meeting.module.single;

import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.foregroundservice.ForegroundService;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.net.service.VideoChatUserRole;
import com.ss.android.vc.net.service.VideoChatUserService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/SingleMeetingDefaultEventListener;", "Lcom/ss/android/vc/meeting/module/single/SingleMeetingBaseEventListener;", "()V", "TAG", "", "endCalling", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "enterCallingState", "enterOnTheCallState", "enterRingingState", "exitRingingState", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.single.e */
public class SingleMeetingDefaultEventListener extends SingleMeetingBaseEventListener {

    /* renamed from: a */
    private final String f158997a = "SingleMeetingDefaultEventListener";

    @Override // com.ss.android.vc.meeting.module.single.SingleMeetingBaseEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: f */
    public void mo212319f(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        super.mo212319f(kVar);
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: e */
    public void mo212318e(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C60700b.m235851b(this.f158997a, "[enterCallingState]", "start");
        ForegroundService.m241663a();
        if (kVar.mo212067p() != DisplayMode.WINDOW) {
            ByteRTCMeetingActivity.f157054h.mo215868a(kVar, false);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: h */
    public void mo212321h(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        String str = this.f158997a;
        C60700b.m235851b(str, "[exitRingingState]", "meetingIdHash=" + (kVar.mo212055d() + ',' + kVar.hashCode()));
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingDefaultEventListener, com.ss.android.vc.meeting.module.single.SingleMeetingBaseEventListener, com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: a */
    public void mo212313a(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        super.mo212313a(kVar);
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "showOnTheCallFragment", this.f158997a, "[enterOnTheCallState] listener = default");
        C60700b.m235851b(this.f158997a, "[enterOnTheCallState]", String.valueOf(kVar.mo212055d()));
        if (kVar.mo212067p() != DisplayMode.WINDOW && kVar.mo212067p() != DisplayMode.FAST_ENTRY) {
            VideoChatUserService F = kVar.mo212088F();
            Intrinsics.checkExpressionValueIsNotNull(F, "meeting.videoChatUserService");
            VideoChatUserRole currentUserRole = F.getCurrentUserRole();
            if (currentUserRole == VideoChatUserRole.UNKNOWN || currentUserRole == VideoChatUserRole.SINGLE_CALLEE || currentUserRole == VideoChatUserRole.SINGLE_CALLER) {
                ByteRTCMeetingActivity.f157054h.mo215869a(kVar, false, false);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.MeetingEventListener
    /* renamed from: g */
    public void mo212320g(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        VideoChatUserService F = kVar.mo212088F();
        Intrinsics.checkExpressionValueIsNotNull(F, "meeting.videoChatUserService");
        F.getSingleRemoteUser();
        C60700b.m235841a(kVar.mo212056e(), "StateEngine", "UI", "showRingingFragment, foreground = " + VCAppLifeCycle.m236255b(), this.f158997a, "[enterRingingState] listener = default");
        ForegroundService.m241663a();
        if (kVar.mo212067p() != DisplayMode.WINDOW) {
            ByteRTCMeetingActivity.f157054h.mo215871b(kVar, false);
        }
        String str = this.f158997a;
        C60700b.m235851b(str, "[enterRingingState]", "meetingIdHash=" + (kVar.mo212055d() + ',' + kVar.hashCode()));
    }
}
