package com.bytedance.ee.bear.wiki.wikitree;

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

public class WikiTreeMainProcActivity extends WikiTreeActivity {
    /* renamed from: a */
    public Context mo46161a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo46162a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo46163a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m49914a(this, context);
    }

    /* renamed from: b */
    public void mo46164b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo46165c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m49912a(this, configuration);
    }

    public AssetManager getAssets() {
        return m49916c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m49913a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m49915b(this);
    }

    /* renamed from: a */
    public static Resources m49913a(WikiTreeMainProcActivity wikiTreeMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiTreeMainProcActivity);
        }
        return wikiTreeMainProcActivity.mo46162a();
    }

    /* renamed from: c */
    public static AssetManager m49916c(WikiTreeMainProcActivity wikiTreeMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiTreeMainProcActivity);
        }
        return wikiTreeMainProcActivity.mo46165c();
    }

    /* renamed from: b */
    public static void m49915b(WikiTreeMainProcActivity wikiTreeMainProcActivity) {
        wikiTreeMainProcActivity.mo46164b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiTreeMainProcActivity wikiTreeMainProcActivity2 = wikiTreeMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiTreeMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m49914a(WikiTreeMainProcActivity wikiTreeMainProcActivity, Context context) {
        wikiTreeMainProcActivity.mo46163a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiTreeMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m49912a(WikiTreeMainProcActivity wikiTreeMainProcActivity, Configuration configuration) {
        Context a = wikiTreeMainProcActivity.mo46161a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
