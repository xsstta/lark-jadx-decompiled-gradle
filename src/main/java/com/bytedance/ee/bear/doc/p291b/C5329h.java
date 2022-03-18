package com.bytedance.ee.bear.doc.p291b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.h */
public class C5329h extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_toolbar_addNewVideo";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        C13479a.m54764b("InsertMediaMission", "show InsertMediaMission");
        View findViewWithTag = cVar.mo24403c().findViewWithTag(ToolbarPrimaryItemId.insertImage.name());
        if (findViewWithTag == null) {
            return true;
        }
        FragmentActivity d = cVar.mo39612d();
        cVar.mo39611b(d.getWindow(), new C10395e(d.getString(R.string.CreationMobile_UploadVideo_Popover), findViewWithTag), null);
        return true;
    }
}
