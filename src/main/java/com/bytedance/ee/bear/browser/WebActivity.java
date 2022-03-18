package com.bytedance.ee.bear.browser;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.LifeCycleActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class WebActivity extends LifeCycleActivity {
    /* renamed from: a */
    public Context mo19328a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo19329a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo19330a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m20242a(this, context);
    }

    /* renamed from: b */
    public void mo19331b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo19332c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m20240a(this, configuration);
    }

    public AssetManager getAssets() {
        return m20244c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m20241a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m20243b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.plugin_web_activity);
    }

    /* renamed from: a */
    public static Resources m20241a(WebActivity webActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webActivity);
        }
        return webActivity.mo19329a();
    }

    /* renamed from: c */
    public static AssetManager m20244c(WebActivity webActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webActivity);
        }
        return webActivity.mo19332c();
    }

    /* renamed from: b */
    public static void m20243b(WebActivity webActivity) {
        webActivity.mo19331b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WebActivity webActivity2 = webActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    webActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m20242a(WebActivity webActivity, Context context) {
        webActivity.mo19330a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webActivity);
        }
    }

    /* renamed from: a */
    public static Context m20240a(WebActivity webActivity, Configuration configuration) {
        Context a = webActivity.mo19328a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
