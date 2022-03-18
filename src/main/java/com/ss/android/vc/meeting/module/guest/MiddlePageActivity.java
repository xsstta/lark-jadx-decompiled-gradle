package com.ss.android.vc.meeting.module.guest;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

public class MiddlePageActivity extends BaseActivity {

    /* renamed from: b */
    private static MiddlePageActivity f155497b;

    /* renamed from: a */
    public Context mo214392a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo214393a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m241880a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m241877a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.base.BaseActivity
    /* renamed from: e */
    public boolean mo208278e() {
        return false;
    }

    /* renamed from: g */
    public Resources mo214398g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m241883c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m241881b(this);
    }

    /* renamed from: h */
    public AssetManager mo214400h() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m241879a(this);
    }

    /* renamed from: a */
    public static void m241878a() {
        MiddlePageActivity middlePageActivity = f155497b;
        if (middlePageActivity != null) {
            middlePageActivity.finish();
            f155497b = null;
        }
    }

    /* renamed from: d */
    public void mo214396d() {
        super.onStop();
        C60700b.m235851b("MiddlePageActivity@", "[onStop]", "onStop");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.activity_bottom_out);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C60700b.m235851b("MiddlePageActivity@", "[onBackPressed]", "onBackPressed");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        C60700b.m235851b("MiddlePageActivity@", "[onDestroy]", "onDestroy");
        f155497b = null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        C60700b.m235851b("MiddlePageActivity@", "[onResume]", "onResume");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        C60700b.m235851b("MiddlePageActivity@", "[onStart]", "onStart");
    }

    /* renamed from: b */
    public static void m241882b() {
        C60700b.m235851b("MiddlePageActivity@", "[openMiddlePage]", "open middlePage");
        C26323w.m95326a(ar.m236694a(), MiddlePageActivity.class);
    }

    /* renamed from: c */
    public void mo214394c() {
        setContentView(LayoutInflater.from(this).inflate(R.layout.activity_guest_middle_page, (ViewGroup) null));
        overridePendingTransition(R.anim.vc_activity_bottom_in, R.anim.fix_black_screen_anim);
        VideoChatModule.getDependency().getAppUpgradeDependency().checkNewVersion();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C60700b.m235851b("MiddlePageActivity@", "[onNewIntent]", "onNewIntent");
    }

    /* renamed from: b */
    public static Resources m241881b(MiddlePageActivity middlePageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(middlePageActivity);
        }
        return middlePageActivity.mo214398g();
    }

    /* renamed from: c */
    public static AssetManager m241883c(MiddlePageActivity middlePageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(middlePageActivity);
        }
        return middlePageActivity.mo214400h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        MiddlePageActivity middlePageActivity;
        super.onCreate(bundle);
        C60700b.m235851b("MiddlePageActivity@", "[onCreate]", "onCreate");
        if (f155497b == null) {
            middlePageActivity = this;
        } else {
            middlePageActivity = null;
        }
        f155497b = middlePageActivity;
        mo214394c();
    }

    /* renamed from: a */
    public static void m241879a(MiddlePageActivity middlePageActivity) {
        middlePageActivity.mo214396d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiddlePageActivity middlePageActivity2 = middlePageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    middlePageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m241880a(MiddlePageActivity middlePageActivity, Context context) {
        middlePageActivity.mo214393a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(middlePageActivity);
        }
    }

    /* renamed from: a */
    public static Context m241877a(MiddlePageActivity middlePageActivity, Configuration configuration) {
        Context a = middlePageActivity.mo214392a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
