package com.ss.android.lark.feed.app.delayed;

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

public class DelayedFeedActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo137467a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo137468a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo137469a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m147475a(this, context);
    }

    /* renamed from: b */
    public void mo137470b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo137471c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m147473a(this, configuration);
    }

    public AssetManager getAssets() {
        return m147477c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m147474a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m147476b(this);
    }

    /* renamed from: a */
    public static Resources m147474a(DelayedFeedActivity delayedFeedActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(delayedFeedActivity);
        }
        return delayedFeedActivity.mo137468a();
    }

    /* renamed from: c */
    public static AssetManager m147477c(DelayedFeedActivity delayedFeedActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(delayedFeedActivity);
        }
        return delayedFeedActivity.mo137471c();
    }

    /* renamed from: b */
    public static void m147476b(DelayedFeedActivity delayedFeedActivity) {
        delayedFeedActivity.mo137470b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DelayedFeedActivity delayedFeedActivity2 = delayedFeedActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    delayedFeedActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C37493c cVar = new C37493c();
        cVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, cVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m147475a(DelayedFeedActivity delayedFeedActivity, Context context) {
        delayedFeedActivity.mo137469a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(delayedFeedActivity);
        }
    }

    /* renamed from: a */
    public static Context m147473a(DelayedFeedActivity delayedFeedActivity, Configuration configuration) {
        Context a = delayedFeedActivity.mo137467a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
