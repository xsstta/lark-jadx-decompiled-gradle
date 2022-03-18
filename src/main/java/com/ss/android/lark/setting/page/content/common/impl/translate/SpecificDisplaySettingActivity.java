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

public class SpecificDisplaySettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185569a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185570a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185571a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210554a(this, context);
    }

    /* renamed from: b */
    public void mo185572b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185573c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210552a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210556c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210553a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210555b(this);
    }

    /* renamed from: d */
    private void m210557d() {
        C54230b bVar = new C54230b();
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, bVar);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m210557d();
    }

    /* renamed from: a */
    public static Resources m210553a(SpecificDisplaySettingActivity specificDisplaySettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specificDisplaySettingActivity);
        }
        return specificDisplaySettingActivity.mo185570a();
    }

    /* renamed from: c */
    public static AssetManager m210556c(SpecificDisplaySettingActivity specificDisplaySettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specificDisplaySettingActivity);
        }
        return specificDisplaySettingActivity.mo185573c();
    }

    /* renamed from: b */
    public static void m210555b(SpecificDisplaySettingActivity specificDisplaySettingActivity) {
        specificDisplaySettingActivity.mo185572b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SpecificDisplaySettingActivity specificDisplaySettingActivity2 = specificDisplaySettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    specificDisplaySettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210554a(SpecificDisplaySettingActivity specificDisplaySettingActivity, Context context) {
        specificDisplaySettingActivity.mo185571a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specificDisplaySettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210552a(SpecificDisplaySettingActivity specificDisplaySettingActivity, Configuration configuration) {
        Context a = specificDisplaySettingActivity.mo185569a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
