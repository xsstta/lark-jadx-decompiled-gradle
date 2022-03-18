package com.bytedance.ee.bear.wiki.spacedetail;

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

public class WikiSpaceDetailMainProcActivity extends WikiSpaceDetailActivity {
    /* renamed from: a */
    public Context mo46121a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo46122a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo46123a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m49882a(this, context);
    }

    /* renamed from: b */
    public void mo46124b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo46125c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m49880a(this, configuration);
    }

    public AssetManager getAssets() {
        return m49884c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m49881a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m49883b(this);
    }

    /* renamed from: a */
    public static Resources m49881a(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceDetailMainProcActivity);
        }
        return wikiSpaceDetailMainProcActivity.mo46122a();
    }

    /* renamed from: c */
    public static AssetManager m49884c(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceDetailMainProcActivity);
        }
        return wikiSpaceDetailMainProcActivity.mo46125c();
    }

    /* renamed from: b */
    public static void m49883b(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity) {
        wikiSpaceDetailMainProcActivity.mo46124b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity2 = wikiSpaceDetailMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiSpaceDetailMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m49882a(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity, Context context) {
        wikiSpaceDetailMainProcActivity.mo46123a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceDetailMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m49880a(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity, Configuration configuration) {
        Context a = wikiSpaceDetailMainProcActivity.mo46121a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
