package com.bytedance.ee.bear.middleground.record.privacy;

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

public class PrivacyMainProcActivity extends PrivacyActivity {
    /* renamed from: a */
    public Context mo38545a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo38546a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo38547a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m42168a(this, context);
    }

    /* renamed from: b */
    public void mo38548b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo38549c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m42166a(this, configuration);
    }

    public AssetManager getAssets() {
        return m42170c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m42167a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m42169b(this);
    }

    /* renamed from: a */
    public static Resources m42167a(PrivacyMainProcActivity privacyMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacyMainProcActivity);
        }
        return privacyMainProcActivity.mo38546a();
    }

    /* renamed from: c */
    public static AssetManager m42170c(PrivacyMainProcActivity privacyMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacyMainProcActivity);
        }
        return privacyMainProcActivity.mo38549c();
    }

    /* renamed from: b */
    public static void m42169b(PrivacyMainProcActivity privacyMainProcActivity) {
        privacyMainProcActivity.mo38548b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PrivacyMainProcActivity privacyMainProcActivity2 = privacyMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    privacyMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m42168a(PrivacyMainProcActivity privacyMainProcActivity, Context context) {
        privacyMainProcActivity.mo38547a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacyMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m42166a(PrivacyMainProcActivity privacyMainProcActivity, Configuration configuration) {
        Context a = privacyMainProcActivity.mo38545a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
