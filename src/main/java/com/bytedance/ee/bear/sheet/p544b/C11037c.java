package com.bytedance.ee.bear.sheet.p544b;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.c */
public class C11037c extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_cardMode_share";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        String string = d.getResources().getString(R.string.CreationMobile_Sheets_ShareCardTitle);
        String string2 = d.getResources().getString(R.string.CreationMobile_Sheets_ShareCard);
        if (onBoardingData.position == null || mo42113f()) {
            return false;
        }
        RectF rectF = new RectF();
        rectF.left = onBoardingData.position.f16905x;
        rectF.top = onBoardingData.position.f16906y;
        rectF.right = rectF.left + onBoardingData.position.width;
        rectF.bottom = rectF.top + onBoardingData.position.height;
        C10390c cVar2 = new C10390c(string, true, rectF);
        cVar2.mo39561a(string2).mo39560a(FlowStyleHollowShape.None).mo39562a(true).mo39565b(d.getResources().getString(R.string.Doc_Facade_GotIt));
        cVar.mo39604a(d.getWindow(), cVar2, (OnBoardingListener) null);
        return true;
    }
}
