package com.ss.android.lark.profile.func.friend_request;

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

public class ReasonEditActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo179091a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179092a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179093a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m202860a(this, context);
    }

    /* renamed from: b */
    public void mo179094b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179095c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m202858a(this, configuration);
    }

    public AssetManager getAssets() {
        return m202862c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m202859a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m202861b(this);
    }

    /* renamed from: d */
    private void m202863d() {
        C52276a aVar = new C52276a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m202863d();
    }

    /* renamed from: a */
    public static Resources m202859a(ReasonEditActivity reasonEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(reasonEditActivity);
        }
        return reasonEditActivity.mo179092a();
    }

    /* renamed from: c */
    public static AssetManager m202862c(ReasonEditActivity reasonEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(reasonEditActivity);
        }
        return reasonEditActivity.mo179095c();
    }

    /* renamed from: b */
    public static void m202861b(ReasonEditActivity reasonEditActivity) {
        reasonEditActivity.mo179094b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ReasonEditActivity reasonEditActivity2 = reasonEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    reasonEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m202860a(ReasonEditActivity reasonEditActivity, Context context) {
        reasonEditActivity.mo179093a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(reasonEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m202858a(ReasonEditActivity reasonEditActivity, Configuration configuration) {
        Context a = reasonEditActivity.mo179091a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
