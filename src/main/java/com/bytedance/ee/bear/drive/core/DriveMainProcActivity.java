package com.bytedance.ee.bear.drive.core;

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

public class DriveMainProcActivity extends DriveActivity {
    /* renamed from: a */
    public Context mo27252a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo27253a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m27462a(this, context);
    }

    /* renamed from: b */
    public Resources mo27254b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo27255c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m27460a(this, configuration);
    }

    @Override // com.bytedance.ee.bear.drive.core.DriveActivity
    /* renamed from: d */
    public AssetManager mo27257d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m27464c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m27461a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m27463b(this);
    }

    /* renamed from: a */
    public static Resources m27461a(DriveMainProcActivity driveMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveMainProcActivity);
        }
        return driveMainProcActivity.mo27254b();
    }

    /* renamed from: c */
    public static AssetManager m27464c(DriveMainProcActivity driveMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveMainProcActivity);
        }
        return driveMainProcActivity.mo27257d();
    }

    /* renamed from: b */
    public static void m27463b(DriveMainProcActivity driveMainProcActivity) {
        driveMainProcActivity.mo27255c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DriveMainProcActivity driveMainProcActivity2 = driveMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    driveMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m27462a(DriveMainProcActivity driveMainProcActivity, Context context) {
        driveMainProcActivity.mo27253a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m27460a(DriveMainProcActivity driveMainProcActivity, Configuration configuration) {
        Context a = driveMainProcActivity.mo27252a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
