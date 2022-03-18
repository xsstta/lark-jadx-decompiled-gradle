package com.ss.android.vc.meeting.module.guest;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel;
import com.ss.android.vcxp.annotation.XMethod;

class OnboardingService$2 implements MeetingPreviewGuestModel.ILogoutCallback {
    OnboardingService$2() {
    }

    @Override // com.ss.android.vc.meeting.module.preview.guest.MeetingPreviewGuestModel.ILogoutCallback
    @XMethod
    public void onResult(boolean z) {
        C60700b.m235851b("OnboardingService@", "[logoutWithoutLogin]", "onResult: success = " + z);
    }
}
