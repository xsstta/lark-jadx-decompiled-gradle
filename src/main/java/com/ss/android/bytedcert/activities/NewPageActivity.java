package com.ss.android.bytedcert.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class NewPageActivity extends AppCompatActivity {

    /* renamed from: a */
    private WebView f71094a;

    /* renamed from: b */
    private ImageView f71095b;

    /* renamed from: c */
    private TextView f71096c;

    /* renamed from: a */
    public Context mo100874a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo100875a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo100876a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103858a(this, context);
    }

    /* renamed from: b */
    public void mo100877b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo100878c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103856a(this, configuration);
    }

    public AssetManager getAssets() {
        return m103860c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103857a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103859b(this);
    }

    /* renamed from: a */
    public static Resources m103857a(NewPageActivity newPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(newPageActivity);
        }
        return newPageActivity.mo100875a();
    }

    /* renamed from: c */
    public static AssetManager m103860c(NewPageActivity newPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(newPageActivity);
        }
        return newPageActivity.mo100878c();
    }

    /* renamed from: b */
    public static void m103859b(NewPageActivity newPageActivity) {
        newPageActivity.mo100877b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NewPageActivity newPageActivity2 = newPageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    newPageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.byted_activity_new_page);
        C28441g.m104237a((Activity) this, -1);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("web_url");
        String stringExtra2 = intent.getStringExtra("web_title");
        ImageView imageView = (ImageView) findViewById(R.id.return_back);
        this.f71095b = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.bytedcert.activities.NewPageActivity.View$OnClickListenerC283061 */

            public void onClick(View view) {
                NewPageActivity.this.finish();
            }
        });
        TextView textView = (TextView) findViewById(R.id.bar_text);
        this.f71096c = textView;
        textView.setText(stringExtra2);
        WebView webView = (WebView) findViewById(R.id.new_page_webview);
        this.f71094a = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        this.f71094a.setWebViewClient(new WebViewClient());
        this.f71094a.loadUrl(stringExtra);
    }

    /* renamed from: a */
    public static void m103858a(NewPageActivity newPageActivity, Context context) {
        newPageActivity.mo100876a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(newPageActivity);
        }
    }

    /* renamed from: a */
    public static Context m103856a(NewPageActivity newPageActivity, Configuration configuration) {
        Context a = newPageActivity.mo100874a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
