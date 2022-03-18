package com.ss.android.vc.meeting.module.preview.guest;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel;
import com.ss.android.vcxp.annotation.XMethod;

/* access modifiers changed from: package-private */
public class MeetingPreviewGuestPresenter$2 implements MeetingPreviewGuestModel.IGuestLoginCallback {

    /* renamed from: a */
    final /* synthetic */ C62739c f157874a;

    @XMethod
    public void onSuccess() {
        C60700b.m235851b("MeetingPreviewGuestPresenter", "[joinMeetingAsGuest]", "passport guestLogin onSuccess.");
    }

    MeetingPreviewGuestPresenter$2(C62739c cVar) {
        this.f157874a = cVar;
    }

    @XMethod
    public void onFailed(String str) {
        C60700b.m235864f("MeetingPreviewGuestPresenter", "[joinMeetingAsGuest2]", "error = " + str);
    }
}
