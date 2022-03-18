package com.bytedance.ee.bear.onboarding.export.ui;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10389b;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;

/* renamed from: com.bytedance.ee.bear.onboarding.export.ui.a */
public class C10403a implements AbstractC10405c {

    /* renamed from: a */
    private AbstractC10396b f27961a;

    /* renamed from: b */
    private FragmentActivity f27962b;

    /* renamed from: c */
    private AbstractC10397d<? extends AbstractC10405c> f27963c;

    /* renamed from: d */
    private OnBoardingColorStyle f27964d;

    /* renamed from: e */
    private AbstractC10400d.AbstractC10401a f27965e;

    /* renamed from: f */
    private AbstractC10400d f27966f;

    /* renamed from: a */
    public boolean mo22171a() {
        return true;
    }

    /* renamed from: d */
    public FragmentActivity mo39612d() {
        return this.f27962b;
    }

    /* renamed from: e */
    public AbstractC10396b mo39613e() {
        return this.f27961a;
    }

    /* renamed from: a */
    public void mo39607a(OnBoardingColorStyle onBoardingColorStyle) {
        this.f27964d = onBoardingColorStyle;
    }

    /* renamed from: a */
    public void mo39608a(AbstractC10397d<? extends AbstractC10405c> dVar) {
        this.f27963c = dVar;
    }

    /* renamed from: a */
    public void mo39609a(AbstractC10400d.AbstractC10401a aVar) {
        this.f27965e = aVar;
    }

    /* renamed from: a */
    public void mo39610a(AbstractC10400d dVar) {
        this.f27966f = dVar;
    }

    public C10403a(FragmentActivity fragmentActivity, AbstractC10396b bVar) {
        this.f27961a = bVar;
        this.f27962b = fragmentActivity;
    }

    /* renamed from: a */
    public void mo39603a(Window window, C10389b bVar, OnBoardingListener cVar) {
        C10404b a = m43271a(this.f27963c, this.f27961a, cVar, this.f27965e);
        AbstractC10400d dVar = this.f27966f;
        if (dVar != null) {
            dVar.mo39539a(this.f27962b, window, bVar, a, this.f27964d);
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c
    /* renamed from: b */
    public void mo39611b(Window window, C10395e eVar, OnBoardingListener cVar) {
        C10404b a = m43271a(this.f27963c, this.f27961a, cVar, this.f27965e);
        AbstractC10400d dVar = this.f27966f;
        if (dVar != null) {
            dVar.mo39543b(this.f27962b, window, eVar, this.f27964d, a);
        }
    }

    /* renamed from: a */
    public void mo39604a(Window window, C10390c cVar, OnBoardingListener cVar2) {
        C10404b a = m43271a(this.f27963c, this.f27961a, cVar2, this.f27965e);
        AbstractC10400d dVar = this.f27966f;
        if (dVar != null) {
            dVar.mo39540a(this.f27962b, window, cVar, this.f27964d, a);
        }
    }

    /* renamed from: a */
    public void mo39605a(Window window, C10395e eVar, OnBoardingListener cVar) {
        C10404b a = m43271a(this.f27963c, this.f27961a, cVar, this.f27965e);
        AbstractC10400d dVar = this.f27966f;
        if (dVar != null) {
            dVar.mo39541a(this.f27962b, window, eVar, this.f27964d, a);
        }
    }

    /* renamed from: a */
    private C10404b m43271a(AbstractC10397d<? extends AbstractC10405c> dVar, AbstractC10396b bVar, OnBoardingListener cVar, AbstractC10400d.AbstractC10401a aVar) {
        return new C10404b(dVar, bVar, cVar, aVar);
    }

    /* renamed from: a */
    public void mo39606a(Window window, C10395e eVar, String str, OnBoardingListener cVar) {
        C10404b a = m43271a(this.f27963c, this.f27961a, cVar, this.f27965e);
        AbstractC10400d dVar = this.f27966f;
        if (dVar != null) {
            dVar.mo39542a(this.f27962b, window, eVar, str, this.f27964d, a);
        }
    }
}
