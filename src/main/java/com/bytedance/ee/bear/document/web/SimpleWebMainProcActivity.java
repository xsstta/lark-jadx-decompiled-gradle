package com.bytedance.ee.bear.document.web;

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

public class SimpleWebMainProcActivity extends SimpleWebActivity {
    /* renamed from: a */
    public Context mo25292a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo25293a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m25225a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m25223a(this, configuration);
    }

    public AssetManager getAssets() {
        return m25227c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m25224a(this);
    }

    /* renamed from: i */
    public Resources mo25296i() {
        return super.getResources();
    }

    /* renamed from: j */
    public void mo25297j() {
        super.onStop();
    }

    /* renamed from: k */
    public AssetManager mo25298k() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m25226b(this);
    }

    /* renamed from: a */
    public static Resources m25224a(SimpleWebMainProcActivity simpleWebMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleWebMainProcActivity);
        }
        return simpleWebMainProcActivity.mo25296i();
    }

    /* renamed from: c */
    public static AssetManager m25227c(SimpleWebMainProcActivity simpleWebMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleWebMainProcActivity);
        }
        return simpleWebMainProcActivity.mo25298k();
    }

    /* renamed from: b */
    public static void m25226b(SimpleWebMainProcActivity simpleWebMainProcActivity) {
        simpleWebMainProcActivity.mo25297j();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SimpleWebMainProcActivity simpleWebMainProcActivity2 = simpleWebMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    simpleWebMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25225a(SimpleWebMainProcActivity simpleWebMainProcActivity, Context context) {
        simpleWebMainProcActivity.mo25293a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(simpleWebMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m25223a(SimpleWebMainProcActivity simpleWebMainProcActivity, Configuration configuration) {
        Context a = simpleWebMainProcActivity.mo25292a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
