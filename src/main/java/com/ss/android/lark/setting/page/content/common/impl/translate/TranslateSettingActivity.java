package com.ss.android.lark.setting.page.content.common.impl.translate;

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
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54309b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class TranslateSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185593a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185594a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185595a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210589a(this, context);
    }

    /* renamed from: b */
    public void mo185596b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185597c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210587a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210591c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210588a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210590b(this);
    }

    /* renamed from: d */
    private void m210592d() {
        C54309b bVar = new C54309b();
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, bVar);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m210592d();
    }

    /* renamed from: a */
    public static Resources m210588a(TranslateSettingActivity translateSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(translateSettingActivity);
        }
        return translateSettingActivity.mo185594a();
    }

    /* renamed from: c */
    public static AssetManager m210591c(TranslateSettingActivity translateSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(translateSettingActivity);
        }
        return translateSettingActivity.mo185597c();
    }

    /* renamed from: b */
    public static void m210590b(TranslateSettingActivity translateSettingActivity) {
        translateSettingActivity.mo185596b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TranslateSettingActivity translateSettingActivity2 = translateSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    translateSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210589a(TranslateSettingActivity translateSettingActivity, Context context) {
        translateSettingActivity.mo185595a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(translateSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210587a(TranslateSettingActivity translateSettingActivity, Configuration configuration) {
        Context a = translateSettingActivity.mo185593a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
