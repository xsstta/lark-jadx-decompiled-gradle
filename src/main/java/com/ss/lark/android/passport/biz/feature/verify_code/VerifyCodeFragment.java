package com.ss.lark.android.passport.biz.feature.verify_code;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65140c;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RouterAnno(watcherName = "verify_code")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002¨\u0006\""}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/verify_code/VerifyCodeFragment;", "Lcom/ss/android/lark/passport/infra/base/architecture/BaseFragment;", "()V", "TAG", "", "changePageAction", "Lcom/ss/lark/android/passport/biz/feature/verify_code/IChangePage;", "mPresenter", "Lcom/ss/lark/android/passport/biz/feature/verify_code/mvp/VerifyCodePresenter;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/lark/android/passport/biz/feature/verify_code/mvp/VerifyCodeView$ViewDependency;", "model", "Lcom/ss/lark/android/passport/biz/feature/verify_code/mvp/VerifyCodeModel;", "uiContainer", "Lcom/ss/lark/android/passport/biz/base/ui/CommonUiContainer;", "verifyType", "verifyType$annotations", "getWatcherTagName", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setChangePage", "changePage", "setVerifyType", "verifyCodeType", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.b */
public final class VerifyCodeFragment extends C49029b {

    /* renamed from: e */
    public IChangePage f164019e;

    /* renamed from: f */
    public String f164020f;

    /* renamed from: g */
    public CommonUiContainer f164021g;

    /* renamed from: h */
    public C65140c f164022h;

    /* renamed from: i */
    private final String f164023i = "VerifyCodeFragment";

    /* renamed from: j */
    private View f164024j;

    /* renamed from: k */
    private C65142d f164025k;

    /* renamed from: l */
    private final VerifyCodeView.AbstractC65134b f164026l = new C65123a(this);

    /* renamed from: m */
    private HashMap f164027m;

    /* renamed from: d */
    public void mo185117d() {
        HashMap hashMap = this.f164027m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return this.f164023i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/lark/android/passport/biz/feature/verify_code/VerifyCodeFragment$mViewDependency$1", "Lcom/ss/lark/android/passport/biz/feature/verify_code/mvp/VerifyCodeView$ViewDependency;", "changeCodePage", "", "changeOtpPage", "changePwdPage", "changebackUpPhonePage", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.b$a */
    public static final class C65123a implements VerifyCodeView.AbstractC65134b {

        /* renamed from: a */
        final /* synthetic */ VerifyCodeFragment f164028a;

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.AbstractC65134b
        /* renamed from: b */
        public void mo224314b() {
            IChangePage aVar = this.f164028a.f164019e;
            if (aVar != null) {
                aVar.mo170970c();
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.AbstractC65134b
        /* renamed from: c */
        public void mo224315c() {
            IChangePage aVar = this.f164028a.f164019e;
            if (aVar != null) {
                aVar.mo224310d();
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.AbstractC65134b
        /* renamed from: d */
        public void mo224316d() {
            IChangePage aVar = this.f164028a.f164019e;
            if (aVar != null) {
                aVar.mo170969b();
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.VerifyCodeView.AbstractC65134b
        /* renamed from: a */
        public void mo224313a() {
            VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean;
            String str = this.f164028a.f164020f;
            C65140c cVar = this.f164028a.f164022h;
            if (cVar != null) {
                verifyIdentifyBean = cVar.mo224347c();
            } else {
                verifyIdentifyBean = null;
            }
            VerifyCodeStatisticsHelper.m255793a(str, verifyIdentifyBean);
            IChangePage aVar = this.f164028a.f164019e;
            if (aVar != null) {
                aVar.mo170967a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65123a(VerifyCodeFragment bVar) {
            this.f164028a = bVar;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C65142d dVar = this.f164025k;
        if (dVar != null) {
            dVar.cn_();
        }
        mo185117d();
    }

    /* renamed from: e */
    private final void m255784e() {
        FragmentActivity activity = getActivity();
        VerifyCodeView.AbstractC65134b bVar = this.f164026l;
        CommonUiContainer commonUiContainer = this.f164021g;
        if (commonUiContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiContainer");
        }
        VerifyCodeView verifyCodeView = new VerifyCodeView(activity, bVar, commonUiContainer);
        verifyCodeView.mo224322a(this.f164020f);
        VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean = null;
        VerifyIdentityStepInfo verifyIdentityStepInfo = null;
        Bundle arguments = getArguments();
        if (arguments != null) {
            verifyIdentityStepInfo = (VerifyIdentityStepInfo) arguments.getSerializable("verify_step_info");
        }
        this.f164022h = new C65140c(verifyIdentityStepInfo, this.f164020f);
        C65142d dVar = new C65142d(getActivity(), this.f164022h, verifyCodeView, this.f123086a, this.f123087b);
        this.f164025k = dVar;
        if (dVar != null) {
            dVar.mo171169a();
        }
        VerifyCodeStatisticsHelper cVar = VerifyCodeStatisticsHelper.f164029a;
        String str = this.f164020f;
        C65140c cVar2 = this.f164022h;
        if (cVar2 != null) {
            verifyIdentifyBean = cVar2.mo224347c();
        }
        cVar.mo224318c(str, verifyIdentifyBean);
        this.f123087b.mo171460a("n_page_verify_code_start");
    }

    /* renamed from: a */
    public final void mo224311a(IChangePage aVar) {
        this.f164019e = aVar;
    }

    /* renamed from: a */
    public final void mo224312a(String str) {
        this.f164020f = str;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (this.f164021g == null) {
            CommonUiContainer.Companion aVar = CommonUiContainer.f162599j;
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            this.f164021g = CommonUiContainer.Companion.m252991a(aVar, requireActivity, R.layout.signin_sdk_fragment_verify_code, viewGroup, false, null, 16, null);
        }
        CommonUiContainer commonUiContainer = this.f164021g;
        if (commonUiContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiContainer");
        }
        this.f164024j = commonUiContainer.f162613b;
        m255784e();
        return this.f164024j;
    }
}
