package com.bytedance.ee.bear.basesdk;

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

public class DocRouteMainProcActivity extends DocRouteActivity {
    /* renamed from: a */
    public Context mo16952a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo16953a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo16954a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m17914a(this, context);
    }

    /* renamed from: b */
    public void mo16955b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo16956c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m17912a(this, configuration);
    }

    public AssetManager getAssets() {
        return m17916c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m17913a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m17915b(this);
    }

    /* renamed from: a */
    public static Resources m17913a(DocRouteMainProcActivity docRouteMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docRouteMainProcActivity);
        }
        return docRouteMainProcActivity.mo16953a();
    }

    /* renamed from: c */
    public static AssetManager m17916c(DocRouteMainProcActivity docRouteMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docRouteMainProcActivity);
        }
        return docRouteMainProcActivity.mo16956c();
    }

    /* renamed from: b */
    public static void m17915b(DocRouteMainProcActivity docRouteMainProcActivity) {
        docRouteMainProcActivity.mo16955b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DocRouteMainProcActivity docRouteMainProcActivity2 = docRouteMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    docRouteMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m17914a(DocRouteMainProcActivity docRouteMainProcActivity, Context context) {
        docRouteMainProcActivity.mo16954a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(docRouteMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m17912a(DocRouteMainProcActivity docRouteMainProcActivity, Configuration configuration) {
        Context a = docRouteMainProcActivity.mo16952a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
