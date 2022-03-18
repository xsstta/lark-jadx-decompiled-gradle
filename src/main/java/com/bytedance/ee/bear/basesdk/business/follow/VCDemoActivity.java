package com.bytedance.ee.bear.basesdk.business.follow;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.bytedance.ee.bear.facade.common.LifeCycleActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class VCDemoActivity extends LifeCycleActivity implements AbstractC7710h {

    /* renamed from: a */
    private ExtensionActivityImpl f13140a;

    /* renamed from: a */
    public Context mo17220a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo17221a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo17223a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m18424a(this, context);
    }

    /* renamed from: b */
    public void mo17224b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo17225c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m18422a(this, configuration);
    }

    public AssetManager getAssets() {
        return m18426c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m18423a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m18425b(this);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (!this.f13140a.mo30094a()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f13140a.mo30095a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f13140a.mo30096a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        ExtensionActivityImpl extensionActivityImpl = this.f13140a;
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30092a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13140a = C4462a.m18437a((AppCompatActivity) this);
    }

    /* renamed from: a */
    public static Resources m18423a(VCDemoActivity vCDemoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vCDemoActivity);
        }
        return vCDemoActivity.mo17221a();
    }

    /* renamed from: c */
    public static AssetManager m18426c(VCDemoActivity vCDemoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vCDemoActivity);
        }
        return vCDemoActivity.mo17225c();
    }

    /* renamed from: b */
    public static void m18425b(VCDemoActivity vCDemoActivity) {
        vCDemoActivity.mo17224b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VCDemoActivity vCDemoActivity2 = vCDemoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    vCDemoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7710h
    /* renamed from: a */
    public <T> T mo17222a(Class<T> cls) {
        return (T) this.f13140a.mo17222a(cls);
    }

    /* renamed from: a */
    public static void m18424a(VCDemoActivity vCDemoActivity, Context context) {
        vCDemoActivity.mo17223a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vCDemoActivity);
        }
    }

    /* renamed from: a */
    public static Context m18422a(VCDemoActivity vCDemoActivity, Configuration configuration) {
        Context a = vCDemoActivity.mo17220a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f13140a.mo30091a(i, i2, intent);
    }
}
