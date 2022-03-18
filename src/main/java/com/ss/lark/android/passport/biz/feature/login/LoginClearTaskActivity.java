package com.ss.lark.android.passport.biz.feature.login;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity;

public class LoginClearTaskActivity extends LoginInputActivity {
    /* renamed from: a */
    public Context mo223746a(Configuration configuration) {
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
        m254627a(this, context);
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
        return m254625a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254629c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254626a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254628b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity, com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity, com.larksuite.component.air.AirActivity, com.ss.lark.android.passport.biz.feature.login_register_base.LoginRegisterBaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static Resources m254626a(LoginClearTaskActivity loginClearTaskActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(loginClearTaskActivity);
        }
        return loginClearTaskActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m254629c(LoginClearTaskActivity loginClearTaskActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(loginClearTaskActivity);
        }
        return loginClearTaskActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m254628b(LoginClearTaskActivity loginClearTaskActivity) {
        loginClearTaskActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LoginClearTaskActivity loginClearTaskActivity2 = loginClearTaskActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    loginClearTaskActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m254627a(LoginClearTaskActivity loginClearTaskActivity, Context context) {
        loginClearTaskActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(loginClearTaskActivity);
        }
    }

    /* renamed from: a */
    public static Context m254625a(LoginClearTaskActivity loginClearTaskActivity, Configuration configuration) {
        Context a = loginClearTaskActivity.mo223746a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
