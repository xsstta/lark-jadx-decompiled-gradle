package com.bytedance.ee.bear.sheet.p544b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.p */
public class C11050p extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_redesign_listMode";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View findViewWithTag = cVar.mo24403c().findViewWithTag("list");
        if (findViewWithTag == null || mo42113f()) {
            return false;
        }
        findViewWithTag.post(new Runnable(d, d.getString(R.string.Sheet_Redesign_ListMode), findViewWithTag) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$p$8Sz0bsV69aiHpjOTzkrgmsSUPjo */
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ View f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C11050p.m45987a(C6042c.this, this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45987a(C6042c cVar, FragmentActivity fragmentActivity, String str, View view) {
        cVar.mo39611b(fragmentActivity.getWindow(), new C10395e(str, view), null);
    }
}
