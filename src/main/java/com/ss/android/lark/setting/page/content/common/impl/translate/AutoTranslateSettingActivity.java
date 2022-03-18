package com.ss.android.lark.setting.page.content.common.impl.translate;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AutoTranslateSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185562a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185563a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185564a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210543a(this, context);
    }

    /* renamed from: b */
    public void mo185565b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185566c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210541a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210545c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210542a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210544b(this);
    }

    /* renamed from: d */
    private void m210546d() {
        C54224a aVar = new C54224a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, aVar);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m210546d();
    }

    /* renamed from: a */
    public static Resources m210542a(AutoTranslateSettingActivity autoTranslateSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingActivity);
        }
        return autoTranslateSettingActivity.mo185563a();
    }

    /* renamed from: c */
    public static AssetManager m210545c(AutoTranslateSettingActivity autoTranslateSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingActivity);
        }
        return autoTranslateSettingActivity.mo185566c();
    }

    /* renamed from: b */
    public static void m210544b(AutoTranslateSettingActivity autoTranslateSettingActivity) {
        autoTranslateSettingActivity.mo185565b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AutoTranslateSettingActivity autoTranslateSettingActivity2 = autoTranslateSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    autoTranslateSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210543a(AutoTranslateSettingActivity autoTranslateSettingActivity, Context context) {
        autoTranslateSettingActivity.mo185564a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210541a(AutoTranslateSettingActivity autoTranslateSettingActivity, Configuration configuration) {
        Context a = autoTranslateSettingActivity.mo185562a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
