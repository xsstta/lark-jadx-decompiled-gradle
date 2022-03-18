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

public class MiniappTabActivity2 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234594a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234595a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234596a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262750a(this, context);
    }

    /* renamed from: b */
    public void mo234597b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234598c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262748a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262752c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262749a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262751b(this);
    }

    /* renamed from: a */
    public static Resources m262749a(MiniappTabActivity2 miniappTabActivity2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity2);
        }
        return miniappTabActivity2.mo234595a();
    }

    /* renamed from: c */
    public static AssetManager m262752c(MiniappTabActivity2 miniappTabActivity2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity2);
        }
        return miniappTabActivity2.mo234598c();
    }

    /* renamed from: b */
    public static void m262751b(MiniappTabActivity2 miniappTabActivity2) {
        miniappTabActivity2.mo234597b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity2 miniappTabActivity22 = miniappTabActivity2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262750a(MiniappTabActivity2 miniappTabActivity2, Context context) {
        miniappTabActivity2.mo234596a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity2);
        }
    }

    /* renamed from: a */
    public static Context m262748a(MiniappTabActivity2 miniappTabActivity2, Configuration configuration) {
        Context a = miniappTabActivity2.mo234594a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
