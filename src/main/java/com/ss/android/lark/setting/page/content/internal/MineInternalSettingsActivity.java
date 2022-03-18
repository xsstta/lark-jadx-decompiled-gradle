package com.ss.android.lark.setting.page.content.internal;

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
import com.ss.android.lark.setting.page.content.internal.mvp.C54543b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MineInternalSettingsActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo186361a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186362a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186363a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211568a(this, context);
    }

    /* renamed from: b */
    public void mo186364b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186365c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211566a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211570c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211567a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211569b(this);
    }

    /* renamed from: d */
    private void m211571d() {
        C54543b bVar = new C54543b();
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, bVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m211571d();
    }

    /* renamed from: a */
    public static Resources m211567a(MineInternalSettingsActivity mineInternalSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineInternalSettingsActivity);
        }
        return mineInternalSettingsActivity.mo186362a();
    }

    /* renamed from: c */
    public static AssetManager m211570c(MineInternalSettingsActivity mineInternalSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineInternalSettingsActivity);
        }
        return mineInternalSettingsActivity.mo186365c();
    }

    /* renamed from: b */
    public static void m211569b(MineInternalSettingsActivity mineInternalSettingsActivity) {
        mineInternalSettingsActivity.mo186364b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MineInternalSettingsActivity mineInternalSettingsActivity2 = mineInternalSettingsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mineInternalSettingsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m211568a(MineInternalSettingsActivity mineInternalSettingsActivity, Context context) {
        mineInternalSettingsActivity.mo186363a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineInternalSettingsActivity);
        }
    }

    /* renamed from: a */
    public static Context m211566a(MineInternalSettingsActivity mineInternalSettingsActivity, Configuration configuration) {
        Context a = mineInternalSettingsActivity.mo186361a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
