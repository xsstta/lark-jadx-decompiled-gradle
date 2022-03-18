package com.bytedance.ee.bear.sheet.p544b;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.Direction;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.b */
public class C11036b extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_cardMode_dragEntry";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        if (onBoardingData.position == null || mo42113f()) {
            return false;
        }
        RectF rectF = new RectF();
        rectF.left = onBoardingData.position.f16905x;
        rectF.top = onBoardingData.position.f16906y;
        rectF.right = rectF.left + onBoardingData.position.width;
        rectF.bottom = rectF.top + onBoardingData.position.height;
        C10395e eVar = new C10395e(d.getString(R.string.CreationMobile_Sheets_FullCard), rectF);
        eVar.mo39589a(Direction.UP);
        cVar.mo39611b(d.getWindow(), eVar, null);
        return true;
    }
}
