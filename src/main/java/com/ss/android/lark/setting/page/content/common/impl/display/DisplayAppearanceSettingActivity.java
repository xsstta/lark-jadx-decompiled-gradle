package com.ss.android.lark.setting.page.content.common.impl.display;

import android.content.Context;
import android.content.Intent;
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/display/DisplayAppearanceSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class DisplayAppearanceSettingActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo185408a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185409a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo185410a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210292a(this, context);
    }

    /* renamed from: b */
    public void mo185411b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185412c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210290a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210294c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210291a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210293b(this);
    }

    /* renamed from: d */
    private final void m210295d() {
        DisplayAppearanceSettingFragment aVar = new DisplayAppearanceSettingFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m210295d();
    }

    /* renamed from: a */
    public static Resources m210291a(DisplayAppearanceSettingActivity displayAppearanceSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displayAppearanceSettingActivity);
        }
        return displayAppearanceSettingActivity.mo185409a();
    }

    /* renamed from: c */
    public static AssetManager m210294c(DisplayAppearanceSettingActivity displayAppearanceSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displayAppearanceSettingActivity);
        }
        return displayAppearanceSettingActivity.mo185412c();
    }

    /* renamed from: b */
    public static void m210293b(DisplayAppearanceSettingActivity displayAppearanceSettingActivity) {
        displayAppearanceSettingActivity.mo185411b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DisplayAppearanceSettingActivity displayAppearanceSettingActivity2 = displayAppearanceSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    displayAppearanceSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m210292a(DisplayAppearanceSettingActivity displayAppearanceSettingActivity, Context context) {
        displayAppearanceSettingActivity.mo185410a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(displayAppearanceSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210290a(DisplayAppearanceSettingActivity displayAppearanceSettingActivity, Configuration configuration) {
        Context a = displayAppearanceSettingActivity.mo185408a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
