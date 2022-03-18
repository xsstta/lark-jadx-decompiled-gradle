package com.ss.lark.android.passport.biz.feature.login.onekey_login;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.C49018a;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.mvp.OneKeyAuthModel;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.mvp.OneKeyAuthPresenter;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.mvp.OneKeyAuthView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RouterAnno(teaName = "passport_one_click_login_view")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0014J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthActivity;", "Lcom/ss/android/lark/passport/infra/base/architecture/BaseActivity;", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthPresenter;", "()V", "authType", "", "fromGuide", "", "mView", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/mvp/OneKeyAuthView;", "finish", "", "getPageEnterLogEvent", "", "initMvp", "isDoAnimationWithDefault", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OneKeyAuthActivity extends BaseActivity<OneKeyAuthPresenter> {

    /* renamed from: h */
    private int f163477h = 2;

    /* renamed from: i */
    private boolean f163478i;

    /* renamed from: j */
    private OneKeyAuthView f163479j;

    /* renamed from: a */
    public Context mo223773a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254680a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public boolean cA_() {
        return false;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254678a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254682c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254679a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254681b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: u */
    public String mo171149u() {
        return "n_page_onekey_auth_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        OneKeyAuthPresenter bVar = (OneKeyAuthPresenter) this.f123050a;
        if (bVar != null) {
            bVar.cn_();
        }
        super.onDestroy();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        super.finish();
        C49018a.m193088a(this, new C49018a.C49019a(C49018a.f123071g));
    }

    /* renamed from: w */
    private final void m254683w() {
        OneKeyAuthActivity oneKeyAuthActivity = this;
        this.f163479j = new OneKeyAuthView(oneKeyAuthActivity);
        OneKeyAuthModel aVar = new OneKeyAuthModel();
        OneKeyAuthView cVar = this.f163479j;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        int i = this.f163477h;
        boolean z = this.f163478i;
        UniContext uniContext = this.f123055f;
        PassportLog passportLog = this.f123052c;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        OneKeyAuthPresenter bVar = new OneKeyAuthPresenter(oneKeyAuthActivity, aVar, cVar, i, z, uniContext, passportLog);
        bVar.mo171169a();
        this.f123050a = bVar;
    }

    /* renamed from: a */
    public static Resources m254679a(OneKeyAuthActivity oneKeyAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oneKeyAuthActivity);
        }
        return oneKeyAuthActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m254682c(OneKeyAuthActivity oneKeyAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oneKeyAuthActivity);
        }
        return oneKeyAuthActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m254681b(OneKeyAuthActivity oneKeyAuthActivity) {
        oneKeyAuthActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OneKeyAuthActivity oneKeyAuthActivity2 = oneKeyAuthActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    oneKeyAuthActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        C49018a.m193088a(this, new C49018a.C49019a(C49018a.f123070f));
        super.onCreate(bundle);
        PassportLog passportLog = this.f123052c;
        String str = this.f123053d;
        Intrinsics.checkExpressionValueIsNotNull(str, "TAG");
        passportLog.mo171465b(str, "start oneKeyAuth");
        BaseUiContainer.Companion.m252998a(BaseUiContainer.f162611c, this, R.layout.signin_sdk_activity_one_key_login, null, 4, null);
        this.f163477h = getIntent().getIntExtra("auth_type_tag", 2);
        this.f163478i = getIntent().getBooleanExtra("from_guide_tag", false);
        m254683w();
        UniContext uniContext = this.f123055f;
        C40654u uVar = C40654u.f103189l;
        Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…e.ONEKEY_LOGIN_PAGE_ENTRY");
        WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
    }

    /* renamed from: a */
    public static void m254680a(OneKeyAuthActivity oneKeyAuthActivity, Context context) {
        oneKeyAuthActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oneKeyAuthActivity);
        }
    }

    /* renamed from: a */
    public static Context m254678a(OneKeyAuthActivity oneKeyAuthActivity, Configuration configuration) {
        Context a = oneKeyAuthActivity.mo223773a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
