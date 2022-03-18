package com.bytedance.ee.bear.document;

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

public class DocMainProcActivity extends DocActivity {
    /* renamed from: a */
    public Context mo22409a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo22410a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m22752a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m22750a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo22412d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo22413e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo22414f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m22754c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m22751a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m22753b(this);
    }

    /* renamed from: a */
    public static Resources m22751a(DocMainProcActivity docMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docMainProcActivity);
        }
        return docMainProcActivity.mo22412d();
    }

    /* renamed from: c */
    public static AssetManager m22754c(DocMainProcActivity docMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docMainProcActivity);
        }
        return docMainProcActivity.mo22414f();
    }

    /* renamed from: b */
    public static void m22753b(DocMainProcActivity docMainProcActivity) {
        docMainProcActivity.mo22413e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DocMainProcActivity docMainProcActivity2 = docMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    docMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m22752a(DocMainProcActivity docMainProcActivity, Context context) {
        docMainProcActivity.mo22410a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m22750a(DocMainProcActivity docMainProcActivity, Configuration configuration) {
        Context a = docMainProcActivity.mo22409a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
