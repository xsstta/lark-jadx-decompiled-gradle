package com.bytedance.ee.bear.drive.test;

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

public class DriveTestMainProcActivity extends DriveTestActivity {
    /* renamed from: a */
    public Context mo28189a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m28841a(this, context);
    }

    /* renamed from: c */
    public void mo28190c(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m28839a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo28192e() {
        return super.getResources();
    }

    @Override // com.bytedance.ee.bear.drive.test.DriveTestActivity
    /* renamed from: g */
    public void mo28193g() {
        super.onStop();
    }

    public AssetManager getAssets() {
        return m28843c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m28840a(this);
    }

    /* renamed from: h */
    public AssetManager mo28195h() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity
    public void onStop() {
        m28842b(this);
    }

    /* renamed from: a */
    public static Resources m28840a(DriveTestMainProcActivity driveTestMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveTestMainProcActivity);
        }
        return driveTestMainProcActivity.mo28192e();
    }

    /* renamed from: c */
    public static AssetManager m28843c(DriveTestMainProcActivity driveTestMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveTestMainProcActivity);
        }
        return driveTestMainProcActivity.mo28195h();
    }

    /* renamed from: b */
    public static void m28842b(DriveTestMainProcActivity driveTestMainProcActivity) {
        driveTestMainProcActivity.mo28193g();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DriveTestMainProcActivity driveTestMainProcActivity2 = driveTestMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    driveTestMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m28841a(DriveTestMainProcActivity driveTestMainProcActivity, Context context) {
        driveTestMainProcActivity.mo28190c(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveTestMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m28839a(DriveTestMainProcActivity driveTestMainProcActivity, Configuration configuration) {
        Context a = driveTestMainProcActivity.mo28189a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
