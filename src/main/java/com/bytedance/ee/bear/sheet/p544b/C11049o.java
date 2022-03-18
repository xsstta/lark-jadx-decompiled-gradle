package com.bytedance.ee.bear.sheet.p544b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.bear.sheet.fab.FabItemEnum;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.o */
public class C11049o extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_redesign_freeze";
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
        findViewWithTag.post(new Runnable(d, d.getString(R.string.Sheet_Redesign_Freeze), findViewWithTag) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$o$IwZXqDt42RqGJz0l5Nb3rIHSp3o */
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ View f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C11049o.m45984a(C6042c.this, this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45984a(C6042c cVar, FragmentActivity fragmentActivity, String str, View view) {
        cVar.mo39611b(fragmentActivity.getWindow(), new C10395e(str, view), null);
    }
}
