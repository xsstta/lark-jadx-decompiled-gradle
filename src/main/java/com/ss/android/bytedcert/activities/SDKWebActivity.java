package com.ss.android.bytedcert.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1307e.C28350a;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SDKWebActivity extends AppCompatActivity {

    /* renamed from: a */
    private BytedCertManager f71121a;

    /* renamed from: b */
    private WebView f71122b;

    /* renamed from: c */
    private C28350a f71123c;

    /* renamed from: d */
    private boolean f71124d;

    /* renamed from: e */
    private String f71125e;

    /* renamed from: a */
    public Context mo100904a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo100906a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103887a(this, context);
    }

    /* renamed from: b */
    public Resources mo100908b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo100909c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103884a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo100911d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m103889c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103885a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103888b(this);
    }

    public void finish() {
        BytedCertManager.getInstance().resetStatus();
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (this.f71124d) {
            C28350a aVar = this.f71123c;
            if (aVar != null) {
                aVar.mo100993b();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C28350a aVar = this.f71123c;
        if (aVar != null) {
            aVar.mo100998d();
            this.f71123c = null;
        }
        WebView webView = this.f71122b;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.f71122b.setWebViewClient(null);
            ViewParent parent = this.f71122b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f71122b);
                try {
                    this.f71122b.destroy();
                } catch (Throwable unused) {
                }
            }
            this.f71122b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100905a() {
        String str;
        if (this.f71122b == null) {
            WebView webView = (WebView) findViewById(R.id.webview);
            this.f71122b = webView;
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
        }
        if (this.f71123c == null) {
            this.f71123c = new C28350a(this.f71122b, this);
        }
        if (this.f71121a.getDebugEnable()) {
            str = this.f71121a.getDebugH5Url();
        } else {
            str = this.f71125e;
        }
        this.f71122b.loadUrl(str);
    }

    /* renamed from: a */
    private void m103886a(Intent intent) {
        this.f71125e = intent.getStringExtra("web_url");
    }

    /* renamed from: a */
    public static Resources m103885a(SDKWebActivity sDKWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sDKWebActivity);
        }
        return sDKWebActivity.mo100908b();
    }

    /* renamed from: c */
    public static AssetManager m103889c(SDKWebActivity sDKWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sDKWebActivity);
        }
        return sDKWebActivity.mo100911d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.byted_activity_web);
        C28441g.m104237a((Activity) this, -1);
        m103886a(getIntent());
        this.f71121a = BytedCertManager.getInstance();
        mo100905a();
    }

    /* renamed from: b */
    public static void m103888b(SDKWebActivity sDKWebActivity) {
        sDKWebActivity.mo100909c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SDKWebActivity sDKWebActivity2 = sDKWebActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sDKWebActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo100907a(boolean z) {
        this.f71124d = z;
    }

    /* renamed from: a */
    public static Context m103884a(SDKWebActivity sDKWebActivity, Configuration configuration) {
        Context a = sDKWebActivity.mo100904a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m103887a(SDKWebActivity sDKWebActivity, Context context) {
        sDKWebActivity.mo100906a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sDKWebActivity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C28350a aVar = this.f71123c;
        if (aVar != null) {
            aVar.mo100982a(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C28350a aVar = this.f71123c;
        if (aVar != null) {
            aVar.mo100984a(i, strArr, iArr);
        }
    }
}
