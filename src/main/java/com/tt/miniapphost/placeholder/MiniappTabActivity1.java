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

public class MiniappTabActivity1 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234588a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234589a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234590a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262740a(this, context);
    }

    /* renamed from: b */
    public void mo234591b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234592c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262738a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262742c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262739a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262741b(this);
    }

    /* renamed from: a */
    public static Resources m262739a(MiniappTabActivity1 miniappTabActivity1) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity1);
        }
        return miniappTabActivity1.mo234589a();
    }

    /* renamed from: c */
    public static AssetManager m262742c(MiniappTabActivity1 miniappTabActivity1) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity1);
        }
        return miniappTabActivity1.mo234592c();
    }

    /* renamed from: b */
    public static void m262741b(MiniappTabActivity1 miniappTabActivity1) {
        miniappTabActivity1.mo234591b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabActivity1 miniappTabActivity12 = miniappTabActivity1;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabActivity12.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262740a(MiniappTabActivity1 miniappTabActivity1, Context context) {
        miniappTabActivity1.mo234590a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabActivity1);
        }
    }

    /* renamed from: a */
    public static Context m262738a(MiniappTabActivity1 miniappTabActivity1, Configuration configuration) {
        Context a = miniappTabActivity1.mo234588a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
