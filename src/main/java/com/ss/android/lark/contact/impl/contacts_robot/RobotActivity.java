package com.ss.android.lark.contact.impl.contacts_robot;

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

public class RobotActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C35723b f92356a;

    /* renamed from: a */
    public Context mo131502a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo131503a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo131504a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m139792a(this, context);
    }

    /* renamed from: b */
    public void mo131505b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo131506c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m139790a(this, configuration);
    }

    public AssetManager getAssets() {
        return m139794c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m139791a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m139793b(this);
    }

    /* renamed from: d */
    private void m139795d() {
        C35723b bVar = new C35723b();
        this.f92356a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f92356a, "RobotFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m139795d();
    }

    /* renamed from: a */
    public static Resources m139791a(RobotActivity robotActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(robotActivity);
        }
        return robotActivity.mo131503a();
    }

    /* renamed from: c */
    public static AssetManager m139794c(RobotActivity robotActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(robotActivity);
        }
        return robotActivity.mo131506c();
    }

    /* renamed from: b */
    public static void m139793b(RobotActivity robotActivity) {
        robotActivity.mo131505b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RobotActivity robotActivity2 = robotActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    robotActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139792a(RobotActivity robotActivity, Context context) {
        robotActivity.mo131504a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(robotActivity);
        }
    }

    /* renamed from: a */
    public static Context m139790a(RobotActivity robotActivity, Configuration configuration) {
        Context a = robotActivity.mo131502a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
