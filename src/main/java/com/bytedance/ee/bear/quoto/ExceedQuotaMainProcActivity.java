package com.bytedance.ee.bear.quoto;

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

public class ExceedQuotaMainProcActivity extends ExceedQuotaActivity {
    /* renamed from: a */
    public Context mo39964a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo39965a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo39966a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m43739a(this, context);
    }

    /* renamed from: b */
    public void mo39967b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo39968c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m43737a(this, configuration);
    }

    public AssetManager getAssets() {
        return m43741c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m43738a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m43740b(this);
    }

    /* renamed from: a */
    public static Resources m43738a(ExceedQuotaMainProcActivity exceedQuotaMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(exceedQuotaMainProcActivity);
        }
        return exceedQuotaMainProcActivity.mo39965a();
    }

    /* renamed from: c */
    public static AssetManager m43741c(ExceedQuotaMainProcActivity exceedQuotaMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(exceedQuotaMainProcActivity);
        }
        return exceedQuotaMainProcActivity.mo39968c();
    }

    /* renamed from: b */
    public static void m43740b(ExceedQuotaMainProcActivity exceedQuotaMainProcActivity) {
        exceedQuotaMainProcActivity.mo39967b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ExceedQuotaMainProcActivity exceedQuotaMainProcActivity2 = exceedQuotaMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    exceedQuotaMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m43739a(ExceedQuotaMainProcActivity exceedQuotaMainProcActivity, Context context) {
        exceedQuotaMainProcActivity.mo39966a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(exceedQuotaMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m43737a(ExceedQuotaMainProcActivity exceedQuotaMainProcActivity, Configuration configuration) {
        Context a = exceedQuotaMainProcActivity.mo39964a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
