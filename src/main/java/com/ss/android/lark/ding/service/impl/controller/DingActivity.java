package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C36720c f94335a;

    /* renamed from: a */
    public Context mo135319a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo135320a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo135321a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m144800a(this, context);
    }

    /* renamed from: b */
    public void mo135322b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo135323c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m144798a(this, configuration);
    }

    public AssetManager getAssets() {
        return m144802c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m144799a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m144801b(this);
    }

    /* renamed from: a */
    public static Resources m144799a(DingActivity dingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(dingActivity);
        }
        return dingActivity.mo135320a();
    }

    /* renamed from: c */
    public static AssetManager m144802c(DingActivity dingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(dingActivity);
        }
        return dingActivity.mo135323c();
    }

    /* renamed from: b */
    public static void m144801b(DingActivity dingActivity) {
        dingActivity.mo135322b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DingActivity dingActivity2 = dingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    dingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36720c cVar = new C36720c();
        this.f94335a = cVar;
        cVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f94335a).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m144800a(DingActivity dingActivity, Context context) {
        dingActivity.mo135321a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(dingActivity);
        }
    }

    /* renamed from: a */
    public static Context m144798a(DingActivity dingActivity, Configuration configuration) {
        Context a = dingActivity.mo135319a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C36720c cVar = this.f94335a;
        if (cVar != null) {
            cVar.onActivityResult(i, i2, intent);
        }
    }
}
