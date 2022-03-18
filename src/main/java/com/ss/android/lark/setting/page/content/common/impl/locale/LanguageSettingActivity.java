package com.ss.android.lark.setting.page.content.common.impl.locale;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LanguageSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185479a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185480a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185481a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210383a(this, context);
    }

    /* renamed from: b */
    public void mo185482b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185483c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210381a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210385c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210382a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210384b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    private void m210386d() {
        C54181a aVar = new C54181a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m210382a(LanguageSettingActivity languageSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(languageSettingActivity);
        }
        return languageSettingActivity.mo185480a();
    }

    /* renamed from: c */
    public static AssetManager m210385c(LanguageSettingActivity languageSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(languageSettingActivity);
        }
        return languageSettingActivity.mo185483c();
    }

    /* renamed from: b */
    public static void m210384b(LanguageSettingActivity languageSettingActivity) {
        languageSettingActivity.mo185482b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LanguageSettingActivity languageSettingActivity2 = languageSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    languageSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("LanguageSettingActivity").mo168688b();
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        C48211b.m190251a().mo168689b("setupFragment");
        m210386d();
        C48211b.m190251a().mo168691c("setupFragment");
    }

    /* renamed from: a */
    public static void m210383a(LanguageSettingActivity languageSettingActivity, Context context) {
        languageSettingActivity.mo185481a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(languageSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210381a(LanguageSettingActivity languageSettingActivity, Configuration configuration) {
        Context a = languageSettingActivity.mo185479a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
