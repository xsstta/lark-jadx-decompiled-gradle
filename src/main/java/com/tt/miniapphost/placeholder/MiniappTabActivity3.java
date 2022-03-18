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

public class MiniappTabActivity3 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234600a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234601a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234602a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262760a(this, context);
    }

    /* renamed from: b */
    public void mo234603b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234604c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262758a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262762c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262759a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262761b(this);
    }

    /* renamed from: a */
    public static Resources m262759a(MiniappTabActivity3 miniappTabActivity3) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity3);
        }
        return miniappTabActivity3.mo234601a();
    }

    /* renamed from: c */
    public static AssetManager m262762c(MiniappTabActivity3 miniappTabActivity3) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity3);
        }
        return miniappTabActivity3.mo234604c();
    }

    /* renamed from: b */
    public static void m262761b(MiniappTabActivity3 miniappTabActivity3) {
        miniappTabActivity3.mo234603b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity3 miniappTabActivity32 = miniappTabActivity3;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity32.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262760a(MiniappTabActivity3 miniappTabActivity3, Context context) {
        miniappTabActivity3.mo234602a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity3);
        }
    }

    /* renamed from: a */
    public static Context m262758a(MiniappTabActivity3 miniappTabActivity3, Configuration configuration) {
        Context a = miniappTabActivity3.mo234600a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
