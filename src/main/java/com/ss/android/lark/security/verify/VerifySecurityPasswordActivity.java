package com.ss.android.lark.security.verify;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.util.C49145aa;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class VerifySecurityPasswordActivity extends BaseActivity {

    /* renamed from: h */
    private C54093b f133890h;

    /* renamed from: a */
    public Context mo185121a(Configuration configuration) {
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
        m209861a(this, context);
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
        return m209858a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: f */
    public boolean mo171133f() {
        return true;
    }

    public AssetManager getAssets() {
        return m209863c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m209859a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m209862b(this);
    }

    /* renamed from: a */
    public static Resources m209859a(VerifySecurityPasswordActivity verifySecurityPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(verifySecurityPasswordActivity);
        }
        return verifySecurityPasswordActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m209863c(VerifySecurityPasswordActivity verifySecurityPasswordActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(verifySecurityPasswordActivity);
        }
        return verifySecurityPasswordActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m209862b(VerifySecurityPasswordActivity verifySecurityPasswordActivity) {
        verifySecurityPasswordActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VerifySecurityPasswordActivity verifySecurityPasswordActivity2 = verifySecurityPasswordActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    verifySecurityPasswordActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C49145aa.m193799b(this, getWindow(), R.color.color_transparent_30_percent_black);
        setContentView(R.layout.activity_verify_security_password);
        this.f133890h = (C54093b) Fragment.instantiate(this, C54093b.class.getName(), mo171127a(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f133890h).commit();
    }

    /* renamed from: a */
    public static void m209861a(VerifySecurityPasswordActivity verifySecurityPasswordActivity, Context context) {
        verifySecurityPasswordActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(verifySecurityPasswordActivity);
        }
    }

    /* renamed from: a */
    public static Context m209858a(VerifySecurityPasswordActivity verifySecurityPasswordActivity, Configuration configuration) {
        Context a = verifySecurityPasswordActivity.mo185121a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m209860a(Context context, String str, String str2) {
        Intent intent = new Intent(context, VerifySecurityPasswordActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.addFlags(65536);
        intent.putExtra("mini_app_id", str);
        intent.putExtra("mini_app_callback_id", str2);
        context.startActivity(intent);
    }
}
