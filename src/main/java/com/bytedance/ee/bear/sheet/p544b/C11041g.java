package com.bytedance.ee.bear.sheet.p544b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10389b;
import com.bytedance.ee.bear.sheet.fab.FabItemEnum;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.g */
public class C11041g extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_newbie_intro";
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View c = cVar.mo24403c();
        String string = d.getString(R.string.Sheet_Newbie_Intro);
        String string2 = d.getString(R.string.Sheet_Newbie_IntroHint);
        View findViewWithTag = c.findViewWithTag(FabItemEnum.operation.name());
        if (findViewWithTag == null || mo42113f()) {
            return false;
        }
        findViewWithTag.post(new Runnable(d, string, string2) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$g$A0drPJWYu10dGkotUVWQq4x7g */
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C11041g.m45960a(C6042c.this, this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45960a(C6042c cVar, FragmentActivity fragmentActivity, String str, String str2) {
        cVar.mo39603a(fragmentActivity.getWindow(), new C10389b(str, Integer.valueOf((int) R.drawable.ccm_onboarding_welcome_sheet_mobile)).mo39551a(str2), (OnBoardingListener) null);
    }
}
