package com.bytedance.applog.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SimulateLaunchActivity extends AppCompatActivity {
    /* renamed from: a */
    public Context mo13889a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo13890a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo13891a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m14568a(this, context);
    }

    /* renamed from: b */
    public void mo13892b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo13893c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m14566a(this, configuration);
    }

    public AssetManager getAssets() {
        return m14570c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m14567a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m14569b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }

    /* renamed from: a */
    public static Resources m14567a(SimulateLaunchActivity simulateLaunchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simulateLaunchActivity);
        }
        return simulateLaunchActivity.mo13890a();
    }

    /* renamed from: c */
    public static AssetManager m14570c(SimulateLaunchActivity simulateLaunchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simulateLaunchActivity);
        }
        return simulateLaunchActivity.mo13893c();
    }

    /* renamed from: b */
    public static void m14569b(SimulateLaunchActivity simulateLaunchActivity) {
        simulateLaunchActivity.mo13892b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SimulateLaunchActivity simulateLaunchActivity2 = simulateLaunchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    simulateLaunchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14568a(SimulateLaunchActivity simulateLaunchActivity, Context context) {
        simulateLaunchActivity.mo13891a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simulateLaunchActivity);
        }
    }

    /* renamed from: a */
    public static Context m14566a(SimulateLaunchActivity simulateLaunchActivity, Configuration configuration) {
        Context a = simulateLaunchActivity.mo13889a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
