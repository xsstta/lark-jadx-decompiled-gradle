package com.bytedance.ee.bear.doc.p291b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.j */
public class C5332j extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_redo_undo";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        C13479a.m54764b("OnBoardingManager", "show DocNewRedoUndoMission");
        FragmentActivity d = cVar.mo39612d();
        View a = cVar.mo24402b().mo19507a("REDO");
        View a2 = cVar.mo24402b().mo19507a("UNDO");
        if (a == null || a2 == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        a.getLocationOnScreen(iArr);
        a2.getLocationOnScreen(iArr2);
        int height = iArr[1] + a.getHeight();
        a.post(new Runnable(cVar, new C10395e(d.getString(R.string.CreationMobile_Toolbar_Redo_Tooltip), new int[]{((iArr[0] + iArr2[0]) + a.getWidth()) / 2, height})) {
            /* class com.bytedance.ee.bear.doc.p291b.$$Lambda$j$EimXzMHU6MfXtuU5sNfpfsaGBaA */
            public final /* synthetic */ C6042c f$1;
            public final /* synthetic */ C10395e f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C5332j.m21770a(FragmentActivity.this, this.f$1, this.f$2);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m21770a(FragmentActivity fragmentActivity, C6042c cVar, C10395e eVar) {
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            cVar.mo39611b(fragmentActivity.getWindow(), eVar, null);
        }
    }
}
