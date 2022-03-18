package com.bytedance.ee.bear.middleground.record.viewhistory;

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

public class ViewHistoryMainProcActivity extends ViewHistoryActivity {
    /* renamed from: a */
    public Context mo38563a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo38564a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo38565a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m42195a(this, context);
    }

    /* renamed from: b */
    public void mo38566b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo38567c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m42193a(this, configuration);
    }

    public AssetManager getAssets() {
        return m42197c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m42194a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m42196b(this);
    }

    /* renamed from: a */
    public static Resources m42194a(ViewHistoryMainProcActivity viewHistoryMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(viewHistoryMainProcActivity);
        }
        return viewHistoryMainProcActivity.mo38564a();
    }

    /* renamed from: c */
    public static AssetManager m42197c(ViewHistoryMainProcActivity viewHistoryMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(viewHistoryMainProcActivity);
        }
        return viewHistoryMainProcActivity.mo38567c();
    }

    /* renamed from: b */
    public static void m42196b(ViewHistoryMainProcActivity viewHistoryMainProcActivity) {
        viewHistoryMainProcActivity.mo38566b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ViewHistoryMainProcActivity viewHistoryMainProcActivity2 = viewHistoryMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewHistoryMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m42195a(ViewHistoryMainProcActivity viewHistoryMainProcActivity, Context context) {
        viewHistoryMainProcActivity.mo38565a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(viewHistoryMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m42193a(ViewHistoryMainProcActivity viewHistoryMainProcActivity, Configuration configuration) {
        Context a = viewHistoryMainProcActivity.mo38563a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
