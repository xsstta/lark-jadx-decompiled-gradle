package com.bytedance.ee.bear.onboarding;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10389b;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.bear.onboarding.view.CardOnBoardingDialog;
import com.bytedance.ee.bear.onboarding.view.FlowOnBoardingDialog;
import com.bytedance.ee.bear.onboarding.view.TextOnBoardingDialog;
import com.bytedance.ee.bear.onboarding.view.TimerTextAndTapOnBoardingDialog;
import com.bytedance.ee.bear.onboarding.view.TimerTextOnBoardingDialog;
import com.bytedance.ee.bear.onboarding.view.p518a.AbstractC10440b;
import com.bytedance.ee.bear.onboarding.view.p518a.C10439a;
import com.bytedance.ee.bear.onboarding.view.p518a.C10441c;

/* renamed from: com.bytedance.ee.bear.onboarding.d */
public class C10385d implements AbstractC10400d {
    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d
    /* renamed from: a */
    public void mo39539a(FragmentActivity fragmentActivity, Window window, C10389b bVar, AbstractC10400d.AbstractC10402b bVar2, OnBoardingColorStyle onBoardingColorStyle) {
        CardOnBoardingDialog bVar3 = new CardOnBoardingDialog(fragmentActivity, window);
        bVar3.mo39700a(bVar2);
        bVar3.mo39698a(bVar.mo39549a());
        bVar3.mo39709a(bVar.mo39555d(), bVar.mo39556e(), bVar.mo39553b(), bVar.mo39554c(), bVar.mo39557f(), onBoardingColorStyle);
        bVar3.show();
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d
    /* renamed from: b */
    public void mo39543b(FragmentActivity fragmentActivity, Window window, C10395e eVar, OnBoardingColorStyle onBoardingColorStyle, AbstractC10400d.AbstractC10402b bVar) {
        TextOnBoardingDialog fVar = new TextOnBoardingDialog(fragmentActivity, window);
        fVar.mo39700a(bVar);
        fVar.mo39698a(eVar.mo39549a());
        fVar.mo39720a(eVar.mo39592c(), eVar.mo39593d(), eVar.mo39594e(), eVar.mo39595f(), eVar.mo39590b(), eVar.mo39596g(), Integer.valueOf(eVar.mo39598i()), onBoardingColorStyle);
        fVar.show();
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d
    /* renamed from: a */
    public void mo39541a(FragmentActivity fragmentActivity, Window window, C10395e eVar, OnBoardingColorStyle onBoardingColorStyle, AbstractC10400d.AbstractC10402b bVar) {
        TimerTextOnBoardingDialog hVar = new TimerTextOnBoardingDialog(fragmentActivity, window);
        hVar.mo39700a(bVar);
        hVar.mo39698a(eVar.mo39549a());
        hVar.mo39731a(eVar.mo39592c(), eVar.mo39593d(), eVar.mo39594e(), eVar.mo39595f(), eVar.mo39590b(), eVar.mo39596g(), Integer.valueOf(eVar.mo39597h()), onBoardingColorStyle);
        hVar.show();
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d
    /* renamed from: a */
    public void mo39540a(FragmentActivity fragmentActivity, Window window, C10390c cVar, OnBoardingColorStyle onBoardingColorStyle, AbstractC10400d.AbstractC10402b bVar) {
        AbstractC10440b bVar2;
        AbstractC10440b cVar2;
        FlowOnBoardingDialog cVar3 = new FlowOnBoardingDialog(fragmentActivity, window);
        cVar3.mo39700a(bVar);
        cVar3.mo39713a(cVar.mo39575k());
        cVar3.mo39698a(cVar.mo39549a());
        C10390c.AbstractC10392b j = cVar.mo39574j();
        if (j instanceof C10390c.C10391a) {
            C10390c.C10391a aVar = (C10390c.C10391a) j;
            cVar2 = new C10439a(aVar.mo39583b(), aVar.mo39582a());
        } else if (j instanceof C10390c.C10393c) {
            C10390c.C10393c cVar4 = (C10390c.C10393c) j;
            cVar2 = new C10441c(cVar4.mo39585b(), cVar4.mo39584a());
        } else {
            bVar2 = null;
            cVar3.mo39714a(cVar.mo39566b(), cVar.mo39567c(), Integer.valueOf(cVar.mo39568d()), Integer.valueOf(cVar.mo39569e()), cVar.mo39572h(), cVar.mo39570f(), cVar.mo39573i(), bVar2, cVar.mo39571g(), cVar.mo39576l(), cVar.mo39577m(), cVar.mo39579o(), cVar.mo39580p(), onBoardingColorStyle, cVar.mo39578n());
            cVar3.show();
        }
        bVar2 = cVar2;
        cVar3.mo39714a(cVar.mo39566b(), cVar.mo39567c(), Integer.valueOf(cVar.mo39568d()), Integer.valueOf(cVar.mo39569e()), cVar.mo39572h(), cVar.mo39570f(), cVar.mo39573i(), bVar2, cVar.mo39571g(), cVar.mo39576l(), cVar.mo39577m(), cVar.mo39579o(), cVar.mo39580p(), onBoardingColorStyle, cVar.mo39578n());
        cVar3.show();
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d
    /* renamed from: a */
    public void mo39542a(FragmentActivity fragmentActivity, Window window, C10395e eVar, String str, OnBoardingColorStyle onBoardingColorStyle, AbstractC10400d.AbstractC10402b bVar) {
        TimerTextAndTapOnBoardingDialog gVar = new TimerTextAndTapOnBoardingDialog(fragmentActivity, window);
        gVar.mo39700a(bVar);
        gVar.mo39698a(eVar.mo39549a());
        gVar.mo39725a(eVar.mo39592c(), eVar.mo39593d(), str, eVar.mo39594e(), eVar.mo39595f(), eVar.mo39590b(), eVar.mo39596g(), onBoardingColorStyle);
        gVar.show();
    }
}
