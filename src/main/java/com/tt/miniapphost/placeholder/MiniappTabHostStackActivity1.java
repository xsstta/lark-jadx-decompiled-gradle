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

public class MiniappTabHostStackActivity1 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234648a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234649a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234650a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262840a(this, context);
    }

    /* renamed from: b */
    public void mo234651b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234652c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262838a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262842c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262839a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262841b(this);
    }

    /* renamed from: a */
    public static Resources m262839a(MiniappTabHostStackActivity1 miniappTabHostStackActivity1) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity1);
        }
        return miniappTabHostStackActivity1.mo234649a();
    }

    /* renamed from: c */
    public static AssetManager m262842c(MiniappTabHostStackActivity1 miniappTabHostStackActivity1) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity1);
        }
        return miniappTabHostStackActivity1.mo234652c();
    }

    /* renamed from: b */
    public static void m262841b(MiniappTabHostStackActivity1 miniappTabHostStackActivity1) {
        miniappTabHostStackActivity1.mo234651b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabHostStackActivity1 miniappTabHostStackActivity12 = miniappTabHostStackActivity1;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabHostStackActivity12.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262840a(MiniappTabHostStackActivity1 miniappTabHostStackActivity1, Context context) {
        miniappTabHostStackActivity1.mo234650a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity1);
        }
    }

    /* renamed from: a */
    public static Context m262838a(MiniappTabHostStackActivity1 miniappTabHostStackActivity1, Configuration configuration) {
        Context a = miniappTabHostStackActivity1.mo234648a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
