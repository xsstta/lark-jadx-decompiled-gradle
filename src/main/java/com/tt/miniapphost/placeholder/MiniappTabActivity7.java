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

public class MiniappTabActivity7 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234624a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234625a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234626a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262800a(this, context);
    }

    /* renamed from: b */
    public void mo234627b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234628c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262798a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262802c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262799a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262801b(this);
    }

    /* renamed from: a */
    public static Resources m262799a(MiniappTabActivity7 miniappTabActivity7) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity7);
        }
        return miniappTabActivity7.mo234625a();
    }

    /* renamed from: c */
    public static AssetManager m262802c(MiniappTabActivity7 miniappTabActivity7) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity7);
        }
        return miniappTabActivity7.mo234628c();
    }

    /* renamed from: b */
    public static void m262801b(MiniappTabActivity7 miniappTabActivity7) {
        miniappTabActivity7.mo234627b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity7 miniappTabActivity72 = miniappTabActivity7;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity72.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262800a(MiniappTabActivity7 miniappTabActivity7, Context context) {
        miniappTabActivity7.mo234626a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity7);
        }
    }

    /* renamed from: a */
    public static Context m262798a(MiniappTabActivity7 miniappTabActivity7, Configuration configuration) {
        Context a = miniappTabActivity7.mo234624a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
