package com.bytedance.ee.bear.drive.common.activity;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DriveCarrierMainProcActivity extends DriveCarrierActivity {
    /* renamed from: a */
    public Context mo27125a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo27126a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo27127a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m27218a(this, context);
    }

    /* renamed from: b */
    public void mo27128b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo27129c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m27216a(this, configuration);
    }

    public AssetManager getAssets() {
        return m27220c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m27217a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m27219b(this);
    }

    /* renamed from: a */
    public static Resources m27217a(DriveCarrierMainProcActivity driveCarrierMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveCarrierMainProcActivity);
        }
        return driveCarrierMainProcActivity.mo27126a();
    }

    /* renamed from: c */
    public static AssetManager m27220c(DriveCarrierMainProcActivity driveCarrierMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveCarrierMainProcActivity);
        }
        return driveCarrierMainProcActivity.mo27129c();
    }

    /* renamed from: b */
    public static void m27219b(DriveCarrierMainProcActivity driveCarrierMainProcActivity) {
        driveCarrierMainProcActivity.mo27128b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DriveCarrierMainProcActivity driveCarrierMainProcActivity2 = driveCarrierMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    driveCarrierMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m27218a(DriveCarrierMainProcActivity driveCarrierMainProcActivity, Context context) {
        driveCarrierMainProcActivity.mo27127a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveCarrierMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m27216a(DriveCarrierMainProcActivity driveCarrierMainProcActivity, Configuration configuration) {
        Context a = driveCarrierMainProcActivity.mo27125a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
