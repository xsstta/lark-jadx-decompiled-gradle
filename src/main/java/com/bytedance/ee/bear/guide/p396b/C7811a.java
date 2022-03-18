package com.bytedance.ee.bear.guide.p396b;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.guide.p395a.C7810a;
import com.bytedance.ee.bear.guide.p396b.C7812b;
import com.bytedance.ee.bear.guide.util.OnBoardingConditionUtil;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.guide.b.a */
public class C7811a {
    /* renamed from: a */
    public static boolean m31302a(boolean z) {
        if (!z || !OnBoardingConditionUtil.m31346a()) {
            return false;
        }
        if (!OnBoardingConditionUtil.m31347b()) {
            return !((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_doc_share_callout");
        }
        C13479a.m54772d("DocShareOnBoardingManager", "shouldShowBadge()... force display");
        return true;
    }

    /* renamed from: a */
    public static void m31301a(boolean z, View view, Window window, FragmentActivity fragmentActivity, String str, String str2) {
        if (z && OnBoardingConditionUtil.m31346a()) {
            boolean a = ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_doc_share_callout");
            if (OnBoardingConditionUtil.m31347b() || !a) {
                C13479a.m54772d("DocShareOnBoardingManager", "show the guidance of docs sharing function");
                AbstractC5233x b = C5234y.m21391b();
                C7810a.m31296b(b, str2);
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39514a(new C7812b(view, window, str, new C7812b.AbstractC7814a(str2) {
                    /* class com.bytedance.ee.bear.guide.p396b.$$Lambda$a$GcXSQkom2OGRqogxQ37922jB3g8 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.bear.guide.p396b.C7812b.AbstractC7814a
                    public final void OnFinishMission() {
                        C7810a.m31298c(AbstractC5233x.this, this.f$1);
                    }
                }), fragmentActivity);
            }
        }
    }
}
