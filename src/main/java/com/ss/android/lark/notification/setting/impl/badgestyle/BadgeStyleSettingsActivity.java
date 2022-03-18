package com.ss.android.lark.notification.setting.impl.badgestyle;

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

public class BadgeStyleSettingsActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C48583a f122221a;

    /* renamed from: a */
    public Context mo169671a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169672a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169673a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m191510a(this, context);
    }

    /* renamed from: b */
    public void mo169674b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169675c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m191508a(this, configuration);
    }

    public AssetManager getAssets() {
        return m191512c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m191509a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m191511b(this);
    }

    /* renamed from: d */
    private void m191513d() {
        C48583a aVar = new C48583a();
        this.f122221a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f122221a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m191513d();
    }

    /* renamed from: a */
    public static Resources m191509a(BadgeStyleSettingsActivity badgeStyleSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(badgeStyleSettingsActivity);
        }
        return badgeStyleSettingsActivity.mo169672a();
    }

    /* renamed from: c */
    public static AssetManager m191512c(BadgeStyleSettingsActivity badgeStyleSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(badgeStyleSettingsActivity);
        }
        return badgeStyleSettingsActivity.mo169675c();
    }

    /* renamed from: b */
    public static void m191511b(BadgeStyleSettingsActivity badgeStyleSettingsActivity) {
        badgeStyleSettingsActivity.mo169674b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BadgeStyleSettingsActivity badgeStyleSettingsActivity2 = badgeStyleSettingsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    badgeStyleSettingsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m191510a(BadgeStyleSettingsActivity badgeStyleSettingsActivity, Context context) {
        badgeStyleSettingsActivity.mo169673a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(badgeStyleSettingsActivity);
        }
    }

    /* renamed from: a */
    public static Context m191508a(BadgeStyleSettingsActivity badgeStyleSettingsActivity, Configuration configuration) {
        Context a = badgeStyleSettingsActivity.mo169671a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
