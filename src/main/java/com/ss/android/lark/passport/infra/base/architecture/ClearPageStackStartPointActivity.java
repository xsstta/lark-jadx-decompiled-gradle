package com.ss.android.lark.passport.infra.base.architecture;

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
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ClearPageStackStartPointActivity extends ReturnMarkerBaseActivity {
    /* renamed from: a */
    public Context mo171162a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m193076a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m193074a(this, configuration);
    }

    public AssetManager getAssets() {
        return m193078c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m193075a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m193077b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            C49092f.m193536c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f123052c.mo171465b("ClearPageStackStartPointActivity", "onNewIntent received, and close page");
        mo171163a("onNewIntent received, and close page");
    }

    /* renamed from: a */
    public static Resources m193075a(ClearPageStackStartPointActivity clearPageStackStartPointActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(clearPageStackStartPointActivity);
        }
        return clearPageStackStartPointActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m193078c(ClearPageStackStartPointActivity clearPageStackStartPointActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(clearPageStackStartPointActivity);
        }
        return clearPageStackStartPointActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m193077b(ClearPageStackStartPointActivity clearPageStackStartPointActivity) {
        clearPageStackStartPointActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ClearPageStackStartPointActivity clearPageStackStartPointActivity2 = clearPageStackStartPointActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    clearPageStackStartPointActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.passport.infra.base.architecture.ReturnMarkerBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PassportLog passportLog = this.f123052c;
        passportLog.mo171465b("ClearPageStackStartPointActivity", "PATH_SWITCH_NEXT_VALID jump, nextStep is:" + this.f123063i);
        C49092f.m193535b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.ReturnMarkerBaseActivity
    /* renamed from: a */
    public void mo171163a(String str) {
        C49092f.m193536c();
        setResult(-1);
        super.mo171163a(str);
    }

    /* renamed from: a */
    public static void m193076a(ClearPageStackStartPointActivity clearPageStackStartPointActivity, Context context) {
        clearPageStackStartPointActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(clearPageStackStartPointActivity);
        }
    }

    /* renamed from: a */
    public static Context m193074a(ClearPageStackStartPointActivity clearPageStackStartPointActivity, Configuration configuration) {
        Context a = clearPageStackStartPointActivity.mo171162a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f123052c.mo171465b("ClearPageStackStartPointActivity", "onActivityResult received, and close page");
        mo171163a("onActivityResult received, and close page");
    }
}
