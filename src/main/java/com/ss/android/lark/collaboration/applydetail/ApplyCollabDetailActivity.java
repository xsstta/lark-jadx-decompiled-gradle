package com.ss.android.lark.collaboration.applydetail;

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

public class ApplyCollabDetailActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo130067a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo130068a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo130069a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m138090a(this, context);
    }

    /* renamed from: b */
    public void mo130070b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo130071c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m138088a(this, configuration);
    }

    public AssetManager getAssets() {
        return m138092c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m138089a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m138091b(this);
    }

    /* renamed from: d */
    private void m138093d() {
        C35341a aVar = new C35341a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m138093d();
        getWindow().setLayout(-1, -1);
    }

    /* renamed from: a */
    public static Resources m138089a(ApplyCollabDetailActivity applyCollabDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applyCollabDetailActivity);
        }
        return applyCollabDetailActivity.mo130068a();
    }

    /* renamed from: c */
    public static AssetManager m138092c(ApplyCollabDetailActivity applyCollabDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applyCollabDetailActivity);
        }
        return applyCollabDetailActivity.mo130071c();
    }

    /* renamed from: b */
    public static void m138091b(ApplyCollabDetailActivity applyCollabDetailActivity) {
        applyCollabDetailActivity.mo130070b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ApplyCollabDetailActivity applyCollabDetailActivity2 = applyCollabDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    applyCollabDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m138090a(ApplyCollabDetailActivity applyCollabDetailActivity, Context context) {
        applyCollabDetailActivity.mo130069a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applyCollabDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m138088a(ApplyCollabDetailActivity applyCollabDetailActivity, Configuration configuration) {
        Context a = applyCollabDetailActivity.mo130067a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
