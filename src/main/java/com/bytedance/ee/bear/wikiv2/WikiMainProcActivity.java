package com.bytedance.ee.bear.wikiv2;

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

public class WikiMainProcActivity extends WikiActivity {
    /* renamed from: a */
    public Context mo46629a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo46630a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m50742a(this, context);
    }

    /* renamed from: b */
    public Resources mo46631b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo46632c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m50740a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo46634d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m50744c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m50741a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m50743b(this);
    }

    /* renamed from: a */
    public static Resources m50741a(WikiMainProcActivity wikiMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiMainProcActivity);
        }
        return wikiMainProcActivity.mo46631b();
    }

    /* renamed from: c */
    public static AssetManager m50744c(WikiMainProcActivity wikiMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiMainProcActivity);
        }
        return wikiMainProcActivity.mo46634d();
    }

    /* renamed from: b */
    public static void m50743b(WikiMainProcActivity wikiMainProcActivity) {
        wikiMainProcActivity.mo46632c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiMainProcActivity wikiMainProcActivity2 = wikiMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m50742a(WikiMainProcActivity wikiMainProcActivity, Context context) {
        wikiMainProcActivity.mo46630a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m50740a(WikiMainProcActivity wikiMainProcActivity, Configuration configuration) {
        Context a = wikiMainProcActivity.mo46629a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
