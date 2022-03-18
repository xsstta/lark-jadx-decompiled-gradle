package com.ss.android.lark.share_group;

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

public class ShareGroupProfileActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo187002a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo187003a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo187004a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m212600a(this, context);
    }

    /* renamed from: b */
    public void mo187005b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo187006c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m212598a(this, configuration);
    }

    public AssetManager getAssets() {
        return m212602c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m212599a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m212601b(this);
    }

    /* renamed from: d */
    private void m212603d() {
        C54832g gVar = new C54832g();
        gVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, gVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m212599a(ShareGroupProfileActivity shareGroupProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareGroupProfileActivity);
        }
        return shareGroupProfileActivity.mo187003a();
    }

    /* renamed from: c */
    public static AssetManager m212602c(ShareGroupProfileActivity shareGroupProfileActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareGroupProfileActivity);
        }
        return shareGroupProfileActivity.mo187006c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getExtras() == null) {
            finish();
        } else {
            m212603d();
        }
    }

    /* renamed from: b */
    public static void m212601b(ShareGroupProfileActivity shareGroupProfileActivity) {
        shareGroupProfileActivity.mo187005b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareGroupProfileActivity shareGroupProfileActivity2 = shareGroupProfileActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareGroupProfileActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m212600a(ShareGroupProfileActivity shareGroupProfileActivity, Context context) {
        shareGroupProfileActivity.mo187004a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareGroupProfileActivity);
        }
    }

    /* renamed from: a */
    public static Context m212598a(ShareGroupProfileActivity shareGroupProfileActivity, Configuration configuration) {
        Context a = shareGroupProfileActivity.mo187002a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
