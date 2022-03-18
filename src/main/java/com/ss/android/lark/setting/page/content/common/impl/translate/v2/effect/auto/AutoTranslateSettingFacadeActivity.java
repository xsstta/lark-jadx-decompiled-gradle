package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

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

public class AutoTranslateSettingFacadeActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185881a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185882a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185883a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210938a(this, context);
    }

    /* renamed from: b */
    public void mo185884b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185885c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210936a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210940c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210937a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210939b(this);
    }

    /* renamed from: a */
    public static Resources m210937a(AutoTranslateSettingFacadeActivity autoTranslateSettingFacadeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingFacadeActivity);
        }
        return autoTranslateSettingFacadeActivity.mo185882a();
    }

    /* renamed from: c */
    public static AssetManager m210940c(AutoTranslateSettingFacadeActivity autoTranslateSettingFacadeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingFacadeActivity);
        }
        return autoTranslateSettingFacadeActivity.mo185885c();
    }

    /* renamed from: b */
    public static void m210939b(AutoTranslateSettingFacadeActivity autoTranslateSettingFacadeActivity) {
        autoTranslateSettingFacadeActivity.mo185884b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AutoTranslateSettingFacadeActivity autoTranslateSettingFacadeActivity2 = autoTranslateSettingFacadeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    autoTranslateSettingFacadeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        getSupportFragmentManager().beginTransaction().add(16908290, new C54341e()).commit();
    }

    /* renamed from: a */
    public static void m210938a(AutoTranslateSettingFacadeActivity autoTranslateSettingFacadeActivity, Context context) {
        autoTranslateSettingFacadeActivity.mo185883a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingFacadeActivity);
        }
    }

    /* renamed from: a */
    public static Context m210936a(AutoTranslateSettingFacadeActivity autoTranslateSettingFacadeActivity, Configuration configuration) {
        Context a = autoTranslateSettingFacadeActivity.mo185881a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
