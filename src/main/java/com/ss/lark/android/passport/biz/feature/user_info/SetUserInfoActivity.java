package com.ss.lark.android.passport.biz.feature.user_info;

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
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65095d;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65097e;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65103f;

@RouterAnno(name = "set_personal_info", teaName = "passport_user_info_setting_view")
public class SetUserInfoActivity extends BaseActivity<C65097e> {

    /* renamed from: h */
    private C65095d f163902h;

    /* renamed from: i */
    private CommonUiContainer f163903i;

    /* renamed from: a */
    public Context mo224226a(Configuration configuration) {
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
        m255595a(this, context);
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
        return m255593a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255597c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255594a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255596b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: u */
    public String mo171149u() {
        return "n_page_set_user_info_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C65097e) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: x */
    private C65095d m255599x() {
        if (this.f163902h == null) {
            this.f163902h = new C65095d(getIntent());
        }
        return this.f163902h;
    }

    /* renamed from: w */
    private void m255598w() {
        C65103f fVar = new C65103f(this, getSupportFragmentManager(), this.f163903i);
        C65095d x = m255599x();
        this.f163902h = x;
        this.f123050a = new C65097e(this, x, fVar, this.f123055f, this.f123052c);
        ((C65097e) this.f123050a).mo171169a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f163903i = CommonUiContainer.m252970b(this, R.layout.signin_sdk_activity_set_user_info);
        m255598w();
    }

    /* renamed from: a */
    public static Resources m255594a(SetUserInfoActivity setUserInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setUserInfoActivity);
        }
        return setUserInfoActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255597c(SetUserInfoActivity setUserInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setUserInfoActivity);
        }
        return setUserInfoActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m255596b(SetUserInfoActivity setUserInfoActivity) {
        setUserInfoActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SetUserInfoActivity setUserInfoActivity2 = setUserInfoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    setUserInfoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m255595a(SetUserInfoActivity setUserInfoActivity, Context context) {
        setUserInfoActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(setUserInfoActivity);
        }
    }

    /* renamed from: a */
    public static Context m255593a(SetUserInfoActivity setUserInfoActivity, Configuration configuration) {
        Context a = setUserInfoActivity.mo224226a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
