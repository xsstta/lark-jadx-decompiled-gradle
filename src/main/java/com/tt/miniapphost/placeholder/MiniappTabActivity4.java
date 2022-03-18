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

public class MiniappTabActivity4 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234606a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234607a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234608a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262770a(this, context);
    }

    /* renamed from: b */
    public void mo234609b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234610c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262768a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262772c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262769a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262771b(this);
    }

    /* renamed from: a */
    public static Resources m262769a(MiniappTabActivity4 miniappTabActivity4) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity4);
        }
        return miniappTabActivity4.mo234607a();
    }

    /* renamed from: c */
    public static AssetManager m262772c(MiniappTabActivity4 miniappTabActivity4) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity4);
        }
        return miniappTabActivity4.mo234610c();
    }

    /* renamed from: b */
    public static void m262771b(MiniappTabActivity4 miniappTabActivity4) {
        miniappTabActivity4.mo234609b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity4 miniappTabActivity42 = miniappTabActivity4;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity42.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262770a(MiniappTabActivity4 miniappTabActivity4, Context context) {
        miniappTabActivity4.mo234608a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity4);
        }
    }

    /* renamed from: a */
    public static Context m262768a(MiniappTabActivity4 miniappTabActivity4, Configuration configuration) {
        Context a = miniappTabActivity4.mo234606a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
