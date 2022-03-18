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

public class MiniappTabHostStackActivity8 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234690a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234691a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234692a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262910a(this, context);
    }

    /* renamed from: b */
    public void mo234693b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234694c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262908a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262912c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262909a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262911b(this);
    }

    /* renamed from: a */
    public static Resources m262909a(MiniappTabHostStackActivity8 miniappTabHostStackActivity8) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity8);
        }
        return miniappTabHostStackActivity8.mo234691a();
    }

    /* renamed from: c */
    public static AssetManager m262912c(MiniappTabHostStackActivity8 miniappTabHostStackActivity8) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity8);
        }
        return miniappTabHostStackActivity8.mo234694c();
    }

    /* renamed from: b */
    public static void m262911b(MiniappTabHostStackActivity8 miniappTabHostStackActivity8) {
        miniappTabHostStackActivity8.mo234693b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabHostStackActivity8 miniappTabHostStackActivity82 = miniappTabHostStackActivity8;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabHostStackActivity82.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262910a(MiniappTabHostStackActivity8 miniappTabHostStackActivity8, Context context) {
        miniappTabHostStackActivity8.mo234692a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity8);
        }
    }

    /* renamed from: a */
    public static Context m262908a(MiniappTabHostStackActivity8 miniappTabHostStackActivity8, Configuration configuration) {
        Context a = miniappTabHostStackActivity8.mo234690a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
