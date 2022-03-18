package com.ss.android.vc.meeting.module.guest;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;

class OnboardingService$1 extends XIGetDataCallback<Boolean> {
    OnboardingService$1() {
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        C60700b.m235864f("OnboardingService@", "[checkAndStartOnboarding2]", "fail");
    }

    @XMethod
    public void onSuccess(Boolean bool) {
        C60700b.m235851b("OnboardingService@", "[checkAndStartOnboarding]", "success");
    }
}
