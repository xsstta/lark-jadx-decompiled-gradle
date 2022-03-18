package com.ss.android.bytedcert.activities;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class WebFailedActivity extends AppCompatActivity {
    /* renamed from: a */
    public Context mo100914a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo100915a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo100916a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103899a(this, context);
    }

    /* renamed from: b */
    public void mo100917b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo100918c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103897a(this, configuration);
    }

    public AssetManager getAssets() {
        return m103901c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103898a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103900b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.byted_activity_webfailed);
        C28441g.m104237a((Activity) this, -1);
    }

    /* renamed from: a */
    public static Resources m103898a(WebFailedActivity webFailedActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webFailedActivity);
        }
        return webFailedActivity.mo100915a();
    }

    /* renamed from: c */
    public static AssetManager m103901c(WebFailedActivity webFailedActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webFailedActivity);
        }
        return webFailedActivity.mo100918c();
    }

    /* renamed from: b */
    public static void m103900b(WebFailedActivity webFailedActivity) {
        webFailedActivity.mo100917b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WebFailedActivity webFailedActivity2 = webFailedActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    webFailedActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m103899a(WebFailedActivity webFailedActivity, Context context) {
        webFailedActivity.mo100916a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webFailedActivity);
        }
    }

    /* renamed from: a */
    public static Context m103897a(WebFailedActivity webFailedActivity, Configuration configuration) {
        Context a = webFailedActivity.mo100914a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
