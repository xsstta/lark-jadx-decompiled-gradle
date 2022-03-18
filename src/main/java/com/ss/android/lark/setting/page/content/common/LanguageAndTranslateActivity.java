package com.ss.android.lark.setting.page.content.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LanguageAndTranslateActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private Fragment f134047a;

    /* renamed from: a */
    public Context mo185329a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185330a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185331a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210212a(this, context);
    }

    /* renamed from: b */
    public void mo185332b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185333c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210210a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210214c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210211a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210213b(this);
    }

    /* renamed from: d */
    private void m210215d() {
        C54160c cVar = new C54160c();
        this.f134047a = cVar;
        cVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f134047a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m210215d();
    }

    /* renamed from: a */
    public static Resources m210211a(LanguageAndTranslateActivity languageAndTranslateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(languageAndTranslateActivity);
        }
        return languageAndTranslateActivity.mo185330a();
    }

    /* renamed from: c */
    public static AssetManager m210214c(LanguageAndTranslateActivity languageAndTranslateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(languageAndTranslateActivity);
        }
        return languageAndTranslateActivity.mo185333c();
    }

    /* renamed from: b */
    public static void m210213b(LanguageAndTranslateActivity languageAndTranslateActivity) {
        languageAndTranslateActivity.mo185332b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LanguageAndTranslateActivity languageAndTranslateActivity2 = languageAndTranslateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    languageAndTranslateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210212a(LanguageAndTranslateActivity languageAndTranslateActivity, Context context) {
        languageAndTranslateActivity.mo185331a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(languageAndTranslateActivity);
        }
    }

    /* renamed from: a */
    public static Context m210210a(LanguageAndTranslateActivity languageAndTranslateActivity, Configuration configuration) {
        Context a = languageAndTranslateActivity.mo185329a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f134047a;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
