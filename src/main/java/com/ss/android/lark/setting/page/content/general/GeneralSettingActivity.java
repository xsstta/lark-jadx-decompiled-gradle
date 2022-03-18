package com.ss.android.lark.setting.page.content.general;

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
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class GeneralSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo186070a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186071a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186072a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211242a(this, context);
    }

    /* renamed from: b */
    public void mo186073b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186074c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211240a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211244c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211241a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211243b(this);
    }

    /* renamed from: d */
    private void m211245d() {
        C54437c cVar = new C54437c();
        cVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, cVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m211245d();
    }

    /* renamed from: a */
    public static Resources m211241a(GeneralSettingActivity generalSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(generalSettingActivity);
        }
        return generalSettingActivity.mo186071a();
    }

    /* renamed from: c */
    public static AssetManager m211244c(GeneralSettingActivity generalSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(generalSettingActivity);
        }
        return generalSettingActivity.mo186074c();
    }

    /* renamed from: b */
    public static void m211243b(GeneralSettingActivity generalSettingActivity) {
        generalSettingActivity.mo186073b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GeneralSettingActivity generalSettingActivity2 = generalSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    generalSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m211242a(GeneralSettingActivity generalSettingActivity, Context context) {
        generalSettingActivity.mo186072a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(generalSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m211240a(GeneralSettingActivity generalSettingActivity, Configuration configuration) {
        Context a = generalSettingActivity.mo186070a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
