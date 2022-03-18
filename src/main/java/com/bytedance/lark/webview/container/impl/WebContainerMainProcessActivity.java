package com.bytedance.lark.webview.container.impl;

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

public class WebContainerMainProcessActivity extends WebContainerActivity {
    /* renamed from: a */
    public Context mo67229a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo67230a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo67231a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.lark.webview.container.impl.WebContainerActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m72390a(this, context);
    }

    /* renamed from: b */
    public void mo67232b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo67233c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m72388a(this, configuration);
    }

    public AssetManager getAssets() {
        return m72392c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.lark.webview.container.impl.WebContainerActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m72389a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m72391b(this);
    }

    /* renamed from: a */
    public static Resources m72389a(WebContainerMainProcessActivity webContainerMainProcessActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webContainerMainProcessActivity);
        }
        return webContainerMainProcessActivity.mo67230a();
    }

    /* renamed from: c */
    public static AssetManager m72392c(WebContainerMainProcessActivity webContainerMainProcessActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webContainerMainProcessActivity);
        }
        return webContainerMainProcessActivity.mo67233c();
    }

    /* renamed from: b */
    public static void m72391b(WebContainerMainProcessActivity webContainerMainProcessActivity) {
        webContainerMainProcessActivity.mo67232b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WebContainerMainProcessActivity webContainerMainProcessActivity2 = webContainerMainProcessActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    webContainerMainProcessActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m72390a(WebContainerMainProcessActivity webContainerMainProcessActivity, Context context) {
        webContainerMainProcessActivity.mo67231a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(webContainerMainProcessActivity);
        }
    }

    /* renamed from: a */
    public static Context m72388a(WebContainerMainProcessActivity webContainerMainProcessActivity, Configuration configuration) {
        Context a = webContainerMainProcessActivity.mo67229a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
