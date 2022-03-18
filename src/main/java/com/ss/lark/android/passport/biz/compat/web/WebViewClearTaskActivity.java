package com.ss.lark.android.passport.biz.compat.web;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class WebViewClearTaskActivity extends WebViewActivity {
    /* renamed from: a */
    public Context mo223249a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m253616a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m253614a(this, configuration);
    }

    public AssetManager getAssets() {
        return m253618c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m253615a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m253617b(this);
    }

    /* renamed from: w */
    public Resources mo223252w() {
        return super.getResources();
    }

    /* renamed from: x */
    public void mo223253x() {
        super.onStop();
    }

    /* renamed from: y */
    public AssetManager mo223254y() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.lark.android.passport.biz.compat.web.WebViewActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static Resources m253615a(WebViewClearTaskActivity webViewClearTaskActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webViewClearTaskActivity);
        }
        return webViewClearTaskActivity.mo223252w();
    }

    /* renamed from: c */
    public static AssetManager m253618c(WebViewClearTaskActivity webViewClearTaskActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webViewClearTaskActivity);
        }
        return webViewClearTaskActivity.mo223254y();
    }

    /* renamed from: b */
    public static void m253617b(WebViewClearTaskActivity webViewClearTaskActivity) {
        webViewClearTaskActivity.mo223253x();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WebViewClearTaskActivity webViewClearTaskActivity2 = webViewClearTaskActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    webViewClearTaskActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m253616a(WebViewClearTaskActivity webViewClearTaskActivity, Context context) {
        webViewClearTaskActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webViewClearTaskActivity);
        }
    }

    /* renamed from: a */
    public static Context m253614a(WebViewClearTaskActivity webViewClearTaskActivity, Configuration configuration) {
        Context a = webViewClearTaskActivity.mo223249a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
