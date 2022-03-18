package com.bytedance.ee.bear.sheet.p544b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.bytedance.ee.bear.sheet.fab.FabItemEnum;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.k */
public class C11045k extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_newbie_toolbox";
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View c = cVar.mo24403c();
        String string = d.getString(R.string.Sheet_Newbie_QuickOperation);
        String string2 = d.getString(R.string.Sheet_Newbie_QuickOperationHint);
        View findViewWithTag = c.findViewWithTag(FabItemEnum.operation.name());
        if (findViewWithTag == null || mo42113f()) {
            return false;
        }
        findViewWithTag.post(new Runnable(findViewWithTag, string, onBoardingData, string2, cVar, d) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$k$wVYjmHFYUJ1M9BC6dn04_skWhE */
            public final /* synthetic */ View f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ OnBoardingData f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ C6042c f$4;
            public final /* synthetic */ FragmentActivity f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void run() {
                C11045k.m45971a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45971a(View view, String str, OnBoardingData onBoardingData, String str2, C6042c cVar, FragmentActivity fragmentActivity) {
        C10390c cVar2 = new C10390c(str, onBoardingData.isLast, C13749l.m55743a(view, -5, -5, -5, -5));
        cVar2.mo39561a(str2).mo39560a(FlowStyleHollowShape.Capsule);
        cVar.mo39604a(fragmentActivity.getWindow(), cVar2, (OnBoardingListener) null);
    }
}
