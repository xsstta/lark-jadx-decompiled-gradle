package com.bytedance.ee.bear.sheet.p544b;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.r */
public class C11052r extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_redesign_viewImage";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        if (mo42113f() || onBoardingData.position == null) {
            return false;
        }
        String string = d.getString(R.string.Sheet_Redesign_ViewImage);
        RectF rectF = new RectF();
        rectF.left = onBoardingData.position.f16905x;
        rectF.top = onBoardingData.position.f16906y;
        rectF.right = rectF.left + onBoardingData.position.width;
        rectF.bottom = rectF.top + onBoardingData.position.height;
        cVar.mo39611b(d.getWindow(), new C10395e(string, rectF), null);
        return true;
    }
}
