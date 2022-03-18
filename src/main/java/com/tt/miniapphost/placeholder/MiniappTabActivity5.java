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

public class MiniappTabActivity5 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234612a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234613a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234614a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262780a(this, context);
    }

    /* renamed from: b */
    public void mo234615b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234616c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262778a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262782c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262779a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262781b(this);
    }

    /* renamed from: a */
    public static Resources m262779a(MiniappTabActivity5 miniappTabActivity5) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity5);
        }
        return miniappTabActivity5.mo234613a();
    }

    /* renamed from: c */
    public static AssetManager m262782c(MiniappTabActivity5 miniappTabActivity5) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity5);
        }
        return miniappTabActivity5.mo234616c();
    }

    /* renamed from: b */
    public static void m262781b(MiniappTabActivity5 miniappTabActivity5) {
        miniappTabActivity5.mo234615b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity5 miniappTabActivity52 = miniappTabActivity5;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity52.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262780a(MiniappTabActivity5 miniappTabActivity5, Context context) {
        miniappTabActivity5.mo234614a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity5);
        }
    }

    /* renamed from: a */
    public static Context m262778a(MiniappTabActivity5 miniappTabActivity5, Configuration configuration) {
        Context a = miniappTabActivity5.mo234612a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
