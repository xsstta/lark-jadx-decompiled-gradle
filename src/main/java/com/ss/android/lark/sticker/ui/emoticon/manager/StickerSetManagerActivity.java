package com.ss.android.lark.sticker.ui.emoticon.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class StickerSetManagerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C55163c f136164a;

    /* renamed from: a */
    public Context mo188076a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo188077a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo188078a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m213996a(this, context);
    }

    /* renamed from: b */
    public void mo188079b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo188080c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m213994a(this, configuration);
    }

    public AssetManager getAssets() {
        return m213998c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m213995a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m213997b(this);
    }

    /* renamed from: a */
    public static Resources m213995a(StickerSetManagerActivity stickerSetManagerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetManagerActivity);
        }
        return stickerSetManagerActivity.mo188077a();
    }

    /* renamed from: c */
    public static AssetManager m213998c(StickerSetManagerActivity stickerSetManagerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetManagerActivity);
        }
        return stickerSetManagerActivity.mo188080c();
    }

    /* renamed from: b */
    public static void m213997b(StickerSetManagerActivity stickerSetManagerActivity) {
        stickerSetManagerActivity.mo188079b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            StickerSetManagerActivity stickerSetManagerActivity2 = stickerSetManagerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    stickerSetManagerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sticker_set_manager);
        this.f136164a = (C55163c) Fragment.instantiate(this, C55163c.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f136164a).commit();
    }

    /* renamed from: a */
    public static void m213996a(StickerSetManagerActivity stickerSetManagerActivity, Context context) {
        stickerSetManagerActivity.mo188078a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetManagerActivity);
        }
    }

    /* renamed from: a */
    public static Context m213994a(StickerSetManagerActivity stickerSetManagerActivity, Configuration configuration) {
        Context a = stickerSetManagerActivity.mo188076a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
