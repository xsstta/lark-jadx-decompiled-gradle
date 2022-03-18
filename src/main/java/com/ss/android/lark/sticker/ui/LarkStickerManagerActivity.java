package com.ss.android.lark.sticker.ui;

import android.content.Context;
import android.content.Intent;
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

public class LarkStickerManagerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C55090b f136041a;

    /* renamed from: a */
    public Context mo187959a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo187960a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo187961a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m213821a(this, context);
    }

    /* renamed from: b */
    public void mo187962b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo187963c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m213819a(this, configuration);
    }

    public AssetManager getAssets() {
        return m213823c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m213820a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m213822b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f136041a.mo188003a();
        super.onBackPressed();
    }

    /* renamed from: d */
    private void m213824d() {
        C55090b bVar = new C55090b();
        this.f136041a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f136041a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m213824d();
    }

    /* renamed from: a */
    public static Resources m213820a(LarkStickerManagerActivity larkStickerManagerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkStickerManagerActivity);
        }
        return larkStickerManagerActivity.mo187960a();
    }

    /* renamed from: c */
    public static AssetManager m213823c(LarkStickerManagerActivity larkStickerManagerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkStickerManagerActivity);
        }
        return larkStickerManagerActivity.mo187963c();
    }

    /* renamed from: b */
    public static void m213822b(LarkStickerManagerActivity larkStickerManagerActivity) {
        larkStickerManagerActivity.mo187962b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LarkStickerManagerActivity larkStickerManagerActivity2 = larkStickerManagerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    larkStickerManagerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m213821a(LarkStickerManagerActivity larkStickerManagerActivity, Context context) {
        larkStickerManagerActivity.mo187961a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkStickerManagerActivity);
        }
    }

    /* renamed from: a */
    public static Context m213819a(LarkStickerManagerActivity larkStickerManagerActivity, Configuration configuration) {
        Context a = larkStickerManagerActivity.mo187959a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C55090b bVar = this.f136041a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}
