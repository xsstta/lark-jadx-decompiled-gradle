package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DisplaySettingFacadeActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185920a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185921a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185922a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m211020a(this, context);
    }

    /* renamed from: b */
    public void mo185923b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185924c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m211018a(this, configuration);
    }

    public AssetManager getAssets() {
        return m211022c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m211019a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m211021b(this);
    }

    /* renamed from: a */
    public static Resources m211019a(DisplaySettingFacadeActivity displaySettingFacadeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displaySettingFacadeActivity);
        }
        return displaySettingFacadeActivity.mo185921a();
    }

    /* renamed from: c */
    public static AssetManager m211022c(DisplaySettingFacadeActivity displaySettingFacadeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displaySettingFacadeActivity);
        }
        return displaySettingFacadeActivity.mo185924c();
    }

    /* renamed from: b */
    public static void m211021b(DisplaySettingFacadeActivity displaySettingFacadeActivity) {
        displaySettingFacadeActivity.mo185923b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DisplaySettingFacadeActivity displaySettingFacadeActivity2 = displaySettingFacadeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    displaySettingFacadeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        getSupportFragmentManager().beginTransaction().add(16908290, new C54366e()).commit();
    }

    /* renamed from: a */
    public static void m211020a(DisplaySettingFacadeActivity displaySettingFacadeActivity, Context context) {
        displaySettingFacadeActivity.mo185922a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displaySettingFacadeActivity);
        }
    }

    /* renamed from: a */
    public static Context m211018a(DisplaySettingFacadeActivity displaySettingFacadeActivity, Configuration configuration) {
        Context a = displaySettingFacadeActivity.mo185920a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
