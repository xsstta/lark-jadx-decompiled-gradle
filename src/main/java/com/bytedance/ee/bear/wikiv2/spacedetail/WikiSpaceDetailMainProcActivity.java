package com.bytedance.ee.bear.wikiv2.spacedetail;

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
    public Context mo47186a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo47187a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo47188a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m51518a(this, context);
    }

    /* renamed from: b */
    public void mo47189b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo47190c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m51516a(this, configuration);
    }

    public AssetManager getAssets() {
        return m51520c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m51517a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m51519b(this);
    }

    /* renamed from: a */
    public static Resources m51517a(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceDetailMainProcActivity);
        }
        return wikiSpaceDetailMainProcActivity.mo47187a();
    }

    /* renamed from: c */
    public static AssetManager m51520c(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceDetailMainProcActivity);
        }
        return wikiSpaceDetailMainProcActivity.mo47190c();
    }

    /* renamed from: b */
    public static void m51519b(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity) {
        wikiSpaceDetailMainProcActivity.mo47189b();
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
    public static void m51518a(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity, Context context) {
        wikiSpaceDetailMainProcActivity.mo47188a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceDetailMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m51516a(WikiSpaceDetailMainProcActivity wikiSpaceDetailMainProcActivity, Configuration configuration) {
        Context a = wikiSpaceDetailMainProcActivity.mo47186a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
