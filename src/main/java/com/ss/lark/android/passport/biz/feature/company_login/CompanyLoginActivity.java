package com.ss.lark.android.passport.biz.feature.company_login;

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
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64681a;
import com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64683b;
import com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c;

@RouterAnno(name = "idp_login_page", teaName = "passport_sso_login_view")
public class CompanyLoginActivity extends BaseActivity<C64683b> {

    /* renamed from: h */
    protected CommonUiContainer f163173h;

    /* renamed from: i */
    private C64681a f163174i;

    /* renamed from: a */
    public Context mo223479a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254101a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254099a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254103c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254100a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254102b(this);
    }

    /* renamed from: w */
    public Resources mo223482w() {
        return super.getResources();
    }

    /* renamed from: x */
    public void mo223483x() {
        super.onStop();
    }

    /* renamed from: y */
    public AssetManager mo223484y() {
        return super.getAssets();
    }

    /* renamed from: z */
    private void m254104z() {
        this.f123050a = mo170970c();
        ((C64683b) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C64683b) this.f123050a).cn_();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C64681a mo170969b() {
        if (this.f163174i == null) {
            this.f163174i = new C64681a(getIntent());
        }
        return this.f163174i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C64683b mo170970c() {
        return new C64683b(this, mo170969b(), mo170967a(), this.f123055f, this.f123052c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C64686c mo170967a() {
        return new C64686c(this, this.f163173h);
    }

    /* renamed from: a */
    public static Resources m254100a(CompanyLoginActivity companyLoginActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(companyLoginActivity);
        }
        return companyLoginActivity.mo223482w();
    }

    /* renamed from: c */
    public static AssetManager m254103c(CompanyLoginActivity companyLoginActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(companyLoginActivity);
        }
        return companyLoginActivity.mo223484y();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123052c.mo171465b("n_page_idp_login_start", "enter idp login page");
        this.f163173h = CommonUiContainer.m252970b(this, R.layout.signin_sdk_activity_company_login);
        m254104z();
    }

    /* renamed from: b */
    public static void m254102b(CompanyLoginActivity companyLoginActivity) {
        companyLoginActivity.mo223483x();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CompanyLoginActivity companyLoginActivity2 = companyLoginActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    companyLoginActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254101a(CompanyLoginActivity companyLoginActivity, Context context) {
        companyLoginActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(companyLoginActivity);
        }
    }

    /* renamed from: a */
    public static Context m254099a(CompanyLoginActivity companyLoginActivity, Configuration configuration) {
        Context a = companyLoginActivity.mo223479a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
