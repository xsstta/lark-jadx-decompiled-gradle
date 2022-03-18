package com.bytedance.ee.bear.doc.p291b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6039a;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.a */
public class C5321a extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_toolbarV2_addNewBlock";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21734a(C6042c cVar, View view) {
        C6039a.m24495a().mo24393a(getClass());
        FragmentActivity d = cVar.mo39612d();
        cVar.mo39611b(d.getWindow(), new C10395e(d.getString(R.string.Doc_Toolbar_AddNewBlock), view), null);
        C13479a.m54764b("OnBoardingManager", "DocAddNewBlockMission show done");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        C13479a.m54764b("OnBoardingManager", "show DocAddNewBlockMission");
        View findViewWithTag = cVar.mo24403c().findViewWithTag(ToolbarPrimaryItemId.addNewBlock.name());
        if (findViewWithTag != null) {
            findViewWithTag.post(new Runnable(cVar, findViewWithTag) {
                /* class com.bytedance.ee.bear.doc.p291b.$$Lambda$a$P7Lv8Sa2tMRtFYZ8FiVA9Fn0L8o */
                public final /* synthetic */ C6042c f$1;
                public final /* synthetic */ View f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C5321a.this.m21734a((C5321a) this.f$1, (C6042c) this.f$2);
                }
            });
            return true;
        }
        C6039a.m24495a().mo24394a(this);
        return false;
    }
}
