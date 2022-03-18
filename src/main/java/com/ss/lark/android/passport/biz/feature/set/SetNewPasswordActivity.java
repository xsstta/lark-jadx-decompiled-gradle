package com.ss.lark.android.passport.biz.feature.set;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;

@RouterAnno(name = "set_pwd_new", teaName = "passport_pwd_setting_view")
public class SetNewPasswordActivity extends BaseActivity {

    /* renamed from: h */
    private C64965a f163695h;

    /* renamed from: a */
    public Context mo223988a(Configuration configuration) {
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
        m255079a(this, context);
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
        return m255077a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255081c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255078a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255080b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: u */
    public String mo171149u() {
        return "n_page_set_pwd_start";
    }

    /* renamed from: w */
    private void m255082w() {
        C64965a aVar = new C64965a();
        this.f163695h = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f163695h, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StatusBarUtil.setTransparent(this);
        m255082w();
    }

    /* renamed from: a */
    public static Resources m255078a(SetNewPasswordActivity setNewPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setNewPasswordActivity);
        }
        return setNewPasswordActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255081c(SetNewPasswordActivity setNewPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setNewPasswordActivity);
        }
        return setNewPasswordActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m255080b(SetNewPasswordActivity setNewPasswordActivity) {
        setNewPasswordActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SetNewPasswordActivity setNewPasswordActivity2 = setNewPasswordActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    setNewPasswordActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m255079a(SetNewPasswordActivity setNewPasswordActivity, Context context) {
        setNewPasswordActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setNewPasswordActivity);
        }
    }

    /* renamed from: a */
    public static Context m255077a(SetNewPasswordActivity setNewPasswordActivity, Configuration configuration) {
        Context a = setNewPasswordActivity.mo223988a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
