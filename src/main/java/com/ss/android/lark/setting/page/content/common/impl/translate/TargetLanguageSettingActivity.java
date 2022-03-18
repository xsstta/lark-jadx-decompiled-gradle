package com.ss.android.lark.setting.page.content.common.impl.translate;

import android.content.Context;
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
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54311c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class TargetLanguageSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185576a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185577a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185578a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210565a(this, context);
    }

    /* renamed from: b */
    public void mo185579b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185580c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210563a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210567c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210564a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210566b(this);
    }

    /* renamed from: d */
    private void m210568d() {
        C54311c cVar = new C54311c();
        cVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, cVar);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m210568d();
    }

    /* renamed from: a */
    public static Resources m210564a(TargetLanguageSettingActivity targetLanguageSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(targetLanguageSettingActivity);
        }
        return targetLanguageSettingActivity.mo185577a();
    }

    /* renamed from: c */
    public static AssetManager m210567c(TargetLanguageSettingActivity targetLanguageSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(targetLanguageSettingActivity);
        }
        return targetLanguageSettingActivity.mo185580c();
    }

    /* renamed from: b */
    public static void m210566b(TargetLanguageSettingActivity targetLanguageSettingActivity) {
        targetLanguageSettingActivity.mo185579b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TargetLanguageSettingActivity targetLanguageSettingActivity2 = targetLanguageSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    targetLanguageSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210565a(TargetLanguageSettingActivity targetLanguageSettingActivity, Context context) {
        targetLanguageSettingActivity.mo185578a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(targetLanguageSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210563a(TargetLanguageSettingActivity targetLanguageSettingActivity, Configuration configuration) {
        Context a = targetLanguageSettingActivity.mo185576a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
