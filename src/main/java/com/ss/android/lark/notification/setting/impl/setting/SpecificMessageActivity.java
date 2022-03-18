package com.ss.android.lark.notification.setting.impl.setting;

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

public class SpecificMessageActivity extends BaseFragmentActivity {

    /* renamed from: a */
    SpecificMessageFragment f122242a;

    /* renamed from: a */
    public Context mo169708a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169709a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169710a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m191574a(this, context);
    }

    /* renamed from: b */
    public void mo169711b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169712c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m191572a(this, configuration);
    }

    public AssetManager getAssets() {
        return m191576c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m191573a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m191575b(this);
    }

    /* renamed from: d */
    private void m191577d() {
        SpecificMessageFragment specificMessageFragment = new SpecificMessageFragment();
        this.f122242a = specificMessageFragment;
        specificMessageFragment.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f122242a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m191577d();
    }

    /* renamed from: a */
    public static Resources m191573a(SpecificMessageActivity specificMessageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specificMessageActivity);
        }
        return specificMessageActivity.mo169709a();
    }

    /* renamed from: c */
    public static AssetManager m191576c(SpecificMessageActivity specificMessageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specificMessageActivity);
        }
        return specificMessageActivity.mo169712c();
    }

    /* renamed from: b */
    public static void m191575b(SpecificMessageActivity specificMessageActivity) {
        specificMessageActivity.mo169711b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SpecificMessageActivity specificMessageActivity2 = specificMessageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    specificMessageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m191574a(SpecificMessageActivity specificMessageActivity, Context context) {
        specificMessageActivity.mo169710a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(specificMessageActivity);
        }
    }

    /* renamed from: a */
    public static Context m191572a(SpecificMessageActivity specificMessageActivity, Configuration configuration) {
        Context a = specificMessageActivity.mo169708a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SpecificMessageFragment specificMessageFragment = this.f122242a;
        if (specificMessageFragment != null) {
            specificMessageFragment.onActivityResult(i, i2, intent);
        }
    }
}
