package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.sso.C65022a;

public class SSOSdkAuthActivity extends BaseActivity {

    /* renamed from: h */
    C65056b f163831h;

    /* renamed from: a */
    public Context mo224136a(Configuration configuration) {
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
        m255411a(this, context);
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
        return m255409a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255414c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255410a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255413b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        C65056b bVar = this.f163831h;
        if (bVar != null) {
            bVar.mo224163e();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C65022a.m255255a("page_dismiss", "sso_sdk_auth");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        if (!m255412a(getIntent().getExtras())) {
            finish();
        } else {
            m255415w();
        }
    }

    /* renamed from: w */
    private void m255415w() {
        C65056b bVar = new C65056b();
        this.f163831h = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f163831h, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m255410a(SSOSdkAuthActivity sSOSdkAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sSOSdkAuthActivity);
        }
        return sSOSdkAuthActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m255414c(SSOSdkAuthActivity sSOSdkAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sSOSdkAuthActivity);
        }
        return sSOSdkAuthActivity.mo170970c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!DesktopUtil.m144301a((Context) this)) {
            mo171132e();
        }
        C65022a.m255255a("page_show", "sso_sdk_auth");
        this.f123052c.mo171460a("n_page_ssosdk_auth_start");
    }

    /* renamed from: b */
    public static void m255413b(SSOSdkAuthActivity sSOSdkAuthActivity) {
        sSOSdkAuthActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SSOSdkAuthActivity sSOSdkAuthActivity2 = sSOSdkAuthActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sSOSdkAuthActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m255412a(Bundle bundle) {
        if (bundle != null) {
            return true;
        }
        this.f123052c.mo171471d("SSOSdkAuthActivity", "checkValidity bundle == null");
        return false;
    }

    /* renamed from: a */
    public static void m255411a(SSOSdkAuthActivity sSOSdkAuthActivity, Context context) {
        sSOSdkAuthActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sSOSdkAuthActivity);
        }
    }

    /* renamed from: a */
    public static Context m255409a(SSOSdkAuthActivity sSOSdkAuthActivity, Configuration configuration) {
        Context a = sSOSdkAuthActivity.mo224136a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
