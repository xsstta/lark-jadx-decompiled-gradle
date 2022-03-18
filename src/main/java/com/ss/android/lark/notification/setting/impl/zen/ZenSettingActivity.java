package com.ss.android.lark.notification.setting.impl.zen;

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

public class ZenSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo169859a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169860a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169861a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m191811a(this, context);
    }

    /* renamed from: b */
    public void mo169862b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169863c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m191809a(this, configuration);
    }

    public AssetManager getAssets() {
        return m191813c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m191810a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m191812b(this);
    }

    /* renamed from: d */
    private void m191814d() {
        C48680b bVar = new C48680b();
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, bVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m191814d();
    }

    /* renamed from: a */
    public static Resources m191810a(ZenSettingActivity zenSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(zenSettingActivity);
        }
        return zenSettingActivity.mo169860a();
    }

    /* renamed from: c */
    public static AssetManager m191813c(ZenSettingActivity zenSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(zenSettingActivity);
        }
        return zenSettingActivity.mo169863c();
    }

    /* renamed from: b */
    public static void m191812b(ZenSettingActivity zenSettingActivity) {
        zenSettingActivity.mo169862b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ZenSettingActivity zenSettingActivity2 = zenSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    zenSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m191811a(ZenSettingActivity zenSettingActivity, Context context) {
        zenSettingActivity.mo169861a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(zenSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m191809a(ZenSettingActivity zenSettingActivity, Configuration configuration) {
        Context a = zenSettingActivity.mo169859a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
