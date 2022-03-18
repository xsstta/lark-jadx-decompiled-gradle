package com.bytedance.ee.bear.facade.common;

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

public class CarrierMainProcActivity extends CarrierActivity {
    /* renamed from: a */
    public Context mo30084a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo30085a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo30086a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m30695a(this, context);
    }

    /* renamed from: b */
    public void mo30087b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo30088c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m30693a(this, configuration);
    }

    public AssetManager getAssets() {
        return m30697c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m30694a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m30696b(this);
    }

    /* renamed from: a */
    public static Resources m30694a(CarrierMainProcActivity carrierMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(carrierMainProcActivity);
        }
        return carrierMainProcActivity.mo30085a();
    }

    /* renamed from: c */
    public static AssetManager m30697c(CarrierMainProcActivity carrierMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(carrierMainProcActivity);
        }
        return carrierMainProcActivity.mo30088c();
    }

    /* renamed from: b */
    public static void m30696b(CarrierMainProcActivity carrierMainProcActivity) {
        carrierMainProcActivity.mo30087b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CarrierMainProcActivity carrierMainProcActivity2 = carrierMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    carrierMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m30695a(CarrierMainProcActivity carrierMainProcActivity, Context context) {
        carrierMainProcActivity.mo30086a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(carrierMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m30693a(CarrierMainProcActivity carrierMainProcActivity, Configuration configuration) {
        Context a = carrierMainProcActivity.mo30084a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
