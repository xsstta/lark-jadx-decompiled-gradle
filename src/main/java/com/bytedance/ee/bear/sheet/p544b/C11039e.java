package com.bytedance.ee.bear.sheet.p544b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.sheet.fab.FabItemEnum;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.e */
public class C11039e extends AbstractC11035a {

    /* renamed from: a */
    private String f29702a = "🎉";

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_checkbox_intro";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View findViewWithTag = cVar.mo24403c().findViewWithTag(FabItemEnum.operation.name());
        if (findViewWithTag == null || mo42113f()) {
            return false;
        }
        findViewWithTag.post(new Runnable(d, C10539a.m43639a(d, R.string.CreationMobile_Checkbox_Callout, "Emoji", this.f29702a), findViewWithTag) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$e$8z5HwPgL5dB0as9TdYMWlsVPdI */
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ View f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C11039e.m45955a(C6042c.this, this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45955a(C6042c cVar, FragmentActivity fragmentActivity, String str, View view) {
        cVar.mo39605a(fragmentActivity.getWindow(), new C10395e(str, view), (OnBoardingListener) null);
    }
}
