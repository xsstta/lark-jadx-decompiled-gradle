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

public class MiniappTabActivity8 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234630a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234631a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234632a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262810a(this, context);
    }

    /* renamed from: b */
    public void mo234633b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234634c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262808a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262812c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262809a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262811b(this);
    }

    /* renamed from: a */
    public static Resources m262809a(MiniappTabActivity8 miniappTabActivity8) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity8);
        }
        return miniappTabActivity8.mo234631a();
    }

    /* renamed from: c */
    public static AssetManager m262812c(MiniappTabActivity8 miniappTabActivity8) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity8);
        }
        return miniappTabActivity8.mo234634c();
    }

    /* renamed from: b */
    public static void m262811b(MiniappTabActivity8 miniappTabActivity8) {
        miniappTabActivity8.mo234633b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity8 miniappTabActivity82 = miniappTabActivity8;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity82.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262810a(MiniappTabActivity8 miniappTabActivity8, Context context) {
        miniappTabActivity8.mo234632a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity8);
        }
    }

    /* renamed from: a */
    public static Context m262808a(MiniappTabActivity8 miniappTabActivity8, Configuration configuration) {
        Context a = miniappTabActivity8.mo234630a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
