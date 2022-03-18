package com.tt.miniapphost.placeholder;

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
import com.tt.miniapphost.MiniappHostBase;

public class MiniappTabHostStackActivity6 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234678a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234679a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234680a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262890a(this, context);
    }

    /* renamed from: b */
    public void mo234681b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234682c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262888a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262892c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262889a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262891b(this);
    }

    /* renamed from: a */
    public static Resources m262889a(MiniappTabHostStackActivity6 miniappTabHostStackActivity6) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity6);
        }
        return miniappTabHostStackActivity6.mo234679a();
    }

    /* renamed from: c */
    public static AssetManager m262892c(MiniappTabHostStackActivity6 miniappTabHostStackActivity6) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity6);
        }
        return miniappTabHostStackActivity6.mo234682c();
    }

    /* renamed from: b */
    public static void m262891b(MiniappTabHostStackActivity6 miniappTabHostStackActivity6) {
        miniappTabHostStackActivity6.mo234681b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabHostStackActivity6 miniappTabHostStackActivity62 = miniappTabHostStackActivity6;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabHostStackActivity62.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262890a(MiniappTabHostStackActivity6 miniappTabHostStackActivity6, Context context) {
        miniappTabHostStackActivity6.mo234680a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity6);
        }
    }

    /* renamed from: a */
    public static Context m262888a(MiniappTabHostStackActivity6 miniappTabHostStackActivity6, Configuration configuration) {
        Context a = miniappTabHostStackActivity6.mo234678a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
