package com.ss.android.appcenter.business.p1265a;

import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.ss.android.appcenter.business.a.j */
public class C27582j {
    /* renamed from: a */
    public static void m100671a(boolean z, LottieAnimationView lottieAnimationView) {
        if (z) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.playAnimation();
            return;
        }
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setVisibility(8);
    }
}
