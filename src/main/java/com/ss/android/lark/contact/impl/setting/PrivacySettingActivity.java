package com.ss.android.lark.contact.impl.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class PrivacySettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C35991b f93041a;

    /* renamed from: a */
    public Context mo132384a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132385a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132386a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m141119a(this, context);
    }

    /* renamed from: b */
    public void mo132387b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132388c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m141117a(this, configuration);
    }

    public AssetManager getAssets() {
        return m141121c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m141118a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m141120b(this);
    }

    /* renamed from: d */
    private void m141122d() {
        C35991b bVar = new C35991b();
        this.f93041a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f93041a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m141122d();
    }

    /* renamed from: a */
    public static Resources m141118a(PrivacySettingActivity privacySettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacySettingActivity);
        }
        return privacySettingActivity.mo132385a();
    }

    /* renamed from: c */
    public static AssetManager m141121c(PrivacySettingActivity privacySettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacySettingActivity);
        }
        return privacySettingActivity.mo132388c();
    }

    /* renamed from: b */
    public static void m141120b(PrivacySettingActivity privacySettingActivity) {
        privacySettingActivity.mo132387b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PrivacySettingActivity privacySettingActivity2 = privacySettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    privacySettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m141119a(PrivacySettingActivity privacySettingActivity, Context context) {
        privacySettingActivity.mo132386a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacySettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m141117a(PrivacySettingActivity privacySettingActivity, Configuration configuration) {
        Context a = privacySettingActivity.mo132384a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f93041a.onActivityResult(i, i2, intent);
    }
}
