package com.ss.android.lark.phone.impl.phonequerylimit;

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

public class PhoneQueryLimitActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C51383a f127910a;

    /* renamed from: a */
    public Context mo176995a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo176996a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo176997a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m199252a(this, context);
    }

    /* renamed from: b */
    public void mo176998b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo176999c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m199250a(this, configuration);
    }

    public AssetManager getAssets() {
        return m199254c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m199251a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m199253b(this);
    }

    /* renamed from: d */
    private void m199255d() {
        C51383a aVar = new C51383a();
        this.f127910a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f127910a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m199255d();
    }

    /* renamed from: a */
    public static Resources m199251a(PhoneQueryLimitActivity phoneQueryLimitActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(phoneQueryLimitActivity);
        }
        return phoneQueryLimitActivity.mo176996a();
    }

    /* renamed from: c */
    public static AssetManager m199254c(PhoneQueryLimitActivity phoneQueryLimitActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(phoneQueryLimitActivity);
        }
        return phoneQueryLimitActivity.mo176999c();
    }

    /* renamed from: b */
    public static void m199253b(PhoneQueryLimitActivity phoneQueryLimitActivity) {
        phoneQueryLimitActivity.mo176998b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PhoneQueryLimitActivity phoneQueryLimitActivity2 = phoneQueryLimitActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    phoneQueryLimitActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m199252a(PhoneQueryLimitActivity phoneQueryLimitActivity, Context context) {
        phoneQueryLimitActivity.mo176997a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(phoneQueryLimitActivity);
        }
    }

    /* renamed from: a */
    public static Context m199250a(PhoneQueryLimitActivity phoneQueryLimitActivity, Configuration configuration) {
        Context a = phoneQueryLimitActivity.mo176995a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
