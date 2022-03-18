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

public class MiniappTabActivity9 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234636a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234637a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234638a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262820a(this, context);
    }

    /* renamed from: b */
    public void mo234639b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234640c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262818a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262822c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262819a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262821b(this);
    }

    /* renamed from: a */
    public static Resources m262819a(MiniappTabActivity9 miniappTabActivity9) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity9);
        }
        return miniappTabActivity9.mo234637a();
    }

    /* renamed from: c */
    public static AssetManager m262822c(MiniappTabActivity9 miniappTabActivity9) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity9);
        }
        return miniappTabActivity9.mo234640c();
    }

    /* renamed from: b */
    public static void m262821b(MiniappTabActivity9 miniappTabActivity9) {
        miniappTabActivity9.mo234639b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity9 miniappTabActivity92 = miniappTabActivity9;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity92.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262820a(MiniappTabActivity9 miniappTabActivity9, Context context) {
        miniappTabActivity9.mo234638a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity9);
        }
    }

    /* renamed from: a */
    public static Context m262818a(MiniappTabActivity9 miniappTabActivity9, Configuration configuration) {
        Context a = miniappTabActivity9.mo234636a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
