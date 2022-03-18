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

public class MiniappTabActivity6 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234618a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234619a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234620a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262790a(this, context);
    }

    /* renamed from: b */
    public void mo234621b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234622c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262788a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262792c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262789a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262791b(this);
    }

    /* renamed from: a */
    public static Resources m262789a(MiniappTabActivity6 miniappTabActivity6) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity6);
        }
        return miniappTabActivity6.mo234619a();
    }

    /* renamed from: c */
    public static AssetManager m262792c(MiniappTabActivity6 miniappTabActivity6) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity6);
        }
        return miniappTabActivity6.mo234622c();
    }

    /* renamed from: b */
    public static void m262791b(MiniappTabActivity6 miniappTabActivity6) {
        miniappTabActivity6.mo234621b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity6 miniappTabActivity62 = miniappTabActivity6;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity62.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262790a(MiniappTabActivity6 miniappTabActivity6, Context context) {
        miniappTabActivity6.mo234620a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity6);
        }
    }

    /* renamed from: a */
    public static Context m262788a(MiniappTabActivity6 miniappTabActivity6, Configuration configuration) {
        Context a = miniappTabActivity6.mo234618a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
