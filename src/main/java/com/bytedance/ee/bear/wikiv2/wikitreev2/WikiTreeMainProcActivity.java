package com.bytedance.ee.bear.wikiv2.wikitreev2;

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
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeMainProcActivity;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivity;", "()V", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiTreeMainProcActivity extends WikiTreeActivity {
    /* renamed from: a */
    public Context mo47232a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo47233a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo47234a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m51559a(this, context);
    }

    /* renamed from: b */
    public void mo47235b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo47236c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m51557a(this, configuration);
    }

    public AssetManager getAssets() {
        return m51561c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m51558a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m51560b(this);
    }

    /* renamed from: a */
    public static Resources m51558a(WikiTreeMainProcActivity wikiTreeMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiTreeMainProcActivity);
        }
        return wikiTreeMainProcActivity.mo47233a();
    }

    /* renamed from: c */
    public static AssetManager m51561c(WikiTreeMainProcActivity wikiTreeMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiTreeMainProcActivity);
        }
        return wikiTreeMainProcActivity.mo47236c();
    }

    /* renamed from: b */
    public static void m51560b(WikiTreeMainProcActivity wikiTreeMainProcActivity) {
        wikiTreeMainProcActivity.mo47235b();
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
    public static void m51559a(WikiTreeMainProcActivity wikiTreeMainProcActivity, Context context) {
        wikiTreeMainProcActivity.mo47234a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiTreeMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m51557a(WikiTreeMainProcActivity wikiTreeMainProcActivity, Configuration configuration) {
        Context a = wikiTreeMainProcActivity.mo47232a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
