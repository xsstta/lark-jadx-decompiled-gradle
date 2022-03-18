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

public class MiniappTabActivity0 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234582a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234583a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234584a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262730a(this, context);
    }

    /* renamed from: b */
    public void mo234585b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234586c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262728a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262732c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262729a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262731b(this);
    }

    /* renamed from: a */
    public static Resources m262729a(MiniappTabActivity0 miniappTabActivity0) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity0);
        }
        return miniappTabActivity0.mo234583a();
    }

    /* renamed from: c */
    public static AssetManager m262732c(MiniappTabActivity0 miniappTabActivity0) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity0);
        }
        return miniappTabActivity0.mo234586c();
    }

    /* renamed from: b */
    public static void m262731b(MiniappTabActivity0 miniappTabActivity0) {
        miniappTabActivity0.mo234585b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity0 miniappTabActivity02 = miniappTabActivity0;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity02.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262730a(MiniappTabActivity0 miniappTabActivity0, Context context) {
        miniappTabActivity0.mo234584a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity0);
        }
    }

    /* renamed from: a */
    public static Context m262728a(MiniappTabActivity0 miniappTabActivity0, Configuration configuration) {
        Context a = miniappTabActivity0.mo234582a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
