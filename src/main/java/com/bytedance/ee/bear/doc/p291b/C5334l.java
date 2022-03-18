package com.bytedance.ee.bear.doc.p291b;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.Direction;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.l */
public class C5334l extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_smartCompose_intro";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        if (onBoardingData.position == null) {
            return false;
        }
        C13479a.m54764b("SmartComposeTapTimerMission", "DocBlockMenuMission " + onBoardingData.toString());
        C13479a.m54764b("SmartComposeTapTimerMission", "screen width " + C13749l.m55736a() + " screen height " + C13749l.m55748b());
        mo21359b(cVar, onBoardingData);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21359b(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        String a = C13749l.m55745a((Context) d, (int) R.string.Doc_Lark_SmartCompose);
        float b = onBoardingData.position.height / ((float) C13749l.m55748b());
        float b2 = onBoardingData.position.f16906y / ((float) C13749l.m55748b());
        C13479a.m54764b("SmartComposeTapTimerMission", "heightP: " + b + "; topP: " + b2);
        RectF rectF = new RectF();
        rectF.left = onBoardingData.position.f16905x;
        rectF.top = onBoardingData.position.f16906y;
        rectF.right = rectF.left + onBoardingData.position.width;
        rectF.bottom = rectF.top + onBoardingData.position.height;
        C10395e eVar = new C10395e(a, rectF);
        eVar.mo39587a(C13749l.m55745a((Context) d, (int) R.string.Doc_Lark_SmartComposeOnboardMobile));
        eVar.mo39589a(Direction.UP);
        eVar.mo39588a(2000);
        cVar.mo39606a(d.getWindow(), eVar, "sc_tap.json", (OnBoardingListener) null);
    }
}
