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

/* renamed from: com.bytedance.ee.bear.doc.b.e */
public class C5326e extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_blockmenu_penetrableIntro";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        if (onBoardingData.position == null) {
            return false;
        }
        C13479a.m54764b("DocBlockMenuTimerMission", "DocBlockMenuMission " + onBoardingData.toString());
        C13479a.m54764b("DocBlockMenuTimerMission", "screen width " + C13749l.m55736a() + " screen height " + C13749l.m55748b());
        mo21355b(cVar, onBoardingData);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21355b(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        String a = C13749l.m55745a((Context) d, (int) R.string.Doc_BlockMenu_Intro);
        float b = onBoardingData.position.height / ((float) C13749l.m55748b());
        float b2 = onBoardingData.position.f16906y / ((float) C13749l.m55748b());
        RectF rectF = new RectF();
        rectF.left = onBoardingData.position.f16905x;
        rectF.top = onBoardingData.position.f16906y;
        rectF.right = rectF.left + onBoardingData.position.width;
        rectF.bottom = rectF.top + onBoardingData.position.height;
        C13479a.m54764b("DocBlockMenuTimerMission", "heightP: " + b + "; topP: " + b2);
        if (b < 0.6666667f || b2 > 0.33333334f) {
            C10395e eVar = new C10395e(a, rectF);
            eVar.mo39589a(Direction.UP);
            eVar.mo39588a(2000);
            cVar.mo39605a(d.getWindow(), eVar, (OnBoardingListener) null);
            return;
        }
        C10395e eVar2 = new C10395e(a, new int[]{(int) rectF.centerX(), (int) rectF.centerY()});
        eVar2.mo39589a(Direction.UP);
        eVar2.mo39588a(2000);
        cVar.mo39605a(d.getWindow(), eVar2, (OnBoardingListener) null);
    }
}
