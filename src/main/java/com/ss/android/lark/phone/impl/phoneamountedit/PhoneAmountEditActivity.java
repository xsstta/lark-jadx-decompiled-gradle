package com.ss.android.lark.phone.impl.phoneamountedit;

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

public class PhoneAmountEditActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C51363a f127884a;

    /* renamed from: a */
    public Context mo176966a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo176967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo176968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m199206a(this, context);
    }

    /* renamed from: b */
    public void mo176969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo176970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m199204a(this, configuration);
    }

    public AssetManager getAssets() {
        return m199208c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m199205a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m199207b(this);
    }

    /* renamed from: d */
    private void m199209d() {
        C51363a aVar = new C51363a();
        this.f127884a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, this.f127884a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m199209d();
    }

    /* renamed from: a */
    public static Resources m199205a(PhoneAmountEditActivity phoneAmountEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(phoneAmountEditActivity);
        }
        return phoneAmountEditActivity.mo176967a();
    }

    /* renamed from: c */
    public static AssetManager m199208c(PhoneAmountEditActivity phoneAmountEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(phoneAmountEditActivity);
        }
        return phoneAmountEditActivity.mo176970c();
    }

    /* renamed from: b */
    public static void m199207b(PhoneAmountEditActivity phoneAmountEditActivity) {
        phoneAmountEditActivity.mo176969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PhoneAmountEditActivity phoneAmountEditActivity2 = phoneAmountEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    phoneAmountEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m199206a(PhoneAmountEditActivity phoneAmountEditActivity, Context context) {
        phoneAmountEditActivity.mo176968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(phoneAmountEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m199204a(PhoneAmountEditActivity phoneAmountEditActivity, Configuration configuration) {
        Context a = phoneAmountEditActivity.mo176966a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
