package com.bytedance.ee.bear.drive.biz.upload.error;

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

public class DriveUploadErrorTipsMainProcActivity extends DriveUploadErrorTipsActivity {
    /* renamed from: a */
    public Context mo26581a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m26639a(this, context);
    }

    /* renamed from: c */
    public void mo26582c(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m26637a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo26584e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo26585f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo26586g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m26641c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m26638a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity
    public void onStop() {
        m26640b(this);
    }

    /* renamed from: a */
    public static Resources m26638a(DriveUploadErrorTipsMainProcActivity driveUploadErrorTipsMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveUploadErrorTipsMainProcActivity);
        }
        return driveUploadErrorTipsMainProcActivity.mo26584e();
    }

    /* renamed from: c */
    public static AssetManager m26641c(DriveUploadErrorTipsMainProcActivity driveUploadErrorTipsMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveUploadErrorTipsMainProcActivity);
        }
        return driveUploadErrorTipsMainProcActivity.mo26586g();
    }

    /* renamed from: b */
    public static void m26640b(DriveUploadErrorTipsMainProcActivity driveUploadErrorTipsMainProcActivity) {
        driveUploadErrorTipsMainProcActivity.mo26585f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DriveUploadErrorTipsMainProcActivity driveUploadErrorTipsMainProcActivity2 = driveUploadErrorTipsMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    driveUploadErrorTipsMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m26639a(DriveUploadErrorTipsMainProcActivity driveUploadErrorTipsMainProcActivity, Context context) {
        driveUploadErrorTipsMainProcActivity.mo26582c(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(driveUploadErrorTipsMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m26637a(DriveUploadErrorTipsMainProcActivity driveUploadErrorTipsMainProcActivity, Configuration configuration) {
        Context a = driveUploadErrorTipsMainProcActivity.mo26581a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
