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
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageAutoTranslateSettingInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AutoTranslateSettingDetailActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185865a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185866a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185867a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210915a(this, context);
    }

    /* renamed from: b */
    public void mo185868b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185869c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210913a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210917c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210914a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210916b(this);
    }

    /* renamed from: a */
    public static Resources m210914a(AutoTranslateSettingDetailActivity autoTranslateSettingDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingDetailActivity);
        }
        return autoTranslateSettingDetailActivity.mo185866a();
    }

    /* renamed from: c */
    public static AssetManager m210917c(AutoTranslateSettingDetailActivity autoTranslateSettingDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingDetailActivity);
        }
        return autoTranslateSettingDetailActivity.mo185869c();
    }

    /* renamed from: b */
    public static void m210916b(AutoTranslateSettingDetailActivity autoTranslateSettingDetailActivity) {
        autoTranslateSettingDetailActivity.mo185868b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AutoTranslateSettingDetailActivity autoTranslateSettingDetailActivity2 = autoTranslateSettingDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    autoTranslateSettingDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        getSupportFragmentManager().beginTransaction().add(16908290, C54331a.m210946a((LanguageAutoTranslateSettingInfo) getIntent().getParcelableExtra("language_auto_translate_setting_info"))).commit();
    }

    /* renamed from: a */
    public static void m210915a(AutoTranslateSettingDetailActivity autoTranslateSettingDetailActivity, Context context) {
        autoTranslateSettingDetailActivity.mo185867a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoTranslateSettingDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m210913a(AutoTranslateSettingDetailActivity autoTranslateSettingDetailActivity, Configuration configuration) {
        Context a = autoTranslateSettingDetailActivity.mo185865a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
