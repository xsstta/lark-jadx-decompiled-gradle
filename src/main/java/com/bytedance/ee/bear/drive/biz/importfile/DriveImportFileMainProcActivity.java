package com.bytedance.ee.bear.drive.biz.importfile;

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

public class DriveImportFileMainProcActivity extends DriveImportFileActivity {
    /* renamed from: a */
    public Context mo25863a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m25970a(this, context);
    }

    /* renamed from: c */
    public void mo25864c(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m25968a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo25866e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo25867f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo25868g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m25972c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m25969a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity
    public void onStop() {
        m25971b(this);
    }

    /* renamed from: a */
    public static Resources m25969a(DriveImportFileMainProcActivity driveImportFileMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveImportFileMainProcActivity);
        }
        return driveImportFileMainProcActivity.mo25866e();
    }

    /* renamed from: c */
    public static AssetManager m25972c(DriveImportFileMainProcActivity driveImportFileMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveImportFileMainProcActivity);
        }
        return driveImportFileMainProcActivity.mo25868g();
    }

    /* renamed from: b */
    public static void m25971b(DriveImportFileMainProcActivity driveImportFileMainProcActivity) {
        driveImportFileMainProcActivity.mo25867f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DriveImportFileMainProcActivity driveImportFileMainProcActivity2 = driveImportFileMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    driveImportFileMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25970a(DriveImportFileMainProcActivity driveImportFileMainProcActivity, Context context) {
        driveImportFileMainProcActivity.mo25864c(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveImportFileMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m25968a(DriveImportFileMainProcActivity driveImportFileMainProcActivity, Configuration configuration) {
        Context a = driveImportFileMainProcActivity.mo25863a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
