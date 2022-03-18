package com.bytedance.ee.bear.doc.p291b;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.g */
public class C5328g extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_comment_intro";
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b, com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: c */
    public String mo21356c() {
        return null;
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        if (onBoardingData.position == null) {
            return false;
        }
        C13479a.m54764b("DocCommentMission", onBoardingData.position.f16905x + " : " + onBoardingData.position.f16906y);
        FragmentActivity d = cVar.mo39612d();
        cVar.mo39611b(d.getWindow(), new C10395e(d.getString(R.string.Doc_Comment_Intro), new int[]{(int) onBoardingData.position.f16905x, (int) onBoardingData.position.f16906y}), null);
        return true;
    }
}
