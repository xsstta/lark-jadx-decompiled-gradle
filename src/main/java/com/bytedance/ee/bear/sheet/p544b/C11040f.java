package com.bytedance.ee.bear.sheet.p544b;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10389b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.f */
public class C11040f extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_landscape_intro";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        if (mo42113f()) {
            return false;
        }
        FragmentActivity d = cVar.mo39612d();
        String string = d.getString(R.string.Sheet_Landscape_Intro);
        String string2 = d.getString(R.string.Sheet_Landscape_IntroHint);
        String string3 = d.getString(R.string.Onboarding_Got_It);
        C10389b bVar = new C10389b(string, Integer.valueOf((int) R.drawable.ccm_onboarding_horizontal_mobile));
        bVar.mo39551a(string2);
        bVar.mo39552b(string3);
        cVar.mo39603a(d.getWindow(), bVar, (OnBoardingListener) null);
        return true;
    }
}
