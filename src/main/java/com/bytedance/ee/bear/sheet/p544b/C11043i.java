package com.bytedance.ee.bear.sheet.p544b;

import android.graphics.RectF;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.io.File;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.b.i */
public class C11043i extends AbstractC11035a {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_newbie_shareSheetImage";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        if (mo42113f()) {
            return false;
        }
        OnBoardingData.Position position = onBoardingData.position;
        FragmentActivity d = cVar.mo39612d();
        String a = ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39511a(d, d.getResources().getString(R.string.CreationMobile_PicExport_Onboarding_Url));
        if (TextUtils.isEmpty(a)) {
            C13479a.m54775e("SheetNewbieExportImageMission", "lottieFileDir not exist.");
            return false;
        } else if (position == null || mo42113f()) {
            return false;
        } else {
            RectF rectF = new RectF(position.f16905x, position.f16906y, position.f16905x + position.width, position.f16906y + position.height);
            String string = d.getResources().getString(R.string.Doc_PicExport_Onboarding_Title);
            String string2 = d.getString(R.string.Doc_PicExport_Onboarding_Descrip);
            C10390c cVar2 = new C10390c(string, true, rectF);
            cVar2.mo39561a(string2).mo39560a(FlowStyleHollowShape.None).mo39564a(new C10390c.C10393c(a + File.separator + "data.json", a + File.separator + "images" + File.separator));
            cVar.mo39604a(d.getWindow(), cVar2, (OnBoardingListener) null);
            return true;
        }
    }
}
