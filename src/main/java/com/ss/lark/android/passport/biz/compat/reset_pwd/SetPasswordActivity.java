package com.ss.lark.android.passport.biz.compat.reset_pwd;

import android.content.Context;
import android.content.Intent;
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
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.C49018a;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.compat.reset_pwd.mvp.SetPasswordModel;
import com.ss.lark.android.passport.biz.compat.reset_pwd.mvp.SetPasswordView;
import com.ss.lark.android.passport.biz.compat.reset_pwd.p3212a.C64433b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/SetPasswordActivity;", "Lcom/ss/android/lark/passport/infra/base/architecture/BaseActivity;", "Lcom/ss/lark/android/passport/biz/compat/reset_pwd/mvp/SetPasswordPresenter;", "()V", "view", "Lcom/ss/lark/android/passport/biz/compat/reset_pwd/mvp/SetPasswordView;", "getEnterAnimationConfig", "Lcom/ss/android/lark/passport/infra/base/architecture/AnimationManager$AnimationConfig;", "getExitAnimationConfig", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
@RouterAnno(name = "set_pwd", teaName = "password_reset_input")
@Deprecated(message = "see SetNewPasswordActivity")
public class SetPasswordActivity extends BaseActivity<C64433b> {

    /* renamed from: h */
    private SetPasswordView f162735h;

    /* renamed from: a */
    public Context mo222996a(Configuration configuration) {
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
        m253208a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m253206a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253210c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253207a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253209b(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: q */
    public C49018a.C49019a mo171145q() {
        return new C49018a.C49019a(C49018a.f123068d);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: r */
    public C49018a.C49019a mo171146r() {
        return new C49018a.C49019a(C49018a.f123069e);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        C64433b bVar = (C64433b) this.f123050a;
        if (bVar != null) {
            bVar.cn_();
        }
        super.onDestroy();
    }

    /* renamed from: w */
    private final void m253211w() {
        Intent intent = getIntent();
        if (intent != null) {
            SetPasswordActivity setPasswordActivity = this;
            this.f162735h = new SetPasswordView(setPasswordActivity);
            C64433b bVar = new C64433b(setPasswordActivity, new SetPasswordModel(intent), this.f162735h, this.f123055f, this.f123052c);
            bVar.mo171169a();
            this.f123050a = bVar;
        }
        if (intent == null) {
            PassportLog passportLog = this.f123052c;
            String str = this.f123053d;
            Intrinsics.checkExpressionValueIsNotNull(str, "TAG");
            passportLog.mo171465b(str, "intent is null");
        }
    }

    /* renamed from: a */
    public static Resources m253207a(SetPasswordActivity setPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setPasswordActivity);
        }
        return setPasswordActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m253210c(SetPasswordActivity setPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setPasswordActivity);
        }
        return setPasswordActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.signin_sdk_set_pwd);
        getWindow().setSoftInputMode(16);
        m253211w();
    }

    /* renamed from: b */
    public static void m253209b(SetPasswordActivity setPasswordActivity) {
        setPasswordActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SetPasswordActivity setPasswordActivity2 = setPasswordActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    setPasswordActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253208a(SetPasswordActivity setPasswordActivity, Context context) {
        setPasswordActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setPasswordActivity);
        }
    }

    /* renamed from: a */
    public static Context m253206a(SetPasswordActivity setPasswordActivity, Configuration configuration) {
        Context a = setPasswordActivity.mo222996a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
