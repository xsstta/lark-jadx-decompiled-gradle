package com.bytedance.ee.bear.doc.p291b.p292a;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6039a;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.a.a */
public class C5322a extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_todocenter_intro";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21738b(C6042c cVar) {
        C6039a.m24495a().mo24393a(getClass());
        View findViewWithTag = cVar.mo24403c().findViewWithTag(ToolbarPrimaryItemId.mention.name());
        if (findViewWithTag != null) {
            FragmentActivity d = cVar.mo39612d();
            cVar.mo39611b(d.getWindow(), new C10395e(d.getString(R.string.CreationMobile_Docs_TaskCenter_Onboarding_Tooltip), findViewWithTag), null);
            C13479a.m54764b("OnBoardingManager", "DocTodoCenterMission show done");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        C13479a.m54764b("OnBoardingManager", "show DocTodoCenterMission");
        if (cVar.mo24403c().findViewWithTag(ToolbarPrimaryItemId.mention.name()) != null) {
            C13742g.m55706a(new Runnable(cVar) {
                /* class com.bytedance.ee.bear.doc.p291b.p292a.$$Lambda$a$HAgEbySAEWHinrrY7Io_cbflek */
                public final /* synthetic */ C6042c f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C5322a.this.m21738b(this.f$1);
                }
            }, 200);
            return true;
        }
        C6039a.m24495a().mo24394a(this);
        return false;
    }
}
