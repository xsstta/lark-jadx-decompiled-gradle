package com.bytedance.ee.bear.onboarding.view.p518a;

import android.text.TextUtils;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;

/* renamed from: com.bytedance.ee.bear.onboarding.view.a.a */
public class C10439a implements AbstractC10440b {

    /* renamed from: a */
    private String f28034a;

    /* renamed from: b */
    private String f28035b;

    @Override // com.bytedance.ee.bear.onboarding.view.p518a.AbstractC10440b
    /* renamed from: a */
    public void mo39708a(BearLottieView bearLottieView) {
        bearLottieView.setAnimation(this.f28034a);
        if (!TextUtils.isEmpty(this.f28035b)) {
            bearLottieView.setImageAssetsFolder(this.f28035b);
        }
    }

    public C10439a(String str, String str2) {
        this.f28034a = str;
        this.f28035b = str2;
    }
}
