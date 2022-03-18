package com.ss.android.lark.contact.impl.selected_confirm;

import android.content.Context;
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

public class SelectedConfirmActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C35962b f92972a;

    /* renamed from: a */
    public Context mo132287a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132288a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132289a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m140946a(this, context);
    }

    /* renamed from: b */
    public void mo132290b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132291c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m140944a(this, configuration);
    }

    public AssetManager getAssets() {
        return m140948c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m140945a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m140947b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f92972a.mo132305a();
    }

    /* renamed from: a */
    public static Resources m140945a(SelectedConfirmActivity selectedConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectedConfirmActivity);
        }
        return selectedConfirmActivity.mo132288a();
    }

    /* renamed from: c */
    public static AssetManager m140948c(SelectedConfirmActivity selectedConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectedConfirmActivity);
        }
        return selectedConfirmActivity.mo132291c();
    }

    /* renamed from: b */
    public static void m140947b(SelectedConfirmActivity selectedConfirmActivity) {
        selectedConfirmActivity.mo132290b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SelectedConfirmActivity selectedConfirmActivity2 = selectedConfirmActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    selectedConfirmActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        C35962b bVar = new C35962b();
        this.f92972a = bVar;
        bVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f92972a, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m140946a(SelectedConfirmActivity selectedConfirmActivity, Context context) {
        selectedConfirmActivity.mo132289a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectedConfirmActivity);
        }
    }

    /* renamed from: a */
    public static Context m140944a(SelectedConfirmActivity selectedConfirmActivity, Configuration configuration) {
        Context a = selectedConfirmActivity.mo132287a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
