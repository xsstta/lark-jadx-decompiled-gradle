package com.ss.android.lark.share.impl.systemshare;

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

public class ShareContentActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo186907a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186908a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186909a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m212454a(this, context);
    }

    /* renamed from: b */
    public void mo186910b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186911c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m212452a(this, configuration);
    }

    public AssetManager getAssets() {
        return m212456c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m212453a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m212455b(this);
    }

    /* renamed from: d */
    private void m212457d() {
        C54756a aVar = new C54756a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_share_content);
        m212457d();
    }

    /* renamed from: a */
    public static Resources m212453a(ShareContentActivity shareContentActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareContentActivity);
        }
        return shareContentActivity.mo186908a();
    }

    /* renamed from: c */
    public static AssetManager m212456c(ShareContentActivity shareContentActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareContentActivity);
        }
        return shareContentActivity.mo186911c();
    }

    /* renamed from: b */
    public static void m212455b(ShareContentActivity shareContentActivity) {
        shareContentActivity.mo186910b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareContentActivity shareContentActivity2 = shareContentActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareContentActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m212454a(ShareContentActivity shareContentActivity, Context context) {
        shareContentActivity.mo186909a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareContentActivity);
        }
    }

    /* renamed from: a */
    public static Context m212452a(ShareContentActivity shareContentActivity, Configuration configuration) {
        Context a = shareContentActivity.mo186907a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
