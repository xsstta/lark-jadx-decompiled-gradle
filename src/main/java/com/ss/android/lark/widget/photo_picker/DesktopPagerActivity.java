package com.ss.android.lark.widget.photo_picker;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DesktopPagerActivity extends PhotoPagerActivity {
    /* renamed from: a */
    public Context mo198464a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo198465a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo198466a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m227086a(this, context);
    }

    /* renamed from: b */
    public void mo198467b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo198468c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m227084a(this, configuration);
    }

    public AssetManager getAssets() {
        return m227088c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m227085a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.photo_picker.PhotoPagerActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m227087b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.widget.photo_picker.PhotoPagerActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.widget.photo_picker.PhotoPagerActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.widget.photo_picker.PhotoPagerActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static Resources m227085a(DesktopPagerActivity desktopPagerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopPagerActivity);
        }
        return desktopPagerActivity.mo198465a();
    }

    /* renamed from: c */
    public static AssetManager m227088c(DesktopPagerActivity desktopPagerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopPagerActivity);
        }
        return desktopPagerActivity.mo198468c();
    }

    /* renamed from: b */
    public static void m227087b(DesktopPagerActivity desktopPagerActivity) {
        desktopPagerActivity.mo198467b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DesktopPagerActivity desktopPagerActivity2 = desktopPagerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    desktopPagerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m227086a(DesktopPagerActivity desktopPagerActivity, Context context) {
        desktopPagerActivity.mo198466a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(desktopPagerActivity);
        }
    }

    /* renamed from: a */
    public static Context m227084a(DesktopPagerActivity desktopPagerActivity, Configuration configuration) {
        Context a = desktopPagerActivity.mo198464a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.widget.photo_picker.PhotoPagerActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
