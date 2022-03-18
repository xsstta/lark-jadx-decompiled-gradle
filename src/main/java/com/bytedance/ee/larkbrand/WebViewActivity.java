package com.bytedance.ee.larkbrand;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.ab.C65726a;
import com.tt.miniapphost.view.BaseActivity;

public class WebViewActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo48826a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo48827a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo48828a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m53307a(this, context);
    }

    /* renamed from: b */
    public void mo48829b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo48830c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m53304a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m53309c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m53306a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m53308b(this);
    }

    /* renamed from: c */
    public static AssetManager m53309c(WebViewActivity webViewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webViewActivity);
        }
        return webViewActivity.mo48830c();
    }

    /* renamed from: b */
    public static void m53308b(WebViewActivity webViewActivity) {
        webViewActivity.mo48829b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WebViewActivity webViewActivity2 = webViewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    webViewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lark_brand_activity_web);
        WebView webView = (WebView) findViewById(R.id.web);
        new C65726a(webView.getSettings(), null).mo230326a();
        webView.loadUrl(getIntent().getStringExtra("extra_url"));
    }

    /* renamed from: a */
    public static Resources m53306a(WebViewActivity webViewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webViewActivity);
        }
        return webViewActivity.mo48827a();
    }

    /* renamed from: a */
    public static void m53307a(WebViewActivity webViewActivity, Context context) {
        webViewActivity.mo48828a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webViewActivity);
        }
    }

    /* renamed from: a */
    public static Context m53304a(WebViewActivity webViewActivity, Configuration configuration) {
        Context a = webViewActivity.mo48826a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static Intent m53305a(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("extra_url", str);
        intent.putExtra("extra_title", str2);
        intent.putExtra("extra_hide_bar", z);
        return intent;
    }
}
