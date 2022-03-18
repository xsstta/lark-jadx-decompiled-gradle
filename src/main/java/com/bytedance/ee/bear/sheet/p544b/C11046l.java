package com.bytedance.ee.bear.sheet.p544b;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.l */
public class C11046l extends AbstractC11035a {
    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m45975g() {
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_oppanel_operate";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View findViewById = cVar.mo24403c().findViewById(R.id.fab_dragview);
        if (findViewById == null || mo42113f()) {
            return false;
        }
        findViewById.post(new Runnable(findViewById, d, cVar) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$l$PrYCiomWFGRCmtKxPpwphEg0TI */
            public final /* synthetic */ View f$0;
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ C6042c f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C11046l.m45974a(this.f$0, this.f$1, this.f$2);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45974a(View view, FragmentActivity fragmentActivity, C6042c cVar) {
        RectF a = C13749l.m55743a(view, 0, 0, 0, 0);
        a.bottom = (float) C13749l.m55754c(view.getContext());
        C10390c cVar2 = new C10390c(fragmentActivity.getString(R.string.CreationMobile_Tips_Title), true, a);
        cVar2.mo39561a(fragmentActivity.getString(R.string.CreationMobile_Toolbox_Action));
        cVar2.mo39559a($$Lambda$l$LMQMuK9UP41otjW0I8T6z_YewOY.INSTANCE);
        cVar.mo39604a(fragmentActivity.getWindow(), cVar2, (OnBoardingListener) null);
    }
}
