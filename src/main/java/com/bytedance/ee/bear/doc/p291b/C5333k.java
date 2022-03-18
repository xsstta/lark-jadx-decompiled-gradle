package com.bytedance.ee.bear.doc.p291b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.k */
public class C5333k extends AbstractC6041b {

    /* renamed from: a */
    private boolean f15237a;

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_translate_intro";
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b, com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: c */
    public String mo21356c() {
        if (this.f15237a) {
            return "mobile_wiki_newbie_pageTree";
        }
        return null;
    }

    public C5333k(boolean z) {
        this.f15237a = z;
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View a = cVar.mo24402b().mo19507a("MORE_OPERATE");
        if (a == null) {
            return false;
        }
        a.post(new Runnable(d, new C10395e(d.getString(R.string.Doc_Translate_Intro), a)) {
            /* class com.bytedance.ee.bear.doc.p291b.$$Lambda$k$5yESrI9xwykCXu78AjZBjKUNSUI */
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ C10395e f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C5333k.m21774a(C6042c.this, this.f$1, this.f$2);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m21774a(C6042c cVar, FragmentActivity fragmentActivity, C10395e eVar) {
        cVar.mo39611b(fragmentActivity.getWindow(), eVar, null);
    }
}
