package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist;

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

public class UploadListMainProcActivity extends UploadListActivity {
    /* renamed from: a */
    public Context mo26772a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m26811a(this, context);
    }

    /* renamed from: c */
    public void mo26773c(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m26809a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo26775e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo26776f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo26777g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m26813c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m26810a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.drive.common.mvpframeworks.app.activity.DriveAbsMvpActivity
    public void onStop() {
        m26812b(this);
    }

    /* renamed from: a */
    public static Resources m26810a(UploadListMainProcActivity uploadListMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(uploadListMainProcActivity);
        }
        return uploadListMainProcActivity.mo26775e();
    }

    /* renamed from: c */
    public static AssetManager m26813c(UploadListMainProcActivity uploadListMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(uploadListMainProcActivity);
        }
        return uploadListMainProcActivity.mo26777g();
    }

    /* renamed from: b */
    public static void m26812b(UploadListMainProcActivity uploadListMainProcActivity) {
        uploadListMainProcActivity.mo26776f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            UploadListMainProcActivity uploadListMainProcActivity2 = uploadListMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    uploadListMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m26811a(UploadListMainProcActivity uploadListMainProcActivity, Context context) {
        uploadListMainProcActivity.mo26773c(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(uploadListMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m26809a(UploadListMainProcActivity uploadListMainProcActivity, Configuration configuration) {
        Context a = uploadListMainProcActivity.mo26772a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
