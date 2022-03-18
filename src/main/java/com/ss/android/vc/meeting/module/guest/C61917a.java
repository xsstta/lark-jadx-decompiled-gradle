package com.ss.android.vc.meeting.module.guest;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;

/* renamed from: com.ss.android.vc.meeting.module.guest.a */
public class C61917a {
    /* renamed from: a */
    public static void m241891a() {
        if (GuestJoinMeetingUtil.m245482d()) {
            C60700b.m235851b("OnboardingService@", "[simplifyLogin]", "go to checkAndStartOnboarding");
            VideoChatModuleDependency.getUGDependency().checkAndStartFlow(new OnboardingService$1());
        } else if (GuestJoinMeetingUtil.m245480b()) {
            C60700b.m235851b("OnboardingService@", "[guestLogin]", "go to openVcWelcomeGuide");
            VideoChatModuleDependency.getGuideDependency().mo196397a(null);
            VideoChatModuleDependency.getLoginDependency().logoutWithoutLogin(ar.m236694a(), false, "guest logout actively", new OnboardingService$2());
            MiddlePageActivity.m241878a();
        }
        C60735ab.m236002a($$Lambda$9ufHViXnTW0JDQtCt2qSpp8MkFI.INSTANCE, 1000);
    }
}
