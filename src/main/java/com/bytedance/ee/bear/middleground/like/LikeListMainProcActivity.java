package com.bytedance.ee.bear.middleground.like;

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

public class LikeListMainProcActivity extends LikeListActivity {
    /* renamed from: a */
    public Context mo36353a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo36354a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo36355a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m39303a(this, context);
    }

    /* renamed from: b */
    public void mo36356b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo36357c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m39301a(this, configuration);
    }

    public AssetManager getAssets() {
        return m39305c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m39302a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m39304b(this);
    }

    /* renamed from: a */
    public static Resources m39302a(LikeListMainProcActivity likeListMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(likeListMainProcActivity);
        }
        return likeListMainProcActivity.mo36354a();
    }

    /* renamed from: c */
    public static AssetManager m39305c(LikeListMainProcActivity likeListMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(likeListMainProcActivity);
        }
        return likeListMainProcActivity.mo36357c();
    }

    /* renamed from: b */
    public static void m39304b(LikeListMainProcActivity likeListMainProcActivity) {
        likeListMainProcActivity.mo36356b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LikeListMainProcActivity likeListMainProcActivity2 = likeListMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    likeListMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m39303a(LikeListMainProcActivity likeListMainProcActivity, Context context) {
        likeListMainProcActivity.mo36355a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(likeListMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m39301a(LikeListMainProcActivity likeListMainProcActivity, Configuration configuration) {
        Context a = likeListMainProcActivity.mo36353a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
