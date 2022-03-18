package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuidePresenter;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "rootView", "Landroid/view/View;", "finishAct", "", "initMVP", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openMainAct", "openUrl", "url", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.d */
public final class LdrGuideFragment extends BaseFragment {

    /* renamed from: a */
    public View f99213a;

    /* renamed from: b */
    private HashMap f99214b;

    /* renamed from: c */
    public void mo141427c() {
        HashMap hashMap = this.f99214b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo141427c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideFragment$initMVP$view$1", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$ViewDependency;", "teamName", "", "getTeamName", "()Ljava/lang/String;", "hideBack", "", "rootView", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.d$b */
    public static final class C38608b implements LdrGuideView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ LdrGuideFragment f99216a;

        /* renamed from: b */
        private final String f99217b;

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView.ViewDependency
        /* renamed from: c */
        public String mo141433c() {
            return this.f99217b;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView.ViewDependency
        /* renamed from: a */
        public View mo141431a() {
            return this.f99216a.f99213a;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView.ViewDependency
        /* renamed from: b */
        public boolean mo141432b() {
            FragmentActivity activity = this.f99216a.getActivity();
            if (activity instanceof LdrActConfig) {
                return ((LdrActConfig) activity).mo141392a();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38608b(LdrGuideFragment dVar) {
            String str;
            this.f99216a = dVar;
            FragmentActivity activity = dVar.getActivity();
            if (activity instanceof LdrActConfig) {
                str = ((LdrActConfig) activity).mo141393b();
            } else {
                str = null;
            }
            this.f99217b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideFragment$initMVP$presenter$1", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuidePresenter$PresenterDependency;", "onBackClick", "", "onButtonClick", "onDoneClick", "openLdrLink", "link", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.d$a */
    public static final class C38607a implements LdrGuidePresenter.PresenterDependency {

        /* renamed from: a */
        final /* synthetic */ LdrGuideFragment f99215a;

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuidePresenter.PresenterDependency
        /* renamed from: a */
        public void mo141428a() {
            this.f99215a.mo141426b();
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuidePresenter.PresenterDependency
        /* renamed from: b */
        public void mo141429b() {
            this.f99215a.mo141425a();
            this.f99215a.mo141426b();
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuidePresenter.PresenterDependency
        /* renamed from: c */
        public void mo141430c() {
            this.f99215a.mo141425a();
            this.f99215a.mo141426b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38607a(LdrGuideFragment dVar) {
            this.f99215a = dVar;
        }
    }

    /* renamed from: b */
    public final void mo141426b() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo141425a() {
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        a.mo141262l().mo141277a(null, new Bundle(), false);
    }

    /* renamed from: d */
    private final void m152317d() {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        new LdrGuidePresenter(new LdrGuideModel(), new LdrGuideView(requireContext, new C38608b(this)), new C38607a(this)).create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m152317d();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.guide_ldr_page, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.f99213a = inflate;
        return inflate;
    }
}
