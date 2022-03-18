package com.ss.lark.android.passport.biz.feature.google_login.mvp;

import android.app.Activity;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.google_login.mvp.IGoogleLoginContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/GoogleLoginView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseView;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView$Delegate;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView;", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getMContext", "()Landroid/app/Activity;", "viewDelegate", "create", "", "destroy", "finishActivity", "hideLoadingView", "routeTo", "stepData", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "callback", "Lkotlin/Function0;", "setViewDelegate", "showLoadingView", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.c */
public final class GoogleLoginView extends AbstractC49023c<IGoogleLoginContract.IView.Delegate> implements IGoogleLoginContract.IView {

    /* renamed from: c */
    private IGoogleLoginContract.IView.Delegate f163351c;

    /* renamed from: d */
    private final Activity f163352d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
    }

    @Override // com.ss.lark.android.passport.biz.feature.google_login.mvp.IGoogleLoginContract.IView
    /* renamed from: f */
    public void mo223656f() {
        this.f163352d.finish();
    }

    @Override // com.ss.lark.android.passport.biz.feature.google_login.mvp.IGoogleLoginContract.IView
    /* renamed from: d */
    public void mo223654d() {
        Activity activity = this.f163352d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.google_login.mvp.IGoogleLoginContract.IView
    /* renamed from: e */
    public void mo223655e() {
        Activity activity = this.f163352d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    public GoogleLoginView(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        this.f163352d = activity;
    }

    /* renamed from: a */
    public void mo171188a(IGoogleLoginContract.IView.Delegate aVar) {
        this.f163351c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "code", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "onRouterResult"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.c$a */
    static final class C64777a implements AbstractC49336a {

        /* renamed from: a */
        final /* synthetic */ Function0 f163353a;

        C64777a(Function0 function0) {
            this.f163353a = function0;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
        public final void onRouterResult(int i, Object obj) {
            this.f163353a.invoke();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.google_login.mvp.IGoogleLoginContract.IView
    /* renamed from: a */
    public void mo223652a(BaseStepData baseStepData, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(baseStepData, "stepData");
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        C49092f.m193529a(this.f163352d, baseStepData, RouterScene.ALL.value, this.f123084a, this.f123085b, new C64777a(function0));
    }
}
