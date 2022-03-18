package com.bytedance.ee.bear.drive.biz.versions;

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

public class VersionOperationRecordMainProcActivity extends VersionOperationRecordActivity {
    /* renamed from: a */
    public Context mo26887a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m26987a(this, context);
    }

    /* renamed from: c */
    public void mo26888c(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m26985a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo26890g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m26989c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m26986a(this);
    }

    /* renamed from: h */
    public void mo26892h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo26893i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity
    public void onStop() {
        m26988b(this);
    }

    /* renamed from: a */
    public static Resources m26986a(VersionOperationRecordMainProcActivity versionOperationRecordMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(versionOperationRecordMainProcActivity);
        }
        return versionOperationRecordMainProcActivity.mo26890g();
    }

    /* renamed from: c */
    public static AssetManager m26989c(VersionOperationRecordMainProcActivity versionOperationRecordMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(versionOperationRecordMainProcActivity);
        }
        return versionOperationRecordMainProcActivity.mo26893i();
    }

    /* renamed from: b */
    public static void m26988b(VersionOperationRecordMainProcActivity versionOperationRecordMainProcActivity) {
        versionOperationRecordMainProcActivity.mo26892h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VersionOperationRecordMainProcActivity versionOperationRecordMainProcActivity2 = versionOperationRecordMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    versionOperationRecordMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m26987a(VersionOperationRecordMainProcActivity versionOperationRecordMainProcActivity, Context context) {
        versionOperationRecordMainProcActivity.mo26888c(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(versionOperationRecordMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m26985a(VersionOperationRecordMainProcActivity versionOperationRecordMainProcActivity, Configuration configuration) {
        Context a = versionOperationRecordMainProcActivity.mo26887a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
