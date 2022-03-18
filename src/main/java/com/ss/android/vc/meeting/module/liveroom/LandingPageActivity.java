package com.ss.android.vc.meeting.module.liveroom;

import android.app.Activity;
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

public class LandingPageActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo214642a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo214643a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m242280a(this, context);
    }

    /* renamed from: b */
    public void mo214644b() {
        super.onStop();
    }

    /* renamed from: b */
    public void mo214645b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public AssetManager mo214646c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m242277a(this, configuration);
    }

    public AssetManager getAssets() {
        return m242282c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m242278a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m242281b(this);
    }

    /* renamed from: d */
    private void m242283d() {
        C62008a aVar = new C62008a();
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m242283d();
    }

    /* renamed from: a */
    public static Resources m242278a(LandingPageActivity landingPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(landingPageActivity);
        }
        return landingPageActivity.mo214643a();
    }

    /* renamed from: c */
    public static AssetManager m242282c(LandingPageActivity landingPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(landingPageActivity);
        }
        return landingPageActivity.mo214646c();
    }

    /* renamed from: b */
    public static void m242281b(LandingPageActivity landingPageActivity) {
        landingPageActivity.mo214644b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LandingPageActivity landingPageActivity2 = landingPageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    landingPageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m242279a(Context context) {
        Intent intent = new Intent(context, LandingPageActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m242280a(LandingPageActivity landingPageActivity, Context context) {
        landingPageActivity.mo214645b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(landingPageActivity);
        }
    }

    /* renamed from: a */
    public static Context m242277a(LandingPageActivity landingPageActivity, Configuration configuration) {
        Context a = landingPageActivity.mo214642a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
